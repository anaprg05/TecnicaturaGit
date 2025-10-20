// process.env.NOMBRE
// accesoAlProceso.variableDeEntorno.NombreVariable
let nombre = process.env.NOMBRE || 'sin nombre';
//let web = process.env.WEB || 'no tengo web';
let web = process.env.MI_WEB || 'no tengo web';

console.log('Hola ' + nombre);
console.log('Mi web es: ' + web)

console.log('Última parte')