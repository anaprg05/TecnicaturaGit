# ***Comandos y funcionalidades Git***
## **Funcionalidades de Nuestras Ramas**
- Una rama es un espacio temporal donde  vamos a trabajar diferentes funcionalidades que van a ser agregadas a nuestro proyecto.
- En la rama Master o rama Main va a ser  la rama principal de todo el proyecto.
- Git los va a permitir ir avanzando de manera cronológica sobre nuestro proyecto.
- También podremos viajar en el tiempo y volver a consultar modificaciones anteriores.

### *Nuestra Rama Máster o Main es un Espacio Temporal*
- Aquí es donde nosotros trabajamos con nuestro proyecto.
- Cada punto representa una confirmación, o sea un avance, una nueva funcionalidad, un punto en el tiempo.
- A medida que nuestro proyecto avanza  vamos trabajando en modificaciones o actualizaciones que vamos haciendo para su mejora.
- Estas modificaciones las va a realizar  de manera cronológica, de manera lineal, tenemos nuestra rama donde vamos trabajando, nuestro repositorio, nuestro proyecto.
- No siempre los cambios que realicemos serán utilizados en nuestro proyecto, hay ocasiones en las que un cambio no necesariamente va a ser aplicado al proyecto.
- Puede ser un cambio que el cliente ha pedido y que nada más es para prueba.
- Puede ser un cambio que el proyecto no amerita al final de todo.
- Por éste motivo hacemos uso de ramas auxiliares.

 Una regla general de Git es que en la rama Main nunca se debe trabajar cambios, solo en ramas auxiliares.
----- 
- Hay una regla que dice que en la rama main nunca se debe trabajar cambios, lo hemos hecho a través de las ramas auxiliares.
- Ahora bien, si en dado caso nosotros queremos que estos cambios sí se incorporen a la Rama Master, a la Rama Main, o sea el proyecto como tal.
- Cuando hacemos cambios en el proyecto, que no estamos seguros que se van a implementar, simplemente podemos eliminarlos, pero no va a haber ningún cambio sobre la rama main.
- Y a eso es a lo que se le conoce como trabajo con  ramas.

## **Funcionalidad del Merge**
- Cuando hacemos un  Merge, estamos realizando la unión de una Rama temporal a la Rama Main.
- En el último punto se realiza la unión y los puntos del commit que hicimos en nuestra rama auxiliar se unen con los commit de nuestra rama Master.


## **¿Cómo se trabaja con Git?**
- Por lo general siempre se trabaja con ramas.
- Siempre tendremos una rama principal (Master o Main) y ramas auxiliares.
- La Rama Master no podemos tocarla.

### *¿Quiénes son los únicos que van a poder trabajar sobre la Master?*
- Siempre en cada proyecto habrá líderes, ellos serán los únicos que estarán a cargo de modificar la Master, los demás integrantes no estarán autorizados.

Creación de Ramas:

Desde las ramas de cada desarrollador, se sacarán ramas para trabajar en la rama que le queda a cada uno.

Una vez que se cumple el trabajo en cada rama se debe volver a la rama Master.

Cuando ejecutamos Merge:

Cuando hablamos de utilizar el comando Merge, hablamos de la integración de las ramas auxiliares (que se han estado trabajando por separado) a nuestra rama Master.

Puede que hemos en la creación de esas ramas auxiliares hemos estado tocando y modificando las mismas ramas y esto puede generar conflictos.

Cambio sólo realizados en nuestras ramas auxiliares:

Todos los cambios que realizaremos en nuestro proyecto los realizaremos en nuestras ramas auxiliares para luego pasarlos a nuestra Rama Master o Main.

Una vez que ya confirmamos nuestros cambios en nuestras Ramas auxiliares, son enviados a la Master o Main.

Allí los líderes controlarán que los cambios realizados funcionen

Nuestra carpeta . GIT IGNORE

 .git ignore

Es una carpeta creada en del directorio de trabajo en el momento de ejecutar git init. Esta carpeta contiene reglas sobre qué archivos y/o carpetas deben ser ignorados por git.

Cualquier archivo que ignoremos no aparecerá en la salida de un git status y además será ignorado cuando utilicemos un comando git add. Esto no quiere decir que los archivos ignorados sean eliminados de tu equipo local, sino que permanecerán ahí pero nunca se subirán al repositorio. 

Vamos a crear un documento para  que luego sea ignorado por Git de nombre requisitos

Ignorando Archivos:

Para ignorar archivos utilizaremos el comando:

Git Ignore

