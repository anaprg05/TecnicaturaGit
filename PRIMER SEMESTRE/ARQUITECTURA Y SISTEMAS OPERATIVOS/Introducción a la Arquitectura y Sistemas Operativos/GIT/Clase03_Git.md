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
  
      gi commit – m «para escribir mensajes cortos»

- git commit  Nos abre el editor que por defecto tenga su máquina, para escribir mensajes un poco más extenso
- Al finalizar, 

      Ctrol. S( guardamos mensaje de texto )
      Ctrol. X(salimos del editor)

- Otra opción es tecleamos Esc. y al final del editor nos aparecen : tecleamos wq!( nos guarda nuestro texto y salimos del editor Vim).

