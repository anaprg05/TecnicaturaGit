'''
Crear una clase llamada 'Cubo'
Atributos: ancho, alto y profundidad.
Método: calcularVolumen
Fórmula: volumen = ancho * alto * profundidad
Los datos necesarios para la fórmula tienen que ser ingresados por el usuario.
'''

# Creación de clase Cubo
class Cubo:
    # Elemento inicializador
    def __init__(self, ancho, alto, profundidad):
        self.ancho = ancho
        self.alto = alto
        self.profundidad = profundidad

    # Definición de Método
    def calcularVolumen(self):
        return self.ancho * self.alto * self.profundidad
    
# Indicarle al usuario que ingrese la base y la altura
ancho1 = float(input(f'Ingrese el ancho del cubo: '))
alto1 = float(input(f'Ingrese la altura del cubo: '))
profundidad1 = float(input(f'Ingrese la profundidad del cubo: '))

# Crear una instancia de la clase Cubo
cubo = Cubo(ancho1, alto1, profundidad1)

# Cálculo del volumen
volumen = cubo.calcularVolumen()

# Impresión del resultado al usuario
print(f'El volumen total del cubo con ancho {ancho1}, alto {alto1} y profundidad {profundidad1} es de: {volumen}')
