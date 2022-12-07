-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 02-Dez-2022 às 14:47
-- Versão do servidor: 10.4.24-MariaDB
-- versão do PHP: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `get_poc`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `aluno`
--

CREATE TABLE `aluno` (
  `Nome` varchar(60) NOT NULL,
  `Matricula` varchar(7) NOT NULL,
  `Senha` varchar(60) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `aluno`
--

INSERT INTO `aluno` (`Nome`, `Matricula`, `Senha`) VALUES
('João', 'EF04212', 'vieira'),
('Juan', 'EF04229', 'avelar'),
('ciclano', 'EF2003', 'detal');

-- --------------------------------------------------------

--
-- Estrutura da tabela `poc`
--

CREATE TABLE `poc` (
  `ID_POC` int(11) NOT NULL,
  `titulo` varchar(100) NOT NULL,
  `lista_autores` text NOT NULL,
  `orientador` varchar(60) NOT NULL,
  `coorientador` varchar(60) NOT NULL,
  `data_postagem` date NOT NULL,
  `palavras_chave` text NOT NULL,
  `resumo` text NOT NULL,
  `area` varchar(60) NOT NULL,
  `caminho_PDF` varchar(100) NOT NULL,
  `usuarioCadastro` varchar(7) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `poc`
--

INSERT INTO `poc` (`ID_POC`, `titulo`, `lista_autores`, `orientador`, `coorientador`, `data_postagem`, `palavras_chave`, `resumo`, `area`, `caminho_PDF`, `usuarioCadastro`) VALUES
(5, 'Titulo1', 'Autor1 Autor2', 'Fabricio', 'Daniel', '2022-01-01', 'Primeiro-POC', 'ABW', 'CDC', 'KJNJFDJHNJÇKJ', 'inicial'),
(6, 'Titulo2', 'Autor2 Autor3', 'Daniel', 'Thais', '2022-01-03', 'Segundo-POC', 'wba', 'COMPUTAÇÃO', 'KJNJFDJHNJJFHUHHÇKJ', 'inicial'),
(7, 'Titulo3', 'Autor3 Autor1', 'Fabricio', 'Marcus', '2022-11-26', 'Terceiro-POC', 'ABWjhbjhb', 'EXATAS', 'KJkldsjfiuhdfiNJFDJHNJÇKJ', 'inicial');

-- --------------------------------------------------------

--
-- Estrutura da tabela `professor`
--

CREATE TABLE `professor` (
  `nome` varchar(60) NOT NULL,
  `matricula` varchar(7) NOT NULL,
  `senha` varchar(60) NOT NULL,
  `e_ADM` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `professor`
--

INSERT INTO `professor` (`nome`, `matricula`, `senha`, `e_ADM`) VALUES
('Vinícius', 'EF04242', 'ferreira', 1),
('Leonardo', 'EF04702', 'aguiar', 1),
('Glaucia-chan', 'EF8562', 'kawaii', 0);

-- --------------------------------------------------------

--
-- Estrutura da tabela `usuario`
--

CREATE TABLE `usuario` (
  `Nome` varchar(100) NOT NULL,
  `Matricula` varchar(6) NOT NULL,
  `Senha` varchar(30) NOT NULL,
  `Tipo` varchar(9) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `usuario`
--

INSERT INTO `usuario` (`Nome`, `Matricula`, `Senha`, `Tipo`) VALUES
('Jose Augusto Lendario Nascif ', '??????', '10111100', 'Professor'),
('Leonardo dipices', 'ef4702', 'entregastes', 'Aluno'),
('Juan Pablo Skolbar', 'ef4707', 'skolpenbar', 'aluno');

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `aluno`
--
ALTER TABLE `aluno`
  ADD PRIMARY KEY (`Matricula`);

--
-- Índices para tabela `poc`
--
ALTER TABLE `poc`
  ADD PRIMARY KEY (`ID_POC`);

--
-- Índices para tabela `professor`
--
ALTER TABLE `professor`
  ADD PRIMARY KEY (`matricula`);

--
-- Índices para tabela `usuario`
--
ALTER TABLE `usuario`
  ADD UNIQUE KEY `Matricula` (`Matricula`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `poc`
--
ALTER TABLE `poc`
  MODIFY `ID_POC` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
