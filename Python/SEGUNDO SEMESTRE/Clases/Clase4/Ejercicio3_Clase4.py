# Ejercicio 3: Insertar los elementos y ordenarlos
# Pedir números y meterlos en una lista, cuando el usuario introduzca un número 0, el programa dejaría de insertar. Por último, mostrar los números ordenados de menor a mayor.

lista = []

while True:
    numeros = float(input('Ingrese los números de la lista (Para finalizar con el proceso, introduzca el 0): '))
    if numeros == 0:
        break
    lista.append(numeros)
lista.sort()

print(f'\n La lista ordenada queda de la siguiente manera: \n {lista}')
