CREATE TABLE Cliente (
    id SERIAL PRIMARY KEY,
    nome VARCHAR(100),
    telefone VARCHAR(20)
);

CREATE TABLE Imovel (
    id SERIAL PRIMARY KEY,
    endereco VARCHAR(200),
    valor DECIMAL(10,2),
    disponivel BOOLEAN
);

CREATE TABLE Contrato (
    id SERIAL PRIMARY KEY,
    cliente_id INT REFERENCES Cliente(id),
    imovel_id INT REFERENCES Imovel(id),
    valor DECIMAL(10,2),
    inicio DATE,
    fim DATE
);

INSERT INTO Cliente (nome, telefone) VALUES ('João Silva', '99999-9999');
INSERT INTO Imovel (endereco, valor, disponivel) VALUES ('Rua A, 123', 1500.00, TRUE);
INSERT INTO Contrato (cliente_id, imovel_id, valor, inicio, fim) VALUES (1, 1, 1500.00, '2025-01-01', '2025-12-31');
