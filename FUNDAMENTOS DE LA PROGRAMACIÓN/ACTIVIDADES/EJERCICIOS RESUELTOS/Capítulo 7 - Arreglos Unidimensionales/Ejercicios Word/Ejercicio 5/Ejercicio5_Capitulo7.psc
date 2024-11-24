// Capítulo 7 (Arreglos Unidimensionales), Ejercicio 5.
// Leer 8 números enteros dentro de un arreglo. Se deben mostrar en el siguiente orden:
// el primero, el último, el segundo, el penúltimo, el tercero, etc.
Proceso Ejercicio5_Capitulo7
	Definir num, i Como Entero;
	Dimensionar num(8);
	Para i<-0 Hasta 7 Con Paso 1 Hacer
		Escribir (i+1), '. Ingrese un número.';
		Leer num[i];
	FinPara
	Para i<-0 Hasta 3 Con Paso 1 Hacer
		Escribir num[i];
		Escribir num[7-i];
	FinPara
FinProceso
