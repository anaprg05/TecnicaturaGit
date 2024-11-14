// Creación de clase
class Producto {
    // Atributo estático
    static contadorProductos = 0;

    // Constructor
    constructor(nombre, precio) {
        this._idProducto = ++Producto.contadorProductos;
        this._nombre = nombre;
        this._precio = precio;
    }

    // Método Get
    get idProducto() {
        return this._idProducto;
    }

    // Método Get
    get nombre() {
        return this._nombre;
    }

    // Método set
    set nombre(nombre) {
        this._nombre = nombre;
    }

    // Método Get
    get precio() {
        return this._precio;
    }

    // Método set
    set precio(precio) {
        this._precio = precio;
    }

    toString() {
        // Template Literals -> Permite insertar código de manera dinámica
        return `ID Producto: ${this._idProducto}, nombre: ${this._nombre}, precio: $${this._precio}`;
    }
}

// Creación de clase
class Orden {
    // Atributo estático
    static contadorOrdenes = 0;

    // Método estático
    static getMAX_PRODUCTOS() {
        // La cantidad máxima de productos es 5
        return 5;
    }

    // Constructor
    constructor() {
        this._idOrden = ++Orden.contadorOrdenes;
        this._productos = [];
        this._contadorProductosAgregados = 0;
    }

    // Método get
    get idOrden() {
        return this._idOrden;
    }

    // Creación de método
    agregarProducto(producto) {
        if (this._productos.length < Orden.getMAX_PRODUCTOS()) {
            this._productos.push(producto);
        } else {
            console.log('No se pueden agregar más productos.');
        }
    }

    // Creación de método
    calcularTotal() {
        let totalVenta = 0;
        for (let producto of this._productos) {
            totalVenta += producto.precio;
        }
        return totalVenta;
    }

    mostrarOrden() {
        let productoOrden = '';
        for (let producto of this._productos) {
            productoOrden += producto.toString() + ' ';
        }
        console.log(`Orden: ${this._idOrden}, Total: $${this.calcularTotal()}, Productos: ${productoOrden}`);
    }
}

// PRUEBAS
let producto1 = new Producto('Pantalón', 200);
let producto2 = new Producto('Camisa', 150);
let producto3 = new Producto('Cinturón', 50);
let orden1 = new Orden();
let orden2 = new Orden();

orden1.agregarProducto(producto1);
orden1.agregarProducto(producto2);
orden1.agregarProducto(producto3);
orden2.agregarProducto(producto1);
orden2.agregarProducto(producto2);
orden2.agregarProducto(producto3);

orden1.mostrarOrden();
orden2.mostrarOrden();
