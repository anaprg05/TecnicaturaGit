# ***GIT***
## **Modificaciones de Carpetas**
### *¿Qué pasa cuando modificamos algún archivo que ya habíamos commiteado?*
- Si en nuestra área de trabajo hemos agregado algún archivo nuevo, al ejecutar git status ya estando dentro de nuestra carpeta Git, nos aparecerán en rojo esa modificaciones.
- Con Git Status comprobamos el estado de nuestra carpeta Git.
- Una vez que nos aparecen las modificaciones
- Ya podemos agregarlas a nuestra área de trabajo.
  
      git Add . (Para mover todos los archivos)
      git add «nombre del archivo» (para pasar sólo por nombre)

- Los archivos ya están listos para ser commiteados.
  
      gi commit –m «para escribir mensajes cortos»

- git commit  Nos abre el editor que por defecto tenga su máquina, para escribir mensajes un poco más extenso
- Al finalizar, 

      Ctrol. S( guardamos mensaje de texto )
      Ctrol. X(salimos del editor)

- Otra opción es tecleamos Esc. y al final del editor nos aparecen : tecleamos wq!( nos guarda nuestro texto y salimos del editor Vim).

## **¿Cómo diferenciamos un archivo de una carpeta en la terminal de Git Bash?**
    / nombre archivo
    ../ (indica que hay dos carpetas o una carpeta superior)

## **¿Cómo guardar modificaciones en un Archivo?**
- Para guardar las modificaciones que hemos hecho en algún archivo.
- Con:

      git commit –am  «agregué una línea a mi repositorio»

- No me permite realizar commitear modificaciones en un mismo archivo.
- En la capeta tecnicatura Git realizar:
    - Añadir desde cualquier editor de texto un archivo Readme.txt
    - Visual Estudio Code
    - Sublime Tex
    - Block de notas

-----

**Ojo! cuando usamos el comando Git add .**
- *Git add .* Agrega los archivos o modificaciones sólo  en la carpeta o subcarpeta  donde estamos ubicados.
- Por ej: Si estamos ubicados en una subcarpeta y tecleamos Git add . No nos  agregara los archivos de otra subcarpeta donde no  estemos ubicados.

-----

- Con:

      git Commit --m « escribimos comentario para el commit»

- Luego nos aparece el commit, con la descripción de lo que hemos modificado.
- Con Git log  vemos la línea de commit que se va formando, para salir tecleamos la letra q

- Cuando tenemos archivos modificados se puede utilizar el siguiente comando

      git commit –am «escribimos el comentario de nuestro commit»

- No se puede utilizar con archivos nuevos.
- Sólo con archivos modificados.

### *Comando Git Checkout*
- El comando  git checkout me permite borrar archivos modificados .
- No me permite eliminar archivos nuevos.

      git checkout « nombre del archivo»
      git checkout –f (nos va a permitir borrar todos los últimos cambios realizados)


### *Git RESTORE*
    git restore  --stage «nombre del archivo».
- Vuelve el archivo al área de trabajo y poder modificarlos.
  
### *Comando  Git Diff*
- Me permite saber qué agregué en el espacios de preparación.
- Nos muestra las modificaciones que hicimos en el archivo de nuestro repositorio.
- Este comando nos permite saber que tipo de modificaciones hicimos.

      git diff --stat
- Nos muestra de forma resumida las modificaciones que se han realizado en  los diferentes archivos en el que se quieren ver las modificaciones.

      git diff –-numstat (solo para ver los números de líneas añadidas y eliminadas)
