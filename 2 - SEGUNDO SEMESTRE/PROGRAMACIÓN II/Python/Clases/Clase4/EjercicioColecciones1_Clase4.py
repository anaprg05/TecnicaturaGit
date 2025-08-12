# Ejercicio 1: Colecciones - Eliminar duplicados de la lista
# Escribir un programa donde tenga una lista y que, a contunuación, elimine los elementos repetidos y, por último, muestre la lista.

lista = [8, 3, 5, 7, 3, 1, 9, 8, 4, 2, 7, 5, 6, 2, 9]
listaSinDuplicado = []
listaSinDuplicado = list(set(lista))

for elemento in lista:
    if elemento not in listaSinDuplicado:
        listaSinDuplicado.append(elemento)

listaSinDuplicado.sort()

print(f'La lista sin los elementos duplicados en la lista son: {listaSinDuplicado}')
