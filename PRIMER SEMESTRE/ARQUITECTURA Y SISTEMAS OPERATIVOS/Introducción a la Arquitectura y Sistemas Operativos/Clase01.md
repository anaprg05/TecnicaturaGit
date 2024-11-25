## Primer Momento: Introducción a los Sistemas Operativos
### Funcionidades de un Sistema Operativo:

- Para comprender la Arquitectura de una computadora es necesario entender como funciona un Sistema Operativo.​
- Las Funcionalidades  básicas de una Sistema Operativo son:
  
  1- Actuar de interfaz entre el usuario y el hardware de manera transparente para el usuario. Ofreciendoun soporte a los usuarios para que sus acciones se transmitan con facilidad. No  es necesario  que  sean especialistast en  software o hardware para usarlo.
  
  2- Gestionar los recursos software y hardware del equipo. El uso eficiente de los recursos es primordial puesto que son limitados. Dependiendo del fin y las tareas encomendadas al sistema informático, la eficiencia puede redirigirse a acciones diferentes.  

El sistema operativo es un software con características particulares, ya que debe administrar todos los recursos del sistema entre los usuarios y el resto de software. 

Por tanto, las características fundamentales que debe soportar cualquier sistema operativo son:

1- Adaptabilidad: se debe acomodar a dos situaciones que evolucionan en paralelo, nuevo software y nuevo hardware. El sistema operativo debe ser capaz de reacondicionarse (normalmente mediante actualizaciones) para hacer uso de nuevas características o mejoras, tanto en componentes físicos como software.​

2- Facilidad de uso: teniendo como referente el fin al que se empleará el sistema informático, la facilidad de manejo ha de ser primordial. Normalmente, una mayor comodidad implica mayor gasto de recursos (como por ejemplo un sistema gráfico de ventanas). Por ello, existen sistemas operativos que ganan en eficiencia a costa de restringir su manejabilidad.
    
  - Eficiencia. los recursos (procesadores y núcleos, RAM, acceso a discos, red o cola de impresión) son limitados. El sistema operativo debe atender todas las peticiones de usuarios, programas y el propio sistema operativo para facilitar el acceso a los recursos. Ello debe hacerse barajando la importancia de cada solicitud y de quién desee hacer uso de los recursos. Esta tarea es muy compleja y crítica, ya que repercutirá en todo el sistema​​.
    
El sistema operativo debe administrar de forma eficiente los recursos, atendiendo al objetivo de dicho sistema operativo. 
Los más solicitados son:

1- Memoria RAM. La parte del sistema operativo que siempre reside en memoria RAM se denomina núcleo o kernel. Es un subconjunto software del propio sistema operativo que por su importancia en la gestión del sistema no puede abandonar la memoria principal. El resto de módulos del sistema operativo se irá cargando y descargando desde los dispositivos de almacenamiento secundario a la memoria principal, dependiendo de la arquitectura del sistema operativo. El espacio restante de memoria RAM se debe gestionar eficientemente para albergar el resto de software y los datos que maneje este.

  - Procesador. Aunque disponga de varios núcleos y, por tanto, pueda ejecutar varios procesos a la vez, existe multitud de software que desea ejecutarse.

  - Adaptadores de red. Múltiples aplicaciones hacen uso de la red simultáneamente, debiendo administrar las conexiones de red entre aplicaciones, procesos y usuarios.

  - Medios de almacenamiento. El acceso a discos duros puede representar un cuello de botella importante. l Colas de impresión. Pueden existir más de una petición de impresión a una misma impresora, por lo que se debe gestionar la cola de trabajos de impresión adecuadamente

### TIPOS DE SISTEMAS OPERATIVOS:
- Existen distintos puntos de vista para catalogar los sistemas operativos:
- Atendiendo al número de procesos que se pueden ejecutar concurrentemente:
  
    A) Monotarea o monoprogramado: un proceso únicamente puede ser ejecutado por un usuario. Esto quiere decir que un usuario solo puede estar ejecutando un programa, además del propio sistema operativo.
    
    B) Multitarea o multiprogramado: un usuario puede ejecutar varios procesos simultáneamente. De esta manera, pueden existir varios programas en memoria susceptibles de ser ejecutados.

- Atendiendo al número de usuarios que pueden ser atendidos por el sistema operativo simultáneamente: ​

    A) Monousuario: solo pueden atender a un usuario. El usuario goza de todos los recursos, a menos que el sistema operativo los acapare.
  
    B) Multiusuario: pueden atender a más de un usuario concurrentemente.

- Atendiendo al tipo de procesamiento: el sistema operativo ha de estar preparado para ejecutar procesos con diferentes finalidades y requisitos. Los sistemas operativos intentan optimizar sus recursos, independientemente de los procesos que atiendan. Sin embargo, los procesos, según su forma de ejecutarse, pueden ser:
  - Atendiendo al tipo de procesamiento: el sistema operativo ha de estar preparado para ejecutar procesos con diferentes finalidades y requisitos. Los sistemas operativos intentan optimizar sus recursos, independientemente de los procesos que atiendan. Sin embargo, los procesos, según su forma de ejecutarse, pueden ser:
    - Por lotes, batch o no interactivos: se suministra un conjunto de tareas al sistema operativo con características similares, y este se encarga de ejecutarlas en serie y sin la intervención del usuario. En caso de producirse un error en una tarea del lote, el resto de tareas no se podrá ejecutar. Ejemplos: realización de facturas agrupadas, tareas de cómputo en investigación, envío de mensajes con informes o resúmenes en cadenas de producción, etc.

-----
TENER EN CUENTA 
-
"Los sistemas operativos multiusuario son multitarea, puesto que tratan con diferentes procesos asociados a varios usuarios. Por tanto, un sistema operativo multiusuario y monotarea, puede tratar con varios usuarios simultáneamente, pero con un único proceso por usuario. Es de reseñar que pueden existir sistemas multiusuario y monotarea, así como multitarea y monousuario​"
-----

- De esta manera, existen sistemas operativos más orientados a uno u otro tipo de proceso, puesto que la eficiencia de estos se planifica desde el diseño de los mismos:

  A) Sistemas operativos en tiempo real: donde se deben cumplir escrupulosamente los plazos de ejecución de los procesos y, además, deben tener un comportamiento predecible. Ejemplos: en aviónica, instrumentación médica, sistemas de alertas en una central nuclear, etc.

   B) Sistemas operativos interactivos o de tiempo compartido: orientados a la participación continua del usuario, los cuales hacen uso de los programas antes comentados, tales como un procesador de textos o un editor de imágenes. Son sistemas de propósito general en los que, a diferencia de los sistemas de tiempo real, no priman los tiempos de respuesta en la ejecución de procesos.

