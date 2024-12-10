# ***VIRTUALIZACIÓN***
- Es un proceso que permite una utilización más eficiente del hardware físico de la computadora y es la base de  la computación en la nube.

## **¿Cómo funciona?**
- El software de virtualización crea una capa de abstracción sobre el hardware de la computadora que permite que los elementos de hardware de una sola computadora (procesadores, memoria, almacenamiento y más) se dividan en múltiples computadoras virtuales, comúnmente llamadas máquinas virtuales (VM). Cada máquina virtual ejecuta su propio sistema operativo (SO) y se comporta como una computadora independiente, aunque se ejecuta solamente en una parte del hardware informático existente.

## **Beneficios**
### *Para las empresas*
- La virtualización permite utilizar el hardware de forma más eficiente y ofrece un mayor retorno de inversión del hardware de una empresa.
- La virtualización permite a los proveedores de la nube prestar servicios a los usuarios con su hardware informático físico existente.

*Para los operadores de datos y proveedores de servicios*
- Eficiencia de recursos: Permite ejecutar varias aplicaciones, cada una en su propia máquina virtual con su propio sistema operativo, en una sola computadora física (generalmente un servidor x86) sin sacrificar la confiabilidad. Esto permite la máxima utilización de la capacidad informática del hardware físico.

## **Su Gestión**
- Gestión más sencilla: Reemplazar las computadoras físicas con máquinas virtuales definidas por software, facilita el uso y la gestión de políticas escritas en software. Esto le permite crear flujos de trabajo de gestión de servicios de TI automatizados.
- Por ejemplo, las herramientas de configuración e implementación automatizadas permiten a los administradores definir colecciones de máquinas virtuales y aplicaciones como servicios, en plantillas de software. Como resultado, pueden instalar estos servicios sistemáticamente sin necesidad de la configuración manual lenta, complicada y propensa a errores.
- Tiempo de inactividad mínimo:las fallas del sistema operativo y de las aplicaciones pueden causar tiempo de inactividad e interrumpir la productividad del usuario.
- Los administradores pueden ejecutar varias máquinas virtuales redundantes de forma paralela y la migración por error entre ellas cuando surjan problemas.
- La ejecución de varios servidores físicos redundantes es más cara.
- Aprovisionamiento más rápido: comprar, instalar y configurar hardware para cada aplicación requiere mucho tiempo. Siempre y cuando el hardware ya esté instalado, el aprovisionamiento de máquinas virtuales para ejecutar todas sus aplicaciones es significativamente más rápido. Incluso puede automatizarlo utilizando un software de gestión e incorporarlo a los flujos de trabajo existentes.

### *Soluciones*
- Varias empresas ofrecen soluciones de virtualización que cubren tareas específicas del centro de datos o situaciones de virtualización de desktop centradas en el usuario final. Los ejemplos más conocidos incluyen VMware, que se especializa en virtualización de servidores, desktop, redes y almacenamiento; Citrix, que tiene un nicho en la virtualización de aplicaciones, pero también ofrece virtualización de servidores y soluciones de desktop virtual; y Microsoft, cuya solución de virtualización Hyper-V viene con Windows y se enfoca en versiones virtuales de servidores y desktop.

## **Máquinas virtuales (VM)**
- Las máquinas virtuales (VM) son entornos virtuales que simulan una computación física en forma de software. Normalmente incluyen varios archivos que contienen la configuración de la máquina virtual, el almacenamiento del disco duro virtual y algunas instantáneas de la máquina virtual que conservan su estado en un momento determinado.

## **Hipervisores**
- Un hipervisor es la capa de software que coordina las máquinas virtuales. Sirve como una interfaz entre la máquina virtual y el hardware físico subyacente, lo que garantiza que cada uno tenga acceso a los recursos físicos que necesita para ejecutarse. También garantiza que las máquinas virtuales no interfieran entre sí al afectar el espacio de memoria o los ciclos de cálculo de las demás.

