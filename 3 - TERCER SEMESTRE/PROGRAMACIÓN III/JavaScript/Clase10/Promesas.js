// Promesas en JavaScript
let miPromesa = new Promise((resolver, rechazar) => {
    let expresion = true; 
    if (expresion) {
        resolver("Resolvió correctamente.");
    } else {
        rechazar("Se produjo un error.");
    }
});

// Práctica con la función 'then'
/*miPromesa.then(
    valor => console.log(valor),
    error => console.log(error)
);
*/

// Práctica con la función 'catch'
/*miPromesa
    .then( valor => console.log(valor)
    .catch(error => console.log(error)));
*/

// Práctica con la función 'setTimeout'
/*let promesa = new Promise((Resolver) => {
    console.log('Iniciando la promesa...');
    setTimeout(() => Resolver('Saludos desde la promesa, callback, función flecha y setTimeout'), 3000);
    console.log('Fin de la promesa');
});
*/

// Llamado a la promesa
// promesa.then(valor => console.log(valor));

// Palabra 'async' con promesas
// async indica que una función regresa una promesa
async function miFuncionConPromesa() {
    return 'Saludos con promesas y async';
}

// miFuncionConPromesa().then(valor => console.log(valor));

// Palabra 'async/await' con promesas
// La palabra 'await' no se puede usar fuera de una función 'async'
async function miFuncionConPromesaYAwait() {
    let miPromesa = new Promise((resolver) => {
        resolver('Promesa con await');
    });
    console.log(await miPromesa);
}

// miFuncionConPromesaYAwait();

// Promesas, await, async y setTimeout
async function miFuncionConPromesaAwaitTimeout() {
    let miPromesa = new Promise((resolver) => {
        console.log('Iniciando la función...');
        setTimeout(() => resolver('Promesa con await y setTimeout'), 3000);
        console.log('Fin de la función');
    });
    console.log(await miPromesa);
}

// Llamado a la función
miFuncionConPromesaAwaitTimeout();
