# TIPO BOOLEANO - TRUE / FALSE
# En los tipos numéricos es FALSE para el 0 (cero) y TRUE para el resto de valores

valor = 0
resultado = bool(valor)
print(f'Valor: {valor}, resultado bool: {resultado}')

valor = 1
resultado = bool(valor)
print(f'Valor: {valor}, resultado bool: {resultado}')

print()

# Tipo String
# FALSE -> cadena vacía ('')
# TRUE -> resto de valores
valor = ''
resultado = bool(valor)
print(f'Valor de una cadena vacía: {valor}, resultado bool: {resultado}')

valor = 'Hola'
resultado = bool(valor)
print(f'Valor de una cadena: {valor}, resultado bool: {resultado}')

print()

# Tipo Colecciones
# FALSE -> colecciones vacías
# TRUE -> resto de valores
# Lista
valor = []
resultado = bool(valor)
print(f'Valor de una lista vacía: {valor}, resultado bool: {resultado}')

valor = [2, 3, 4]
resultado = bool(valor)
print(f'Valor de una lista: {valor}, resultado bool: {resultado}')

print()

# Tupla
valor = ()
resultado = bool(valor)
print(f'Valor de una tupla vacía: {valor}, resultado bool: {resultado}')

valor = (2, 3, 4)
resultado = bool(valor)
print(f'Valor de una tupla: {valor}, resultado bool: {resultado}')

print()

# Diccionario
valor = {}
resultado = bool(valor)
print(f'Valor de un diccionario vacío: {valor}, resultado bool: {resultado}')

valor = {'Nombre': 'Ana', 'Apellido': 'Ríos'}
resultado = bool(valor)
print(f'Valor de un diccionario: {valor}, resultado bool: {resultado}')

print()

# SENTENCIAS DE CONTROL
if '':
    print('Regresa Verdadero')
else:
    print('Regresa Falso')

if 'Hola':
    print('Regresa Verdadero')
else:
    print('Regresa Falso')

if valor:
    print('Regresa Verdadero')
else:
    print('Regresa Falso')

if {}:
    print('Regresa Verdadero')
else:
    print('Regresa Falso')

if []:
    print('Regresa Verdadero')
else:
    print('Regresa Falso')

if ():
    print('Regresa Verdadero')
else:
    print('Regresa Falso')

print()

# CICLOS
variable = 40
while variable:
    print('Regresa Verdadero')
    break
else:
    print('Regresa Falso')

variable = ''
while variable:
    print('Regresa Verdadero')
    break
else:
    print('Regresa Falso')

variable = {}
while variable:
    print('Regresa Verdadero')
    break
else:
    print('Regresa Falso')

variable = []
while variable:
    print('Regresa Verdadero')
    break
else:
    print('Regresa Falso')

variable = ()
while variable:
    print('Regresa Verdadero')
    break
else:
    print('Regresa Falso')
