// Capítulo 7 (Arreglos Unidimensionales), Ejercicio 6.
// Leer por teclado una serie de 5 números reales. El programa debe indicar si los números
// están ordenados de forma creciente, decreciente, o si están desordenados.
Proceso Ejercicio6_Capitulo7
	Definir i Como Entero;
	Definir creciente, decreciente Como Logico;
	Definir num Como Real;
	Dimensionar num(5);
	Para i<-0 Hasta 4 Con Paso 1 Hacer
		Escribir (i+1), '. Ingrese un número.';
		Leer num[i];
	FinPara
	creciente <- falso;
	decreciente <- falso;
	Para i<-0 Hasta 3 Con Paso 1 Hacer
		Si num[i]<num[i+1] Entonces
			creciente <- verdadero;
		FinSi
		Si num[i]>num[i+1] Entonces
			decreciente <- verdadero;
		FinSi
	FinPara
	Si creciente=verdadero Y decreciente=falso Entonces
		Escribir 'El arreglo está en forma creciente.';
	SiNo
		Si creciente=falso Y decreciente=verdadero Entonces
			Escribir "El arreglo está en forma decreciente.";
		SiNo
			Escribir "El arreglo está desordenado.";
		FinSi
	FinSi
FinProceso
