# Ejercicio 1: LLenar una lista
# Llenar una lista del 1 al 50. Luego, mostrar la lista con el bucle for, los elementos deben mostrarse de la siguiente forma:
#   1-2-3-4-5...-50

lista = list(range(1, 51))

for i in lista:
    if i != 50:
        print(i, end="-")
    else:
        print(i)

