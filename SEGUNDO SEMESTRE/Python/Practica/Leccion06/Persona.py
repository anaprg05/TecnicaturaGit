# Definición de clase padre, la cual hereda de la clase Object
class Persona:
    # Método inicializador
    def __init__(self, nombre, edad):
        self.nombre = nombre
        self.edad = edad

    @property
    def nombre(self):
        return self._nombre
    
    @nombre.setter
    def nombre(self, nombre):
        self._nombre = nombre
    
    @property
    def edad(self):
        return self._edad
    
    @edad.setter
    def edad(self, edad):
        self._edad = edad

    # (Override) Sobreescribir Método
    # Método dunder __str__() 
    def __str__(self):
        return f'Persona: [ Nombre: {self._nombre}, edad: {self._edad} ]'  

# Creación de la clase hija
class Empleado(Persona):
    # Es necesario inicializar con las características de la clase padre
    def __init__(self, nombre, edad, sueldo):
        # super() -> constructor de la clase padre
        super().__init__(nombre, edad)
        self. sueldo = sueldo

    @property
    def sueldo(self):
        return self._sueldo
    
    @sueldo.setter
    def sueldo(self, sueldo):
        self._sueldo = sueldo

    def __str__(self):
        return f'Empleado: [ Sueldo: {self._sueldo} ] {super().__str__()}'

empleado1 = Empleado('Paula', 19, 750000)
print(empleado1.nombre)
print(empleado1.edad)
print(empleado1.sueldo)

# TAREA: - Encapsular los atributos y agregar los métodos getter ay setter
#        - Crear otro objeto, pasar los datos para nombre, edad y sueldo
#        - Mostrar estos datos, luego modificar y mostrar nuevamente

empleado2 = Empleado('Lautaro', 16, 500000)
print(empleado2.nombre)
print(empleado2.edad)
print(empleado2.sueldo)

empleado2 = Empleado('Lucas', 20, 870000)
print(empleado2.nombre)
print(empleado2.edad)
print(empleado2.sueldo)

