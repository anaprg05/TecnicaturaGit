# COLECCIONES EN PYTHON
# Listas -> Mutables (Se pueden editar)
# Conjunto de elementos (nombres, números, etc) de cualquier tipo de dato.

nombres = ['Ana', 'Lucas', 'Nelson', 'Lautaro']
print(nombres)
# print(nombres[0])
# print(nombres[1])
# print(nombres[3])
# print(nombres[-1])
# print(nombres[-2])
# Solo muestra el índice 0, 1 pero no el índice 2.
print(nombres[0:2]) 

# Ir del inicio de la lista al índice (sin incluirlo).
# Índices a mostrar: 0, 1, 2.
print(nombres[ :3])

# Desde el índice indicado hasta el final.
print(nombres[1: ])

# Modificar un valor dentro de la lista
nombres[2] = 'Mercedes'
nombres[0] = 'Paula'
print(nombres)

# Iterar una lista
# nombre es singular, la lista es plural
for nombre in nombres: 
    print(nombre)
else:
    print('Se acabaron los elementos de la lista.')

# Preguntar cuántos elementos que contiene la lista.
# El parámetro que está pidiendo 'len' es la lista 'nombres'
print(len(nombres))

# Agregar elementos a la lista.
nombres.append('Gabriel')
# nombres.append(1, 2, 3)
# nombres.append(True)
# nombres.append(10.45)
# nombres.append([4, 5])
# nombres.append(7)
print(nombres)

# Insertar un nuevo elemento en un índice específico
# insert necesirta si o si dos elementos, la posicion en la lista y el nombre del índice.
nombres.insert(1, 'Ana')
print(nombres)
nombres.insert(3, 'Omar')
print(nombres)

# Eliminar un elemento de la lista
nombres.remove('Paula')
print(nombres)

# Eliminar el último elemento
nombres.pop()
print(nombres)

# Eliminar un índice específico
# del significa delete (eliminar)
del nombres[2]
print(nombres)

# Eliminar todos los elementos de la lista
nombres.clear()
print(nombres)

# Eliminar la lista
# El print muestra un error de que no existe
# del nombres
# print(nombres)

# Tuplas -> Inmutables (No se pueden editar)
# Para que sea una tupla y no un string, se necesita poner, aunque sea un elemento, una ','
# Definir una tupla.
cocina = ("cuchara", "cuchillo", "tenedor")
print(cocina)
print(len(cocina))

# Acceder a un elemento, utilizar corchetes, no paréntesis
print(cocina[0])

# Mostrar de manera inversa
print(cocina[-1])
print(cocina[-2])

# Acceder a un rango
print(cocina[0:2])

# Ejemplo
verduras = ("papas",)

# Recorrer los elementos de la tupla
for cocinar in cocina:
    # Print utiliza \n para los saltos de línea
    # Para finalizar los saltos de línea hay que poner ", end=' '"
    print(cocinar)

# Modificar la tupla
# La única forma de modificar una tupla es realizando una conversión de tupla a lista, 
# modificar la lista y convertirla a tupla nuevamente.
cocinaLista = list(cocina)
cocinaLista[0] = "plato"
cocina = tuple(cocinaLista)
print(cocina)

# Eliminar una tupla
# del cocina
# print(cocina)

# Colección Tipo Set
# No tiene un orden y no permite almacenar elementos duplicados o repetidos, no se puede modificar pero se puede eliminar. Lo que quiere decir que no es mutable, pero tampoco inmutable.
# A la hora de imprimir, el orden del contenido es completamente aleatorio.

planetas = {'Marte', 'Júpiter', 'Venus'}
print(planetas)
print(len(planetas))

# Revisar si un elemento existe dentro de set
# Es un tipo booleano (TRUE o FALSE). 
# Deben estar iguales, no puede tener una mayúscula o minúscula demás, ninguna letra menos o más.
print('Marte' in planetas)
print('Júpiter' in planetas)

# Agregar un elemento
# Para esto hay que utilizar la función 'add'
planetas.add('Tierra')
planetas.add('Tierra') # Este no afectaría porque no se pueden duplicar los elementos.
print(planetas)

# Eliminar elementos, puede arrojar un error si el elemento no existe.
# En la función 'remove' ante un mal ingreso y inexistencia del elemento, da error.
planetas.remove('Júpiter')
print(planetas)

# Aquí se muestra el error
# planeta.remove('Urano')
# print(planetas)

