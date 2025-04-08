# ***Sentencias***
- Sentencia para traer datos específicos de una o varias tablas.
- Para ello utilizaremos las sentencia:

      use base1;
      select * from usuario where nombre like "J%";

- El símbolo de  %, hace referencia a cuando buscamos un dato que empiece con una letra , se va  a colocar la letra específica de la búsqueda y luego el sígno de porcentaje

      “LETRA%”
- Si se quiere buscar una palabra que finalice con una determinada letra se colocará delante de la letra.

      “%LETRA”

- O si se necesita buscar datos que contengan letras específicas se clocará

      “%letra%”

  - “letra%”, nos arroja el dato que empieza con la letra específica.
  - “%letra” nos arroja con la letra que finaliza el dato.
  - “%letra%”, para búsquedas de letras específicas en datos.
- También se puede especificar por  cantidad de carácter que tenga un dato.
- Según la cantidad de carácter que tenga ese dato.
- Por ejemplo si un dato tiene 5 carácter utilizaremos el guión bajo “_” según la cantidad de caracteres que tenga el dato que necesitamos que nos arroje.

- Ejemplo:

      use base1;
      select * from usuario where nombre like "_____";

- Utilizando “_” el guion bajo para  especificar la cantidad de caracteres que necesitamos que nos arroje.
- Como cambiar nombre de columnas y tablas utilizando sentencias.
- Para cambiar el nombre a las columnas utilizaremos:

      Use nombre base;
      alter table nombre tabla change nombre de columna Nuevo nombre de columna varchar (50);
      select * from nombre tabla; //para visualizer la modificación de nuestra tabla//

- Utilizamos la sentencia chage para cambiar nombre a nuestra columna.
- Para cambiar el nombre de la tabla utilizaremos el Rename:

      alter table <nombre tabla> Rename < nuevo nombre tabla>;

- Para visualizar el cambio de nombre de nuestra tabla, refrescamos datos.
