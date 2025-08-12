# Creación de clase
class Persona:
    # Variable de clase
    contadorPersonas = 0

    # Decorador
    @classmethod
    # Método por el cual no es necesaria la creación de objetos 
    # para que el contador aumente
    def generarSiguienteValor(cls):
        # Contador incrementa de uno en uno
        cls.contadorPersonas += 1
        return cls.contadorPersonas

    # Método iniciador
    def __init__(self, nombre, edad):
        self.idPersona = Persona.generarSiguienteValor()
        self.nombre = nombre
        self.edad = edad
    
    # Método str
    def __str__(self):
        return f'Persona [{self.idPersona} {self.nombre} {self.edad}]'

# Instancias
persona1 = Persona('Ana', 19)
print(persona1)
persona2 = Persona('Lucas', 20)
print(persona2)
persona3 = Persona('Lautaro', 16)
print(persona3)
Persona.generarSiguienteValor()
persona4 = Persona('Ulises', 16)
print(persona4)

print(f'Valor del contador de personas: {Persona.contadorPersonas}')