Este comando nos permite mover los archivos que no utilicemos  en nuestras ramas  de Git

Ignorando Archivos:

Para ignorar archivos utilizaremos el comando:

Git Ignore

Este comando nos permite mover los archivos que no utilicemos  en nuestras ramas  de Git

Para cambiar de una rama a otra:

En las clases anteriores estuvimos utilizando los comandos

Git Checkout Master

Git Switch

Uno de los comandos que utilizamos para visualizar las ramas creadas

Git Branch

¿Cómo cambiar el nombre  de la Rama Master?

Podemos cambiar el nombre de nuestra Rama Master a través de una configuración global

En primer lugar digitaremos

Git branch

Este comando me permite visualizar las ramas que tengo

Para cambiar el nombre de las ramas:

Git branch -m (nombre actual de la rama « Master») (nuevo nombre «Main»)

 

Este comando solo te permite cambiar el nombre de la rama Master a Main o al revés de Main a Master


¿Qué pasa si no me aparece ninguna rama?

Cuando utilizamos el comando

Git Branch

    ?

Si no nos aparece ninguna rama es porque aun no hemos realizado ningún commit y tampoco hemos creado una nueva rama.

En el momento que comenzamos a realizar commit, nos figurará la rama Master o Main.

Con Git Branch vamos a poder visualizar las ramas que hemos creado


Proyectos en Git:

Cuando trabajamos proyectos en git por lo general

trabajamos con diferentes versiones de nuestro Proyecto.

Los desarrolladores prefieren llevar siempre un proyecto

por versiones, por pasos o por diferentes puntos:

•Se revisa el producto
•Se realiza un testing rápido y se verifica que el proyecto
 vaya conforme a lo pedido por el cliente.

Los Tags:

Git nos permite crear este tipo de seguimientos o versiones.

Para ello  nos da los Tags, un tag o etiqueta también es un

 identificador que nos permite seleccionar un grupo de

modificaciones o cambios que realizamos y agruparlas en

una versión o Tag.

Comando para trabajar por versiones nuestro proyecto:

El comando que utilizaremos para ordenar nuestras diferentes versiones del proyecto en el que estemos trabajando es el siguiente.

Git Tag (Nombre que va a llevar el Tag)

Ej:

 Git Tag Versión 1

Es importante seleccionar sólo los commit que van  a ser parte de esa Versión 1 de nuestro proyecto
¿ Cómo realizar la selección de los commit que quiero versionar o separar con etiqueta?

Para ello utilizaremos el comando

Git Reset  --hard (n° del commit hasta donde vamos a seleccionar)

Solo quedan seleccionados los commit hasta el numero de hash que seleccionamos, esos commit serian los que formarán parte de la versión 1 de nuestro proyecto.

Tener en cuenta que todos los commit que quedan fuera o más recientes cambios desaparecerán. No es aconsejable utilizarlo si se esta trabajando de forma global. Ya que se borrarían los commit a todos los desarrolladores que estén trabajando en el proyecto

Sólo nos figurarán los commit hasta el número de hash seleccionado.

El puntero se posicionará donde queremos agregar nuestra etiqueta, según el hash que seleccionemos.


Pasos para agregar nuestra Tag o etiqueta a nuestro proyecto
En primer lugar ejecutaremos el comando

Git log --oneline

Veremos todos los commit a etiquetar en una versión. Luego utilizaremos el comando

Git Tag versión1 «numero del hash»

Con Git Tag añadiremos la etiqueta de nuestra versión y además con

 git log --oneline --all, veremos nuestra tag en el commit seleccionado



Para comprobar si mi etiqueta ya se añadió utilizo el siguiente comando.

Git Tag

Nos arrojará la versión que estamos trabajando o que tenemos hasta el momento.

Git log  --oneline nos mostrará la lista de los commit y en el último commit que trabajamos nos figurará,  pegado a nuestra Main, la etiqueta de la versión que estamos trabajando.


¿Cómo eliminamos un Tags?

Para eliminar un Tag o etiqueta de nuestro proyecto , realizamos el siguiente comando

Git tag –d (nombre de la versión)

Por ejemplo:

Git Tag –d versión 1

Luego tecleamos

Git Tag

Y nos arrojará las versiones que nos queden o ninguna en el caso que solo tengamos una.

Con el comando Git Tag -d «nombre de la version» eliminamos etiqueta

con git log --oneline --all vemos los cambios


Otra forma de agregar etiquetas o versiones a nuestro proyecto es utilizando el siguiente comando:

Git tag -a «nombre del Tag» -m «mensaje del tag»