# En la función 'discard' no se presenta ningún error.
planetas.discard('Tierra')
print(planetas)

planetas.discard('Urano')
print(planetas)

# Limpiar set o conjuto
planetas.clear()
print(planetas)

# Eliminar set o conjunto
# del planetas
# print(planetas)

# DICCIONARIO DE PYTHON
# En lugar de tener una lista, hay una colección de datos ordenados de una manera particular.
# El diccionario está compuesto por dos elementos.
# 'Maradona' : 10
#  Llave  +  Valor asociado -> El conjunto de estas dos cosas es el diccionario.
# dict(key, value)

diccionario = {
    'IDE': 'Integrated Development Environment',
    'POO': 'Programación Orientada a Objetos',
    'SABD': 'Sistema de Administración de Base de Datos'
}
print(diccionario)

# Verificar los elementos del diccionario
print(len(diccionario))

# Acceder a un elemento del diccionario
# Para acceder a algún elemento del diccionario, hay que utilizar una llave (key)
# Se puede realizar mediante dos métodos
# Primer Método
print(diccionario['IDE'])

# Segundo Método
print(diccionario.get('POO'))
print(diccionario.get('SABD'))

# Modificar los elementos del diccionario
diccionario['IDE'] = 'Entorno de Desarrollo Integrado'
print(diccionario)

# Cómo recorrer los elementos 
# Solo las llaves
for termino in diccionario:
    print(termino)

# Recorrer el valor
for termino, valor in diccionario.items():
    print(termino, valor)

# Otras maneras de acceder al diccionario
# Solo las llaves
for termino in diccionario.keys():
    print(termino)

# Recorrer el valor
for valor in diccionario.values():
    print(valor)

# Comprobar la existencia de algún elemento
print('IDE' in diccionario) # Devuelve un booleano

# Agregar un elemento
diccionario['PK'] = 'Primary Key'
print(diccionario)

# Eliminar un elemento
diccionario.pop('SABD')
print(diccionario)

# Vaciar un diccionario
diccionario.clear()
print(diccionario)

# Eliminar el diccionario
# del diccionario
# print(diccionario)

# REPASO DE LISTAS
# Concatenar listas
lista1 = [1, 1, 1, 2, 3]
lista2 = [4, 5, 6]
lista3 = lista1 + lista2
print(lista3)

# Agregar varios elementos en la lista
lista3.extend([7, 8, 9])
print(lista3)

# En qué indicie esta el elemento elegido
print(lista3.index(5))
# print(lista3.index(0)) # Esto daría error por ser un elemento que no forma parte de la lista.

# Como saber cuántos valores repetidos hay dentro de una lista
print(lista3.count(1)) # Cuenta cuantos valores iguales hay dentro de la lista

# Cómo poner al revés la lista
lista3.reverse()
print(lista3)

# Cómo se multiplica la lista, repitiendo sus elementos
lista = [1, 2, 3] * 2
print(lista)

lista3 = lista3 * 2
print(lista3)

# Métodos de ordenamiento
# sort(): Por default ordenará los elementos de manera ascendente
lista3.sort()
print(lista3)

# sort(reverse=True): Ordenará los elementos de manera descendente
lista3.sort(reverse=True)
print(lista3)

# REPASO DE TUPLAS
# ¿Qué se puede usar dentro de las tuplas?
#   Se pueden utilizar: index, count, len.
# Para modificar una tupla hay que convertirla en lista, modificar esa lista y volver a convertirla en tupla.
# Las tuplas pueden contener diferentes tipos de datos dentro de si.
tupla = (4, 'Hola', 6.78, [1, 2, 78], 4, 'Hola')
print(tupla)

# Se puede buscar un dato dentro de la tupla
# Acción booleana -> Su respuesta es tipo booleana
print(4 in tupla)

# REPASO DEL TIPO SET O CONJUNTO
# Los conmjuntos pueden tener distintos tipos de datos, pero los valores de los mismos deben ser únicos, no se pueden repetir.
# ¿Cómo definir un conjunto?
# Para poder inicializar un elemento vacío, solo se puede utilizar set, de otra forma, saltará error.
conjunto2 = set()
conjunto1 = {'bye',}
conjunto2.add(7)
conjunto2.add('Hola')
print(conjunto2)

conjunto1.add('Hola')
print(conjunto1)

# Preguntar si el número 3 NO está en el 'conjunto1'
# Acción booleana -> Su respuesta es tipo booleana
print(3 not in conjunto1) 

