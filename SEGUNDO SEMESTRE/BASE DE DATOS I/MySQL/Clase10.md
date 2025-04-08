# ***MySQL***
## Tablas
### Use:
- Nos permite posicionarnos en una base de datos ​

      Use <nombre de la base>;​
  
### Cargar Datos en las Tablas
- Para cargar datos a nuestras tablas utilizaremos también una sentencia SQL propiamente del lenguaje​ a partir de palabras reservadas, en este caso utilizaremos: ​

      Insert Into <nombre de la tabla> values (<valores>);​

- Para tener en cuenta los datos en  números se escriben en números.
- Los datos tipo caracter o varchar se escriben entre 1 comilla 'Nombre'​.
- UnA VEZ QUE UTILIZAMOS LOS COMANDOS iNSER iNTO CON TODOS LOS VALORES DE NUESTRA TABLA, EJECUTAREMOS  CON EL ÍCONO DEL RAYO.

## SENTANCIA SELECT *FORM
- Utilizaremos la sentencia SELECT *FROM para visualizar los datos ingresados en nuestra tabla, en este caso al ejecutar la sentencia utilizaremos el rayo con el cursor, para ejecutar solo la últime línea.​

      SELECT *FROM <nombre de la tabla>;​

- Ejecutando la sentencia SELECT *from pero con el rayo que tiene el curso , porque sólo queremos ejecutar la última línea de comandos.​
- Una vez ejecutado el comando, no aparecerá la tabla con los datos ingresados.

## Sentencia Select 
- ​La sentencia SELECT es  para mostrar, para ver, para visualizar datos de una base de datos.

      Select <columna> form<nombre base.nombre tabla>;
- Nos permite traer los datos específicos cuando no utilizamos el asterisco y seleccionando sólo los datos que necesitamos​.
- Nos permite traer datos de diferentes columnas.

      ​SELECT <COMULMNA1 , COLUMNA 3 , COLUMNA 5 FROM <NOMBRE DE LA BASE>.<NOMBRE DE LA TABLA>;

​- SELECT TAMBIÉN NOS PERMITE CAMBIAR EL NOMBRE A UNA COLUMNA, UTILIZAREMOS ​

    Select <Nombre de la columna a> AS <nuevo nombre de la columna> FROM < Nombre dela Base> . <Nombre de tabla>;​

- Para cambiar el nombre a mútiples columnas

      Select <Nombre de la columna A > AS <nuevo nombre de la columna A>, <nombre de columna B> AS < nuevo nombre columna B > FROM < Nombre dela Base> . <Nombre de tabla>;​

## Sentencia Where
- Esta sentencia me traer datos escpecíficos según lo que se le especifique en la búsqueda​

      SELECT * FROM base1.usuario where nombre = "Romina";​

## Sentencia Distinct
- Esta sentencia me va a permitir mostrar datos distintos de  una sola columna, oviará los datos repetidos.
