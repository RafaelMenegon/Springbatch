CREATE TABLE IF NOT EXISTS person  (
    person_id BIGINT auto_increment NOT NULL PRIMARY KEY,
    first_name VARCHAR(40),
    last_name VARCHAR(40),
    email VARCHAR(100),
    age VARCHAR(100),
);
INSERT INTO person (first_name, last_name, email, age)
VALUES ('italo', 'barbosa', 'italo@gmail', '1');
INSERT INTO person (first_name, last_name, email, age)
VALUES ('rafael', 'menegon', 'rafa@gmail', '2');
INSERT INTO person (first_name, last_name, email, age)
VALUES ('joao', 'victor', 'joao@gmail', '3');
INSERT INTO person (first_name, last_name, email, age)
VALUES ('sara', 'sarao', 'sara@gmail', '4')