# Cómo hacer la igualdad de dos conjuntos
# Acción booleana -> Su respuesta es tipo booleana
print(conjunto1 == conjunto2)

# Operaciones en conjuntos
# RECORDAR -> No sigue una linea de índices, lo que imprima será en orden aleatorio
# La linea (|) une dos conjuntos
conjunto3 = conjunto1 | conjunto2
print(conjunto3)

# Intersección (&) -> El elemento que tienen en común dos (o más) conjuntos
conjunto3 = conjunto1 & conjunto2
print(conjunto3)

# Mostrar elementos que están en un conjunto pero no en el otro
conjunto3 = conjunto1 - conjunto2
print(conjunto3)

conjunto3 = conjunto2 - conjunto1
print(conjunto3)

# Diferencia (^) -> Son los elementos que están en los dos conjuntos pero no están compartidos
conjunto3 = conjunto1 ^ conjunto2
print(conjunto3)

# Cómo determinar si un conjunto es subconjunto de otro
# Acción booleana -> Su respuesta es tipo booleana
conjunto3 = conjunto1 | conjunto2
print(conjunto1.issubset(conjunto3))
print(conjunto2.issubset(conjunto3))

print(conjunto3.issubset(conjunto1))
print(conjunto3.issubset(conjunto2))

# Cómo saber si los conjuntos no comparten ningún elemento en común
# Acción booleana -> Su respuesta es tipo booleana
# True = Superconjunto
print(conjunto3.issuperset(conjunto1))
print(conjunto3.issuperset(conjunto2))

print(conjunto2.issuperset(conjunto3))

# Cómo saber si ambos conjuntos son disconexos, es decir, que no comparten elementos en común
# Acción booleana -> Su respuesta es tipo booleana
print(conjunto1.isdisjoint(conjunto2))

# Convertir un conjunto totalmente inmutable
# 'frozenset' hace que el conjunto sea totalmente inmutable
# No se puede agregar, modificar ni eliminar elementos del conjunto
conjunto1 = frozenset

# REPASO DICCIONARIOS
diccionarioNuevo = {
                    'Azul': 'Blue', 
                    'Rojo': 'Red', 
                    'Verde': 'Green', 
                    'Amarillo': 'Yellow'
                    }
print(diccionarioNuevo)

# Cómo eliminar
del (diccionarioNuevo['Azul'])
print(diccionarioNuevo)

# Los diccionarios pueden almacenar diferentes tipos de datos
diccionario2 = {'Ana': {'Edad': 19, 'Altura': 1.49}, 'Lucas': {'Edad': 19, 'Altura': 1.83}, 'Lautaro': {'Edad': 16, 'Altura': 1.65}}
print(diccionario2)

# Cómo recorrer el diccionario
for llave in diccionario2:
    print(llave)

# Cómo mostrar los valores dentro del diccionario
for valor in diccionario2.values():
    print(valor)

# Cómo ver todos los datos (valor y llave)
for llave, valor in diccionario2.items():
    print(valor, llave)

# Método Pilas
# Pilas usando listas, el método se conoce como pila pero se utiliza una lista
# Pila se trata de trabajar siempre con el último elemento (agregar o quitar)
pila = [1, 2, 3]
print(pila)

# Agregar elementos a la pila por el final
# Esto quiere decir que el último elemento ingresado es el último en salir
pila.append(4)
pila.append(5)
print(pila)

# Sacar elementos a la pila por el final
# La función pop saca y retorna el último elemento de la lista
# El elemento que se va a eliminar será almacenado en la variable 'elementoBorrado'
elementoBorrado = pila.pop()
print(pila)
print(f'El elemento eliminado es: {elementoBorrado}')

# Método Cola
# Cola usando listas, el método se conoce como cola pero se utiliza una lista
# Estructura de datos tipo fifo (first input / first output)
# Quiere decir que último elemento agregado será al final y que el primer elemento en la cola será el primero en entrar y salir
cola = ['Ana', 'Paula', 'Nelson', 'Lautaro']
print(cola)

# Agregarm elementos al final de la cola
cola.append('Lucas')
cola.append('Mercedes')
print(cola)

# Sacar elementos de la cola
# El elemento que se va a eliminar será almacenado en la variable 'seRetira'
seRetira = cola.pop(0)
print(f'Cliente atendido: {seRetira}')
print(cola)
seRetira = cola.pop(0)
print(f'Cliente atendido: {seRetira}')
print(cola)

