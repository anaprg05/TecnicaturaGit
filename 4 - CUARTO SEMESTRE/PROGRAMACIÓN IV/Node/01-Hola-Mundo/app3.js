// INSTRUCCIONES NO BLOQUEANTES - SÍNCRONOS
// 1
console.log('Inicio del Programa'); 

// 5
setTimeout(() => {
    console.log('Primer Timeout');
}, 3000); // 3000 = 3 segundos

// 3
setTimeout(() => {
    console.log('Segundo Timeout');
}, 0); 

// 4
setTimeout(() => {
    console.log('Tercer Timeout');
}, 0); 

// 2
console.log('Fin del Programa');
