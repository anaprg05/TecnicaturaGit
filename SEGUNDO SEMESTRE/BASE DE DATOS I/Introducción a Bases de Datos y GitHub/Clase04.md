# ***Datos***
## Tipos de Datos
- *CHAR (n)*: Nos va a permitir almacenar caracteres y cadenas de texto, pero en forma limitada. Este tipo de dato va a reservar un espacio de memoria del número de caracteres que va a ser ocupado.
- *Varchar(n)*: Al igual que Char, va a reservar espacio en la memoria, La diferencia es que esta reserva un espacio mínimo de memoria y a partir de esa va creciendo o encogiéndose(su límite es de 255 caracteres) por ejemplo : Si queremos guardar una cadena de 100 caracteres o de 2 caracteres, esto se debe a que es dinámico.
- *Tex*: Su función es guardar cadenas de texto muy grandes de más de 1000 caracteres.

## Tipo de Datos Numéricos
- Este tipo de datos nos ayuda a guardar números.
  - *Integer(entero)*: Hace referencia al número que no tienen punto decimal y se usa para declarar. Un tipo de dato entero que me pueda servir para realizar operaciones.Cuando se utiliza este tipo de datos, nuestra base de datos sabrá que estamos hablando de números y no solo de un simple caracter.
  - *Bigint*: Es un subtipo de números enteros que nos sirve para declarar números muy grandes.
  - *Smallint*: También es un subtipo de números enteros que nos va a servir para declarar números muy pequeños (99 o menos).
  - *Decimal(n,s)*: Tiene dos parámetro. La primera entrada es para números eneros y la segunda para números decimales.
  - *Numeric(n,s)*: Al igual que Decimal tiene dos parámetros donde ingresan en la primera entrada números enteros y en la segunda números decimales.

## Tipo de Datos de Fecha y Hora
- Nos van a servir para hacer operaciones más precisas.
- Esta clase de tipo de dato es muy peculiar, ya que nos ayuda a tener una bitácora o registro de nuestra base de datos.
- Por ejemplo: Para saber cuándo alguien creo un registro, lo modificó o lo borró.
  - *Date*: Sólo contiene la fecha (año, mes y día).
  - *Time*: Sólo contiene la hora.
  - *Date time*: Es una mezcla de los dos primeros y va a contener fecha y hora.
  - *TimeStamp*: Es el número de segundos que han transcurrido desde que un archivo fue creado. En otras palabras, podría decirse que es un medidor de tiempo.

## Tipos de Datos Lógicos
- Son los tipos de datos que pueden ser verdadero o falso.
  - *Boolean*: Este tipo de dato puede tener solo dos valores y va a funcionar como un tipo de dato binario. Usando de manera discriminatoria para hacer validaciones.
    - Por ejemplo: Si es verdadero o falso, 1 o 0.
    - Por ejemplo: Se quiere saber si un sitio está activo o inactivo.

# ***Contraint (Restricciones)***
- Son un tipo de reglas que van a permitir que tengas en una base de datos, ósea que tipos de datos podemos ingresar.
  - *NotNull*: Esta regla se ocupa que una columna no tenga valores nulos, ósea que no acepte casilleros vacíos.
  - *Unique*: Se asegura que cada valor en la columna no se repita(que sea único)
  - *Primary key*: Es una combinación de not null y unique. Es además una etiqueta importante ya qué a través de ella, se nos permite hacer relaciones entre las distintas entidades.

## Foreign Key(llave fortanea)
- Es el otro lado de la primary key, ya que identifica de manera única una tupla en otra tabla.
  - Check:  Se asegura que el valor de una columna se cumpla una condición dada.
- Algunas bases de datos removieron este tipo  de restricciones, pero las que aún las conservan son muy potentes.
- Otra característica es que permite añadir las reglas que querremos a nuestra base de datos.

## Default
- Va a colocar un valor por el defecto cuando no hay un valor especificado.

## INDEX
- Se crea por columna para permitir búsquedas más rápidas.
- Su desventaja es que suele volverse lenta cada vez que se añade un nuevo registro.
