# ***Git Bash***
Es una herramienta de control de versiones que permite alojar los diferentes proyectos en los que estén trabajando, permitiendo gestionar de forma muy simple y gráfica las diferentes versiones o modificaciones que se vayan realizando en cada uno de sus proyectos.

Fue desarrollada por Linux Torvalds creador del núcleo Linux.

**Definición, clasificación y funcionamiento**

Se llama control de versiones a la gestión delos diversos cambios que se realizan sobre los elementos de algún producto o una configuración del mismo. Una versión, revisión o edición de un producto, es el estado en el que se encuentra dicho producto en un momento dado de su desarrollo o modificación. Aunque un sistema de control de versiones puede realizarse de forma manual, es muy aconsejable disponer de herramientas que faciliten esta gestión dando lugar a los llamados sistemas de control de versiones o SVC (del inglés System Version Control). Estos sistemas facilitan la administración de las distintas versiones de cada producto desarrollado, así como las posibles especializaciones realizadas (por ejemplo, para algún cliente específico).

Algunos Ejemplos de este tipo de herramientas son entre otros:

CVS, Subversion, SourceSafe, ClearCase, Darcs, Bazaar , Plastic SCM, Git, Mercurial, Perforce.

*Git es como un diario de viaje:*
- Una Bitácora de un Capitán que va dejando todo los registro de las rutas de sus viajes.
- En este caso Git les va a permitir ir registrando cada modificación que vayan realizando a su proyecto.
- Ese registro se va a llevar a cabo con los commit.

*Ventajas de Git:*
- Podemos trabajar a nivel local sin tener que comprometer el repositorio principal a cada cambio que realicemos.
- Gracias a este sistema, los desarrolladores del proyecto podrán trabajar de forma independiente hasta el momento en el que tengan que poner en común con el resto del equipo su código, controlando los cambios en las versiones y mejorando el seguimiento al desarrollo.

## **Terminología**
**-** *Repositorio ("repository")*: El repositorio es el lugar en el que se almacenan los datos actualizados e históricos de cambios.

  **1-** *Repositorios Locales*: Los cambios son guardados localmente y no se comparten con nadie. Esta arquitectura es la antecesora de las dos siguientes. El modelo local utiliza una copia de la base de control de versiones y una copia de los archivos del proyecto. Este tipo es el más sencillo y no es recomendable cuando se trabaja en equipo ya que todos tienen que acceder a los mismos archivos.
  
  **2-** *Repositorios Centralizados*: Existe un repositorio centralizado de todo el código, del cual es responsable un único usuario (o conjunto de ellos). Se facilitan las tareas administrativas a cambio de reducir flexibilidad, pues todas las decisiones fuertes (como crear una nueva rama) necesitan la aprobación del responsable.

Se realiza en un servidor que se encargará de recibir y dar los cambios realizados en el archivo a cada uno de los usuarios.

**3-** *Repositorios Distribuidos*: Cada usuario tiene su propio repositorio. Los distintos repositorios pueden intercambiar y mezclar revisiones entre ellos. Es frecuente el uso de un repositorio, que está normalmente disponible, que sirve de punto de sincronización de los distintos repositorios locales.

El modelo distribuido es el más utilizado, en este caso cada usuario tiene un control de versiones propio que a su vez son manejadas por el servidor. 

## **Comandos para la configuración de GIT**
*Git config*: es un comando que permite configurar  todos los aspectos de cómo funcionará Git de manera local, global o system.

  - *git config mantiene su valor entre actualizaciones.* Por lo tanto, se debe configurar solo una vez. Todos los archivos de configuración tienen la misma sintaxis, pero un alcance diferente. Esto ofrece mucha flexibilidad.

  Existe 3  comandos para el almacenamiento:
  
  **- Local.**
    
  **- Global.**
    
  **- System.**

Además, es importante recordar que cada nivel anula los valores del nivel anterior.

Prioridad:
    
    Local > Global > System

**- Local**: las configuraciones locales están disponibles solo para el repositorio actual. Puede hacer que git lea y escriba desde la computadora que se está utilizando solo localmente .

          git config --local

**- Global**: las configuraciones globales están disponibles para los usuarios actuales para todos los proyectos.

     git config --global

**- System**: ésta configuración están disponibles para cada usuario en el sistema y se requiere que tengas permisos de administración.

     git config --system
