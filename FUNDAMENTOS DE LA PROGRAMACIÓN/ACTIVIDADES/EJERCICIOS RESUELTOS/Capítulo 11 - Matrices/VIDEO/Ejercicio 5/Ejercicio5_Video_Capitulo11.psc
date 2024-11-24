// Capítulo 11 (Matrices), Ejercicio 5 (VIDEO).
// Ejercicio de práctica.
Proceso Ejercicio5_Video_Capitulo11
	Definir matriz1, matriz2, i, j, filas, columnas Como Entero;
	Dimensionar matriz1(100,100), matriz2(100,100);
	Escribir 'Ingrese la cantidad de filas para la matriz'Sin Saltar;
	Leer filas;
	Escribir 'Ingrese la cantidad de columnas para la matriz'Sin Saltar;
	Leer columnas;
	Escribir '';
	Para i<-0 Hasta filas-1 Con Paso 1 Hacer
		Para j<-0 Hasta columnas-1 Con Paso 1 Hacer
			matriz1[i,j]<-azar(999);
			matriz2[i,j]<-matriz1[i,j];
			Escribir matriz2[i,j], ' 'Sin Saltar;
		FinPara
		Escribir '';
	FinPara
	Escribir '';
FinProceso
