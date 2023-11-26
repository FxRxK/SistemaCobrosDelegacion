# Integridad relacional para proyecto NithDelegación

El sistema a desarrollar necesita de los siguientes módulos:

- Lógin que valida el ingreso en página de inicio
- Módulo de registro de usuarios con visualización para mejor edición de registros
- Módulo de registro de contribuciones con visualización para mejor edición de registros.



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
  `obra` int(11) DEFAULT NULL,
  `abril` int(11) DEFAULT NULL,
  `julio` int(11) DEFAULT NULL,
  `agosto` int(11) DEFAULT NULL,
  `septiembre` int(11) DEFAULT NULL,
  `total` int(11) DEFAULT NULL,
  `observaciones` varchar(255) DEFAULT NULL
)

CREATE TABLE `inteUC` (
  `idUC` int(11) NOT NULL,
  `idUsuario` int(11) DEFAULT NULL,
  `idContribucion` int(11) DEFAULT NULL
)

```

**Diagrama entidad relación**

![Diagrama](/home/Adalberto/Escritorio/bd.png)

