# ***Base de Datos No Reacionales***
## Base de Datos NoSQL
- Cuando hablamos de bases de datos nosql , nos referimos a un conjunto de datos no relacionales.
- Es una amplia base de datos, la cual no utiliza lenguaje SQL como lenguaje principal de consulta, sino que se maneja con documentos.

### VENTAJAS
#### Productividad:
- En el desarrollo de aplicaciones. El sistema NOSQL nos proporciona un modelo de datos que encajan con las necesidades de las aplicaciones.
- Es adaptable y cuando surge las bases nosql, produjo muchas migraciones de una base de datos relacional a una no relacional.

#### Datos a Gran Escala:
- Esta base de datos está diseñada para ejecutarse sobre clústeres.
- Me va a permitir manejar mucha cantidad de base de datos.

### Características
- No utiliza  SQL como lenguaje principal.
- Generalmente es de código abierto.
- No posee un esquema fijo.

## Modelos de Base de Datos NOSQL
### Modelo Clave-Valor
- Se basa en un método simple clave-valor. Almacenando los datos como un conjunto de pares clave-valor.
- Almacenando los datos como conjunto de pares clave-valor en la que una clave sirve como un identificador único.

### Modelo Orientado a Documentos
- Una base de datos orientada a documentos es un subconjunto de base de datos NOSQL.
- Siendo esta base de datos semi-estructurado.
- Estas bases se almacenan en documentos y sobre esos documentos se realizan las consultas.
- Por ej: Facebook utiliza base de DaTOS NO REACIONALES YA QUE MANEJA MUCHOS DATOS DE USUARIOS

### Modelo Basado en Columnas
- La base de datos basada en columnas son creadas para la velocidad, trabajan de una forma que permite omitir los datos irrelevantes para el análisis y leer de inmediato lo que se busca.

#### Documentos
- Cuando hablamos de documentos, no nos referimos a los documentos que tenemos en nuestra computadora, sino a documentos de base de datos nosql, estos serian lo que en una base de datos relacionales llamamos filas o tuplas.

## Mongo DB
- Es una base de datos, que va a funcionar mediante documentos, o sea que todos los datos en los que se trabaja se almacenan en documentos.

### ¿Cómo es el almacenamiento en Mongo DB?
- Mongo DB almacena los datos estructurados de forma JSON (Notación de objetos basados en JavaScript), utilizando un esquema dinámico llamado BSON (Esquema no fijo) que es actualizable.

#### Los Documentos contiene múltiples pares clave valor
- Cuando decimos que los documentos contienen múltiples pares clave valor nos referimos a que las claves serian como los atributos en Mysql y el valor a los datos que se almacenan en un campo.

### Características de Mongo DB
- Las claves están definidas como cadenas y puede utilizarce cualquier carácter.
- En las claves no pueden quedar el valor nulo/0 o usar “.” o “$” ya que tienen propiedades especiales (no se puedes utilizar este tipo de caracteres).
- Mongo db es sensitivo a como se escriben los datos( mayúsculas y minúsculas ej:

      {USUARIO: “kevin 503”}, {usuario: kevin 503}

- Va a cambiar el concepto de la clave
- Un documento no puede tener la clave duplicada( las claves deben ser de diferentes formas)
- Por ej:
![image](https://github.com/user-attachments/assets/05000ab2-1ffc-447a-80d7-6db24dba65f9)

## Instalaciónes
### Mongo DB
1. En el Buscador escribiremos Mongo DB, una vez que nos aparece la página, ingresaremos en el enlace Community Edition.
2. Una vez que ya ingresamos al enlace, nos aparecerá una página donde seleccionaremos la versión mas actual.
3. Una vez seleccionada la versión que deseamos instalar, iniciamos la descarga.

### STUDIO 3T
1. En el buscador escribimos Robo 3T, una vez que nos aparece la página, seleccionamos el primer enlace.
2. Una vez que ingresamos al enlace, nos abrirá la página principal.
3. Iniciaremos la descarga de STUDIO 3T.
