// Cap�tulo 7 (Arreglos Unidimensionales), Ejercicio 8.
// Leer 5 elementos num�ricos que se introducir�n ordenados de forma creciente. �stos ser�n
// guardados en un arreglo de tama�o 6. Leer un n�mero N, e insertado en el adecuado para que 
// el arreglo contin�e ordenado.
Proceso Ejercicio8_Capitulo7
	Definir num, i, posicion, j, dato Como Entero;
	Definir creciente Como Logico;
	Dimensionar num(6);
	Repetir
		creciente <- verdadero;
		Para i<-0 Hasta 4 Con Paso 1 Hacer
			Escribir (i+1), '. Ingrese un n�mero.';
			Leer num[i];
		FinPara
		Para i<-0 Hasta 3 Con Paso 1 Hacer
			Si num[i]>num[i+1] Entonces
				creciente <- falso;
			FinSi
		FinPara
		Si creciente=falso Entonces
			Escribir 'El arreglo no est� ordenado, ingrese un n�mero nuevamente.';
		FinSi
	Hasta Que creciente=verdadero
	Escribir 'Ingrese un valor a agregar.';
	Leer dato;
	posicion <- 0;
	j <- 0;
	Mientras posicion<5 Y num[posicion]<dato Hacer
		posicion <- posicion+1;
		j <- j+1;
	FinMientras
	Para i<-4 Hasta posicion Con Paso -1 Hacer
		num[i+1]<-num[i];
	FinPara
	num[posicion] <- dato;
	Escribir '';
	Escribir 'El nuevo arreglo es: ';
	Para i<-0 Hasta 5 Hacer
		Escribir num[i], ' 'Sin Saltar;
	FinPara
	Escribir '';
FinProceso
