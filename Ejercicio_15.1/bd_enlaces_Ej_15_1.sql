-- phpMyAdmin SQL Dump
-- version 3.3.5
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 16-05-2014 a las 23:48:57
-- Versión del servidor: 5.1.49
-- Versión de PHP: 5.3.3

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `bd_enlaces`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `enlaces`
--

CREATE TABLE IF NOT EXISTS `enlaces` (
  `id_enlaces` int(11) NOT NULL AUTO_INCREMENT,
  `url` varchar(50) COLLATE utf8_spanish2_ci NOT NULL,
  `titulo` varchar(40) COLLATE utf8_spanish2_ci NOT NULL,
  `comentario` varchar(200) COLLATE utf8_spanish2_ci NOT NULL,
  `id_usuario` int(11) NOT NULL,
  `privado` tinyint(1) NOT NULL,
  PRIMARY KEY (`id_enlaces`)
) ENGINE=MyISAM  DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci AUTO_INCREMENT=9 ;

--
-- Volcar la base de datos para la tabla `enlaces`
--

INSERT INTO `enlaces` (`id_enlaces`, `url`, `titulo`, `comentario`, `id_usuario`, `privado`) VALUES
(1, 'www.coches.es', 'Web sobre el automovil', '---', 1, 0),
(2, 'www.patatas.com', 'Web sobre el mundo de la patata', '---', 1, 1),
(3, 'www.boligrafos.com', 'Compra venta de boligrafos', 'Buenos precios', 2, 0),
(4, 'www.informatica.com', 'Compra venta de equipos informaticos', 'Buenos precios', 2, 1),
(5, 'www.querico.es', 'Web sobre gastronomia', 'recetas y mas', 3, 0),
(6, 'www.lechugas.com', 'Web sobre las lechugas', '---', 3, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `etiquetas`
--

CREATE TABLE IF NOT EXISTS `etiquetas` (
  `id_enlace` int(11) NOT NULL,
  `etiqueta` varchar(20) CHARACTER SET ucs2 COLLATE ucs2_spanish2_ci NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

--
-- Volcar la base de datos para la tabla `etiquetas`
--

INSERT INTO `etiquetas` (`id_enlace`, `etiqueta`) VALUES
(1, 'coches'),
(1, 'automoviles'),
(2, 'patata'),
(2, 'tuberculo'),
(3, 'boligrafos'),
(3, 'compra'),
(3, 'venta'),
(4, 'informatica'),
(4, 'compra'),
(4, 'venta'),
(5, 'recetas'),
(5, 'gastronomia'),
(6, 'lechugas'),
(6, 'huerta');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE IF NOT EXISTS `usuarios` (
  `id_usuario` int(11) NOT NULL AUTO_INCREMENT,
  `login` varchar(15) COLLATE utf8_spanish2_ci NOT NULL,
  `clave` varchar(15) COLLATE utf8_spanish2_ci NOT NULL,
  `nombre_completo` varchar(20) COLLATE utf8_spanish2_ci NOT NULL,
  PRIMARY KEY (`id_usuario`)
) ENGINE=MyISAM  DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci AUTO_INCREMENT=13 ;

--
-- Volcar la base de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`id_usuario`, `login`, `clave`, `nombre_completo`) VALUES
(1, 'manuel', '1234', 'Manuel Garcia'),
(2, 'pepe', '1234', 'Pepe Lopez'),
(3, 'antonio', '1234', 'Antonio Lopez');
