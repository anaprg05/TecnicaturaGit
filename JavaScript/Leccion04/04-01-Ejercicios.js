// Ejercicio 1: Calcular estación del año
//  Ingresar un mes del año, el valor debe ser entre 1 y 12, 
//  luego hay que indicar en qué estación del año se está:
//     VERANO             OTOÑO           INVIERNO        PRIMAVERA
//  21/12 al 21/03    21/03 al 21/06  21/06 al 21/09    21/09 al 21/12
//     1, 2, 3            4, 5, 6          7, 8, 9         10, 11, 12

//IF - IF ELSE
let mes = 5;
let estacion;

if (mes == 1 || mes == 2 || mes == 3){
    estacion = "VERANO";
}
else if (mes == 4 || mes == 5 || mes == 6){
    estacion = "OTOÑO";
}
else if (mes == 7 || mes == 8 || mes == 9){
    estacion = "INVIERNO";
}
else if (mes == 10 || mes == 11 || mes == 12){
    estacion = "PRIMAVERA";
}
else{
    estacion = "Número de mes inexistente";
}

console.log(estacion);

//SWITCH (Igual a la de Java)
switch(mes){
    case 1: case 2: case 3:
        estacion = "VERANO";
    break;

    case 4: case 5: case 6:
        estacion = "OTOÑO";
    break;

    case 7: case 8: case 9:
        estacion = "INVIERNO";
    break;

    case 10: case 11: case 12:
        estacion = "PRIMAVERA";
    break;
    
    default:
        estacion = "Número de mes inexistente";  
}

console.log(estacion);

//Ejercicio 2: Hora del día
/* 
    De 6 a 11 -> 'Good Morning!'
    De 12 a 16 -> 'Good Afternoon!'
    De 17 a 19 -> 'Good Evening!'
    De 20 a 23 -> 'Good Night!'
*/

let hora = 5;
let mensaje;

if (hora >= 6 || hora <= 11){
    mensaje = "Good Morning!";
}
else if (hora == 12 || hora <= 16){
    mensaje = "Good Afternoon!";
}
else if (hora == 17 || hora <= 19){
    mensaje = "Good Evening!";
}
else if (hora == 20 || hora <= 23){
    mensaje = "Good Night!";
}
else{
    mensaje = "Hora no identificada";
}

console.log(mensaje);
