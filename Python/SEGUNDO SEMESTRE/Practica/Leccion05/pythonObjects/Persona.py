# Programación Orientada a Objetos -> Parte 1
# Creación de la clase
class Persona:
    # Por falta de contenido, no se procesa nada
    # pass

    # Atributos en métodos y creación de objetos con argumentos
    # Atributos -> Características
    # Métodos -> Comportamiento que van a tener los objetos (acciones)

    # Para agregar atributos a una clase, es necesario utilizar un método llamado init
    # init -> es similar a un constructor, el cual se encuentra oculto
    # self -> significa uno mismo y es un parámetro por default
    # Este método es conocido como 'Init Dunder'
    def __init__(self, nombre, apellido, edad):
        # No es muy común asignar valores por default a los parámetros
        # Atributos sin clase, son atributos de un método
        # self.atributoDeMetodo = variable
        self.nombre = nombre
        self.apellido = apellido
        self.edad = edad
    
    # Métodos de Instancia
    # Definición de método
    def mostrarDetalle(self):
        print(f'Persona: {self.nombre} {self.apellido} {self.edad}')

print(Persona)

# Creación de objetos
# Al objeto se le asigna el constructor, el cual apunta directamente al método init
# Al agregar argumentos dentro del init, es necesario llenar el paréntesis con argumentos
persona1 = Persona('Paula', 'Ríos', 19)

print(persona1.nombre)
print(persona1.apellido)
print(persona1.edad)

print(f'El nombre y apellido del primer objeto de la clase Persona es: {persona1.nombre} {persona1.apellido} de edad: {persona1.edad}')

persona2 = Persona('Lucas', 'Cerbino', 20)
print(f'El nombre y apellido del segundo objeto de la clase Persona es: {persona2.nombre} {persona2.apellido} de edad: {persona2.edad}')

# Modificación de atributos de un objeto
persona1.nombre = 'Ana'
persona1.apellido = 'Garín'
persona1.edad = 40

print(f'El nombre y apellido del objeto modificado de la clase Persona es: {persona1.nombre} {persona1.apellido} de edad: {persona1.edad}')

persona1.mostrarDetalle()
persona2.mostrarDetalle()

