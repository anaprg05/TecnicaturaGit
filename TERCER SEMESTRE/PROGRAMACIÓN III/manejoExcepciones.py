# Un error o excepción es cuando el programa acaba de manera abrupta.
try:
    10/0

# La clase Exception es una clase padre de la clase Zero Divition Error.
# Esta clase permite mandar a imprimir el error que ocurre.
except Exception as e:
    print(f'Ocurrió un error: {e}')

