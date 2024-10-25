# Importación de clase
from Cuadrado import Cuadrado
from Rectangulo import Rectangulo

# Creación de objeto
print('Creación de objeto clase Cuadrado'.center(50, '_'))
cuadrado1 = Cuadrado(5, 'Verde')
print(cuadrado1.color)
print(cuadrado1.ancho)
print(cuadrado1.alto)
print(f'Cálculo del área del cuadrado: {cuadrado1.calcularArea()}')
print(cuadrado1)

print(' ')

print('Creación de objeto clase Rectángulo'.center(50, '_'))
rectangulo1 = Rectangulo(2, 4, 'Rosa')
print(rectangulo1.color)
print(rectangulo1.ancho)
print(rectangulo1.alto)
print(f'Cálculo del área del rectángulo: {rectangulo1.calcularArea()}')
print(rectangulo1)

print(' ')

# Método MRO: Method Resolution Order
# Permite conocer la jerarquía de las clases
# Muestra un 'paso a paso' del código, es decir, como el código va recorriendo las clases¿
print('Método MRO: Method Resolution Order')
print(Cuadrado.mro())
print(Rectangulo.mro())
