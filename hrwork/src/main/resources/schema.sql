DROP TABLE IF EXISTS tb_worker;

CREATE TABLE tb_worker (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    daily_income DOUBLE NOT NULL
);