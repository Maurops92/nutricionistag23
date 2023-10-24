-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 24-10-2023 a las 23:58:26
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `nutricionistag23`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `comida`
--

CREATE TABLE `comida` (
  `idComida` int(11) NOT NULL,
  `nombre` varchar(30) NOT NULL,
  `detalle` varchar(100) NOT NULL,
  `cantCalorias` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `comida`
--

INSERT INTO `comida` (`idComida`, `nombre`, `detalle`, `cantCalorias`) VALUES
(1, 'Merluza', 'filet de merluza de 400 gr acompañada de ensalada', 200),
(2, 'Frutos secos', '100 gr de frutos secos variados', 300),
(3, 'Huevos', ' 2 Huevos hervidos 6\'', 120),
(4, 'Solomillo', 'Solomillo de cerdo de 350 gr magro con ensalada', 250),
(7, 'Medallon de pollo', 'Medallon de pollo de 200 gr con pure de zapallo', 450),
(8, 'Ñoquis de Calabaza', '200 gr de ñoquis de calabaza con salsa de tomate', 350),
(9, 'Manzana', 'Manzana entera', 140),
(10, 'Barrita energetica', 'Barrita energetica a eleccion Gallo.', 200),
(11, 'Granola', 'Mix de Granola', 100),
(12, 'Hamburguesa', '1 Hamburguesa casera de carne magra 100 gr con pure de zapallo\n', 250),
(13, 'Compota de Frutas', 'Compota de frutas de estacion con edulcorante', 150),
(14, 'Filet de Salmon', 'Salmon rosado 250 gr con salsa de soja y verduras asadas', 400),
(15, 'Tarta de verdura', 'Tarta de verdura de estacion con ensalada', 150),
(16, 'Bife magro', 'Bife magro de 200 gr con vegetales salteados con salsa de soja', 300),
(17, 'Permitido de semana', 'Permitido random a eleccion del paciente que no supere 1000 calorias', 1000),
(18, 'Queso y uvas', 'mix de quesos blandos con uvas', 100);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `dieta`
--

CREATE TABLE `dieta` (
  `idDieta` int(11) NOT NULL,
  `nombre` varchar(30) NOT NULL,
  `idPaciente` int(11) NOT NULL,
  `fechaInicial` date NOT NULL,
  `pesoInicial` double NOT NULL,
  `pesoFinal` double NOT NULL,
  `fechaFinal` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `dieta`
--

INSERT INTO `dieta` (`idDieta`, `nombre`, `idPaciente`, `fechaInicial`, `pesoInicial`, `pesoFinal`, `fechaFinal`) VALUES
(2, 'Keto', 9, '2023-08-25', 100.5, 94.9, '2023-08-30'),
(3, 'Musculos Pereyra', 14, '2023-10-02', 70, 73, '2023-10-09'),
(4, 'Musculos Pereyra II', 14, '2023-10-09', 72.5, 75, '2023-10-16'),
(5, 'Musculos Pereyra III', 14, '2023-10-23', 75, 80, '2023-10-30');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `dietacomida`
--

CREATE TABLE `dietacomida` (
  `idDietaComida` int(11) NOT NULL,
  `idComida` int(11) NOT NULL,
  `idDieta` int(11) NOT NULL,
  `horario` varchar(20) DEFAULT NULL,
  `dia` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `dietacomida`
--

INSERT INTO `dietacomida` (`idDietaComida`, `idComida`, `idDieta`, `horario`, `dia`) VALUES
(1, 2, 2, 'DESAYUNO', 'LUNES'),
(2, 4, 2, 'CENA', 'MARTES'),
(5, 1, 2, 'CENA', 'LUNES'),
(6, 3, 3, 'DESAYUNO', 'LUNES'),
(7, 4, 3, 'ALMUERZO', 'LUNES'),
(8, 4, 3, 'MERIENDA', 'LUNES'),
(9, 2, 3, 'CENA', 'LUNES'),
(10, 3, 3, 'SNACK', 'LUNES'),
(11, 3, 3, 'DESAYUNO', 'MARTES'),
(12, 2, 3, 'ALMUERZO', 'MARTES'),
(13, 3, 3, 'MERIENDA', 'MARTES'),
(14, 7, 3, 'CENA', 'MARTES'),
(15, 3, 3, 'SNACK', 'MARTES'),
(16, 15, 2, 'ALMUERZO', 'LUNES'),
(17, 9, 2, 'MERIENDA', 'LUNES'),
(18, 11, 2, 'SNACK', 'LUNES'),
(19, 13, 2, 'DESAYUNO', 'MARTES'),
(20, 12, 2, 'ALMUERZO', 'MARTES'),
(21, 2, 2, 'MERIENDA', 'MARTES'),
(22, 18, 2, 'SNACK', 'MARTES'),
(23, 11, 2, 'DESAYUNO', 'MIERCOLES'),
(24, 8, 2, 'ALMUERZO', 'MIERCOLES'),
(25, 18, 2, 'MERIENDA', 'MIERCOLES'),
(26, 14, 2, 'CENA', 'MIERCOLES'),
(27, 3, 2, 'SNACK', 'MIERCOLES'),
(28, 11, 2, 'SNACK', 'JUEVES'),
(29, 18, 2, 'SNACK', 'VIERNES'),
(30, 9, 2, 'SNACK', 'SABADO'),
(31, 2, 2, 'SNACK', 'DOMINGO'),
(32, 3, 2, 'DESAYUNO', 'JUEVES'),
(33, 18, 2, 'DESAYUNO', 'VIERNES'),
(34, 11, 2, 'DESAYUNO', 'SABADO'),
(35, 10, 2, 'DESAYUNO', 'DOMINGO'),
(36, 15, 2, 'ALMUERZO', 'JUEVES'),
(37, 16, 2, 'ALMUERZO', 'VIERNES'),
(38, 4, 2, 'ALMUERZO', 'SABADO'),
(39, 14, 2, 'ALMUERZO', 'DOMINGO'),
(41, 2, 2, 'MERIENDA', 'VIERNES'),
(42, 3, 2, 'MERIENDA', 'SABADO'),
(43, 9, 2, 'MERIENDA', 'DOMINGO'),
(44, 12, 2, 'CENA', 'JUEVES'),
(45, 15, 2, 'CENA', 'VIERNES'),
(46, 17, 2, 'CENA', 'SABADO'),
(47, 7, 2, 'CENA', 'DOMINGO'),
(48, 9, 2, 'MERIENDA', 'JUEVES');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `historial`
--

CREATE TABLE `historial` (
  `idHistorial` int(11) NOT NULL,
  `idPaciente` int(11) NOT NULL,
  `peso` double NOT NULL,
  `fechaRegistro` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `historial`
--

INSERT INTO `historial` (`idHistorial`, `idPaciente`, `peso`, `fechaRegistro`) VALUES
(2, 1, 110, '2023-10-09'),
(3, 1, 109.6, '2023-10-10'),
(4, 1, 100.8, '2023-10-12'),
(6, 1, 60, '2023-10-12'),
(7, 1, 70, '2023-10-12'),
(8, 1, 80, '2023-10-12'),
(9, 1, 90, '2023-10-10'),
(10, 2, 90, '2023-10-12'),
(11, 2, 88, '2023-10-04'),
(12, 2, 100, '1991-10-02'),
(13, 9, 98, '2023-08-27'),
(14, 9, 97, '2023-08-28'),
(15, 9, 96, '2023-08-29'),
(16, 9, 110, '2023-09-21'),
(17, 9, 95, '2023-08-30'),
(18, 14, 70, '2023-10-02'),
(19, 14, 71, '2023-10-05'),
(20, 14, 73, '2023-10-09'),
(21, 14, 72.8, '2023-10-14'),
(22, 14, 70, '2023-10-16');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `paciente`
--

CREATE TABLE `paciente` (
  `nombre` varchar(100) NOT NULL,
  `idPaciente` int(11) NOT NULL,
  `dni` int(11) NOT NULL,
  `domicilio` varchar(100) NOT NULL,
  `telefono` varchar(30) NOT NULL,
  `pesoActual` double NOT NULL,
  `pesoDeseado` double NOT NULL,
  `estatura` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `paciente`
--

INSERT INTO `paciente` (`nombre`, `idPaciente`, `dni`, `domicilio`, `telefono`, `pesoActual`, `pesoDeseado`, `estatura`) VALUES
('Dario', 1, 12345679, 'Italia 987', '381-9346418', 111, 90, 1.85),
('Marcos', 2, 12345688, 'Tucuman 654', '381-2351563', 71, 72, 1.65),
('Carina', 3, 12345689, 'Paris 123', '381-9234561', 80, 55, 1.55),
('Perez Juan', 8, 12905636, 'Las heras 252', '381-7425369', 0, 0, 1.75),
('Carabetta Jonathan Adrian', 9, 38153558, 'Neuquen 659', '381-4658201', 99.6, 89.9, 1.65),
('Cabral Lucas', 10, 36985254, 'Mendoza 786', '381-5534440', 100, 90, 0),
('Juarez Angel', 13, 23456987, 'San miguel de Tucuman', '381-4689752', 50, 70, 1),
('Pereyra Bruno', 14, 12345666, 'San martin 890', '261-5524440', 70, 75, 1.7);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `comida`
--
ALTER TABLE `comida`
  ADD PRIMARY KEY (`idComida`);

--
-- Indices de la tabla `dieta`
--
ALTER TABLE `dieta`
  ADD PRIMARY KEY (`idDieta`),
  ADD KEY `idPaciente` (`idPaciente`);

--
-- Indices de la tabla `dietacomida`
--
ALTER TABLE `dietacomida`
  ADD PRIMARY KEY (`idDietaComida`),
  ADD KEY `idDieta` (`idDieta`),
  ADD KEY `idComida` (`idComida`);

--
-- Indices de la tabla `historial`
--
ALTER TABLE `historial`
  ADD PRIMARY KEY (`idHistorial`),
  ADD KEY `idPaciente` (`idPaciente`);

--
-- Indices de la tabla `paciente`
--
ALTER TABLE `paciente`
  ADD PRIMARY KEY (`idPaciente`),
  ADD UNIQUE KEY `dni` (`dni`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `comida`
--
ALTER TABLE `comida`
  MODIFY `idComida` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;

--
-- AUTO_INCREMENT de la tabla `dieta`
--
ALTER TABLE `dieta`
  MODIFY `idDieta` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `dietacomida`
--
ALTER TABLE `dietacomida`
  MODIFY `idDietaComida` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=49;

--
-- AUTO_INCREMENT de la tabla `historial`
--
ALTER TABLE `historial`
  MODIFY `idHistorial` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=23;

--
-- AUTO_INCREMENT de la tabla `paciente`
--
ALTER TABLE `paciente`
  MODIFY `idPaciente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `dieta`
--
ALTER TABLE `dieta`
  ADD CONSTRAINT `dieta_ibfk_1` FOREIGN KEY (`idPaciente`) REFERENCES `paciente` (`idPaciente`);

--
-- Filtros para la tabla `dietacomida`
--
ALTER TABLE `dietacomida`
  ADD CONSTRAINT `dietacomida_ibfk_1` FOREIGN KEY (`idDieta`) REFERENCES `dieta` (`idDieta`),
  ADD CONSTRAINT `dietacomida_ibfk_2` FOREIGN KEY (`idComida`) REFERENCES `comida` (`idComida`);

--
-- Filtros para la tabla `historial`
--
ALTER TABLE `historial`
  ADD CONSTRAINT `historial_ibfk_1` FOREIGN KEY (`idPaciente`) REFERENCES `paciente` (`idPaciente`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
