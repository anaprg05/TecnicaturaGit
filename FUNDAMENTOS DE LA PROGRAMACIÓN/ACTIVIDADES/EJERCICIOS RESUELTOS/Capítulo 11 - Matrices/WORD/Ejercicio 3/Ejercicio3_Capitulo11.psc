// Capítulo 11 (Matrices), Ejercicio 3.
// Hacer un algoritmo que llene una matriz de 4*4.
// Calcular la suma de cada fila y almacenarla en un arreglo, la suma de cada columna 
// y almacenarla en otro arreglo.
Proceso Ejercicio3_Capitulo11
	Definir filas, sumaFilas, posFilas Como Entero;
	Definir columnas, sumaCol, posCol Como Entero;
	Definir num, i, j Como Entero;
	Dimensionar num(4,4);
	Dimensionar filas(4);
	Dimensionar columnas(4);
	Para i<-0 Hasta 3 Con Paso 1 Hacer
		Para j<-0 Hasta 3 Con Paso 1 Hacer
			Escribir 'Ingrese un número [', i, '][', j, ']: 'Sin Saltar;
			Leer num[i,j];
		FinPara
	FinPara
	Escribir '';
	Para i<-0 Hasta 3 Con Paso 1 Hacer
		Para j<-0 Hasta 3 Con Paso 1 Hacer
			Escribir num[i,j], ' 'Sin Saltar;
		FinPara
	FinPara
	Escribir '';
	posFilas <- 0;
	Para i<-0 Hasta 3 Con Paso 1 Hacer
		sumaFilas <- 0;
		Para j<-0 Hasta 3 Con Paso 1 Hacer
			sumaFilas <- sumaFilas+num[i,j];
		FinPara
		filas[posFilas] <- sumaFilas;
		posFilas <- posFilas+1;
	FinPara
	posCol <- 0;
	Para j<-0 Hasta 3 Con Paso 1 Hacer
		sumaCol <- 0;
		Para i<-0 Hasta 3 Con Paso 1 Hacer
			sumaCol <- sumaCol+num[i,j];
		FinPara
		columnas[posCol] <- sumaCol;
		posCol <- posCol+1;
	FinPara
	Escribir '';
	Escribir 'La suma de las filas es: 'Sin Saltar;
	Para i<-0 Hasta 3 Con Paso 1 Hacer
		Escribir filas[i], ' 'Sin Saltar;
	FinPara
	Escribir '';
	Escribir 'La suma de las columnas es: 'Sin Saltar;
	Para i<-0 Hasta 3 Con Paso 1 Hacer
		Escribir columnas[i], ' 'Sin Saltar;
	FinPara
	Escribir '';
FinProceso
