-- phpMyAdmin SQL Dump
-- version 4.7.5
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost
-- Tiempo de generación: 22-03-2021 a las 08:53:08
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
-- Base de datos: `el8102`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `asistencias`
--

CREATE TABLE `asistencias` (
  `Nombre_persona` varchar(25) NOT NULL,
  `Dni` varchar(9) NOT NULL,
  `nombre_evento` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empresa`
--

CREATE TABLE `empresa` (
  `Nif` varchar(9) NOT NULL,
  `nombre` varchar(30) NOT NULL,
  `razon_social` varchar(40) NOT NULL,
  `cnae` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `empresa`
--

INSERT INTO `empresa` (`Nif`, `nombre`, `razon_social`, `cnae`) VALUES
('12345678Z', 'Estanco', 'venta variada de cigarros', 52412),
('15724682L', 'JVS', 'construccion y remodelacion de pisos', 34962);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `evento`
--

CREATE TABLE `evento` (
  `Nombre` varchar(20) NOT NULL,
  `Direccion` varchar(50) NOT NULL,
  `fecha` date NOT NULL,
  `hora_inicio` time NOT NULL,
  `hora_fin` time NOT NULL,
  `max_personas` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `evento`
--

INSERT INTO `evento` (`Nombre`, `Direccion`, `fecha`, `hora_inicio`, `hora_fin`, `max_personas`) VALUES
('ane', 'martin', '2021-03-25', '01:00:00', '04:00:00', 12),
('paco', 'garcia', '2021-03-17', '04:00:00', '04:30:00', 44),
('patxi', 'perez', '2021-03-17', '01:00:00', '03:00:00', 33),
('paz', 'padilla', '2021-03-16', '02:30:00', '03:30:00', 77);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `persona`
--

CREATE TABLE `persona` (
  `Nombre` varchar(25) NOT NULL,
  `Dni` varchar(9) NOT NULL,
  `telefono` varchar(9) NOT NULL,
  `empresa_nif` varchar(9) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `asistencias`
--
ALTER TABLE `asistencias`
  ADD PRIMARY KEY (`Nombre_persona`,`Dni`,`nombre_evento`) USING BTREE,
  ADD KEY `FK_as_evento` (`nombre_evento`),
  ADD KEY `FK_as_dni` (`Dni`,`Nombre_persona`) USING BTREE;

--
-- Indices de la tabla `empresa`
--
ALTER TABLE `empresa`
  ADD PRIMARY KEY (`Nif`);

--
-- Indices de la tabla `evento`
--
ALTER TABLE `evento`
  ADD PRIMARY KEY (`Nombre`);

--
-- Indices de la tabla `persona`
--
ALTER TABLE `persona`
  ADD PRIMARY KEY (`Dni`),
  ADD KEY `FK_empresa` (`empresa_nif`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `asistencias`
--
ALTER TABLE `asistencias`
  ADD CONSTRAINT `FK_as_dni` FOREIGN KEY (`Dni`) REFERENCES `persona` (`Dni`),
  ADD CONSTRAINT `FK_as_evento` FOREIGN KEY (`nombre_evento`) REFERENCES `evento` (`Nombre`);

--
-- Filtros para la tabla `persona`
--
ALTER TABLE `persona`
  ADD CONSTRAINT `FK_empresa` FOREIGN KEY (`empresa_nif`) REFERENCES `empresa` (`Nif`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
