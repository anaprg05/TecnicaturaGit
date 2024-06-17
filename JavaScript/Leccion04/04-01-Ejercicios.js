// AMPLIANDO EL USO DE VAR, LET Y CONST
/*
    Con var se pueden reasignar los valores en cualquier momento, este forma parte del ámbito globarl.
    Un error es que se sobreescriba 
*/

var nombre = "Ana";
var nombre = "Paula";
console.log(nombre);

function saludar(){
    var nombre2 = "Lucas";
    console.log(nombre2);
}

console.log(nombre2); //No lee el dato de la función

if(true){
    var edad = 34;
    console.log(edad);
}

console.log(edad); //En la función, funcionó perfectamente, mientras que en la estructura if, falló.

/*
    let: puede ser reasignada en cualquier momento.
    La diferencia es que su ámbito es de bloque, solo disponible dentro de un bloque de llaves o dentro de una función.
*/

function saludar2(){
    var nombre3 = "Diego";
    console.log(nombre3);
}

//console.log(nombre3);

if(true){
    let edad2 = 33;
    console.log(edad2);
}

//console.log(edad2);

/*
    const: se utiliza para valores constantes que no pueden ser resignadas.
*/

const fechaNacimiento = 2005;
console.log(fechaNacimiento);

fechaNacimiento = 2010;
console.log(fechaNacimiento); // Solo se ejecuta la consola anterior.


