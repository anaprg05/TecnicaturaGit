# Clase padre
class Producto:
    # Variable de clase
    contadorProductos = 0

    # Método inciador
    def __init__(self, nombre, precio):
        Producto.contadorProductos += 1
        self._idProductos = Producto.contadorProductos
        self._nombre = nombre
        self._precio = precio

    # Getter
    @property
    def nombre(self):
        return self._nombre
    
    # Setter
    @nombre.setter
    def nombre(self, nombre):
        self._nombre

    # Getter
    @property
    def precio(self):
        return self._precio
    
    # Setter
    @precio.setter
    def precio(self, precio):
        self._precio

    # Método str
    def __str__(self):
        return f'ID Producto: {self._idProductos}. Nombre: {self._nombre}, Precio: {self._precio}'

# Comprobación
if __name__ == '__main__':
    producto1 = Producto('Remera', 100.00)
    print(producto1)
    producto2 = Producto('Pantalón', 150.00)
    print(producto2)
