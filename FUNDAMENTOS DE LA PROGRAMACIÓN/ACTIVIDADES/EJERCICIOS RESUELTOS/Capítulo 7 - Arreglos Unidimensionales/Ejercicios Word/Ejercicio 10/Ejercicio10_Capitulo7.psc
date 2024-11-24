// Capítulo 7 (Arreglos Unidimensionales), Ejercicio 10.
// Leer dos arreglos de 5 números enteros cada uno, que estarán ordenadoscrecientemente. 
// Copiar (fusionar) los dos arreglos en un tercero, de forma que los números sigan ordenados.
Proceso Ejercicio10_Capitulo7
	Definir i, j, k Como Entero;
	Definir creciente Como Logico;
	Definir a, b, c Como Entero;
	Dimensionar a(5), b(5), c(10);
	Escribir 'Ingrese los elementos del primer arreglo.';
	Repetir
		creciente <- Verdadero;
		Para i<-0 Hasta 4 Con Paso 1 Hacer
			Escribir i, '. Ingrese un número.';
			Leer a[i];
		FinPara
		Para i<-0 Hasta 3 Con Paso 1 Hacer
			Si a[i]>a[i+1] Entonces
				creciente <- Falso;
			FinSi
		FinPara
		Si creciente=Falso Entonces
			Escribir 'El arreglo está desordenado, vuelva a ingresar un número.';
		FinSi
	Hasta Que creciente=Verdadero
	Escribir 'Ingrese los elementos del segundo arreglo.';
	Repetir
		creciente <- Verdadero;
		Para i<-0 Hasta 4 Con Paso 1 Hacer
			Escribir i, '. Ingrese un número.';
			Leer b[i];
		FinPara
		Para i<-0 Hasta 3 Con Paso 1 Hacer
			Si b[i]>b[i+1] Entonces
				creciente <- Falso;
			FinSi
		FinPara
		Si creciente=Falso Entonces
			Escribir 'El arreglo está desordenado, vuelva a ingresar un número.';
		FinSi
	Hasta Que creciente=Verdadero
	i <- 0;
	j <- 0;
	k <- 0;
	Mientras (i<5 Y j<5) Hacer
		Si a[i]<b[j] Entonces
			c[k] <- a[i];
			i <- i+1;
		SiNo
			c[k] <- b[j];
			j <- j+1;
		FinSi
		k <- k+1;
	FinMientras
	Si (i=5) Entonces
		Mientras (j<5) Hacer
			c[k] <- b[j];
			j <- j+1;
			k <- k+1;
		FinMientras
	SiNo
		Si (j=5) Entonces
			Mientras (i<5) Hacer
				c[k] <- a[i];
				i <- i+1;
				k <- k+1;
			FinMientras
		FinSi
	FinSi
	Para i<-0 Hasta 9 Con Paso 1 Hacer
		Escribir i, '. Elemento: ', c[i];
	FinPara
FinProceso
