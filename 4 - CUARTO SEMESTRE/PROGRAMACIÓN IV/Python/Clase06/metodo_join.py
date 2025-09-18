
# help(str.join)

# JOIN -> Une todos los elementos en una sola cadena
tupla_str = ('Hola', 'alumnos', 'tecnicatura', 'universitaria')
mensaje = ' '.join(tupla_str)
print(f'Mensaje: {mensaje}')

lista_cursos = ['Java', 'Python', 'Angular', 'Spring']
mensaje = ', '.join(lista_cursos)
print(f'Mensaje: {mensaje}')

cadena = 'HolaMundo'
mensaje = '.'.join(cadena)
print(f'Mensaje: {mensaje}')

diccionario = {'nombre': 'Ana', 'apellido': 'Ríos', 'edad': '20'}
llaves = ' - '.join(diccionario.keys())
valores = ' - '.join(diccionario.values())
print(f'Llaves: {llaves}, Type: {type(llaves)}, Valores: {valores}, Type: {type(valores)}')
