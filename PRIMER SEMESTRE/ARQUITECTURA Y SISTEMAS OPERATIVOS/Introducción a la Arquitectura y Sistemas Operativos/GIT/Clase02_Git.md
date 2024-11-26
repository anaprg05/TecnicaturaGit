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

