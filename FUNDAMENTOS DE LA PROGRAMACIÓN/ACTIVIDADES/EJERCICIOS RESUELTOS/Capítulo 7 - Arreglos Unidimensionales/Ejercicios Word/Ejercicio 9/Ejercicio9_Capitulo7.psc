// Cap�tulo 7 (Arreglos Unidimensionales), Ejercicio 9.
// Leer por teclado un arreglo de 5 elementos num�ricos y una posici�n (entre 0 y 4). Eliminar
// el situado en la posici�n dada sin dejar huecos.
Proceso Ejercicio9_Capitulo7
	Definir num, i, posicion Como Entero;
	Dimension num[5];
	Para i<-0 Hasta 4 Con Paso 1 Hacer
		Escribir i, ". Ingrese un n�mero.";
		Leer num[i];
	FinPara
	Repetir
		Escribir "Ingrese una aposici�n del arreglo.";
		Leer posicion;
	Hasta Que posicion >= 0 y posicion <= 4
	Para i<-posicion Hasta 3 Hacer
		num[i] <- num[i+1];
	FinPara
	Escribir "";
	Escribir "El nuevo arreglo es: ";
	Para i<-0 Hasta 3 Hacer
		Escribir i, ". Elemento: ", num[i];
	FinPara
FinProceso
