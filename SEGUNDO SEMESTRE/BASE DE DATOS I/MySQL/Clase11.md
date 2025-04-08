# ***Sentencias***
## Order by
- Se utiliza para ordenar de forma ascendente o descendente una un campo en una tabla, ya sea por medio de A la Z, z a la A de 1 hasta el infinito o desde el infinito hasta el 1.

      use <nombre de la base>;
      Select * from <nombre de la base>. <nombre tabla> order by <nombre columna> asc;

- Orden de forma ascendente

      use base1;
      select * from base1.usuario order by nombre asc;

- Ordenar de forma descenedente

      use base1;
      Select * from base1.usuario order by nombre desc;

## SENTENCIA NOT
- El operador Not lo que hace es que no me muestra el valor que yo le indique, esto me permitirá traer sólo los datos que necesito trabajar en ese momento.

      use <nombre de la base>;
      Select * from <nombre base>. <nombre tabla>
      Where not <columna de la tabla>  = “dato específico";

- Utilizamos el operador Not para eliminar algún dato que no necesite ver en mi tabla

      use base1;
      Select * from base1.Usuario
      Where not apellido = "Rojas";

## Sentencia DROP
- Esta sentencia me permite  eliminar columnas,  un dato en específico y  eliminar una base de datos.
  
      Use <nombre de la base>;
      alter table <nombre tabla>
      drop column <nombre columna>

- Ej:

      use base1;
      alter table Usuario
      drop column correo

- Se eliminará la columna seleccionada

## Sentencia Delete
- Esta sentencia nos permitirá eliminar, contenidos de tablas específicos o en general.
- Si utilizamos sólo el comando DELETE FROM y el nombre de la tabla eliminaremos todo el contenido de dicha tabla.

      use <nombre de la base>;
      delete from <nombre de la tabla>

- EJ.

      use base1;
      delete from usuario

- Para no eliminar todos los datos de una tabla acompañamos el delete con el where

      use <nombre de la base>;
      delete from >nombre de la tabla> where <nombre de la columna> = “dato específico”;

- De esta manera sólo estaríamos eliminando datos específicos y no todos los datos.

## Normalización
- La normalización es un proceso el cual los atributos de una tabla pasan a ser re organizados, evitando así la repetición de estos y ahorrar espacio en una base de datos.

### ¿PARA QUÉ SE UTILIZA?
- La normalización es un proceso al cual el programador utiliza lo que es su lógica para evitar datos repetidos en una base de datos y así optimizar y ahorrar espacio y recursos en una empresa.

### OBJETIVO:
- La normalización tiene como objetivo principal evitar la redundancia de datos en una base de datos y a su vez el ahorro de espacio en la misma. Muchas veces estarán limitados por la mismas empresas.
- Tres formas de Normalización:
  - Primera forma:
    - Se encarga de eliminar los datos repetidos que tiene una tabla y separarlos.
    - Crea una tabla por separado por cada grupo de datos relacionado.
    - Identifica cada grupo de datos relacionados con una clave primaria.
  - Segunda forma:
    - Se crean tablas separadas para aquellos grupos de datos que se aplican a varios registros.
    - Las tablas se relacionan mediante una clave externa.
  - Tercera forma:
    - Es la relación y dependencia que tiene cada tabla.
    - Elimina todos aquellos campos que no dependan de una clave.
    - Por ejemplo, si la tabla A, B y C. B depende de A, entonces  C depende de B y de A, pero si yo elimino B, C  sigue dependiendo de A.

### Seleccionar datos de diferentes tablas
- Utilizaremos el comando:

      SELECT * FROM  <nombre de tabla1> , <nombre de tabla 2>;

- Para seleccionar datos específicos de tablas, utilizaremos:

      use base1;
      Select *from  <nombre de tabla 1>, <nombre de tabla 2>;
      SELECT * FROM usuario, serial ; select usuario.nombre, usuario.apellido , serial. n_serial from usuario, serial where usuario.idusuario=serial.idserial;
 
