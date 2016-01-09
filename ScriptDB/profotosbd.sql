-- phpMyAdmin SQL Dump
-- version 4.2.11
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 09-01-2016 a las 08:19:16
-- Versión del servidor: 5.6.21
-- Versión de PHP: 5.6.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `profotosbd`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `articulo`
--

CREATE TABLE IF NOT EXISTS `articulo` (
`id` int(11) NOT NULL,
  `precio` float(18,2) NOT NULL,
  `cantidad` int(11) NOT NULL,
  `costo` float(18,2) NOT NULL,
  `idIva` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `articuloventa`
--

CREATE TABLE IF NOT EXISTS `articuloventa` (
`id` int(11) NOT NULL,
  `precio` float(18,2) NOT NULL,
  `cantidad` int(11) NOT NULL,
  `costo` float(18,2) NOT NULL,
  `idIva` int(11) NOT NULL,
  `idArticulo` int(11) NOT NULL,
  `idVenta` int(11) NOT NULL,
  `idx` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `egreso`
--

CREATE TABLE IF NOT EXISTS `egreso` (
`id` int(11) NOT NULL,
  `nombre` varchar(150) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `egreso`
--

INSERT INTO `egreso` (`id`, `nombre`) VALUES
(1, 'Gasolina');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `egresovalor`
--

CREATE TABLE IF NOT EXISTS `egresovalor` (
`id` int(11) NOT NULL,
  `valor` float(18,2) NOT NULL,
  `idEgreso` int(11) NOT NULL,
  `idVenta` int(11) NOT NULL,
  `idx` int(11) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `egresovalor`
--

INSERT INTO `egresovalor` (`id`, `valor`, `idEgreso`, `idVenta`, `idx`) VALUES
(1, 20.50, 1, 1, 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `evento`
--

CREATE TABLE IF NOT EXISTS `evento` (
`id` int(11) NOT NULL,
  `nombre` varchar(80) NOT NULL,
  `fecha` datetime NOT NULL,
  `lugar` varchar(250) NOT NULL,
  `estado` int(11) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `evento`
--

INSERT INTO `evento` (`id`, `nombre`, `fecha`, `lugar`, `estado`) VALUES
(1, 'Graduación ITSON 2011-2015', '2016-01-01 13:30:00', 'ITSON GUAYMAS', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `historial`
--

CREATE TABLE IF NOT EXISTS `historial` (
`id` int(11) NOT NULL,
  `fecha` datetime NOT NULL,
  `cantidad` int(11) NOT NULL,
  `motivo` varchar(500) NOT NULL,
  `costo` float(18,2) NOT NULL,
  `tipoMovimiento` int(11) NOT NULL,
  `idArticulo` int(11) NOT NULL,
  `idx` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `iva`
--

CREATE TABLE IF NOT EXISTS `iva` (
`id` int(11) NOT NULL,
  `tasa` int(11) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `iva`
--

INSERT INTO `iva` (`id`, `tasa`) VALUES
(1, 16);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `sueldos`
--

CREATE TABLE IF NOT EXISTS `sueldos` (
`id` int(11) NOT NULL,
  `sueldoLider` int(11) NOT NULL,
  `sueldoFotografo` int(11) NOT NULL,
  `sueldoVendedor` int(11) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `sueldos`
--

INSERT INTO `sueldos` (`id`, `sueldoLider`, `sueldoFotografo`, `sueldoVendedor`) VALUES
(1, 20, 20, 200);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE IF NOT EXISTS `usuario` (
`id` int(11) NOT NULL,
  `login` varchar(80) NOT NULL,
  `pass` varchar(80) NOT NULL,
  `nombre` varchar(150) NOT NULL,
  `perfil` int(11) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`id`, `login`, `pass`, `nombre`, `perfil`) VALUES
(1, 'admin', 'admin', 'Administrador', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `venta`
--

CREATE TABLE IF NOT EXISTS `venta` (
`id` int(11) NOT NULL,
  `empleado` varchar(80) NOT NULL,
  `tipoEmpleado` int(11) NOT NULL,
  `fecha` datetime NOT NULL,
  `total` float(18,2) NOT NULL,
  `idEvento` int(11) NOT NULL,
  `idx` int(11) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `venta`
--

INSERT INTO `venta` (`id`, `empleado`, `tipoEmpleado`, `fecha`, `total`, `idEvento`, `idx`) VALUES
(1, 'Juan Carlos', 1, '2016-01-02 09:33:00', 100.00, 1, 0);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `articulo`
--
ALTER TABLE `articulo`
 ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `articuloventa`
--
ALTER TABLE `articuloventa`
 ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `egreso`
--
ALTER TABLE `egreso`
 ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `egresovalor`
--
ALTER TABLE `egresovalor`
 ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `evento`
--
ALTER TABLE `evento`
 ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `historial`
--
ALTER TABLE `historial`
 ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `iva`
--
ALTER TABLE `iva`
 ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `sueldos`
--
ALTER TABLE `sueldos`
 ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
 ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `venta`
--
ALTER TABLE `venta`
 ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `articulo`
--
ALTER TABLE `articulo`
MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `articuloventa`
--
ALTER TABLE `articuloventa`
MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `egreso`
--
ALTER TABLE `egreso`
MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT de la tabla `egresovalor`
--
ALTER TABLE `egresovalor`
MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT de la tabla `evento`
--
ALTER TABLE `evento`
MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT de la tabla `historial`
--
ALTER TABLE `historial`
MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `iva`
--
ALTER TABLE `iva`
MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT de la tabla `sueldos`
--
ALTER TABLE `sueldos`
MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT de la tabla `usuario`
--
ALTER TABLE `usuario`
MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT de la tabla `venta`
--
ALTER TABLE `venta`
MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=2;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
