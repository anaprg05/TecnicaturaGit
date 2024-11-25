# Primer Momento: Introducción a los Sistemas Operativos
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

En esta clasificación se encuentran los más conocidos por nosotros como las diferentes versiones de escritorio y de red de Microsoft Windows o de Apple (Mac OS), así como distribuciones Linux, como Ubuntu.

Atendiendo al sistema de interfaz empleado: ​

A) Textuales: emplean un repertorio de comandos que se introducen en el sistema de forma escrita a través de un terminal de órdenes. Aunque, se necesitan mayores conocimientos de sintaxis y manejo del sistema operativo, las acciones pueden llegar a ser muy potentes desde un punto de vista de explotación del sistema operativo. 

B) Gráficos: usan un conjunto de ventanas, botones y desplegables gráficos donde se representan los diferentes volúmenes, unidades y sistemas de ficheros de forma muy intuitiva. Además, los programas lanzados presentan una vista gráfica. El manejo se realiza con un dispositivo de entrada/salida, como un ratón, y destaca por su fácil utilización. Este sistema emplea muchos más recursos que el textual a nivel de procesador, memoria e incluso, en algunos casos, se necesita de manera casi obligada un adaptador gráfico. Por tanto, en sistemas operativos donde se busca ahorrar todo tipo de recursos en favor de atender a peticiones de usuarios y procesos, la interfaz gráfica se desprecia.

Atendiendo a la forma de ofrecer los servicios:

- Sistemas operativos cliente o de escritorio. Se encargan de realizar el procesamiento de la información, la gestión de los procesos, de la memoria, dispositivos de E/S de una sola computadora. Esta computadora suele estar conectada en red, pero el usuario es consciente de sus accesos externos. En un entorno corporativo, se pueden emplear prácticamente para compartir archivos en red. Por tanto, este tipo de sistema operativo es el normalmente empleado en un hogar o pequeña oficina, así como en entornos empresariales en el ámbito de un servicio de directorio en una red distribuida.
- Sistemas operativos en red. Se encargan de gestionar la red, los usuarios y los recursos de una red de computadoras en general, de forma centralizada mediante un servidor o varios como réplicas o extensiones del primero. Es en el servidor donde se instala este sistema operativo. El resto de equipos de la red (con sistemas operativos cliente) se conectan al servidor (de forma consciente) formando parte del sistema e interactuando con él. Su principal objetivo es el intercambio de información centralizada. Sin embargo, el servidor puede resultar un cuello de botella si cae o si se deteriora la transferencia de información. Destacan por su seguridad y robustez en la administración general del sistema y la gestión de la información que gestionan frente a los sistemas operativos de escritorio.
- Sistemas operativos distribuidos. A diferencia de los anteriores, actúan varios computadores de manera transparente al usuario, de forma que da la sensación que este interactúa solo con uno de ellos. Por tanto, permiten emplear los recursos de varias computadoras en paralelo.

-----

- El proceso de datos:Un proceso es una sucesión de acciones relacionadas, que transforman elemento de entrada en resultados. En un proceso de datos estos son los “Input” (materia prima) constituida por símbolos, y el output también son símbolos que constituyen información.
- Información: Sirve para tomar decisiones, para un accionar concreto (presente o futuro), y se obtiene realizando operaciones  sobre los datos permitiéndonos tomar conocimiento de algún aspecto de la realidad desconocido. Se la conoce como procesamiento. Para ser utilizado por una computadora, los datos deben primero ser convertidos en un formato legible por máquina. Una vez que los datos están en formato digital, se pueden aplicar varios procedimientos sobre los datos para obtener información útil.
- El Proceso Automático de un computador: Debemos tener en cuenta que en esencia una computadora o Equipo lleva acabo un proceso de datos velozmente y en forma automática, sin intervención humana durante ese procesamiento. Los datos se escriben en su memoria que también recibe las instrucciones para ejecutar cada proceso de datos que se quiere realizar, las cuales son ejecutadas por el procesador (Pentium, I3, I5, etc.). Cada conjunto de instrucciones pueden cambiar rápida y fácilmente en su memoria. Cada computadora o equipo puede realizar tantos procesos de datos de diferente índole como se quiera (procesar textos, para juegos, dibujar, procesador de imágenes, etc.)
- Un programa: Se basa en el conjunto de instrucciones que sigue el ordenador para ejecutarse. La programación es lo que permite que un ordenador funcione y realice las tareas que el usuario solicita. El lenguaje de programación es un idioma artificial prediseñado formado por signos, palabras y símbolos que permite la comunicación entre el programador y el ordenador. Las instrucciones que sigue el ordenador para la ejecución de aplicaciones y programas están escritas en lenguaje de programación y luego son traducidas a un lenguaje de máquina que puede ser interpretado y ejecutado por el hardware del equipo (parte física). Los programas  suelen seguir algoritmos, que son el conjunto de instrucciones organizadas y relacionadas entre sí que permiten trabajar al software de los equipos de computación.

### ¿Qué es el Hardware?

Es la parte física que da soporte y que permite el desarrollo de un proceso de datos.

### ¿Qué es el Software?

Es el programa con el que vamos a llevar  a cabo ese desarrollo del procesamiento de datos. Es la parte intangible de nuestra computadora.

### Conceptos básicos:
- bit: es la unidad básica de almacenamiento de datos informáticos.
- Un campo: es un elemento de información que puede almacenarse.
- Un registro: consta de dos o más valores o variables almacenados en posiciones consecutivas de memoria.
- Un archivo: está compuesto por una colección de registros.
- Dato: Los datos pueden ser cualquier número o carácter que puede representar los valores de las mediciones o los fenómenos observables.
- Una base de datos: es una colección integrada de registros relacionados lógicamente.
- Conversión de Datos: implica el cambio de datos en otro formato, y no implica ninguna manipulación de datos.

### Etapas de procesamiento de Datos:
- Recopilación de datos: La recopilación de datos es el primer paso en el procesamiento de datos. Los datos se obtienen de las fuentes disponibles, incluidos los archivos de texto y los almacenes de datos.
- Preparación de datos: Una vez que se recopilan los datos, estos ingresan a la etapa de preparación de los datos. La preparación de datos, a menudo denominada "pre-procesamiento", es la etapa en la que los datos sin procesar se limpian y organizan para la siguiente etapa de procesamiento de datos.
- Entrada de datos: La entrada de datos es la primera etapa en la que los datos sin procesar comienzan a tomar la forma de información utilizable, según el lenguaje en el que vamos a trabajar.
- Procesamiento: los datos ingresados ​​en la computadora en la etapa anterior se procesan para su interpretación. El procesamiento se puede realizar mediante técnicas de filtrado, análisis e visualización de datos e incluso con algoritmos de aprendizaje automático, aunque el proceso en sí puede variar ligeramente dependiendo de la fuente de datos que se procesa (base de datos, redes sociales, dispositivos conectados, etc.) y su uso previsto (examen de patrones de publicidad, diagnóstico de dispositivos conectados, determinar las necesidades del cliente, etc.).
- Interpretación de los datos: La etapa de salida / interpretación es la etapa en la que los datos son finalmente utilizables para los usuarios. Se traducen los datos, se pueden leer, y  a menudo en forma de gráficos, videos, imágenes, texto sin formato, etc.).
- Almacenamiento de datos: La etapa final del procesamiento de datos es el almacenamiento. Una vez que se procesan todos los datos, se almacenan para su uso futuro. Si bien es posible que alguna información se use de inmediato, gran parte de ella tendrá un propósito más adelante.
- Dar Salida: exteriorizar, obtener del sistema datos resultantes.
