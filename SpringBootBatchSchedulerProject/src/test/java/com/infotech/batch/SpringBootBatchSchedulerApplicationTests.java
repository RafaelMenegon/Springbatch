package com.infotech.batch;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.test.JobLauncherTestUtils;
import org.springframework.batch.test.context.SpringBatchTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.infotech.batch.config.BatchConfig;

@SpringBatchTest
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = BatchConfig.class)
public class SpringBootBatchSchedulerApplicationTests {

	
	 @Bean
	 public JobLauncherTestUtils jobLauncherTestUtils() {

	 return new JobLauncherTestUtils();

	 }
	 @Test
	public void contextLoads() throws Exception {
		JobExecution jobExecution = jobLauncherTestUtils().launchJob();
		assertEquals(BatchStatus.COMPLETED, jobExecution.getStatus());
	}

}
