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

Habilitar su IDE para correr el programa con maven, en este caso se usa InteliJ:
![](.README_images/6385faf8.png)
y darler run a la clase main. Por otro lado tambien puede corre el proyecto con los siguientes comandos

![](.README_images/6d2eb383.png)
```
mvn package
```

Y luego

![](.README_images/b97d145b.png)
```
java -cp "target/classes;target/dependency/*" edu.escuelaing.arep.SparkWebApp
