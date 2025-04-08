# Creación de excepciones personalizadas
# Las excepciones que se creen tienen que ser clases hijas de la clase Exception.
class NumerosIgualesException (Exception):
    def __init__(self, mensaje):
        self.message = mensaje
