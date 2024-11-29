# ***Comandos Git***
## **¿Cómo viajamos en el tiempo para ver los cambios que realizamos en nuestro proyecto?**

- Cada commit tiene un número de id o # hash
- Otras funciones de Git Checkout.
- Con:

      git checkout «más el número de identificación» (se pueden copiar sólo los primeros 7 dígitos)

- Podremos ver entonces a como estaba nuestro proyecto sin las modificaciones nuevas.
- Para volver al presente donde esta mi último commit ejecutamos:

      git checkout master

-----

      git log --raw
- Este comando nos permite saber cuales fueron los cambios que pasaron en un commit.
- Nos figura el numero hash de nuestro commit.

### *Git LOG*

      git log --oneline
- Este Comando nos permite ver en una hilera un resumen de los hash # acortados de los cambios que se realizaron en cada commit.
- Nos aparecerá la última rama trabajada porque se respeta siempre el tiempo.

      git log   --oneline  -n «x»
- Con este comando voy a poder ver la cantidad de commit que quiero leer.

      git log --pritty=format : «»
- Éste comando permite agregar el formato que se desee, por ej: el nombre del autor, correo, fecha, etc.

## **Ramas**
- Dentro de mi rama MASTER puedo crear ramas nuevas o auxiliares.
- Esto nos indicará que vamos a tener dos líneas de tiempo con diferentes tiempos y commit.
- Cada línea tiene su independencia y nuevas características, esto nos permite solucionar problemas que pueden surgir en la Master y así evitar dañar nuestro proyecto.
- Las Ramas nos permiten fusionar más adelante y se pueden generar más líneas.
- Cada línea del tiempo se llamarán ramas como si fuera un árbol.

            git log
  - Nos dará la ubicación de nuestra rama Master

            git log  --online
    
   - Nos indicará que estamos en el Master

            git log –checkout + «el numero de ID del commit» 

    - Nos dará la ubicación especifica de nuestro commit.

- Si queremos volver a la rama Master ejecutamos el comando

         git checkout master


## **RAMA NUEVA**
- Para Crear una Rama Nueva utilizaremos el siguiente comando

      git checkout  -b «nombre de la rama»

- En el momento de crear mi rama auxiliar o nueva rama mi puntero se va a posicionar en mi nueva rama de mi proyecto.
- Una vez creada la rama, añadiremos las modificaciones a nuestro proyecto, cuando ya estén listas nuestras modificaciones.

      git status.

- Veremos entonces cada una de las modificaciones que hemos realizado.
- Luego commitearemos dichas modificaciones.

      git add .  (agregamos archivo modificado)
      git checkout  -b «nombre de la nueva rama»
      git branch (veremos  tanto la rama Master como nuestra rama creada)

        git branch
- Este comando nos permite ver todas las ramas que tenemos tanto nuestra rama Master como todas las creadas.

      git log --oneline --all --graph
- Este comando nos va a permitir ver todas las ramas en línea y con los commit (puntos) en cada rama.

      git log --oneline --all --graph --decorate
- Este comando nos permite ver de manera gráfica (dibujo) de las ramas que se van  trabajando por separado y las modificaciones  que vamos registrando.
