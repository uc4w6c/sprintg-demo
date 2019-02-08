CREATE TABLE users(username varchar(100) NOT NULL primary key, encoded_password varchar(255));
INSERT INTO users (username, encoded_password) values ('user1', ' ');
INSERT INTO users (username, encoded_password) values ('user2', ' ');
ALTER TABLE customers ADD username VARCHAR(100) NOT NULL DEFAULT 'user1';
ALTER TABLE customers ADD CONSTRAINT FK_CUSTOMERS_USERNAME FOREIGN KEY (username) REFERENCES users(username);
