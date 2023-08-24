# TALLER 1: APLICACIONES DISTRIBUIDAS (HTTP, SOCKETS, HTML, JS,MAVEN, GIT)
Aplicación de consulta de descripciones de películas. Esta aplicación se conecta a un API externo para obtener las descripciones de películas. 
El usuario puede buscar una película por título y la aplicación mostrará una tabla con información sobre la película, como el género, la duración, la clasificación por edades y la sinopsis.

## Iniciando
Para descargar el repositorio y verlo local, utiliza el siguiente código:
```
  git clone https://github.com/YeSte114/AREP_LAB01.git
```
```
  cd AREP_LAB01
```
### Prerequisitos
Es necesario tener Java 8 y Maven instalados. Compruebe con los siguientes comandos:

```
java --version
mvn --version
```
### Instalación

Habilitar su IDE para correr el programa con maven, en este caso se usa NetBeans:
![](.README_images/2023-08 190340.png)

y darler run a la clase main de la clase HttpServer. Por otro lado tambien puede corre el proyecto con los siguientes comandos

```
mvn package
```

Y luego

```
mvn clean package exec:java -D "exec.mainClass"="edu.escuelaing.arep.app.AREP_LAB01.HttpServer"
```

Finalmente ingrese al navegador de su preferencia con el siguiente link:
http://localhost:35000

## Construcción

* [Spark](https://sparkjava.com/documentation#views-and-templates) - Framework API
* [Maven](https://maven.apache.org/) - Manejo de dependencias
* [JavaScript](https://developer.mozilla.org/es/docs/Web/JavaScript) - Statics files (frontend)

## Autor

* **Yeison Steven Barreto Rodriguez** - *AREP - LAB01* - [YeSte114](https://github.com/YeSte114)


---

### DESCRIPCIÓN  DE LA ARQUITECTURA:

![](.README_images/2023-08 191557.png)

##### Requerimientos:

1) El cliente Web debe ser un cliente asíncrono que corra en el browser  y use Json como formato para los mensajes.
2) El servidor de servirá como un gateway para encapsular llamadas a otros servicios Web externos.
3) La aplicación debe ser multiusuario.
4) Todos los protocolos de comunicación serán sobre HTTP.
5) Los formatos de los mensajes de intercambio serán siempre JSON.
6) La interfaz gráfica del cliente debe ser los más limpia y agradableolo HTML y JS (Evite usar librerías complejas). Para invocar métodos REST desde el cliente usted puede utilizar la tecnología que desee.
7) Debe construir un cliente Java que permita probar las funciones del servidor fachada. El cliente utiliza simples conexiones http para conectarse a los servicios. Este cliente debe hacer pruebas de concurrencia en su servidor de backend.
8) La fachada de servicios tendrá un caché que permitirá que llamados que ya se han realizado a las implementaciones concretas con parámetros específicos no se realicen nuevamente. Puede almacenar el llamado como un String con su respectiva respuesta, y comparar el string respectivo. Recuerde que el caché es una simple estructura de datos.
9) Se debe poder extender fácilmente, por ejemplo, es fácil agregar nuevas funcionalidades, o es fácil cambiar el proveedor de una funcionalidad.
10) Debe utilizar maven para gestionar el ciclo de vida, git y github para almacenar al código fuente y heroku como plataforma de producción.
11) En el backend debe utilizar solo Java. No puede utilizar frameworks como SPRING.

## Documentación
Se encontrar la documentación en la carpeta nombrada "javadoc", para generar nueva documentación puede correr el siguiente comando
```
mvn javadoc:javadoc
```
La nueva documentación generada puede encontrarla en la ruta /target/site/apidocs

## Corriendo Tests unitatios

Para correr los test ubiquese en la carpeta principal de repositorio y corra el siguiente comando desde la consola

```
mvn test
```
