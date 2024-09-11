# Ejercicio 2: Colecciones - Operaciones de conjuntos con listas
# Escribir un programa que tenga dos listas y que, a continuación, cree las siguientes listas (las cuales no deben tener repetición):
#   1- Lista de palabras que aparecen en las listas
#   2- Lista de palabras que aparecen en la primer lista, no en la segunda
#   3- Lista de palabras que aparecen en la segunda lista, no en la primera
#   4- Lista de palabras que aparecen en ambas listas

lista1 = ['Ana', 'Lucas', 'Milo', 'Zuki', 'Nelson', 'Illa', 'Freddy', 'Carlos', 'Eugenia', 'Luchy', 'Raúl']
lista2 = ['Paula', 'Ana', 'Mercedes', 'Kimura', 'Illa', 'Lautaro', 'Carlos', 'Raúl', 'Mary', 'Leonel']

conjunto1 = set(lista1)
conjunto2 = set(lista2)

listaPalabras1 = conjunto1 | conjunto2 
print(f'La lista 1 quedaría de la siguiente manera: {listaPalabras1}')

print('')
listaPalabras2 = list(conjunto1 - conjunto2)
print(f'La lista 2 quedaría de la siguiente manera: {listaPalabras2}')

print('')
listaPalabras3 = list(conjunto2 - conjunto1)
print(f'La lista 3 quedaría de la siguiente manera: {listaPalabras3}')

print('')
listaPalabras4 = conjunto1 & conjunto2
print(f'La lista 4 quedaría de la siguiente manera: {listaPalabras4}')