seleccionArgentina = {
                        10: {'Nombre': 'Leonel', 'Apellido': 'Messi', 'Edad': '35', 'Altura': '1.70', 'Precio': '50 millones', 'Posición': 'Extremo Derecho'},
                        11: {'Nombre': 'Angel', 'Apellido': 'Di María', 'Edad': '34', 'Altura': '1.80', 'Precio': '12 millones', 'Posición': 'Extremo Derecho'},
                        21: {'Nombre': 'Paulo', 'Apellido': 'Dybala', 'Edad': '28', 'Altura': '1.77', 'Precio': '35 millones', 'Posición': 'Media Punta'},
                        19: {'Nombre': 'Nicolás', 'Apellido': 'Otamendi', 'Edad': '34', 'Altura': '1.83', 'Precio': '3.5 millones', 'Posición': 'Defensa Central'},
                        1: {'Nombre': 'Franco', 'Apellido': 'Armani', 'Edad': '35', 'Altura': '1.89', 'Precio': '3.5 millones', 'Posición': 'Portero'}
                        }

for i in seleccionArgentina:
    print(f'{i} -> {seleccionArgentina[i]}')

#--------------------------------------------
# Clase Math
import math

# Sacar la raíz cuadrada (sqrt)
numero = int(input('Ingrese un número positivo: '))

while numero < 0:
    print('Error -> Debería ser un número positivo.')
    numero = int(input('Ingrese un número positivo: '))

# Para evitar que el número decimal sea demasiado larga, el .2f sirve para que hayan solo dos números después de la coma.
print(f'\n Su raís cuadrada es: {math.sqrt(numero):.2f}')

# List Unpacking: Desempaquetado de listas
# Creación de una función con dos parámetros
def show(name, lastname):
    print(name + " " + lastname)

# Creación de una lista con nombres
persona = ['Ana', 'Garín']

# FORMAS DE PASAR POR LOS DATOS
# Se pasa por cada dato de la lista (uno por uno) directamente a la función
show(persona[0], persona[1])

# A diferencia del anterior, se pasa todo junto
show(*persona)

# Estos procesos se pueden realizar también para las tuplas
persona2 = ('Nelson', 'Ríos')
show(*persona2)

# También, se pueden realizar para diccionarios
persona3 = {
    'lastname': 'Atim', 'name': 'Mercedes'
}

# Para los diccionarios es necesario poner dos asteriscos, uno para clave y otro para valor
show(**persona3)

# Repaso del Ciclo for else
# Creación una lista de números 
numbers = [1, 2, 3, 4, 5]

# Creación de un ciclo for con una variable 'n'
for n in numbers:
    print(n)
    # Única forma de evitar que se ejecute el else
    # if n == 3:
    #     break
# El else se va a ejecutar siempre, incluso si la lista está vacía
else:
    print('Esto se terminó.')

#  List Comprehension: Lista de Comprensión
# Este método sirve para tomar solo lo necesario de una lista sin hacer ningúntipo de modificaciones en la misma

# Creación de una lista de nombres (String)
names = ['Mariana', 'Wanda', 'Nicolás', 'Cirano', 'Melina']

# Se realiza la compresión
alongM = [m for m in names if m[0] == 'M'] # Esto regresa una lista nueva
# m -> Cada elemento en singular
# m para m en names -> Se recorre cada uno de los elementos de la lista 'names'
# if m[0] == 'M' -> Condición en la cuál, si los elementos en adelante es igual a la letra 'm', 
# se regresará a una nueva lista que se guardará en 'alongM'

# Mostrar la lista nueva
print(alongM)

# Este proceso se puede hacer en tuplas y diccionarios
# Diccionario
botellaC = {
    {'name': 'Quilmes', 'country': 'Arg'},
    {'name': 'Corona', 'country': 'Mx'},
    {'name': 'Stella Artois', 'country': 'Belgium'}
}

# Diccionario para guardar lo que se desea mantener a parte
Arg = [b for b in botellaC if b[country] == 'Arg']
# Es lo mismo que antes, se recorre elemento por elemento del diccionario
# La condición se cumple si el elemento que se recorre singularmente dentro de 'country' es igual al valor 
# de Arg, entonces se creará el diccionario con el nombre Arg
print(Arg)
print(botellaC)

# Funciones: Paso de Argumentos
# Definición de función
def miFuncion(name, lastName):
    print("Saludos al profe si lee este archivo de Python. \n")
    print(f'Nombre: {name}, Apellido: {lastName}')