En este comando creamos una etiqueta  pero añadimos un mensaje con –m

Si tecleamos

Git Tag  ( nos aparecerá)

V1.0

Si utilizamos

Git log --oneline

También nos figurará al lado de main o master, la etiqueta

Tag : V1.0

Git Show:

Este comando me permite ver una descripción detallada de la etiqueta que utilizamos anteriormente.

Git tag -a v1.0  -m «versión 1 del proyecto»

 digitaremos entonces:

Git show V1.0

Nos mostrará una información extra:

-La versión o Tag

-El Autor, cuando fue creado

-El mensaje que añadí a la etiqueta cuando cree mi versión.

-El commit donde esta ubicado.

-Me aparece un Diff con los cambios realizados.

El comando Git Show nos permite ver detalles de nuestros cambios y modificaciones realizadas en nuestro repositorio.


Creando una etiqueta desde un commit anterior:

Otra manera de crear una versión de tu proyecto es a partir de un commit

Con el siguiente comando:

Tecleamos git log  --oneline y seleccionamos y copiamos el hash desde donde queremos comenzar nuestra 1ra. Versión

Git Tag «nombre de la versión» (n° hash)

Por ejemplo:

Git Tag v1.0  028bf55

Si digitamos el comando

Git log --oneline nos aparecerá la lista de los commit, pero en el commit que habíamos elegido figurará la etiqueta  donde esta nuestra versión 1.0

Con Git log --oneline --all podremos ver la versión en el otro commit seleccionado


Para eliminar el Tag

Utilizaremos el siguiente comando

Git tag –d «versión creada»

Ejemplo

Git tag –d v1.0

Y me borrará la etiqueta de mi versión

Comprobamos con el comando

Git log --oneline 

Podemos ver que se elimino nuestra v 1.0 del commit


Para agregar una etiqueta con un comentario desde el commit que seleccionemos:

Seleccionaremos uno de los commit desde donde queremos que figure nuestra etiqueta de nuestra versión.

Para ello utilizaremos:

Git tag –a «nombre de la versión» –m «mensaje de la versión» n° hash

Por ejemplo:

 

Git tag –a v1.0 –m «primera versión de mi proyecto» 7bc3d84

Tecleamos Git log --oneline y veremos los commit con el commit seleccionado con su etiqueta de la versión de nuestro proyecto.

Para agregar otras versiones a nuestro proyecto:

Seguiremos los pasos anteriores pero respetaremos el órden de nuestras etiquetas.

En este caso si ya tenemos creada la etiqueta de nuestra Versión 1.0 , seleccionaremos otro commit desde donde vamos a iniciar nuestra versión, en este caso seria nuestra versión 2.0

Git tag –a v2.0 –m « versión 2 del proyecto»

Si ejecutamos Git log --oneline nos figurarán las dos versiones realizadas.

También puedes ejecutar Git Show  (mas la versión elegida ) para ver los detalles que te permite el comando mencionado.

Con git tag –a «nombre de la version» –m «mensaje de la version» nos permite utilizar luego git show


Cuando nos encontramos modificando archivos y se nos solicita unas nuevas modificaciones

Cuando  nos encontramos modificando, trabajando o creando más archivos de nuestro proyecto, ya sea porque vamos avanzando o porque simplemente hay modificaciones que hacer, es muy probable que en algún punto tengamos que hacer algo así como un freno de emergencia, como un stop de emergencia.

Por ejemplo: Si estamos trabajando en algún archivo y de pronto el cliente pide

una actualización urgente o un cambio que es de vida o muerte, es algo que debe hacerse en el momento.

Pero aún no se ha terminado con las modificaciones  que se estaban realizando, no has acabado tu progreso  por Múltiples razones.

Cómo vamos a solucionar esto?

Git Stash

Me permite generar  un campo temporal en el que se va a guardar el progreso de nuestro proyecto.

Hacemos la modificación que el cliente pide y ya luego podemos continuar en donde lo habíamos dejado.

Vamos a teclear Git Stash

Y nos guardará los cambios sin que se alteren las modificaciones en que estamos trabajando.

Para realizar las modificaciones que nuestro cliente nos esta pidiendo con urgencia.

Luego ejecutaremos git add y comitearemos las modificaciones.

Git commit –am «mensaje del commit»

Luego con el comando

Git stash pop

recuperaremos las modificaciones en las que estábamos trabajando y podremos seguir trabajando en ellas.

El comando Git stash me permite guardar las modificaciones que estaba realizando para atender alguna modificación mas urgente y después seguir trabajando en lo que estaba realizando


