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
    # Método init Dunder con argumentos variables (*args, **kwargs)
    def __init__(self, nombre, apellido, edad, dni, estadoCivil, *args, **kwargs):
        # No es muy común asignar valores por default a los parámetros
        # Atributos sin clase, son atributos de un método
        # self.atributoDeMetodo = variable
        self.nombre = nombre
        self.apellido = apellido
        self.edad = edad

        # Encapsulamiento
        # Atributos Privados -> No pueden ser usados libremente fuera de la clase.
        # Para hacer el encapsulamiento de un atributo, se tiene que añadir un guión bajo (_)
        # Encapsulado de manera sugerida
        self._dni = dni

        # Anotación que evita que el atributo sea modificado -> doble guión bajo (__)
        # Está totalmente encapsulado
        self.__estadoCivil = estadoCivil

        # Argumentos variables y diccionarios
        self.args = args
        self.kwargs = kwargs
    
    # Métodos de Instancia
    # Definición de método
    # Palabra reservada self y atributos de instancia
    # self es igual a this, además no es necesario utilizar esa palabra, pero python recomienda su uso
    def mostrarDetalle(self):
        print(f'La clase Persona tiene los siguientes datos: {self.nombre} {self.apellido} {self.edad} {self._dni}, la dirección es: {self.args} y los datos importantes son: {self.kwargs}')

print(Persona)

# Creación de objetos
# Al objeto se le asigna el constructor, el cual apunta directamente al método init
# Al agregar argumentos dentro del init, es necesario llenar el paréntesis con argumentos
persona1 = Persona('Paula', 'Ríos', 19, 29321238)

print(persona1.nombre)
print(persona1.apellido)
print(persona1.edad)

print(f'El nombre y apellido del primer objeto de la clase Persona es: {persona1.nombre} {persona1.apellido} de edad: {persona1.edad}')

persona2 = Persona('Lucas', 'Cerbino', 20, 764376569)
print(f'El nombre y apellido del segundo objeto de la clase Persona es: {persona2.nombre} {persona2.apellido} de edad: {persona2.edad}')

# Modificación de atributos de un objeto
persona1.nombre = 'Ana'
persona1.apellido = 'Garín'
persona1.edad = 40

print(f'El nombre y apellido del objeto modificado de la clase Persona es: {persona1.nombre} {persona1.apellido} de edad: {persona1.edad}')

# Cuando se utiliza un objeto, la referencia se pasa de manera automática
persona1.mostrarDetalle()
persona2.mostrarDetalle()

# Cuando se utiliza directamente la clase y no los objetos, es necesario pasarle la referencia
# Persona.mostrarDetalle() -> Esta forma provocará un error

# Agregar/crear atributos a un objeto
# Este atributo es 'superficial' porque no se comparten con los demás objetos
# Esto no es utilizado comunmente
persona1.telefono = '11 2342-3421'
print(f'Este es el teléfono de la primer persona: {persona1.telefono}')

# Al imprimir el objeto sin el atributo superficial, saltará error de tipo atributo
# print(persona2.telefono)

# Creación de objetos con atributos variables o diccionarios
persona3 = Persona('Juan', 'Hercun', 20, 'Teléfono', '11 2342-4346', 'Calle Malaspina', 234, 'Manzana', 45, 'Casa', 83, Altura = 1.82, Peso = 81, ColorFavorito = 'Amarillo y Azul', Auto = 'Volkswagen', Modelo = 2004)
persona3.mostrarDetalle()

# Esto no se debe utilizar (ya que está encapsulado) en Python, esto indica que se desconoce
# print(persona3._dni)

persona4 = Persona('César', 'Cerbino', 22, 'Teléfono', '11 5764-8964', 'Calle Poeta Risso', 789, 'Manzana', 7, 'Casa', 29, Altura = 1.80, Peso = 83, ColorFavorito = 'Rojo', Auto = 'Fiat', Modelo = 2012)
persona4.mostrarDetalle()
