## ***Comandos Git, Mi Primer Repositorio***
### *Conceptos Generales*
Al ser un sistema de control de versiones, permite ver el estado del proyecto, los cambios realizados en cada archivo, la persona que los realizó, así como poder restaurar una versión anterior.

### *¿Qué es una versión?*
- Conjunto de nuevas características y funcionalidades de un software disponibles para el usuario final.

### *Commit*
- Cada vez que se guarda un  trabajo, Git crea un Commit (confirmación).
- Una confirmación es una anotación o registro de los cambios realizados en un momento dado . Si un archivo no ha cambiado de una commit a otro, Git usa el archivo almacenado anteriormente.

## **RAMAS**
### *¿Qué es una Rama?*
- Es un conjunto de commit que se unen entre si y que sufren  cambios distintos.
- En cada cambio debe hacerse un commit.
- Las ramas auxiliares son punteros ligeros y van a administrar una separación de la rama principal. Una vez que se realizaron los cambios en nuestra rama auxiliar, volvemos a incorporarnos en la rama principal o Master.
- Git nos permite viajar en una línea del tiempo de nuestro proyecto y realizar cambio en el.
- Los commit crean vínculos a otras confirmaciones, formando un gráfico del historial del desarrollo, a esto llamaremos rama.
- Al trabajar en ramas auxiliares, estamos trabajando en un espacio temporal y esto me permite realizar cambios que no necesariamente se van a aplicar en nuestro proyecto. Y también proteger nuestro proyecto en caso de que las modificaciones sean fallidas, evitamos cualquier daño a la rama principal.

### *Estados de Git*
Es un espacio en el que se puede realizar una acción
- Espacio de trabajo.
- Área de preparación.
- Repositorio (carpeta .git).

## **Flujo de Trabajo en Git**
El flujo de trabajo básico en Git es el siguiente:
- Editas una serie de archivos en tu directorio de trabajo.
- Preparas los archivos que quieras subir al directorio, añadiéndolos a tu área de preparación.
- Confirmas los cambios, lo que toma los archivos tal y como están en el área de preparación, y guarda esas instantáneas de forma permanente en tu directorio de Git.

## **Espacio de Trabajo**
### *¿Cuál es el espacio de trabajo?*
- Se considera como espacio de trabajo, a todos los archivos que se pueden visualizar en carpeta.
- Se ha modificado el archivo pero todavía no lo se ha confirmado en tu base de datos local.
- Git aun no se entera de la existencia de estos archivos, ya que aún no son parte de Git y tampoco es parte del espacio de trabajo.

### *Área de preparación (Staging Area)*
- Se ha marcado un archivo modificado en su versión actual para que vaya en tu próxima confirmación.
- El área de preparación se inicia, cuando se agrega con el comando:
                  
      git add 

- Los archivos existentes que todavía no están siendo traqueados por git.
- Acá es donde nosotros vamos a preparar todos los archivos que queremos realizar o mandar al repositorio.
- Eso es un lugar temporal, como una memoria caché donde vamos a tener nuestros archivos.
- Por último,  lo pasamos al repositorio.

### *Área de repositorio (Carpeta Git)*
- El repositorio es el lugar en el que se almacenan los datos actualizados e históricos de cambios que realicemos a nuestro proyecto.
- Esta carpeta va a ser '.git'.
- Los datos del archivo están guardados en tu base de datos local.

### *Comandos*
- Para limpiar terminal o pantalla:

      Control + L
      clear
      q
  
- Para borrar archivo:

      rmdir «nombre de la carpeta»

- Para abrir manual de Git:

      git --help branch
      git --help branch (Manual Git)

- Para pasar al Estado de preparación:

      git add <archivo>

    - Para guardar o aprobar (commit) ficheros en nuestro repositorio Git, primero se necesita añadirlos al área de preparación.
    - Los usuarios mueven los cambios desde el espacio  de trabajo al área de preparación, antes de aprobarlos/commit hacia el repositorio.
    - El comando “git add .” permite registrar todos los cambios del directorio de trabajo.
    - Si queremos eliminar el archivo de nuestra zona de preparación antes de enviarlo al repositorio.

          git  rm --cached "nombre del archivo"
          git reset

    - En espacio de preparación ya tenemos un archivo para enviar a nuestro repositorio y ser commiteado.

