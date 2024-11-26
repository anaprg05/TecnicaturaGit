# ***Introducción a la Arquitectura de Sistemas***

##* *​¿QUÉ SIGNIFICA ARQUITECTURA?*
  - EL ARTE O LA CIENCIA DE LA CONSTRUCCIÓN ESPECÍFICAMENTE:
    EL ARTE O LA PRÁCTICA DE DISEÑAR Y CONSTRUIR ESTRUCTURAS Y ESPECIALMENTE LAS HABITABLES.

### *ARQUITECTURAS DE LOS SISTEMAS OPERATIVOS*

La arquitectura de los sistemas operativos ha ido evolucionando de la mano del desarrollo del  hardware de los sistemas informáticos. Ambas partes no pueden funcionar de forma aislada y dependen la una de la otra. A lo largo de los años se han sucedido varias tipologías de arquitecturas en el desarrollo de los sistemas operativos, cada una con sus ventajas e inconvenientes y estando orientadas a propósitos diferentes. La evolución de los propios sistemas operativos ha tomado ideas de arquitecturas o modelos anteriores para fusionarlos y hacerlos propios en beneficio de nuevos sistemas operativos.

## *SISTEMAS CON CAPAS O ANILLOS*
- *Presentan una estructura interna llamada jerárquica, en niveles o en capas.* Se puede decir que están formados por un conjunto de anillos concéntricos que representan servicios o funciones diferentes. Cada capa solo se puede comunicar con la capa inmediata inferior o superior para solicitar servicios o resolver peticiones, respectivamente. Su principal ventaja es el uso de una 62 Sistemas Informáticos con una  estructura bien definida que facilita la corrección de errores, pero resulta lento y complejo al definir las capas. Ejemplo de ello son los sistemas operativos THE y MULTICS, ambos en desuso.
- Los sistemas operativos implementan una multitud de servicios y funciones como la gestión de entrada y salida, la cuenta y control de los programas, la gestión de la memoria, entre otros, lo cual genera una complejidad que los diseñadores deben ocultar pues las operaciones del sistema operativo deben ser transparentes al usuario, lo cual lleva  ocultar todos los detalles de información y de las estructuras de datos empaquetando las funciones en módulos.
- La ocultación de los detalles es una estrategia que ha funcionado construyendo una jerarquía de niveles de abstracción, de modo que cada nivel proporciona un conjunto específico de funciones primitivas que podrán usar las funciones de la capa superior.

### *CAPAS DE UN SISTEMA OPERATIVO*
  **1-** *NÚCLEO*
    - El núcleo o kernel gestiona todos los procesos, es el encargado de llevar la cuenta de todos los procesos activos y de la planificación de los mismos, al seleccionar cuál de ellos ocupara tiempo del procesador, esta capa es muy importante, dado que define el rendimiento del sistema, prueba de ello es el rendimiento que obtuvo Windows XP, al ser creado sobre la base de un núcleo UNIX que fue adquirido a la compañía Santa Cruz Operations.

  **2-** *MANEJO DE MEMORIA*
    - Este nivel administra la memoria principal o memoria RAM, se encarga de asignar los bloques de memoria a los procesos y de liberarlos cuando los procesos han terminado, así también se encarga de retirar algunos procesos de la memoria y almacenar una imagen de ellos en el disco duro, con la finalidad de simular que existe más memoria de la que realmente existe de forma física, el cual es un proceso que denominamos memoria virtual.

  **3-** *ENTRADA Y SALIDA BÁSICA*
    - Proporciona funciones primitivas para la gestión de la memoria secundaria, es decir, se encarga de proveer las primitivas necesarias para la localización, escritura y lectura de bloques de datos en el disco duro, sin llegar a proporcionar muchos detalles, cabe señalar que en esta capa la información almacenada no se representa como archivos, la cual es una implementación de una capa superior.

   **4-** *SISTEMA DE ARCHIVOS*
     - Esta capa proporciona las funciones necesarias para almacenar la información en archivos, se apoya en las primitivas de la capa de entrada y salida; y la decisión de que procesos hacen uso de memoria se ubican en esta capa.
     
   **5-** *INTERFAZ DE USUARIO*
     - ​En esta ultima capa se ubica la interfaz visible para el usuario, ya sea como una línea de comando o como una GUI (Interfaz Gráfica de Usuario), con la cual el usuario comunica y que esta capa traduce al conjunto de primitivas de las capas anteriores.

## *COMPARATIVA ENTRE SISTEMAS OPERATIVOS MONOLÍTICOS, MICROKERNEL E HÍBRIDOS*
### *SISTEMAS MONOLÍTICOS*
