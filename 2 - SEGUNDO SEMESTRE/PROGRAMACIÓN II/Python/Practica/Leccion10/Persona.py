class Persona:
    def __init__(self, nombre, edad):
        self.nombre = nombre
        self.edad = edad
    
    def __add__(self, other):
        return f'{self.nombre} {other.nombre}'
    
    def ___sub___(self, otro):
        return self.edad - otro.edad

persona1 = Persona('Ana', 19)
persona2 = Persona('Ríos', 5)

# Sintaxis interna y automática
# persona1.__add__(persona2)

print(persona1 + persona2)
print(persona1 - persona2)