### *GIT STATUS*
- Permite visualizar el estado de los cambios en el directorio de trabajo y en el área de preparación comparando con el repositorio. Muestra una lista de los archivos modificados o añadidos.
- Aun no tenemos commit y también nos dice que tenemos archivos sin traquear.
- Los archivos que están  listos ser trackeados, nos aparecen en "rojo".
- Para pasar nuestros archivos desde el área de trabajo al área de preparación utilizaremos el comando.

      git add «nombre del archivo que se va a mover»

- Luego volvemos a ejecutar.

      git status (para ver el nuevo estado del nuestro archivo.)


- Una vez trackeado nos aparece el archivo de "color verde", eso significa que esta listo para ser enviado al repositorio.

      New film: archivo

### *COMMIT*
- Una vez que nuestro archivo ya esta en nuestra área de preparación vamos a pasarlo a nuestra área de repositorio.
- Se inicia los commit (carpeta .git)
- Nos abrirá un editor de texto que se llama

      Vim

### *Editor de texto(Vim)*
- Una vez que estamos en el editor de texto, nos va a permitir realizar los comentarios sobre las modificaciones que realicemos a nuestro proyecto.
- En la pantalla del editor nos aparece un mensaje con # , eso quiere decir que todo lo que este  en esas líneas será ignorado, solo nos sirve como contexto de lo que estamos realizando.
- Sólo en la primera línea nos aparece sin #, en esa línea escribiremos nuestro primer commit

      « mi primer commit con git» ( se inicia el proyecto)

IMPORTANTE: si no escribimos algo no habrá commit.
-

- Comandos para guardar texto

      Ctrlo S

- Comando para salir del editor

      Ctrol X

- Nos aparece el primer commit:

      « mi primer commit con git»( se inicia el proyecto)

- Nos menciona la cantidad de archivos agregados + la cantidad de líneas utilizadas de código.
- Nos menciona el nombre de los archivos creados.

### *GIT LOG*
- Con este comando veremos nuestro primer commit.
- Será el cuaderno, la "Bitácora" que mostrará en pantalla todos los commits, todos los mensajes).
- Nos aparece el Autor del commit( nombre, apellido y el correo).
- Fecha y hora del sistema y el mensaje que realizamos en nuestro editor de texto.
- Cada commit tiene un número identificador  y que permite de manera ordenara realizar cada commit en mi proyecto, de manera que es imposible que se repitan.

- *Pasos para añadir archivos a nuestro repositorio y crear nuestros primer commit*:

**Paso 1:** Una vez que tenemos ya creadas las carpetas Tecnicatura Git y las subcarpetas Java y Python con sus respectivos archivos dentro.

**Paso 2:** Tecleamos Git status
              " veremos los archivos listos para ser enviados a nuestra área de preparación, los archivos deben figurar en color rojo.
              
**Paso 3:** Tecleamos Git add .Para añadir lo que contiene ambas carpetas

En caso de querer agregar un archivo especifico se debe teclear Git add "nombre del archivo"
Para borrar el archivo del área de preparación Git reset .

**Paso 4:** nuevamente tecleamos Git Status
            " ahora nos aparecerán los archivos que fueron añadidos en color verde "
            
**Paso 5:** nuestros archivos están listos para ser commiteados 
               Git commit 
                nos abre el editor de texto Vim
               en la primera línea escribimos " mi primer commit de git"
                guardamos nuestro mensaje del editor con : w  o  Ctrol. S 
                 y Ctrol. x para salir del editor .

 otra opción es:
                Git commit --m  "mi primer commit de git" y damos enter
                
**Paso 6:** Git log   leemos nuestro commit 
