from Producto import Producto

# Clase padre
class Orden:
    # Variable de clase
    contadorOrdenes = 0

    # Método iniciador
    def __init__(self, productos):
        Orden.contadorOrdenes += 1
        self.idOrden = Orden.contadorOrdenes
        # Conversión a lista
        self._productos = list(productos)

    # Método para agregar nuevo producto
    def agregarProductos(self, producto):
        # Agregar un nuevo producto
        self._productos.append(producto)

    # Método para calcular el total de órdenes
    def calcularTotal(self):
        # Variable temporal para almacenar el total temporal
        total = 0
        for producto in self._productos:
            total += producto.precio
        return total  # Colocamos el return fuera del for

    def __str__(self):
        # Variable temporal de lista de productos
        productosStr = ''
        for producto in self._productos:
            productosStr += producto.__str__() + ' | '
        return f'Orden: {self.idOrden}, \nProductos: {productosStr}'

# Comprobación
if __name__ == '__main__':
    producto1 = Producto('Remera', 100.00)
    producto2 = Producto('Pantalón', 150.00)
    
    # Lista de productos
    productos1 = [producto1, producto2]
    
    # Primer objeto orden pasando la lista de productos
    orden1 = Orden(productos1)
    print(orden1)
    print(f'Total de la orden1: {orden1.calcularTotal()}')
    
    # Segunda orden con una lista de nuevos productos
    producto3 = Producto('Blusa', 120.00)
    producto4 = Producto('Campera', 200.00)
    producto5 = Producto('Pollera', 140.00)
    producto6 = Producto('Medias', 80.00)

    productos2 = [producto3, producto4, producto5, producto6]
    orden2 = Orden(productos2)  # Nueva instancia de orden con productos2

    # Mostrar la nueva orden2
    print(orden2)
    print(f'Total de la orden2: {orden2.calcularTotal()}')