### *Hay dos tipos de hipervisores*
- Los hipervisores de tipo 1 o "bare-metal" interactúan con los recursos físicos subyacentes, reemplazando por completo el sistema operativo tradicional. Suelen aparecer en escenarios de servidores virtuales.
- Los hipervisores de tipo 2 se ejecutan como una aplicación en un sistema operativo existente. Usados más comúnmente en dispositivos de punto final para ejecutar sistemas operativos alternativos, conllevan una sobrecarga de rendimiento porque deben usar el sistema operativo host para acceder y coordinar los recursos de hardware subyacentes.

## **Tipos de virtualización**
- Virtualización de desktop.
- Virtualización de red.
- Virtualización de almacenamiento.
- Virtualización de datos.
- Virtualización de aplicaciones.
- Virtualización del centro de datos.
- Virtualización de CPU.
- Virtualización de GPU.
- Virtualización de Linux.
- Virtualización en la nube.

### **Las MV ofrecen una herramienta versátil en distintos entornos informáticos**
  - Ordenadores personales (PC):  Las personas pueden utilizar una máquina virtual en un equipo personal para ejecutar software diseñado para un sistema operativo diferente. Por ejemplo, puede crear una máquina virtual con Windows en su Mac para ejecutar programas específicos sólo para Windows.
  - Servidores locales:  Las empresas pueden aprovechar las MV para consolidar varios servidores físicos en un número menor de máquinas más potentes. Esto reduce los costes de hardware y simplifica la gestión de los servidores. Los departamentos de TI pueden crear MV para tareas específicas, como servidores web, bases de datos o entornos de desarrollo.
  - Cloud computing Los proveedores de cloud ofrecen máquinas virtuales as a service (IaaS), que ofrecen una escalabilidad y flexibilidad increíbles. Las empresas pueden aprovisionar fácilmente máquinas con los recursos deseados según demanda, eliminando la necesidad de una inversión inicial en hardware. También pueden escalar sus MV hacia arriba o hacia abajo en función de las cargas de trabajo cambiantes.

- Las VM proporcionan entornos informáticos aislados que se comportan como ordenadores independientes.
- Este aislamiento les permite ejecutar diferentes sistemas operativos y aplicaciones en la misma máquina física, independientemente de la ubicación (su PC, un servidor de la empresa o la nube). Esta flexibilidad y eficiencia hacen de la virtualización una tecnología central en el panorama de TI actual.

## **DIFERENCIA ENTRE LA VIRTRUALIZACIÓN Y LOS CONTENEDORES**
- La virtualización de servidores reproduce una computadora completa en hardware, que luego ejecuta un sistema operativo completo. El sistema operativo ejecuta una aplicación. Es más eficiente que no tener ninguna virtualización, pero continúa duplicando código y servicios innecesarios para cada aplicación que desee ejecutar.
- Los contenedores adoptan un enfoque alternativo. Comparten un kernel de sistema operativo subyacente, solo ejecutan la aplicación y las cosas de las que depende, como bibliotecas de software y variables de entorno. Esto hace que los contenedores sean más pequeños y más rápidos de implementar.

### *¿Qué es un contenedor?*
- Mientras que las máquinas virtuales sobresalen en la emulación de computadoras enteras, los contenedores ofrecen una alternativa más ligera y rápida. A diferencia de las máquinas completamente virtualizadas, los contenedores no simulan su hardware. En su lugar, comparten el núcleo del sistema operativo de la máquina host, pero aíslan la aplicación específica, sus bibliotecas y las dependencias necesarias para ejecutarse. Normalmente, los contenedores son orquestados por algo como Kubernetes o Docker.
- Los contenedores son ligeros y eficientes, utilizarlos y gestionar muchos de ellos, especialmente a escala, puede llegar a ser complejo. Las soluciones de orquestación, como Docker, automatizan la implementación, el escalamiento y las redes en múltiples contenedores.
- Ofrecen un enfoque más rápido y ágil para la virtualización que las VM. Su naturaleza liviana y su enfoque en código aislado los convierten en perfectos para los flujos de trabajo modernos de desarrollo e implementación, especialmente en entornos basados en la nube.

