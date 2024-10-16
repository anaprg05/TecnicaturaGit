'''
Crear una clase llamada 'Rectangulo'
Atributos: base y altura.
Método: calcularArea
Fórmula: area = base * altura
Los datos necesarios para la fórmula tienen que ser ingresados por el usuario.
'''

# Creación de clase Rectangulo
class Rectangulo:
    # Elemento inicializador
    def __init__(self, base, altura):
        self.base = base
        self.altura = altura

    # Definición de Método
    def calcularArea(self):
        return self.base * self.altura
    
# Indicarle al usuario que ingrese la base y la altura
base1 = float(input(f'Ingrese la base del rectángulo: '))
altura1 = float(input(f'Ingrese la altura del rectángulo: '))

# Crear una instancia de la clase Rectangulo
rectangulo = Rectangulo(base1, altura1)

# Cálculo del área
area = rectangulo.calcularArea()

# Impresión del resultado al usuario
print(f'El área total del rectángulo con base {base1} y altura {altura1} es de: {area}')
