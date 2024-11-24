// Cap�tulo 11 (Matrices), Ejercicio 2.
// Hacer un algoritmo que llene una matriz de 4*4 y que determine la posici�n
// [fila, columna] del n�mero mayor almacenado en la matriz. 
Proceso Ejercicio2_Capitulo11
	Definir num, i, j, mayor, posfila, posCol Como Entero;
	Dimensionar num(4,4);
	Para i<-0 Hasta 3 Hacer
		Para j<-0 Hasta 3 Hacer
			Escribir 'Ingrese un n�mero [', i, '][', j, ']; 'Sin Saltar;
			Leer num[i,j];
		FinPara
	FinPara
	Escribir '';
	Para i<-0 Hasta 3 Hacer
		Para j<-0 Hasta 3 Hacer
			Escribir num[i,j], ' 'Sin Saltar;
		FinPara
		Escribir '';
	FinPara
	mayor <- 0;
	Para i<-0 Hasta 3 Hacer
		Para j<-0 Hasta 3 Hacer
			Si num[i,j]>mayor Entonces
				mayor <- num[i,j];
				posfila <- i;
				posCol <- j;
			FinSi
		FinPara
	FinPara
	Escribir '';
	Escribir 'La posici�n del n�mero es: ', posfila, ', Columna: ', posCol;
	Escribir 'El n�mero mayor es: ', mayor;
FinProceso
