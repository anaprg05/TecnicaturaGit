// Capítulo 11 (Matrices), Ejercicio 5.
// Hacer un algoritmo que llene una matriz de 4*4 y que almacene
// la diagonal principal en un arreglo. Imprimir el arreglo resultante.
Proceso Ejercicio5_Capitulo11
	Definir i, j, pos Como Entero;
	Definir matriz, arreglo Como Cadena;
	Dimensionar matriz(4,4), arreglo(4);
	Para i<-0 Hasta 3 Hacer
		Para j<-0 Hasta 3 Hacer
			Escribir 'Ingrese un número [', i, '][', j, ']: 'Sin Saltar;
			Leer matriz[i,j];
		FinPara
	FinPara
	Escribir '';
	Para i<-0 Hasta 3 Hacer
		Para j<-0 Hasta 3 Hacer
			Escribir matriz[i,j], ' 'Sin Saltar;
		FinPara
		Escribir '';
	FinPara
	pos <- 0;
	Escribir '';
	Para i<-0 Hasta 3 Hacer
		Para j<-0 Hasta 3 Hacer
			Si i=j Entonces
				arreglo[pos] <- matriz[i,j];
				pos <- pos+1;
			FinSi
		FinPara
	FinPara
	Escribir '';
	Escribir 'Los elementos de la diagonal son: 'Sin Saltar;
	Para i<-0 Hasta 3 Hacer
		Escribir arreglo[i], ' 'Sin Saltar;
	FinPara
	Escribir '';
FinProceso
