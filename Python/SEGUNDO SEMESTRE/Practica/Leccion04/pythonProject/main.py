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
del cocina
print(cocina)
