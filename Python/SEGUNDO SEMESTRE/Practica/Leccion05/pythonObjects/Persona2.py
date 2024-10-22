# Métodos Get & Set
# Set -> colocar, establecer, modificar
# Get -> obtener o recuperar

# Creación de clase
class Persona2:
    # Elemento inicializador
    def __init__(self, nombre, apellido, edad):
        self._nombre = nombre
        self._apellido = apellido
        self._edad = edad
    
    # Definición de Método
    def mostrarDetalles(self):
        print(f'Los datos a mostrar son los siguientes: \n{self._nombre} \n{self._apellido} \n{self._edad}')
        
    # Definición de Método 'Get'
    # Decorador -> Función que recibe otra función como parámetro, le añade cosas y retorna una función diferente
    @property
    def nombre(self):
        print('Uso del método "Get"')
        return self._nombre
    
    # Definición de Método 'Set'
    # Decorador
    @nombre.setter
    def nombre(self, nombre):
        print('Uso del método "Set"')
        self._nombre = nombre

    @property
    def apellido(self):
        return self._apellido
    
    @apellido.setter
    def apellido(self, apellido):
        self._apellido = apellido
    
    @property
    def edad(self):
        return self._edad
    
    # Atributos read-only (solo lectura)
    # Al borrar el set, el atributo para edad (la variable edad) se transformaría en un read-only
    @edad.setter
    def edad(self, edad):
        self._edad = edad

    def __del__(self):
        print(f'Persona2: {self._nombre} {self._apellido} {self._edad}')

# Para que el código no se vea a la hora de imprimirlo en __main__, se hace lo siguiente:
if __name__ == '__main__':
    persona1 = Persona2('Ana', 'Ríos', 19)

    # Llamado al Método 'Get', el cual no necesita parámetros
    print(persona1.nombre)

    # La modificación que se está pasando, es un parámetro que se está pasando al método set
    persona1.nombre = 'Lucas'
    print(persona1.nombre)

    print(persona1.mostrarDetalles())

    # edad: Atributo read-only ya que no tiene el método set
    # persona1.edad = 40
    print(persona1.edad)

    # Tarea:
    #   Crear tres objetos más, utilizando los métodos getter and setter para modificar,
    #   y mostrar los cambios con el método 'mostrarDetalles'

    # OBJETO 1
    persona2 = Persona2
    persona2.nombre = 'Lautaro Gabriel'
    persona2.apellido = 'Ríos Garín'
    persona2.edad = 16
    print(persona2.nombre)
    print(persona2.apellido)
    print(persona2.edad)
    print(persona2.mostrarDetalles())

    # OBJETO 2
    persona3 = Persona2
    persona3.nombre = 'Nelson Omar'
    persona3.apellido = 'Ríos'
    persona3.edad = 44
    print(persona3.nombre)
    print(persona3.apellido)
    print(persona3.edad)
    print(persona3.mostrarDetalles())

    # OBJETO 3
    persona4 = Persona2
    persona4.nombre = 'Ana'
    persona4.apellido = 'Garín'
    persona4.edad = 40
    print(persona4.nombre)
    print(persona4.apellido)
    print(persona4.edad)
    print(persona4.mostrarDetalles())

    # Comprobación del módulo principal en ejecución
    # Es decir, comprobación de dónde se está ejecutando el código
    print(__name__)
