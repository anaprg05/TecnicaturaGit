
# help(str.capitalize)

mensaje1 = 'hola mundo'
mensaje2 = mensaje1.capitalize() # -> crea una nueva cadena
print(f'Mensaje1: {mensaje1}. ID: {id(mensaje1)}')
print(f'Mensaje2: {mensaje2}. ID: {id(mensaje2)}')

mensaje1 += ', adios'
print(f'Mensaje1: {mensaje1}. ID: {id(mensaje1)}')
