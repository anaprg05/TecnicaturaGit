from Producto import Producto
from Orden import Orden

producto1 = Producto('Remera', 100.00)
producto2 = Producto('Pantalón', 150.00)
producto3 = Producto('Blusa', 120.00)
producto4 = Producto('Campera', 200.00)
producto5 = Producto('Pollera', 140.00)
producto6 = Producto('Medias', 80.00)

productos1 = [producto1, producto2]
orden1 = Orden(productos1)
orden1.agregarProductos(producto5)
orden1.agregarProductos(producto3)
print(orden1)
print(f'Total de la orden1: {orden1.calcularTotal()}')
productos2 = [producto3, producto4]
orden2 = Orden(productos2)
orden2.agregarProductos(producto6)
orden2.agregarProductos(producto2)
print(orden2)
print(f'Total de la orden2: {orden2.calcularTotal()}')