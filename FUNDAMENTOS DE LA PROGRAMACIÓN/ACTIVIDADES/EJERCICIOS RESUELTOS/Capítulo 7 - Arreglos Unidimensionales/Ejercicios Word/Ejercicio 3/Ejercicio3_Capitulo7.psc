// Capítulo 7 (Arreglos Unidimensionales), Ejercicio 3.
// Crear un arreglo unidimensional con "N" caracteres, leer los elementos por teclado, guardarlos en el arreglo,
// y mostrarlos en el orden inverso al introducido.
Proceso Ejercicio3_Capitulo7
	Definir letras Como Cadena;
	Dimensionar letras(100);
	Definir n_elementos, i Como Entero;
	Repetir
		Escribir 'Ingrese un número de elementos para el arreglo.';
		Leer n_elementos;
	Hasta Que n_elementos>0
	Para i<-0 Hasta (n_elementos-1) Con Paso 1 Hacer
		Escribir (i+1), '. Ingrese un número.';
		Leer letras[i];
	FinPara
	Escribir 'Los caracteres en orden inverso son: ';
	Para i<-(n_elementos-1) Hasta 0 Con Paso -1 Hacer
		Escribir letras[i];
	FinPara
FinProceso
