// Creación de clase
class Producto{
    // Atributo estático
    static contadorProductos = 0;

    // Constructor
    constructor(nombre, precio){
        this._idProducto = ++ Producto.contadorProductos;
        this._nombre = nombre;
        this._precio = precio;
    }

    // Método Get
    get idProducto(){
        return this._idProducto;
    }

    // Método Get
    get nombre(){
        return this._nombre;
    }

    // Método set
    set nombre(nombre){
        this._nombre = nombre;
    }

    // Método Get
    get precio(){
        return this._precio;
    }

    // Método set
    set precio(precio){
        this._precio = precio;
    }
    
    toString(){
        // Template Literals -> Permite insertar código de manera dinámica
        return `ID Producto: ${this._idProducto}, nombre: ${this._nombre}, precio: $${this._precio}`;
    }
}

// PRUEBAS: Clase Producto
let producto1 = new Producto('Pantalón', 200);
let producto2 = new Producto('Camisa', 150)
console.log(producto1.toString());
console.log(producto2.toString());

// Creación de clase
class Orden{
    // Atributo estático
    static contadorOrdenes = 0;

    //Método estático
    static getMAX_PRODUCTOS(){
        // La cantidad máxima de productos es 5
        return 5;
    }

    // Constructor
    constructor(){
        this._idOrden = ++ contadorOrdenes;
        this._productos = [];
        this._contadorProductosAgregados = 0;
    }
    
    // Método get
    get idOrden(){
        return this._idOrden;
    }

    // Creación de método
    agregarProducto(producto){
        if(this._productos.length < Orden.getMAX_PRODUCTOS()){
            // Dos tipos de sintaxis
            // Número 1:
            this._productos.push(producto);
            // Número 2:
            // this._productos[this._contadorProductosAgregados++] = producto;
        }
        else{
            console.log('No se pueden agregar más productos.')
        }
    }
}
