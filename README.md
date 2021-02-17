# Clima con un API externa
Este programa tiene como funcionalidad retornar el clima en formato JSON en una api externo de cualquier ciudad



## Prerequisitos del sistema
* Maven
* Git
* Java
* Heroku

## Descarga,instalacion y ejecución
Primero debemos clonar el repositorio, como veremos en el siguiente comando:

**git clone https://github.com/johanrueda/parcial1Arep**

Ahora ejecutamos una consola de comandos en el directorio donde fue clonado el repositorio y compilar el proyecto con el siguiente comando:

**mvn package**


de esta manera la aplicacion corre localmente, en tu navegador favorito colocas localhost:4546.

Pero tambien dicha aplicacion tiene un despliegue en heroku que puedes utilizar en cualquier momento.

[Heroku](https://parcialarepjohan.herokuapp.com//)


Para ejecutar las pruebas basta con un comando sencillo ya que estan automatizadas con el framework JUnit:

**mvn test**

este es el resultado del programa y lo esperado:


## Documentación

Para generar la documentación de Java Doc ejecute el siguiente comando:

**mvn javadoc:javadoc**

## Desarrollo

Este proyecto se desarrollo con:
* Maven
* Java 8
* Intellij IDEA
* Heroku

## Autor

**Johan David Rueda Rodriguez**

## Licencia
Este proyecto lo contiene la licencia GNU GENERAL PUBLIC LICENSE.
