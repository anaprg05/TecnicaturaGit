# Importación de clases padre
# from 'módulo/archivo' import 'clase'
from FiguraGeometrica import FiguraGeometrica
from Color import Color

# En caso de herencia múltiple, es necesario poner las clases padre dentro de los paréntesis, 
# separadas por una coma
# Además, es importante el orden en el que se colocan los padres
class Cuadrado(FiguraGeometrica, Color):
    # Inicialización de la clase hija
    def __init__(self, lado, color):
        # En caso de herencia múltiple, no se utiliza el super().__init__, ya que 
        # podría causar confución debido a que no se especifica a qué padre está llamando
        # super().__init__(lado)

        # Se llaman directamente a las clases padre
        FiguraGeometrica.__init__(self, lado, lado)
        Color.__init__(self, color)

    # Definición de método
    # Si se quita, no se puede instanciar la clase Cuadrado porque la clase padre es abstracta
    # Al ser la clase padre abstracta, las clases hijas automáticamente son abstractas
    def calcularArea(self):
        return self._alto * self._ancho

    def __str__(self):
        return f'{FiguraGeometrica.__str__(self)} {Color.__str__(self)}'
