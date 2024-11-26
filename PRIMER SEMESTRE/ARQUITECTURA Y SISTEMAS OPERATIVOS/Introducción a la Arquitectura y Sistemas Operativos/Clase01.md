# ***Introducción a los Sistemas Operativos***

### *Funcionalidades de un Sistema Operativo:*

- Para comprender la arquitectura de una computadora es necesario entender cómo funciona un Sistema Operativo.​
- Las funcionalidades básicas de un Sistema Operativo son:

  **1-** *Actuar de interfaz entre el usuario y el hardware de manera transparente para el usuario.*  
  Ofreciendo un soporte a los usuarios para que sus acciones se transmitan con facilidad. No es necesario que sean especialistas en software o hardware para usarlo.
  
  **2-** *Gestionar los recursos software y hardware del equipo.*  
  El uso eficiente de los recursos es primordial puesto que son limitados. Dependiendo del fin y las tareas encomendadas al sistema informático, la eficiencia puede redirigirse a acciones diferentes.

El sistema operativo es un software con características particulares, ya que debe administrar todos los recursos del sistema entre los usuarios y el resto de software.

### **Características fundamentales que debe soportar cualquier sistema operativo:**

- **1-** *Adaptabilidad*:  
  Se debe acomodar a dos situaciones que evolucionan en paralelo: nuevo software y nuevo hardware. El sistema operativo debe ser capaz de reacondicionarse (normalmente mediante actualizaciones) para hacer uso de nuevas características o mejoras, tanto en componentes físicos como software.​

- **2-** *Facilidad de uso*:  
  Teniendo como referente el fin al que se empleará el sistema informático, la facilidad de manejo ha de ser primordial.  
  - *Eficiencia*: Los recursos (procesadores y núcleos, RAM, acceso a discos, red o cola de impresión) son limitados. El sistema operativo debe atender todas las peticiones de usuarios, programas y el propio sistema operativo para facilitar el acceso a los recursos. 

El sistema operativo debe administrar de forma eficiente los recursos, atendiendo al objetivo de dicho sistema operativo. Los más solicitados son:

- **Memoria RAM:**  
  La parte del sistema operativo que siempre reside en memoria RAM se denomina núcleo o kernel. Es un subconjunto del propio sistema operativo que, por su importancia, no puede abandonar la memoria principal. El resto de módulos se cargan y descargan según sea necesario.

- **Procesador:**  
  Aunque disponga de varios núcleos y, por tanto, pueda ejecutar varios procesos a la vez, existe multitud de software que desea ejecutarse simultáneamente.

- **Adaptadores de red:**  
  Múltiples aplicaciones hacen uso de la red simultáneamente, debiendo administrar las conexiones de red entre aplicaciones, procesos y usuarios.

- **Medios de almacenamiento:**  
  El acceso a discos duros puede representar un cuello de botella importante.

- **Colas de impresión:**  
  Pueden existir más de una petición de impresión a una misma impresora, por lo que se debe gestionar la cola de trabajos de impresión adecuadamente.

---

### *Tipos de Sistemas Operativos:*

#### **1. Atendiendo al número de procesos que se pueden ejecutar concurrentemente:**

- **A)** *Monotarea o monoprogramado:*  
  Solo se ejecuta un proceso por usuario. 

- **B)** *Multitarea o multiprogramado:*  
  Un usuario puede ejecutar varios procesos simultáneamente.

#### **2. Atendiendo al número de usuarios que pueden ser atendidos simultáneamente:**

- **A)** *Monousuario:*  
  Solo pueden atender a un usuario. 

- **B)** *Multiusuario:*  
  Pueden atender a más de un usuario al mismo tiempo.

#### **3. Atendiendo al tipo de procesamiento:**

- **A)** *Por lotes, batch o no interactivos:*  
  El sistema operativo ejecuta un conjunto de tareas en serie sin intervención del usuario. Ejemplo: procesamiento de facturas agrupadas.

- **B)** *En tiempo real:*  
  Procesos con plazos estrictos de ejecución. Ejemplos: aviónica, instrumentación médica.

- **C)** *Interactivos o de tiempo compartido:*  
  Orientados a la participación continua del usuario. Ejemplo: sistemas operativos de propósito general como Windows, macOS o Linux.

---

### *Interfaz de usuario:*

#### **1. Atendiendo al sistema de interfaz empleado:**

- **A)** *Textuales:*  
  Emplean comandos introducidos de forma escrita a través de un terminal. Son potentes, pero requieren mayores conocimientos.

- **B)** *Gráficos:*  
  Usan ventanas y botones intuitivos para facilitar el manejo. Sin embargo, consumen más recursos.

---

### *Atendiendo a la forma de ofrecer los servicios:*

- **Sistemas operativos cliente o de escritorio:**  
  Gestionan procesos y recursos de una sola computadora. Son comunes en hogares y oficinas pequeñas.

- **Sistemas operativos en red:**  
  Gestionan recursos y usuarios de una red centralizada a través de un servidor. 

- **Sistemas operativos distribuidos:**  
  Actúan varios computadores de manera transparente al usuario, dando la sensación de interactuar con un único sistema.

---

### *Etapas del procesamiento de datos:*

1. **Recopilación de datos:**  
   Los datos se obtienen de fuentes disponibles, incluidos archivos de texto o almacenes de datos.

2. **Preparación de datos:**  
   Los datos se limpian y organizan antes de procesarse.

3. **Entrada de datos:**  
   Los datos sin procesar se transforman en información utilizable según el lenguaje de trabajo.

4. **Procesamiento:**  
   Se aplican técnicas como filtrado, análisis o visualización.

5. **Interpretación de datos:**  
   Los datos procesados se traducen en gráficos, texto, imágenes u otros formatos legibles.

6. **Almacenamiento de datos:**  
   Los datos procesados se guardan para uso futuro.

7. **Dar salida:**  
   Los datos resultantes se exteriorizan.

---

### **Conceptos básicos:**

- **Bit:** Unidad básica de almacenamiento.  
- **Campo:** Elemento de información almacenable.  
- **Registro:** Conjunto de valores relacionados en memoria.  
- **Archivo:** Colección de registros.  
- **Dato:** Número o carácter que representa un valor o medición.  
- **Base de datos:** Colección integrada de registros relacionados lógicamente.  
- **Conversión de datos:** Cambio de datos a otro formato sin manipulación.

---

### *¿Qué es el Hardware?*  
La parte física que da soporte y permite el desarrollo de un proceso de datos.

### *¿Qué es el Software?*  
El programa que permite llevar a cabo el desarrollo del procesamiento de datos. Es la parte intangible de la computadora.
