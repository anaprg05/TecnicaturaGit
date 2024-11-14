# Creación de la clase padre
class Color:
    # Método inicializador
    def __init__(self, color):
        self._color = color

    # Getter
    @property
    def color(self):
        return self._color
    
    # Setter
    @color.setter
    def alto(self, color):
        self._color = color

    def __str__(self):
        return f'Color: [ color: {self._color} ]'
    