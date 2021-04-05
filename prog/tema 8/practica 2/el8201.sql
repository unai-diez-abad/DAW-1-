-- phpMyAdmin SQL Dump
-- version 4.7.5
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost
-- Tiempo de generación: 05-04-2021 a las 10:25:25
-- Versión del servidor: 5.6.34
-- Versión de PHP: 5.6.32

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `el8201`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `abogado`
--

CREATE TABLE `abogado` (
  `Dni` varchar(9) NOT NULL,
  `nombre` varchar(20) NOT NULL,
  `apellidos` varchar(50) NOT NULL,
  `direccion` varchar(80) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `abogado`
--

INSERT INTO `abogado` (`Dni`, `nombre`, `apellidos`, `direccion`) VALUES
('12345678b', 'Dani', 'diaz', 'paaaaaaaa');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `abogadocaso`
--

CREATE TABLE `abogadocaso` (
  `numexpediente` varchar(10) NOT NULL,
  `Dniabogado` varchar(9) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `abogadocaso`
--

INSERT INTO `abogadocaso` (`numexpediente`, `Dniabogado`) VALUES
('45811', '12345678b');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `caso`
--

CREATE TABLE `caso` (
  `numexpediente` varchar(10) NOT NULL,
  `cliente` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `caso`
--

INSERT INTO `caso` (`numexpediente`, `cliente`) VALUES
('45811', 'patxi');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `Dni` varchar(9) NOT NULL,
  `nombre` varchar(20) NOT NULL,
  `apellidos` varchar(50) NOT NULL,
  `direccion` varchar(80) NOT NULL,
  `telefonocontacto` varchar(9) NOT NULL,
  `correoelectronico` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`Dni`, `nombre`, `apellidos`, `direccion`, `telefonocontacto`, `correoelectronico`) VALUES
('padilla', 'ss', 'dd', 'ee', 'rr', 'gg'),
('patxi', 'se', 'dd', 'ff', 'gg', 'hh');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `juicio`
--

CREATE TABLE `juicio` (
  `numexpediente` varchar(10) NOT NULL,
  `finicio` date NOT NULL,
  `ffin` date DEFAULT NULL,
  `estado` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `juicio`
--

INSERT INTO `juicio` (`numexpediente`, `finicio`, `ffin`, `estado`) VALUES
('45811', '2021-03-10', NULL, 'arc');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `abogado`
--
ALTER TABLE `abogado`
  ADD PRIMARY KEY (`Dni`);

--
-- Indices de la tabla `abogadocaso`
--
ALTER TABLE `abogadocaso`
  ADD PRIMARY KEY (`numexpediente`,`Dniabogado`) USING BTREE,
  ADD KEY `FK_ac_dniab` (`Dniabogado`);

--
-- Indices de la tabla `caso`
--
ALTER TABLE `caso`
  ADD PRIMARY KEY (`numexpediente`),
  ADD KEY `FK_cl_cliente` (`cliente`);

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`Dni`);

--
-- Indices de la tabla `juicio`
--
ALTER TABLE `juicio`
  ADD PRIMARY KEY (`numexpediente`,`finicio`) USING BTREE;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `abogadocaso`
--
ALTER TABLE `abogadocaso`
  ADD CONSTRAINT `FK_ac_dniab` FOREIGN KEY (`Dniabogado`) REFERENCES `abogado` (`Dni`) ON DELETE CASCADE,
  ADD CONSTRAINT `FK_expediente` FOREIGN KEY (`numexpediente`) REFERENCES `caso` (`numexpediente`) ON DELETE CASCADE;

--
-- Filtros para la tabla `caso`
--
ALTER TABLE `caso`
  ADD CONSTRAINT `FK_cl_cliente` FOREIGN KEY (`cliente`) REFERENCES `cliente` (`Dni`) ON DELETE CASCADE;

--
-- Filtros para la tabla `juicio`
--
ALTER TABLE `juicio`
  ADD CONSTRAINT `FK_casojuicio` FOREIGN KEY (`numexpediente`) REFERENCES `caso` (`numexpediente`) ON DELETE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
