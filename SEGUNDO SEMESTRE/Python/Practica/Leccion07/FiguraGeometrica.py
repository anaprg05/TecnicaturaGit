# Creación de la clase padre
class FiguraGeometrica:
    # Método inicializador
    def __init__(self, ancho, alto):
        self._ancho = ancho
        self._alto = alto

    # Getter
    @property
    def ancho(self):
        return self._ancho
    
    # Setter
    @ancho.setter
    def ancho(self, ancho):
        self._ancho = ancho

    # Getter
    @property
    def alto(self):
        return self._alto
    
    # Setter
    @ancho.setter
    def alto(self, alto):
        self._alto = alto

    def __str__(self):
        return f'Figura Geométrica: [ Ancho: {self._ancho}, alto: {self._alto} ]'
    