CREATE DATABASE shop;

USE shop;

CREATE TABLE customer (
    id      VARCHAR(35) PRIMARY KEY,
    name    VARCHAR(100),
    address TEXT,
    tel     VARCHAR(20)
);

CREATE TABLE user (
    name      VARCHAR(35) PRIMARY KEY,
    address    VARCHAR(100),
    contact TEXT,
    email     VARCHAR(50),
    userName  VARCHAR (20),
    password  VARCHAR (20)
);