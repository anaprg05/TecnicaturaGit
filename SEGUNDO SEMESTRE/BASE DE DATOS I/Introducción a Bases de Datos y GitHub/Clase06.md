# ***RDB, RDBMS e Introducción a Mysql***
## ¿Qué es RDB y RDBMS?
### RDBMS(Relational Database Management System)
- Es un programa que se encarga de cumplir las reglas de códigos. Hay diferentes tipos de manejadores de datos relacionales y hay algunos como Oracle, PostgreSql y MySQL.

## Diferencia entre RDB Y RDBMS
### RDB(BASE DE DATOS RELACIONAL)
- Es un conjunto  de datos perteneciente a un mismo contexto que guarda datos  para un posterior uso en forma persistente.

### RDBMS(SISTEMA MANEJADO)
- Nos permite acceder a nuestra base, es un software o herramienta que sirve de conexión entre la base de datos y el usuario.
- Nos presenta una interface para poder gestionarla.

## MySQL
- Es un sistema open source de administración de bases de datos que es desarrollado y soportado por Oracle.

### SU ORÍGEN
- MySQL fue originalmente lanzado en 1995. Desde entonces, ha pasado por varios cambios de propiedad/administración, antes de terminar en la Oracle Corporation en 2010. A pesar de que Oracle está a cargo ahora, MySQL sigue siendo un software open source, lo que quiere decir que decir que es un software abierto  y puede ser usado y  modificado.​
- El nombre viene al juntar “My” – el nombre de la hija del co-fundador – con SQL – la abreviatura de Structured Query Language, el cual es el lenguaje de programación que le ayuda a acceder y administrar datos en una base de datos relacional.​
- Para poder entender como funciona MySQL, es importante conocer dos conceptos conectados:

#### Bases de Datos Relacionales
- Cuando se trata de almacenar datos en una base de datos, hay distintos enfoques que usted puede utilizar.​
- MySQL opta por un enfoque llamado una base de datos relacional.​
- Con una base de datos relacional, sus datos son fragmentados en varias áreas de almacenamiento separadas – llamadas tablas – en lugar de poner todo junto en una gran unidad de almacenamiento.​
- Por ejemplo, digamos que quiere almacenar dos tipos de información:​
  - Clientes – su nombre, dirección, detalles, etc.​
  - Pedidos – como los productos que compran, el precio, quién hizo la orden, etc.​

- Si intentamos poner todos estos datos juntos en un gran bote, tendrá algunos problemas como:​
  - Datos distintos – los datos que usted necesita para recolectar para una orden son diferentes que los que son para un cliente.​
  - Datos duplicados – cada cliente tiene un nombre, y cada orden también tiene el nombre de un cliente. El lidiar con datos duplicados suele ser complicado.​
  - Sin organización – ¿cómo se conecta uno de forma concisa la información de un pedido con la información de un cliente?​

- Para resolver esos problemas:
  - Una base de datos relacional usaría una tabla separada para los clientes y otra tabla separada para las ordenes.​
  - Sin embargo, usted querrá poder decir “muéstreme todas las ordenes para un determinad cliente”. Aquí es donde entra la parte relacional.​

- Llave:
​  - Al usa una “llave”, usted podrá enlazar los datos, usted verá qué utiliza este modelo relacional, con todos sus datos divididos en tablas separadas.​
  - Por defecto, WordPress utiliza 12 tablas separadas, pero muchos plugins de WordPress también agregarán sus propias tablas. Por ejemplo, ¡la base de datos para el sitio de WordPress de abajo tiene 44 tablas separadas!​​
    - "La llave – el número ID – es lo que conecta todo. Y así es como se “relacionan” una con otra, a pesar de almacenar los datos en tablas separadas."
![image](https://github.com/user-attachments/assets/ffca5d6b-5522-41da-a2a7-fd52b7b9bf1f)

#### Modelo de Cliente-Servidor
- Más allá del sistema de bases de datos relacional, MySQL también utiliza algo llamado el modelo cliente-servidor.​
- La parte de servidor es donde sus datos realmente residen. Pero, para poder acceder a estos datos, usted deberá pedirlos. Aquí es donde entra el cliente.
- Usando SQL- el lenguaje de programación que mencionamos anteriormente – el cliente envía una petición al servidor de la base de datos para los datos que el cliente necesita.​
  - Por ejemplo, si alguien visita una publicación de un blog en su sitio, su sitio de WordPress enviará múltiples peticiones SQL al servidor de la base de datos para obtener toda la información que necesita para entregar la publicación del blog al navegador del visitante. Haría:​
  - Consulta a la tabla wp_posts para obtener contenido para la publicación del blog​.
  - Consulta a la tabla de wp_users para obtener información para la casilla del autor (utilizando la llave que le mostramos anteriormente)​
  - Etc.

### SQL
- Debido a la necesidad de la época por realizar consultas de datos de una forma más organizada se crea SQL como una especie de lenguaje estándar para hacer este proceso en los distintos manejadores de datos.
- SQL es un lenguaje de acceso a bases de datos que explota la flexibilidad y potencia de los sistemas relacionales y permite así gran variedad de operaciones
- SQL es un lenguaje de acceso a bases de datos que explota la flexibilidad y potencia de los sistemas relacionales y permite así gran variedad de operaciones.
- Existe un amplio uso a lo largo de la historia y hasta el día de hoy sobre SQL.

### NOSQL
- Ahora en la actualidad a partir del SQL se crea el NoSQL el cual es un poco más complejo, pero tiene la base de SQL y nos permite manejar los datos de una mejor forma.
