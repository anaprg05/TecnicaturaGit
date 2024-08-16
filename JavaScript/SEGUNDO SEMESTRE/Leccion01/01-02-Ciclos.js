// Ciclo 'while'
let contador = 0;
while(contador < 3){
    console.log(contador);
    contador++;
}
console.log("Fin del ciclo while.");

// Ciclo 'do while'
let conteo = 0;
do{
    console.log(conteo);
    conteo++;
}while(conteo < 3);
console.log("Fin del ciclo do while.");

// Ciclo 'for'
for( let contando = 0; contando < 3; contando++){
    console.log(contando);
}
console.log("Fin del ciclo for.");

// Palabra reservada 'break'
// Rompe cualquiera que sea la estructura y termina el ciclo.
for(let contando = 0; contando <10; contando++){
    if(contando % 2 == 0){
        console.log(contando);
        break;
    }
}
console.log("Termina el ciclo al encontrar el primer número par.");

// Palabra reservada 'continue' y etiqueta 'label'
// Continue: Continúa a la siguiente iteración
for(let contando = 0; contando <10; contando++){
    if(contando % 2 !== 0){
        continue; //inicio -> esta vendría a ser la etiqueta (continue inicio;), pero me salta error.
    }
    console.log(contando);
}
console.log("Termina el ciclo.");
