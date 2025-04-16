from NumerosIgualesException import NumerosIgualesException
# Un error o excepción es cuando el programa acaba de manera abrupta.
# Creación de variables
# La variable resultado permite ver mejor el testeo el código.
resultado = None # -> no tiene ningún valor

# Posibles variables de 'a'
# a = 10
# a = '10'
# a = 7

# Posibles variables de 'b'
# b = 0
# b = 5

try:
   # Las variables pueden ser definidas dentro del bloque try, pero serán exclusivas de dicho bloque.
    # También, se le puede indicar al usuario que ponga el valor de las variables.
    a = int(input('Digite el primer número: '))
    b = int(input('Digite el segundo número: '))
    
    # Uso de excepciones personalizadas
    if a == b:
        raise NumerosIgualesException('Son números iguales.')

    # La variable resultado no se define dentro del bloque try porque dejaría de ser una variable global.
    resultado = a / b

# Si se especifica una excepción (clase hija de Exception), pero no es la del problema, se pasara a la próxima excepción.
except TypeError as e:
    print(f'TypeError - Ocurrió un error: {type(e)}')

except ZeroDivisionError as e:
    print(f'ZeroDivisionError - Ocurrió un error: {type(e)}')

# La clase Exception es una clase padre.
# Esta clase permite mandar a imprimir el error que ocurre.
except Exception as e:
    print(f'Exception - Ocurrió un error: {type(e)}')

# Si se coloca el tipo de excepción por debajo de la clase Exception, el error ocurre.
#except ZeroDivisionError as e:
#    print(f'Ocurrió un error: {e}')

# Bloque Else (Es un bloque opcional)
# Únicamente se ejecutará si no se ha realizado ninguna excepción.
else:
    print('No se arrojó ninguna excepción.')

# Bloque Finally
# Se puede utilizar para liberar algún recurso para avisar al usuario de cómo finalizó el manejo de excepciones, entre otras cosas.
# Este bloque siempre se va a ejecutar.
finally:
    print('Ejecución del bloque finally.')

print(f'El resultado es: {resultado}')
print('Seguimos...')

