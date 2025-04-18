# ***BASES DE DATOS NO RELACIONALES***
## COLECCIONES
- Las colecciones son un conjunto de documentos.​
- Estos son documentos dinámicos, es decir, que su estructura puede cambiar.​
- Aunque siempre o en la mayoría de estructuras de base de datos es muy común encontrar lo que son este tipo de estructura con colecciones, ya que es una mejor organización y encierro de datos.​

### ​¿Qué tener en cuenta a la hora de crear una colección?
- Las colecciones no pueden tener un nombre que sea una cadena vacía, es decir, que tenemos que asignarle un nombre a una colección.​
- La colección no puede ser nombrada por un valor nulo y tampoco por una palabra reservada con el valor​
- nulo.​

## VARIABLES
​- Una variable es un espacio memoria en el sistema, el cual tiene un identificador o nombre.​
- En este espacio se puede almacenar información de cualquier tipo.​
- Por ejemplo: un espacio memoria donde se guarda algún dato, ya sea un nombre, un número, un número decimal​ o un hasta una operación o el resultado de una operación.​

### TIPOS DE VARIABLES
#### Variable Nulo
- Llamamos variable nulo a aquella que ocupa un valor nulo​ o que el  campo que no existe.​
- Por ejemplo:​

      {Edad:null}

​#### Variable Boolean
- Es una variable, la cual puede tener almacenado dos valores.​
- Estos pueden ser ya sea true o false. Podemos utilizarlo mucho para encuestas.​
- Por ejemplo:​

       {Casado:true}​

#### Variables Enteras (Numéricas)
- Esta variable, la cual almacena datos numéricos enteros, es decir, sin puntos decimales.​
- Por ejemplo:​

      {Edad:15}


#### Variables Decimales
- Esta variable almacena números o datos numéricos decimales.
- Por ejemplo:​

      {Resultado:50.0}​

### Variable de Cadena de Texto:
- Estas variables se denomina cadena de texto o string.​
- Cualquiera de los dos esta variable, la cual almacena datos de tipo caracter, pero también puede almacenar datos de tipo numérico, o sea que puede almacenar de cualquier tipo.​
- Por Ejemplo:​

      {Nombre:"Natalia"}​
- Tener en cuenta que al momento de colocar una variable que​ no sea numérica, tenemos que colocarlo entre comillas.

#### Variable Fecha
- Esta es una variable la cual almacena, almacena fechas en milisegundos para crearla.​
- Se utiliza "new Date()"​-
- Tenemos que colocar lo que es este valor o este comando new date para almacenar las fechas, porque si no nos va a presentar otro tipo de información.​
- En la shell se mostraran de acuerdo a la zona horaria de la máquina (pc)​.
- Por ejemplo:​

       {Date: new date()}
​
### Expresiones Regulares
- Este tipo de variables se utilizan para realizar consultas en la base de datos.
  
#### Arrays
​- Son arreglos y son un tipo de variables, los cuales al amanecer almacenan diversos datos​ en una variable.​
- Los arreglos son campos o son una variable que puede almacenar diversos datos y tipo​de datos en una misma variable.​
- Es decir, yo puedo almacenar nombres, números, o sea cadenas de texto, números decimales y todo tipo de datos sin que la variable pues me dé algún error o cualquier otra cosa.​

#### Documentos Embebidos
- Este tipo de variables utilizan documentos como​ datos, es decir, documentos dentro de documentos.​
- Nosotros al crear un documento siempre tenemos la costumbre de poner lo que son llaves y datos, pero​ esta vez podemos almacenar la variable por medio de una llave.​
- Y aparte, en lugar de poner por decirlo así una variable, ya sea numérica y demás, puedo poner un​ documento dentro de esa misma y a eso llamamos  documentos embebidos.​Por ejemplo: ​
- Para almacenar los datos de una de una persona, por ejemplo el nombre datos personales.​
- Pero después quiero almacenar también otro tipo de dato dentro de esa misma que me sirven para identificara esa persona.​
- Debo crear un documento embebido, sea un documento dentro de otro documento.​

### Datos Binarios
- Estos tipos de datos son una cadena a la cual no puede manipular o no puede ser manipulada directamente​, o sea, podemos manipularlos de forma indirecta, ya sea configurando la base de datos de hace de forma, comando y demás o en su shell​

### Código JavaScript
​- En Mongo DB se puede implementar lo​ que es código JavaScript.​
- Esto puede estar implementados en las consultas y documentos, o sea que dentro de los mismos podemos​ crear funciones.​
- Podemos hacer también lo que son operaciones y demás, sin que este nos dé algún tipo de problema o conflicto.​

### Comandos
​- Vamos a ingresar vamos a iniciar abriendo el servicio y después la shell.​
- Para eso vamos a dar control Windows + R y nos va abrir una ventana ejecutable de Windows​.
- En ejecutador ingresaremos CMD y nos abrirá la terminal de Windows​.
- Colocaremos mongod​.
- Luego abriremos el archivo que descargamos de mongoshell.
- Seleccionamos la carpeta bin y luego mongos.
- Es importante mantener las dos ventanas abiertas​.
- Pasos para crear la base de Datos desde la Shell de Mongo:​
  - Utilizaremos el comando Use​.

        >use.primeraclase ​
  - ​Con el comando cls limpiamos pantalla​.

        >cls​
  - Crearemos una colección​.

        >primera clase >db.insertar.insert({ "nombre":"juancito", "edad":20})​
  - Para consultar si se creo la base de datos utilizaremos el comando find()​.

        >db.insertar.find()​
  - Nos arrojará todo los DaTos de las colecciones con el nombre insertar.
