# Para convertir una clase en una clase abstracta, es necesario ir a 
# la primer línea del código e importar Abstract Base Class (ABC)
# Decorador abstractmethod -> importa un método abstracto
# Para importar más elementos de un mismo módulo se escribe de la siguiente forma:
# from 'módulo' import 'clase', 'modulo', etc.
from abc import ABC, abstractmethod

# Creación de la clase padre
# Ahora, 'FiguraGeometrica' es hija de la clase 'ABC'
class FiguraGeometrica(ABC):
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
        else:
            print(f'Valor erroneo para el ancho: {ancho}')

    # Getter
    @property
    def alto(self):
        return self._alto
    
    # Setter
    @ancho.setter
    def alto(self, alto):
        if self._validarValores(alto):
            self._alto = alto
        else:
            print(f'Valor erroneo para el ancho: {alto}')

    # Para que el método sea considerado abstracto debe tener primero el decorador
    @abstractmethod
    def calcularArea(self):
        # Para que no se implemente en la clase padre es necesario poner lo siguiente
        pass

    def __str__(self):
        return f'Figura Geométrica: [ Ancho: {self._ancho}, alto: {self._alto} ]'

    # Método encapsulado
    # Este método no se dfebe utilizar fuera de la clase padre
    def _validarValores(self, valor):
        return True if 0 < valor < 10 else False
