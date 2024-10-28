# Creación de la clase padre
class FiguraGeometrica:
    # Método inicializador
    def __init__(self, ancho, alto):
        if self._validarValores(ancho):
            self._ancho = ancho
        else:
            self._ancho = 0
            print(f'Valor erroneo para el ancho: {ancho}')
        
        if self._validarValores(alto):
            self._alto = alto
        else:
            self._alto = 0
            print(f'Valor erroneo para el alto: {alto}')

    # Getter
    @property
    def ancho(self):
        return self._ancho
    
    # Setter
    @ancho.setter
    def ancho(self, ancho):
        if self._validarValores(ancho):
            self._ancho = ancho

    # Getter
    @property
    def alto(self):
        return self._alto
    
    # Setter
    @ancho.setter
    def alto(self, alto):
         if self._validarValores(alto):
            self._alto = alto

    def __str__(self):
        return f'Figura Geométrica: [ Ancho: {self._ancho}, alto: {self._alto} ]'

    # Método encapsulado
    # Este método no se dfebe utilizar fuera de la clase padre
    def _validarValores(self, valor):
        return True if 0 < valor < 10 else False
