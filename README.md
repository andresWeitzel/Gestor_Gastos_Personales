# Gestor de Gastos Personales

**Se desarrolla una GUI en Java Swing con Maven para la gestión de Gastos Personales implementando JDBC en MYSQL.**

</br>

## Vista de Inicio de la Desktop App 1/3
*En la vista inicial si se desea ingresar un gasto se deberá ingresar necesariamente al menos 1 gasto(compras, servicios, transporte) con su fecha correspondiente.Este JFrame posee control de formulario, estrictamente implementado como la base de datos creada.
En las esquinas inferiores se encuentran las secciónes de ANALYTICS y VER GASTOS. Cada una se explicará seguidamente y corresponden a JFrames independientes.*

![Index app](https://github.com/andresWeitzel/Graphics/blob/main/Proyectos/GestorGastosPersonales_app/Captura%20de%20pantalla%20(328).png)

</br>

## Vista de Inicio de la Desktop App 2/3
*Esta es la vista de gestión principal de los gastos. Desarrollé un filtro de búsqueda especifico en relación al campo deseado. Dentro de los filters de Java8 se especificó funciones en las cuáles busquen el comienzo o que contengan al menos lo deseado en los registros.
Para ACTUALIZAR o ELIMINAR algún registro se deberá seleccionar el deseado o mismo la aplicación te avisará con un mensaje de alerta (también posee un control de seleccion).
En los bordes laterales tenemos las secciones ANALYTICS(último inciso) Y REFRESCAR LISTA(recarga la tabla).*

</br>

![Index app](https://github.com/andresWeitzel/Graphics/blob/main/Proyectos/GestorGastosPersonales_app/Captura%20de%20pantalla%20(329).png)


## Vista de Inicio de la Desktop App 3/3
*Esta vista(se puede abrir desde el JFrame inicial como en el de ver gastos) poseé funciones estadísticas que nos permiten recopilar cierta información desde lo que se carga del JTable(mismo puede ser de la db de forma directa).En este caso solo 4 funciones relevantes(valor total, promedio, mínimo y máximo) aplicando la clase Math.
Notar que los GASTOS MÍNIMOS estan en 0.0 , la db la diseñe con formato para el campo Gasto de tipo float y corresponde al mínimo valor dentro de este.*

![Index app](https://github.com/andresWeitzel/Graphics/blob/main/Proyectos/GestorGastosPersonales_app/Captura%20de%20pantalla%20(330).png)



 </br>

| **Tecnologías** | **Versión** |               
| ------------- | ------------- |
| Java |   12.0.2 |
| Apache NetBeans IDE |  12.0 |
| Cygwin | 3.1.6-1  | -> Terminal en Windows integrada al IDE Netbeans
| Git | 2.29.1.windows.1  |
| XAMPP | 3.2.2  |
| Mysql Workbench | 8.0.20  |


</br>

| **Dependencia Maven** | **Finalidad** |               
| ------------- | ------------- |
| mysql-connector-8.0.21|  Conexion e implementación de queries a la db con mysql |

* Repositorio dependencia: https://mvnrepository.com/artifact/mysql/mysql-connector-java/8.0.21

</br>

 ## Patrones de Diseño Implementados
 * **Singleton** 
 * **Dao** 
 
 ## Uso de Java8
* **Streams**
* **Lambdas**
* **Filters**
* **Collections**
* **Etc..**

</br>

## Descarga y documentacion de las Tecnologías empleadas:
#### Java-JDK 12:                     https://www.oracle.com/java/technologies/javase/jdk12-archive-downloads.html
#### Maven Repositories:              https://mvnrepository.com/
#### Apache Netbeans IDE:             https://netbeans.apache.org/download/index.html
#### Cygwin:                           https://cygwin.com/install.html
#### Git:                              https://git-scm.com/docs
#### XAMPP:                            https://www.apachefriends.org/download.html
#### Mysql Workbench:                 https://www.mysql.com/products/workbench/


</br>

<hr>

## Más Información

## Uso de Cygwin

#### 1)Descargar la herramienta en https://cygwin.com/install.html dependiendo la arquitectura que se tenga (32-64 bits), como toda aplicacion siguiente.... siguiente....```(IMPORTANTE:NO TENER ABIERTO EL IDE DURANTE LA INSTALACION, SINO NO RECONOCE EL PATH)```
#### 2)Abrir el IDE Netbeans, seguidamente seleccionar el proyecto para implementar git, ir a la barra del ide y clickear ```Tools->Open in terminal```
#### 3)Te debería aparecer algo parecido a esto(Ruta Absoluta de tu proyecto)...
```andre@DESKTOP-7BN69K1/cygdrive/c/Users/andre/OneDrive/Escritorio/LenguajesProgramacion/JAVASE/Proyectos/GestorGastos_app```
#### 4)Crear un nuevo repositorio y comenzar con git
```Debajo de esta sección, explico como usar git de forma detallada.```
#### 5) Más Información https://ourcodeworld.com/articles/read/680/how-to-configure-an-integrated-terminal-command-prompt-in-netbeans-for-windows

</br>

## Subir el proyecto al repositorio con la terminal a traves de Cygwin en Netbeans

#### 1)Creamos un nuevo repositorio en GitHub

#### 2)Inicializamos nuestro repositorio local .git
* git init

#### 3)Agregamos lo desarrollado a nuestro repo local
* git add *

#### 4)Agregamos lo que tenemos en nuestro repo local al área de Trabajo.
* git commit -m "agrega un comentario entre comillas"

#### 5)Le indicamos a git donde se va a almacenar nuestro proyecto(fijate en tu repositorio de github cual es el enlace de tu proyecto(esta en code)).
* git remote add origin https://github.com/andresWeitzel/Gestor_Gastos_Personales.git

#### 6)Subimos nuestro proyecto.
* git push -u origin master


</br>


## Actualización de el proyecto al repositorio con la terminal a traves de Cygwin en Netbeans

#### 1)Visualizamos las modificaciones realizadas en local
* git status

#### 2)Agregamos lo modificado al area de trabajo
* git add *

#### 3)Confirmamos las modificaciones realizadas
* git commit -m "tu commit entre comillas"

#### 4)Sincronizamos y traemos todos los cambios del repositorio remoto a la rama en la que estemos trabajando actualmente.
##### (Desconozco porqué tengo que ejecutar este comando, supongo que será porque no estoy trabajando con branchs en mi proyecto, el main por defecto de gitHub ahora es mi master(Yo realicé esa modificación para mejor visualización)).
* git pull https://github.com/andresWeitzel/Gestor_Gastos_Personales.git

#### 5)Enviamos todos los cambios al repo en github
* git push https://github.com/andresWeitzel/Gestor_Gastos_Personales.git

</br>