# Parámetros -> Son las variables que se declaren en la función
# Argumentos -> Es el valor que se le envía a la función

# Se manda a llamar la función y se pasan los argumentos
# Para evitar errores, a la hora de llamar a la función hay que pasarle los argumentos
# La función se puede llamar reiteradas veces pero con diferentes argumentos 
miFuncion('Nicolás', 'Mercado')
miFuncion('Wanda', 'Lanatta')
miFuncion('Mariana', 'Aguilera')

# Funciones: Palabra return
# Creación de una función para sumar
def sumar(a, b):
    # Hay dos opciones
    # 1. Asignar a una variable el resultado de la operación y esa es la variable que se va a retornar
    # 2. Regresar el resultado de la operación con la palabra 'return' 
    # haciendo la operación dentro del bloque
    return a + b 

# Creación de una variable y llamado a la función
# Aquí la función necesita que se le introduzcan los argumentos
# resultado = sumar(78, 22)
# print(f'El resultado de la suma es: {resultado}')
print(f'El resultado de la suma es: {sumar(55, 45)}')

# Funciones: Valores por Default en Argumentos
# Creación de función
# Declarar que los argumentos son de tipo entero no determinará el tipo de valor que tendrán
def sumar2(a:int = 0, b:int = 0) -> int:
    return a + b

# resultado tirará error porque faltan los argumentos requeridos, 
# para evitar esto es necesario ponerle un valor por default a los mismos
resultado = sumar2()

# Imprime el resultado default
print(f'Resultado de la suma: {resultado}')

#Imprime el resultado con los valores pasados en el print
print(f'Resultado de la suma: {sumar2(22, 66)}')

# Funciones: Argumentos, Variables en Funciones
# Definición de función
# Si se desconoce el número de argumentos que la función recibirá, se utiliza el *, 
# así los argumentos varían
# Normalmente se utiliza *args
def listaNombres(*nombres):
    for nombre in nombres:
        # La variable nombre se convertirá en una tupla
        print(nombre)

# Fuera del bloque, se pasarán los argumentos
# Por más que se impriman en líneas diferentes, los argumentos seguirán agregándose sin problemas
listaNombres('Mercedes', 'Nelson', 'Nicolás', 'Mariana', 'Wanda')
listaNombres('Melina', 'Cirano', 'Ana', 'Ariel', 'Natalia', 'Osvaldo', 'Liliana')

# Argumentos variables para un diccionario
# Definición de función
# El parámetro para poder recibir el diccionario completo es **. 
# Lo más utilizado es **kwargs para recibir argumentos
# kwargs -> key word argument
def listarTerminos(**terminos):
    for llave, valor in terminos.itrms():
        print(f'{llave} : {valor}')

# No se mostrará nada
listarTerminos()

# Se pueden iniciar varios tipos de datos (menos números)
listarTerminos(IDE = 'Integrated Develoment Enviroment', PK = 'Primary Key')
listarTerminos(Nombre = 'Leonel Messi')

# Lista de elementos con funciones (convertir)
# Distintos tipos de datos como argumentos
# Definición de función (establecimiento tipo lista)
def desplegarNombres(nombres):
    for nombre in nombres:
        print(nombre)

# Creación de lista
nombres2 = ['Nelson', 'Mercedes', 'Mariana']
# Llamado a la lista
desplegarNombres(nombres2)

# Este llamado se imprimira de forma que cada uno de los elementos quede en cada renglón. 
# Es decir: 
# A 
# n
# a
desplegarNombres('Ana')

# En caso de llamar un número entero, saltará error a la hora de imprimir, 
# ya que no es un objeto iterable
#   desplegarNombres(10)
# Si se llaman a dos números (o más) enteros, el error persistirá
#   desplegarNombres(10, 11)

# Para recorrer números enteros, hay que transformar en tupla
# Para que sea una tupla con un solo elemento, 
# no hay que olvidar de dejar la coma al lado del mismo ya que sin ella saltará error
desplegarNombres((10, 11))
# Una alternativa a la tupla, es la lista
desplegarNombres([22, 55])

# Funciones recursivas con factorial
def factorial(numero):
    # Caso Base
    if numero == 1:
        return 1
    else:
        # Caso Recursivo
        return numero * factorial(numero - 1)

# Resultado en código duro
resultado = factorial(5)
print(f'El factorial del número 5 es: {resultado}')

