# ***Diferencias al clonar un repositorio***
- Cuando seleccionamos desde code la opción descargar zip, nos va a descargar el código fuente pero no el repositorio que tenemos remoto.
- Pero cuando desde nuestra consola ejecutamos el comando git clone, estaremos realizando toda la descarga de nuestro repositorio.
- Si seleccionas la opción download zip , estarás descargando solo el código fuente no el repositorio complete.
- En cambio, cuando seleccionamos la opción https y copiamos el enlace, abrimos la consola de git bash e ingresamos el comando git clone y pegamos el enlace , nos descargará el repositorio completo, ósea una copia exacta del repositorio remoto.
- Ya ubicados en la consola ingresaremos el comando git clone junto con el enlace de git que pegamos desde github, damos enter y ya tendríamos nuestro repositorio clonado de manera local.

## Modificación de un commit en Github
- Algo que nos permite github es modificar un commit.
- Para realizarlo seleccionaremos donde dice commits.
- Seleccionan el commit que desean modificar.
- Cómo identificamos los commit que realizamos de manera remota y los de manera local.
- El commit que se realizó de forma remota estará logeado con el nombre de la cuenta de git hub.
- El commit que se realizó de forma local estará logeado con los datos del repositorio local.
- Una vez que modificamos un commit nos figurará el commit en una linea de color rojo.

## ¿Cómo actualizamos la nueva rama que creamos Git hub y la añadimos a nuestro repositorio local?
- Utilizaremos el comando git pull para actualizar nuestro repositorio.
- Una vez que ya actualizamos nuestro repositorio, podremos visualizar los cabios, pero no la rama creada en git hub, porque necesitaremos actualizar las ramas de forma manual.
- Con el comando git checkout (nombre rama aux.) voy a añadir la rama creada en git hub.
- Para poder visualizar la rama digitaremos git branch y nos figurará la rama creada.
- Para finalizar utilizaremos el comando git log --oneline --decorate para visalizar los cambios en nuestro repositorio.
- Para hacer un merge a mi rama main en git hub utilizaremos el pull request, siempre necesitaremos la aprobación del owner o encargado de proyecto. Si el encargado de proyecto da el visto bueno se acepta el pull request.
- El pull reques será examinado antes de aceptar integrarlo a la rama main. Una vez examinado y aprobado se procede al merge. Seleccionaremos Merge pull request.
- Una vez realizado el merge ya podemos eliminar la rama si no la utilizaremos más adelante.
- Para eliminar la rama creada  desde git hub, solo seleccionaremos borrar.
- Muchas veces git no nos actualizará los cambios en nuestro repositorio local de forma automática, después de ejecutar un pull en nuestra consola de git bash. Ya que nos seguirá apareciendo la rama aux que cree en remoto.
- Como estoy trabajando en la rama que cree, voy a utilizar git switch main para moverme a la rama principal y poder eliminar la rama auxiliar.
- Eliminaremos la rama auxiliar con git branch –d nombre de la rama aux. y ya no nos figurará.
- Y si ejecutamos un:

      git log --all --oneline --decorete 
- Podremos ver el merge a la rama principal
