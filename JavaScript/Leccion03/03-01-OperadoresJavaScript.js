// Ejercicio 1: Encontrar números Pares e Impares
//  Utilizar los operadores para comprobar si el número es par o impar.

let numero = 10;
if(numero % 2 == 0){
    console.log("El número es PAR.");
}
else{
    console.log("El número es IMPAR.");    
}

// Ejercicio 2: Es mayor de edad
//  Indicar si el usuario es mayor de edad o no.
var edad = 15;
var adulto = edad >= 18;
if (adulto){
    console.log("Usted es mayor de edad.");
}
else{
    console.log("Usted es menor de edad.");
}

// Ejercicio 3: Dentro de un rango - Operador and
//  Indicar si el valor está dentro del rango.

let num = 5; // número variable.
let numMin = 0, numMax = 10;

if(num >= numMin && num <= numMax){
    console.log("El número está dentro del rango.");
}
else{
    console.log("El número está fuera del rango.");
}

//Ejercicio 4: Si el padre puede asistir al juego de su hijo - Operador or
let vacaciones = false, diaLibre = true;
if (vacaciones || diaLibre){
    console.log("El padre puede asistir al juego de su hijo");
}
else{
    console.log("El padre no puede asistir al juego de su hijo");
}

// Ejercicio 4: Ejercicio Par Impar - Operador ternario
//  Indicar si el número es par o impar.

let resultado2 = 3 > 2 ? "Verdadero" : "Falso";
console.log(resultado2);

let numero1 = 5;
resultado2 = numero1 % 2 == 0 ? "El número es PAR" : "El número es IMPAR";
console.log(resultado2);

// Ejercicio 5: Es mayor de edad (convertir a String) - Función Number
//  Indicar si la persona es mayor de edad y puede votar o no.
//  ¿Cómo convertir a String?

let miNumero = "21"; // Es una cadena.
console.log(miNumero);

let edad2 = Number(miNumero); //Es una función.
console.log(typeof edad2);

// is not a number - Función isNaN
if(isNaN(edad2)){
    console.log("Esta variable no contiene solo números.");
}

if (edad >= 18){
    console.log("Es mayor de edad, puede votar.");
}
else{
    console.log("Es menor de edad, no puede votar.");
}

// Operador Ternario
let resultado3 = edad2 >= 18 ? "Es mayor de edad, puede votar." : "Es menor de edad, no puede votar.";
console.log(resultado3);
