SOBRECARGA DE OPERADORES

  La sobrecarga de un operador significa que un mismo operador
significa que un mismo operador puede comportarse de diferentes 
formas.
  Por ejemplo, el operador de suma (+).
  El operador de suma es un buen ejemplo de la sobrecarga de 
operadores.
  Este operador se puede comportar de maneras distintas dependiendo
si está trabajando con tipos String, con tipos enteros o, por ejemplo,
con tipos lista.
  Así que dependiendo del tipo con el que esté trabajando, es el 
tipo de resultado que vamos a obtener. Por lo tanto, un mismo operador
puede trabajar de distintas formas. Esto se conoce como sobrecarga de
operadores.

     - CASO 1 -                     - CASO 2 -
    a = 2                           a = 'Hola '
    b = 3                           b = 'mundo'
    print(a + b)                    print(a + b)

  En este segundo caso, en lugar de obtener una suma, se obtiene una 
concatenación de tipos String y, entonces, con esto se obtiene la
sobrecarga del operador.
  Si hay dos tipos numéricos, se comporta de una forma. y si hay
tipos String se comporta de otra forma.

                - CASO 3 -
               a = [3, 4, 5]
               b = [6, 7, 8, 9]
               print(a + b)

  Se va a comportar de manera diferente, se obtiene una unión de 
dos listas, creando una sola.

  Es el mismo operador, pero dependiendo del tipo de dato con el
que se está trabajando va a ser el resultado.

-----------------------------------------------------------------

¿SE PUEDE HACER LA SOBRECARGA CON LAS CLASES EN PYTHON?

  Si, se puede. Sin embargo, hay que agregar la sobrecarga de un 
método dependiendo del operador que se quiera sobrecargar.
  Por ejemplo, esta es la lista de métodos según el operador
que se desea sobrecargar. Todos están definidos en la clase 'Object'.

    Operadores Aritméticos             magic method
            +                         __add__(self, other)
            -                         __sub__(self, other)
            *                         __mul__(self, other)
            /                         __truediv__(self, other)
            //                        __floordiv__(self, other)
            %                         __mod__(self, other)
            **                        __pow__(self, other)

    Operadore Comparación (Lógicos)
            <                         __lt__(self, other)
            >                         __gt__(self, other)
            <=                        __le__(self, other)
            >=                        __ge__(self, other)
            ==                        __eq__(self, other)
            !=                        __ne__(self, other)

  Entonces, hay que sobreescribir el método respectivo definido
en la clase 'Object'. 
  En este caso, si se desea sobrecargar la suma, entonces hay 
que sobreescribir el método de add.
  Todos los métodos son tipo dunder. Lo que quiere decir que 
está definido en la clase 'Object'.
  Si se desea sobrecargar el operador de resta, entonces hay que
sobreescribir el método de sub. 
  La sobrecarga y la escritura son dos conceptos diferentes.
  La sobrecarga de un operador significa que se puede comportar
de maneras distintas dependiendo de los operandos con los cuales 
esté trabajando y la sobreescritura tiene que ver con la herencia.
  En este caso, se estaría sobreescribiendo un método definido en 
una clase padre. Así que son conceptos muy distintos.

-----------------------------------------------------------------

SOBRECARGA DE OPERADORES Y SOBREESCRITURA DE MÉTODOS

  Tabla con los operadores de asignación que se pueden sobrecargar.

    Operadore de Asignación (Compuestos)       magic method
            -=                             __isub__(self, other)
            +=                             __iadd__(self, other)
            *=                             __imul__(self, other)
            /=                             __idiv__(self, other)
            //=                            __ifloordiv__(self, other)
            %=                             __imod__(self, other)
            **=                            __ipow__(self, other)

  Tabla con los operadores unarios que se pueden sobrecargar. Es 
decir, solamente trabajan con un solo operando.

    Operadore Unarios                          magic method
            -                             __neg__(self, other)
            +                             __pos__(self, other)
            ~                             __invert__(self, other)
