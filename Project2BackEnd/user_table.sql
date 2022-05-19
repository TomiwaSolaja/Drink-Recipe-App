CREATE TABLE users(
user_id SERIAL NOT NULL,
"name" TEXT NOT NULL,
email TEXT NOT NULL,
birth_date DATE NOT NULL,
"password" VARCHAR NOT NULL,
PRIMARY KEY(user_id)
);