# Ejercicio 2: Modificar los elementos de una lista
# Llenar una lista con los números del 1 al 10. Luego, modificar los elementos de la lista multiplicándolos por el valor ingresado por el usuario.

lista = list(range(1, 11))

print('Lista a multiplicar')
for i in lista:
    print(i, end= '-')

numero = int(input('\n Ingrese el número que desea multiplicar: '))

for indice, i in enumerate(lista):
    lista[indice] *= numero

print('\n Lista Multiplicada')
for i in lista:
    print(i, end= '-')
