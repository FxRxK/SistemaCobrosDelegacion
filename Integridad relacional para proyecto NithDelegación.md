# Integridad relacional para proyecto NithDelegación

El esquema de SQL para crear estas tablas y establecer las relaciones.

La tecnología usada es MySQL con Java

```sql
CREATE TABLE `usuarios` (
  `id` int(11) NOT NULL,
  `folio` varchar(10) NOT NULL,
  `nombre` varchar(100) DEFAULT NULL,
  `domicilio` varchar(100) DEFAULT NULL,
  `telefono` varchar(10) DEFAULT NULL,
  `correo_electronico` varchar(100) NOT NULL,
  `fecha_nacimiento` date NOT NULL,
  `genero` varchar(30) NOT NULL
)

CREATE TABLE `Contribuciones` (
  `id` int(11) NOT NULL,
  `cantidad_1` int(11) DEFAULT NULL,
  `cantidad_2` int(11) DEFAULT NULL,
  `cantidad_3` int(11) DEFAULT NULL,
  `cantidad_4` int(11) DEFAULT NULL,
  `cantidad_5` int(11) DEFAULT NULL,
  `total` int(11) DEFAULT NULL,
  `observaciones` varchar(255) DEFAULT NULL
)

CREATE TABLE `inteUC` (
  `idUC` int(11) NOT NULL,
  `idUsuario` int(11) DEFAULT NULL,
  `idContribucion` int(11) DEFAULT NULL
)

```

