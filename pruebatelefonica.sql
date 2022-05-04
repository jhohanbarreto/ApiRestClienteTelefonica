-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 04-05-2022 a las 20:02:53
-- Versión del servidor: 10.4.22-MariaDB
-- Versión de PHP: 8.1.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `pruebatelefonica`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clientes`
--

CREATE TABLE `clientes` (
  `id_cliente` int(11) NOT NULL,
  `apellido_cliente` varchar(255) DEFAULT NULL,
  `fecha_nacimiento` date DEFAULT NULL,
  `nombre_cliente` varchar(255) DEFAULT NULL,
  `numero_documento` int(11) DEFAULT NULL,
  `tipo_documento` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `clientes`
--

INSERT INTO `clientes` (`id_cliente`, `apellido_cliente`, `fecha_nacimiento`, `nombre_cliente`, `numero_documento`, `tipo_documento`) VALUES
(1, 'barreto', '2022-05-07', 'jhohan', 72256598, 'DNI'),
(3, 'Vivanco', '2001-06-15', 'Genesis', 785659856, 'DNI'),
(4, 'Sarzo', '2012-05-16', 'Rosa', 748565981, 'Pasaporte');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `linea_movil`
--

CREATE TABLE `linea_movil` (
  `id_linea_movil` int(11) NOT NULL,
  `estado` bit(1) DEFAULT NULL,
  `id_cliente` int(11) DEFAULT NULL,
  `nombre_plan` varchar(255) DEFAULT NULL,
  `numero_telefono` int(11) DEFAULT NULL,
  `tipo` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `linea_movil`
--

INSERT INTO `linea_movil` (`id_linea_movil`, `estado`, `id_cliente`, `nombre_plan`, `numero_telefono`, `tipo`) VALUES
(1, b'1', 1, 'Plan S/ 29.90', 936528225, 'Postpago'),
(2, b'1', 1, 'Plan Prepago', 985236582, 'Prepago'),
(3, b'1', 1, 'Plan S/. 39.90', 935853321, 'Postpago'),
(4, b'1', 3, 'Plan S/. 49.90', 986523654, 'Postpago'),
(5, b'1', 4, 'Plan S/. 65.90', 968565456, 'Postpago');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `oferta`
--

CREATE TABLE `oferta` (
  `id_oferta` int(11) NOT NULL,
  `codigo_oferta` varchar(255) DEFAULT NULL,
  `descripcion_oferta` varchar(255) DEFAULT NULL,
  `fecha_fin` date DEFAULT NULL,
  `fecha_inicio` date DEFAULT NULL,
  `id_linea_movil` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `oferta`
--

INSERT INTO `oferta` (`id_oferta`, `codigo_oferta`, `descripcion_oferta`, `fecha_fin`, `fecha_inicio`, `id_linea_movil`) VALUES
(1, 'E2001001', 'El plan no admite recargo', '2022-05-06', '2022-05-04', 2),
(2, 'E2001002', 'Si no se paga en el tiempo pactado se cobrará mora.', '2022-06-04', '2022-05-04', 1),
(3, 'E2001003', 'Si no se paga en el tiempo pactado se cobrará mora.', '2022-05-04', '2022-05-31', 3),
(4, 'E2001004', 'Si no se paga en el tiempo pactado se cobrará mora.', '2022-05-06', '2022-05-30', 4),
(5, 'E2001005', 'Si no se paga en el tiempo pactado se cobrará mora.', '2022-05-07', '2022-05-27', 5);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `clientes`
--
ALTER TABLE `clientes`
  ADD PRIMARY KEY (`id_cliente`);

--
-- Indices de la tabla `linea_movil`
--
ALTER TABLE `linea_movil`
  ADD PRIMARY KEY (`id_linea_movil`),
  ADD KEY `id_cliente` (`id_cliente`);

--
-- Indices de la tabla `oferta`
--
ALTER TABLE `oferta`
  ADD PRIMARY KEY (`id_oferta`),
  ADD KEY `id_linea_movil` (`id_linea_movil`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `clientes`
--
ALTER TABLE `clientes`
  MODIFY `id_cliente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `linea_movil`
--
ALTER TABLE `linea_movil`
  MODIFY `id_linea_movil` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `oferta`
--
ALTER TABLE `oferta`
  MODIFY `id_oferta` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `linea_movil`
--
ALTER TABLE `linea_movil`
  ADD CONSTRAINT `linea_movil_ibfk_1` FOREIGN KEY (`id_cliente`) REFERENCES `clientes` (`id_cliente`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `oferta`
--
ALTER TABLE `oferta`
  ADD CONSTRAINT `oferta_ibfk_1` FOREIGN KEY (`id_linea_movil`) REFERENCES `linea_movil` (`id_linea_movil`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
