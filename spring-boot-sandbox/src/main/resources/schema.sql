DROP TYPE IF EXISTS status;
CREATE TYPE status AS ENUM ('active', 'closed', 'suspended');

DROP TABLE IF EXISTS account;
CREATE TABLE account (
   id INT AUTO_INCREMENT PRIMARY KEY,
   status status,
   balance NUMERIC NOT NULL,
   customer_id INT NOT NULL,
   bank_identifier VARCHAR(150) NOT NULL
);

DROP TABLE IF EXISTS customer_company;
CREATE TABLE customer_company (
   id INT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
   identifier  VARCHAR(150) NOT NULL,
   title  VARCHAR(150) NOT NULL
);