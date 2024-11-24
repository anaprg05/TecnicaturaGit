// Capítulo 7 (Arreglos Unidimensionales), Ejercicio 7.
// Crear un programa que lea por teclado un arreglo de 6 números y la desplace a una posición 
// hacia abajo: el primero pasa a ser el segundo, el segunda pasa a ser el tercero y así sucesivamente.
// El último pasa a ser el primero.
Proceso Ejercicio7_Capitulo7
	Definir num, ultimo, i Como Entero;
	Dimensionar num(6);
	Para i<-0 Hasta 5 Con Paso 1 Hacer
		Escribir (i+1), '. Ingrese un número.';
		Leer num[i];
	FinPara
	ultimo <- num[5];
	Para i<-4 Hasta 0 Con Paso -1 Hacer
		num[i+1]<-num[i];
	FinPara
	num[0] <- ultimo;
	Escribir 'El nuevo arreglo es';
	Para i<-0 Hasta 5 Con Paso 1 Hacer
		Escribir num[i], ' 'Sin Saltar;
	FinPara
	Escribir '';
FinProceso
