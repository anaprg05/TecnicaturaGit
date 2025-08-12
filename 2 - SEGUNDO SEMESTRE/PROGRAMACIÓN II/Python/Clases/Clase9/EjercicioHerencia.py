# Ejercicio: Uso de herencia
'''
    Definir una clase padre llamada 'Vehiculo' y dos clases hijas llamadas 'Auto' y 'Bicicleta', las cuales
    heredan de la clase padre Vehiculo. La clase padre debe tener los siguientes atributos y métodos:
        Vehiculo(Clase padre):
        - Atributos (color, ruedas)
        - Métodos (__init__(color, ruedas) y __str__())

        Auto(Clase hija de Vehiculo):
        - Atributos (velocidad(km/hr))
        - Métodos (__init__(color, ruedas, velocidad) y __str__())
        
        Bicicleta(Clase hija de Vehiculo):
        - Atributos (tipo(urbana/montaña/etc))
        - Métodos (__init__(color, ruedas, tipo) y __str__())

    Crear un objeto de cada clase
'''

# Creación clase padre
class Vehiculo:
    # Método inciador
    def __init__(self, color, ruedas):
        self.color = color
        self.ruedas = ruedas

    # Método dunder __str__() 
    def __str__(self):
        return f'Vehículo: [ Color: {self.color}, ruedas: {self.ruedas} ]'  

# Creación de clases hijas
class Auto(Vehiculo):
    # Método inciador
    def __init__(self, color, ruedas, velocidad):
        # Constructor de la clase padre
        super().__init__(color, ruedas)
        self.velocidad = velocidad

    # (Override) Sobreescribir Método
    # Método dunder __str__() 
    def __str__(self):
        return f'Auto: [ Velocidad: {self.velocidad} km/hr ] {super().__str__()}'  

class Bicicleta(Vehiculo):
    # Método inciador
    def __init__(self, color, ruedas, tipo):
        # Constructor de la clase padre
        super().__init__(color, ruedas)
        self.tipo = tipo

    # (Override) Sobreescribir Método
    # Método dunder __str__() 
    def __str__(self):
        return f'Bicicleta: [ Tipo: {self.tipo} ] {super().__str__()}'
    
# Creación de objetos
auto1 = Auto("Rojo", 4, 150)  
bicicleta1 = Bicicleta("Lila", 2, "Paseo")  

# Mostrar información de los objetos
print(auto1)
print(bicicleta1)
