from FiguraGeometrica import FiguraGeometrica
from Color import Color

class Rectangulo(FiguraGeometrica, Color):
    def __init__(self, ancho, alto, color):
        FiguraGeometrica.__init__(self, ancho, alto)
        Color.__init__(self, color)
    
    # Definición de método
    # Si se quita, no se puede instanciar la clase Rectangulo porque la clase padre es abstracta
    # Al ser la clase padre abstracta, las clases hijas automáticamente son abstractas
    def calcularArea(self):
        return self.alto * self.ancho

    def __str__(self):
            return f'{FiguraGeometrica.__str__(self)} {Color.__str__(self)}'