### *Similitud y diferencia*
- Las máquinas virtuales y los contenedores son herramientas de virtualización poderosas, pero su enfoque y las ventajas y desventajas resultantes difieren. Las VM emulan un sistema informático, incluidas sus interfaces virtuales de CPU, memoria, almacenamiento y red.
- Cada MV tiene un sistema operativo completo. Esto proporciona un alto grado de aislamiento, lo que hace que las VM sean ideales para escenarios en los que debe ejecutar varios sistemas operativos en el mismo hardware, soportar aplicaciones heredadas vinculadas a versiones específicas del sistema operativo o requerir límites de seguridad rigurosos. Sin embargo, toda esta emulación del sistema genera sobrecarga; las VM son más prominentes, su inicio es más lento y utilizan más recursos.
- Los contenedores, por otro lado, utilizan un enfoque más ligero. Comparten el núcleo del sistema operativo de la máquina host, pero empaquetan la aplicación específica junto con todas sus bibliotecas y dependencias necesarias. Esto hace que un contenedor sea increíblemente rápido de iniciar (a menudo en segundos) y altamente portátil.
- Su tamaño más pequeño también permite una mayor eficiencia: puede utilizar muchos más contenedores en un solo host que las VM. Los contenedores son adecuados para cargas de trabajo nativas de la nube, arquitecturas de microservicios y cualquier situación donde la velocidad, la portabilidad y la eficiencia de los recursos son cruciales. Al mismo tiempo, los contenedores ofrecen un buen aislamiento, pero no son tan fuertes como las VM debido al sistema operativo del núcleo compartido.

## **¿Qué es Docker?**
- Docker es una plataforma abierta para que desarrolladores y administradores de sistemas desarrollen, envíen y ejecuten aplicaciones distribuidas, ya sea en computadoras portátiles, máquinas virtuales de centros de datos o en la nube.
- Docker empaqueta software en “contenedores” que incluyen en ellos todo lo necesario para que dicho software se ejecute, incluidas librerías. Con Docker se puede implementar y ajustar la escala de aplicaciones de una forma rápida en cualquier entorno con la garantía de que el código se ejecutará.

### *Hay 4 entidades importantes de Docker*
- Containers: Es el corazón de docker, lo más importante y lo que se va a utilizar todo el tiempo. Sin los contenedores Docker no tiene sentido
- Image: Son los artefactos que utiliza Docker para empaquetar contenedores y para poder distribuirlo a través de distintas instalaciones de Docker
- Data Volumes: Es la forma en que Docker nos permite acceder, con seguridad y de manera flexible, al sistema de archivos de la máquina anfitriona sin comprometer la seguridad del mismo.
- Network: Permite a los distintos contenedores de Docker comunicarse entre sí o con el mundo exterior.

### *Su arquitectura*
- La arquitectura Docker es una arquitectura cliente-servidor, dónde el cliente habla con el servidor (que es un proceso daemon) mediante un API para poder gestionar el ciclo de vida de los contenedores y así poder construir, ejecutar y distribuir los contenedores.
- El hecho de que el cliente se comunique con el servidor mediante el API hace que el cliente y servidor puedan estar en la misma máquina comunicándose mediante sockets de UNIX o bien en máquinas diferentes comunicándose mediante un end-point en la red.

#### Docker Engine: es la aplicación cliente-servidor que implementa Docker Y tiene tres componentes:
**1.** Servidor: es el proceso principal de Docker y que funciona como proceso demonio del sistema. Es el encargado de gestionar los objetos que hay en Docker como imágenes, contenedores, redes y volúmenes. Se representa mediante el comando dockerd.

**2.** API Rest: es un API Rest que nos permite acceder a las capacidades del servidor y ejecutar comandos sobre él. Podemos utilizar un simple curl para acceder a las capacidades del API de Docker

**3.** Cliente: es la línea de comandos representada por el comando docker. El cliente habla vía el API Rest para poder ejecutar los comandos. Es lo que utilizaremos para poder ir gestionando el ciclo de vida de nuestras imágenes y contenedores.

### *Registros Docker*
- Los registros Docker (Docker Registry) son los que almacenan imágenes Docker. El Docker Hub es un registro público que almacena múltiples imágenes, algunas de ellas certificadas por Docker.

