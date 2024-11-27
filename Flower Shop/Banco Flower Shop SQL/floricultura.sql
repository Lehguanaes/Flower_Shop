-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 27-Nov-2024 às 18:52
-- Versão do servidor: 10.4.22-MariaDB
-- versão do PHP: 8.0.13

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `floricultura`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `categoria`
--

CREATE TABLE `categoria` (
  `Cod_Categoria` int(11) NOT NULL,
  `Nome_Categoria` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `categoria`
--

INSERT INTO `categoria` (`Cod_Categoria`, `Nome_Categoria`) VALUES
(1, 'Flores'),
(2, 'Vasos'),
(3, 'Adubos'),
(4, 'Sementes'),
(5, 'Tesoura'),
(6, 'Terra'),
(7, 'Utensilios'),
(8, 'Graos'),
(9, 'Aventais');

-- --------------------------------------------------------

--
-- Estrutura da tabela `cliente`
--

CREATE TABLE `cliente` (
  `CPF_Cliente` char(14) NOT NULL,
  `Nome_Cliente` varchar(100) NOT NULL,
  `Telefone_Cliente` varchar(20) NOT NULL,
  `Email_Cliente` varchar(100) NOT NULL,
  `Status_Cliente` varchar(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `cliente`
--

INSERT INTO `cliente` (`CPF_Cliente`, `Nome_Cliente`, `Telefone_Cliente`, `Email_Cliente`, `Status_Cliente`) VALUES
('111.222.333-44', 'Carlos Alberto Pereira', '+55 (41) 94444-5555', 'carlos.pereira@email.com', 'Medio'),
('123.456.789-00', 'Gabrielly Nascimento Bento', '+55 (21) 98888-7777', 'gabrielly.bento@email.com', 'Bom'),
('234.567.890-11', 'Jovana Oliveira da Silva', '+55 (11) 97777-6666', 'jovana.silva@email.com', 'Medio'),
('345.678.901-22', 'Karinne Angelo Ventura', '+55 (31) 96666-5555', 'karinne.ventura@email.com', 'Ruim'),
('456.789.012-33', 'Leticia Guanaes Moreira', '+55 (21) 95555-4444', 'leticia.moreira@email.com', 'Bom'),
('567.890.123-44', 'Maria Eduarda Viana', '+55 (41) 94444-3333', 'maria.viana@email.com', 'Medio');

-- --------------------------------------------------------

--
-- Estrutura da tabela `item_pedido`
--

CREATE TABLE `item_pedido` (
  `Cod_Item_Pedido` int(11) NOT NULL,
  `Cod_Pedido` int(11) NOT NULL,
  `Cod_Produto` int(11) NOT NULL,
  `Quantidade_Vendida` int(11) NOT NULL,
  `Valor_Vendido` decimal(10,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `item_pedido`
--

INSERT INTO `item_pedido` (`Cod_Item_Pedido`, `Cod_Pedido`, `Cod_Produto`, `Quantidade_Vendida`, `Valor_Vendido`) VALUES
(1, 1, 1, 10, '55.00'),
(2, 2, 2, 5, '250.00'),
(3, 3, 3, 15, '56.25'),
(4, 4, 4, 8, '120.00'),
(5, 5, 5, 12, '87.00'),
(6, 6, 10, 3, '67.50'),
(7, 7, 12, 2, '60.00'),
(8, 8, 9, 2, '50.00'),
(9, 9, 10, 1, '22.50'),
(10, 9, 11, 3, '97.80');

-- --------------------------------------------------------

--
-- Estrutura da tabela `pedido`
--

CREATE TABLE `pedido` (
  `Cod_Pedido` int(11) NOT NULL,
  `CPF_Cliente` char(14) NOT NULL,
  `Data_Pedido` date NOT NULL,
  `Valor_Total` decimal(10,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `pedido`
--

INSERT INTO `pedido` (`Cod_Pedido`, `CPF_Cliente`, `Data_Pedido`, `Valor_Total`) VALUES
(1, '123.456.789-00', '2024-09-01', '150.75'),
(2, '456.789.012-33', '2024-09-02', '300.50'),
(3, '234.567.890-11', '2024-09-03', '99.99'),
(4, '567.890.123-44', '2024-09-04', '500.00'),
(5, '345.678.901-22', '2024-09-05', '250.30'),
(6, '111.222.333-44', '2024-11-27', '67.50'),
(7, '123.456.789-00', '2024-11-27', '60.00'),
(8, '111.222.333-44', '2024-11-27', '50.00'),
(9, '111.222.333-44', '2024-11-27', '120.30');

-- --------------------------------------------------------

--
-- Estrutura da tabela `produto`
--

CREATE TABLE `produto` (
  `Cod_Produto` int(11) NOT NULL,
  `Nome_Produto` varchar(100) NOT NULL,
  `Quantidade_Produto_Disponivel` int(11) NOT NULL,
  `Preco_Produto` decimal(10,2) NOT NULL,
  `Cod_Categoria` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `produto`
--

INSERT INTO `produto` (`Cod_Produto`, `Nome_Produto`, `Quantidade_Produto_Disponivel`, `Preco_Produto`, `Cod_Categoria`) VALUES
(1, 'Rosa Vermelha', 100, '5.50', 1),
(2, 'Vaso Grande', 50, '50.00', 2),
(3, 'Girassol', 200, '3.75', 1),
(4, 'Adubo Organico', 150, '15.00', 3),
(5, 'Semente de Tomate', 80, '7.25', 4),
(6, 'Tesoura de Grama', 60, '20.00', 5),
(7, 'Terra Vermelha', 150, '12.50', 6),
(8, 'Terra Argilosa', 120, '17.00', 6),
(9, 'Vaso Pequeno', 28, '25.00', 2),
(10, 'Adubo Sintetico', 36, '22.50', 3),
(11, 'Orquideas', 77, '32.60', 1),
(12, 'Avental Rosa M', 8, '30.00', 9);

-- --------------------------------------------------------

--
-- Estrutura da tabela `usuarios`
--

CREATE TABLE `usuarios` (
  `id` int(11) NOT NULL,
  `usuario` varchar(50) NOT NULL,
  `senha` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `usuarios`
--

INSERT INTO `usuarios` (`id`, `usuario`, `senha`) VALUES
(1, 'vendedor', '123');

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `categoria`
--
ALTER TABLE `categoria`
  ADD PRIMARY KEY (`Cod_Categoria`);

--
-- Índices para tabela `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`CPF_Cliente`);

--
-- Índices para tabela `item_pedido`
--
ALTER TABLE `item_pedido`
  ADD PRIMARY KEY (`Cod_Item_Pedido`),
  ADD KEY `Cod_Pedido` (`Cod_Pedido`),
  ADD KEY `Cod_Produto` (`Cod_Produto`);

--
-- Índices para tabela `pedido`
--
ALTER TABLE `pedido`
  ADD PRIMARY KEY (`Cod_Pedido`),
  ADD KEY `CPF_Cliente` (`CPF_Cliente`);

--
-- Índices para tabela `produto`
--
ALTER TABLE `produto`
  ADD PRIMARY KEY (`Cod_Produto`),
  ADD KEY `Cod_Categoria` (`Cod_Categoria`);

--
-- Índices para tabela `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `item_pedido`
--
ALTER TABLE `item_pedido`
  MODIFY `Cod_Item_Pedido` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de tabela `pedido`
--
ALTER TABLE `pedido`
  MODIFY `Cod_Pedido` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT de tabela `produto`
--
ALTER TABLE `produto`
  MODIFY `Cod_Produto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT de tabela `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Restrições para despejos de tabelas
--

--
-- Limitadores para a tabela `item_pedido`
--
ALTER TABLE `item_pedido`
  ADD CONSTRAINT `item_pedido_ibfk_1` FOREIGN KEY (`Cod_Pedido`) REFERENCES `pedido` (`Cod_Pedido`),
  ADD CONSTRAINT `item_pedido_ibfk_2` FOREIGN KEY (`Cod_Produto`) REFERENCES `produto` (`Cod_Produto`);

--
-- Limitadores para a tabela `pedido`
--
ALTER TABLE `pedido`
  ADD CONSTRAINT `pedido_ibfk_1` FOREIGN KEY (`CPF_Cliente`) REFERENCES `cliente` (`CPF_Cliente`);

--
-- Limitadores para a tabela `produto`
--
ALTER TABLE `produto`
  ADD CONSTRAINT `produto_ibfk_1` FOREIGN KEY (`Cod_Categoria`) REFERENCES `categoria` (`Cod_Categoria`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
