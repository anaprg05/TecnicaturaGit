# Esta clase no extiende de ninguna clase, pero precisa de los métodos: __enter__ y __exit__, los cuales están definidos en la clase padre.
class ManejoArchivos:
    def __init__(self, nombre):
        self.nombre = nombre
    
    def __enter__(self):
        print(' Obtención del recurso ' .center(50, '-'))
        # Se encapsula el código dentro del método.
        self.nombre = open(self.nombre, 'r', encoding = 'utf8')
        return self.nombre
    
    # El método __exit__ tiene por default los siguientes parámetros: exc_type, exc_val, exc_tb (track back)
    def __exit__(self, tipoException, valorException, trazaError):
        print(' Cierre del recurso ' .center(50, '-'))
        if self.nombre:
            # Si es verdadero, el archivo se cerrará.
            self.nombre.close()

