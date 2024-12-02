# ***Comandos Git y Trabajo Git***
### *Commit*
- Un commit es un conjunto de cambios en los archivos que hemos  confirmado y que queremos almacenar  para un futuro. Los commits se relacionan unos con otros en una o varias secuencias para poder ir viendo la historia de un determinado archivo a lo largo del tiempo.

## **El concepto de HEAD**
- Se refiere al commit que está dentro de tu repositorio posicionado en cada momento. Por regla general HEAD suele coincidir con el último commit de la rama en la que estés ubicado, ya que habitualmente estás trabajando en lo último. Pero si te mueves hacia cualquier otro commit anterior entonces el HEAD estará más atrás.

### *Guiones en Git*
- Para entender los comando que estamos aplicando desde **Git Bach** es importante saber el significado.
  - -(un sólo guión)  acompaña una o dos letra

          Ej: Git checkout -b

  - -- (dos guiones) acompañan una palabra
 
    
         Ej: Git log --


- **«Cuando se hace Git log el HEAD nos indica en que rama estamos ubicado.»**


### *¿Cómo hacer para eliminar un commit?*
- Para poder eliminar un commit utilizaremos el comando: 

      git reset «hash del commit»

- Este comando permite eliminar la modificación que commiteamos.

### **Ramas**
- Existe una rama predeterminada que se crea automáticamente cuando se crea un repositorio que se llama *Rama Master*.
  - Actualización posterior:
    - En realidad, hasta mediados del año 2020 esta rama se llamaba *"master"* y no *"main"*. Pero por aquel entonces, aunque existen diversas teorías sobre el origen de ese nombre, se decidió que era una referencia al esclavismo ("master" de "amo", frente a "slave" de "esclavo. Otras teorías hablan, de que viene de "master copy" o copia maestra o principal) y que había que renombrarla. Así que ahora es "main" y no "master".
  - Nuestra Rama Master hoy llamada Main:
    - Por regla general a Main se la considera la rama principal y la raíz de la mayoría de las demás ramas. Lo más habitual es que en main se encuentre el "código definitivo", que luego va a producción, y es la rama en la que se mezclan todas las demás tarde o temprano para dar por finalizada una tarea e incorporarla al producto final:
      - En la clase n°4 estuvimos viendo como crear nuevas ramas.
      - Con el comando:

            git checkout -b «nombre de la nueva rama»

      - Y con el comando:

            git branch

      - Nos permite ver todas las ramas que tenemos, tanto la rama creada como la rama Master.

      - Como se puede apreciar en la imagen, se crea una rama auxiliar, se realizan commit en ella y luego se fusiona  nuevamente a la rama principal o rama Master.

## **Git Merge**
### *¿Qué es Git Merge?*

- Git Merge es un comando que se usa para fusionar ramas independientes en una sola rama en Git.
- Cuando se usa el comando de fusión en Git, solo se actualiza la rama actual para reflejar la fusión y la rama de destino no se ve afectada. Esto significa que, a menudo, Git Merge se usa junto con git checkout para seleccionar la rama actual y git branch para eliminar una rama fuente desactualizada.
- Git Merge es un comando para fusionar ramas en Git
  - ¿Cómo funciona Git Merge?:
    - El uso principal del comando Git Merge es fusionar dos ramas. También se utiliza para fusionar cadenas de confirmación en un historial unificado.
    - Para comprender cómo funciona el comando Git Merge, tomaremos un ejemplo de combinación de ramas. En la siguiente ilustración, Git Merge tomará dos ramas y encontrará una confirmación de base común entre ellas. Cuando Git encuentra una confirmación de base común, crea una nueva confirmación de combinación y combina los cambios en la secuencia de cada confirmación de combinación. Aquí, tenemos 2 sucursales: sucursal principal y sucursal de etapa. Ahora, fusionaremos la rama del escenario con la rama principal.
  - ¿Cómo fusionar las ramas que hemos creado?
    - Utilizarás el comando:

          git merge

    - Indicarás haciendo:

          git merge «nombre de la rama» (a la rama cuál querrás fusionar con master)


«Siempre tener en cuenta que cuando se mezclan ramas se debe tener cuidado con los archivos que se han tocado. Cuando no se tocan los mismos archivos no hay inconvenientes, pero cuando se tocan los mismos archivos git no sabrá cuál archivo agregar y habrá un conflicto.»
-----

  - ¿Qué pasa si sólo aplicamos el siguiente comando?:

        git merge «el nombre de la rama que quiero fusionar»

    - Nos Abrirá un editor de texto ( Vim, Atomo, Nano, VSC, etc.).

          «colocaremos la mezcla de la rama master con la nueva rama»

    - Salimos del editor

          Ctrol S y Ctrol X
          O con Esc : WQ!

    - Cerramos el editor de texto y nos actualiza el commit con la fusión de las 2 ramas.
    - Tecleamos:

          git log  --oneline  --all  --graph --decorate

    - Nos aparecerá el commit con la fusión con el fin de la rama e integrándose a la Rama Master.
  - Para eliminar mi fusión de ramas:
    - En caso que se produzca un conflicto en mis ramas, con el siguiente comando hacemos que cada rama vuelva a su posición original.

          git merge --abort

  - ¿Cómo eliminar una rama?
    - Estando ubicados en la rama Master, borramos la rama auxiliar que habíamos creado.

          git branch -D "nombre de la rama"
          (No se puede eliminar una rama en la cual estás ubicado)
          (La opción -D siempre debe ser mayúscula)
    - Se eliminará la rama creada
    - Tecleamos:

          git log --oneline --all --graph --decorate

    - Nos aparecerá la rama Master, pero desaparece la que habíamos creado.
  - ¿Cómo resolver conflictos en el merge de ramas?
    - Cuando realizas un git merge y te aparece un conflicto deberás proceder de la siguiente manera:
      - Abrir tu editor de texto, allí git agregará estás 3 líneas

            1.<<<<< HEAD (Current Change)
              (esta te muestra en que rama estás ubicado y los cambios actuales)
        
            2.===== (esta para dividir los cambios)
        
            3. >>>>> nombre-rama (Incoming Change)
                (esta te muestra la rama a la cual le estás haciendo el merge y sus cambios)
      - Analizar cuáles cambios deben ser tomados de estas ramas y eliminar los que no serán utilizados.
      - Borrar las líneas que git agregó y dejar en el HEAD todos los cambios que serán utilizados
