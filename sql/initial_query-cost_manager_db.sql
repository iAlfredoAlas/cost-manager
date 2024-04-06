/*================================================================================*/
/* DDL SCRIPT                                                                     */
/*================================================================================*/
/*  Title    :                                                                    */
/*  FileName : cost-manager.ecm                                                   */
/*  Platform : MySQL 5.6                                                          */
/*  Version  : Concept                                                            */
/*  Date     : viernes, 5 de abril de 2024                                        */
/*================================================================================*/
/*================================================================================*/
/* CREATE TABLES                                                                  */
/*================================================================================*/

CREATE TABLE currencies (
  id_currency TINYINT AUTO_INCREMENT NOT NULL,
  name_currency VARCHAR(45) NOT NULL,
  iso_code_currency VARCHAR(3) NOT NULL,
  symbol_currency VARCHAR(10) NOT NULL,
  CONSTRAINT PK_currencies PRIMARY KEY (id_currency)
);

CREATE TABLE accounts (
  id_account TINYINT AUTO_INCREMENT NOT NULL,
  name_account VARCHAR(40) NOT NULL,
  initial_account_balance REAL NOT NULL,
  initial_balance_date DATE NOT NULL,
  balance BOOL NOT NULL,
  id_currency TINYINT NOT NULL,
  CONSTRAINT PK_accounts PRIMARY KEY (id_account)
);

CREATE TABLE category_icons (
  id_category_icon TINYINT AUTO_INCREMENT NOT NULL,
  category_icon VARCHAR(40) NOT NULL,
  CONSTRAINT PK_category_icons PRIMARY KEY (id_category_icon)
);

CREATE TABLE categories (
  id_category TINYINT AUTO_INCREMENT NOT NULL,
  name_category VARCHAR(40) NOT NULL,
  id_category_icon TINYINT NOT NULL,
  CONSTRAINT PK_categories PRIMARY KEY (id_category)
);

CREATE TABLE transactions (
  id_transaction SERIAL NOT NULL,
  date_transaction DATE NOT NULL,
  transaction_amount REAL NOT NULL,
  id_category TINYINT NOT NULL,
  id_account TINYINT NOT NULL,
  CONSTRAINT PK_transactions PRIMARY KEY (id_transaction)
);

/*================================================================================*/
/* CREATE FOREIGN KEYS                                                            */
/*================================================================================*/

ALTER TABLE accounts
  ADD CONSTRAINT FK_accounts_currencies
  FOREIGN KEY (id_currency) REFERENCES currencies (id_currency);

ALTER TABLE categories
  ADD CONSTRAINT FK_categories_category_icons
  FOREIGN KEY (id_category_icon) REFERENCES category_icons (id_category_icon);

ALTER TABLE transactions
  ADD CONSTRAINT FK_transactions_categories
  FOREIGN KEY (id_category) REFERENCES categories (id_category);

ALTER TABLE transactions
  ADD CONSTRAINT FK_transactions_accounts
  FOREIGN KEY (id_account) REFERENCES accounts (id_account);

