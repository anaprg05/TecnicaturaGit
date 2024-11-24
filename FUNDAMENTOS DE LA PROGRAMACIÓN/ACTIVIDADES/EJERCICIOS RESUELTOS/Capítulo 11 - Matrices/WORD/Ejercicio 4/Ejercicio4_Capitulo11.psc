// Capítulo 11 (Matrices), Ejercicio 4.
// Hacer un algoritmo que llene una matriz de 3*4.
// Sumar las columnas e imprimir que columna tuvo la máxima
// suma y la suma de esa columna.
Proceso Ejercicio4_Capitulo11
	Definir num, i, j Como Entero;
	Definir mayor, sumaCol, posCol Como Entero;
	Dimension num[3,4];
	Para i<-0 Hasta 2 Con Paso 1 Hacer
		Para j<-0 Hasta 3 Con Paso 1 Hacer
			Escribir Sin Saltar "Ingrese un número [", i,"][", j,"]: ";
			Leer num[i,j];
		FinPara
	FinPara
	Para i<-0 Hasta 2 Con Paso 1 Hacer
		Para j<-0 Hasta 3 Con Paso 1 Hacer
			Escribir Sin Saltar num[i,j], " " ;
		FinPara
		Escribir "";
	FinPara
	sumaCol <- 0;
	Para i<-0 Hasta 2 Con Paso 1 Hacer
		sumaCol <- sumaCol + num[i,0];
	FinPara
	mayor <- sumaCol;
	posCol <- 0;
	Para j<-0 Hasta 3 Con Paso 1 Hacer
		sumaCol <- 0;
		Para i<-0 Hasta 2 Con Paso 1 Hacer
			sumaCol <- sumaCol + num[i,j];
		FinPara
		Si sumaCol > mayor Entonces
			mayor <- sumaCol;
			posCol <- j;
		FinSi
	FinPara
	Escribir "";
	Escribir "La columna con la suma mayor es: ", posCol;
	Escribir "La suma de dicha columna es: ", mayor;
	Escribir "";
FinProceso
