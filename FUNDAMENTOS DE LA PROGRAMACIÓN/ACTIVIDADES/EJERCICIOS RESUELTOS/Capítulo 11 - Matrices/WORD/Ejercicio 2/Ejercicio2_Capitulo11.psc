// Capítulo 11 (Matrices), Ejercicio 2.
// Hacer un algoritmo que llene una matriz de 4*4 y que determine la posición
// [fila, columna] del número mayor almacenado en la matriz. 
Proceso Ejercicio2_Capitulo11
	Definir num, i, j, mayor, posfila, posCol Como Entero;
	Dimensionar num(4,4);
	Para i<-0 Hasta 3 Hacer
		Para j<-0 Hasta 3 Hacer
			Escribir 'Ingrese un número [', i, '][', j, ']; 'Sin Saltar;
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
	Escribir 'La posición del número es: ', posfila, ', Columna: ', posCol;
	Escribir 'El número mayor es: ', mayor;
FinProceso
