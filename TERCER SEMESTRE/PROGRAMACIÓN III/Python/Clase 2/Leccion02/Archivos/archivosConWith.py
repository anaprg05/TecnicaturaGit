# Importación de Clase Padre
from ManejoArchivos import ManejoArchivos

# Manejo de archivos.
# Manejo de Contexto With: Uso de la palabra 'with'.
# Es una forma simplificada que de manera automática abre y cierra el archivo. Por lo que, los bloques 'try' y 'finally' ya no son necesarios.
# Los métodos que se ejecutan automáticamente son:
#   __enter__ (el que abre)
#   __exit__ (el que cierra)
# Primero, se abre en modo lectura (r) y, luego, se renombra como 'archivo' (as archivo).
# Lo que regresa la función de 'open' es un flujo.
# with open('prueba.txt', 'r', encoding = 'utf8') as archivo:
    # print(archivo.read())

with ManejoArchivos('prueba.txt') as archivo:
    print(archivo.read())
