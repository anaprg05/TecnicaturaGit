# Importación de clase
from Cuadrado import Cuadrado
from Rectangulo import Rectangulo

# Creación de objeto
cuadrado1 = Cuadrado(5, 'Verde')
print(cuadrado1.color)
print(cuadrado1.ancho)
print(cuadrado1.alto)
print(f'Cálculo del área del cuadrado: {cuadrado1.calcularArea()}')

print(cuadrado1)

rectangulo1 = Rectangulo(2, 4, 'Rosa')
print(rectangulo1.color)
print(rectangulo1.ancho)
print(rectangulo1.alto)
print(f'Cálculo del área del rectángulo: {rectangulo1.calcularArea()}')


# Método MRO: Method Resolution Order
# Permite conocer la jerarquía de las clases
# Muestra un 'paso a paso' del código, es decir, como el código va recorriendo las clases
# print(Cuadrado.mro())

