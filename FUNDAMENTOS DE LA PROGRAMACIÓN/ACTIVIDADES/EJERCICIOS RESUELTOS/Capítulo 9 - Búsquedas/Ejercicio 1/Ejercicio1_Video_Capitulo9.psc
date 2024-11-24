// Capítulo 9 (Búsquedas), Ejercicio 1 (VIDEO).
// Ejercicio de práctica.
Proceso Ejercicio1_Video_Capitulo9
	Definir encontrado Como Logico;
	Definir num, i, posicion, dato Como Entero;
	Dimensionar num(5);
	Escribir 'Ingrese los elementos del arreglo.';
	Para i<-0 Hasta 4 Con Paso 1 Hacer
		Escribir i, '. Ingrese un número: 'Sin Saltar;
		Leer num[i];
	FinPara
	Escribir '';
	Escribir 'Ingrese un elemento a buscar.';
	Leer dato;
	encontrado <- Falso;
	i <- 0;
	Mientras (i<5 Y encontrado=Falso) Hacer
		Si (num[i]=dato) Entonces
			encontrado <- Verdadero;
			posicion <- i;
		FinSi
		i <- i+1;
	FinMientras
	Si encontrado=Verdadero Entonces
		Escribir 'El elemento ', dato, ' existe en el arreglo en la posición: ', posicion;
	SiNo
		Escribir 'El elemento no existe en el arreglo.';
	FinSi
FinProceso
