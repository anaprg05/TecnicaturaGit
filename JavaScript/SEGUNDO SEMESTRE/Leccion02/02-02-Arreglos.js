// Los arreglos en JavaScript son tipo 'objet'. Permite almacenar varios valores y se pueden declarar de diferentes formas.

// Primer forma de declarar - Sintáxis antigua, no recomendable usar.
//let autos = new Array('Ferrari', 'Renault', 'BWM');

// Segunda forma de declarar - Sintáxis actual.
// Para los arreglos, se utilizan corchetes
const autos = ['Ferrari', 'Renault', 'BWM'];
console.log(autos);

// Recorrer los elementos de un arreglo
// Acceder a un elemento específico
console.log(autos[0]);
console.log(autos[2]);

// Recorrer todos los elementos
for(let i = 0; i < autos.length; i++){
    console.log(i+ ': ' + autos[i]);
}

// Modificar los elementos del arreglo
autos[1] = 'Volvo';
console.log(autos);

// Como agregar nuevos valores al arreglo
// Agregar el elemento al final del arreglo
autos.push('Audi');
console.log(autos);

// Segunda forma de agregar elementos al arreglo
autos[autos.length] = 'Porche';
console.log(autos);

// Tercer forma de agregar elementos al arreglo
// Hay que tener cuidado con esta forma porque si se define en un índice dejando un lugar vacío, ese lugar ocupará memoria.
autos[6] = 'Renault';
console.log(autos);

// Como saber si es un arreglo(Array)
// typeoff no sirve en este caso porque solo muestra que los elementos son un tipo object
// Primer Forma
// Devuelve un resultado booleano
console.log(Array.isArray(autos));

// Segunda Forma
// Devuelve un resultado booleano
console.log(autos instanceof Array);
