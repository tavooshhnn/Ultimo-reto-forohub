Foro Hub - API REST para un foro de discusión

Este proyecto es una API REST desarrollada con Spring Boot para un foro de discusión en línea. Permite a los usuarios registrarse, iniciar sesión, crear tópicos, comentar en ellos y más.

Características principales

Autenticación con JWT: Los usuarios se autentican mediante JSON Web Tokens (JWT) para acceder a las funcionalidades protegidas.

Gestión de usuarios: Permite el registro e inicio de sesión de usuarios.

Creación de tópicos: Los usuarios pueden crear nuevos tópicos de discusión.

Comentarios en tópicos: Los usuarios pueden comentar en los tópicos existentes.

Migraciones de base de datos: Utiliza Flyway para gestionar las migraciones de la base de datos.

Seguridad: Implementa Spring Security para proteger las rutas y recursos de la API.

Tecnologías utilizadas

Java: Versión 17 o superior

Spring Boot: Versión 3 o superior

Maven: Versión 4 o superior

Spring Security: Para la autenticación y autorización

JWT (JSON Web Tokens): Para la autenticación de usuarios

MySQL: Versión 8 o superior

Flyway: Para las migraciones de base de datos

Lombok: Para reducir el código repetitivo

IntelliJ IDEA: IDE recomendado (opcional)

Insomnia: Para realizar pruebas de las rutas de la API

Dependencias principales

Spring Web: Para la construcción de APIs REST

Spring Boot DevTools: Para el desarrollo rápido con recarga automática de cambios

Spring Data JPA: Para el acceso y gestión de datos con JPA/Hibernate

Flyway Migration: Para gestionar la evolución de la base de datos

MySQL Driver: Para conectarse a la base de datos MySQL

Validation: Para realizar validaciones de datos

Spring Security: Para manejar autenticación y autorización

Lombok: Para simplificar el código eliminando getters, setters y constructores repetitivos

Instalación

Clonar el repositorio:

git clone https://github.com/tu-usuario/tu-repositorio.git

Configurar la base de datos:

Crear una base de datos MySQL.

Actualizar la configuración de la base de datos en el archivo application.properties.

Ejecutar la aplicación:
