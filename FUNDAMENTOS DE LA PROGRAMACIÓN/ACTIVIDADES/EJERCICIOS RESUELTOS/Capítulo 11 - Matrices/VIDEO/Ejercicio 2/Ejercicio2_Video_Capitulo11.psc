// Cap�tulo 11 (Matrices), Ejercicio 2 (VIDEO).
// Ejercicio de pr�ctica.
Proceso Ejercicio2_Video_Capitulo11
	Definir matriz, filas, columnas, i, j Como Entero;
	Dimensionar matriz(100,100);
	Escribir 'Ingrese el n�mero de filas para la matriz: 'Sin Saltar;
	Leer filas;
	Escribir 'Ingrese el n�mero de columnas para la matriz: 'Sin Saltar;
	Leer columnas;
	Para i<-0 Hasta filas-1 Con Paso 1 Hacer
		Para j<-0 Hasta columnas-1 Con Paso 1 Hacer
			Escribir 'Ingrese un n�mero [', i, '][', j, ']'Sin Saltar;
			Leer matriz[i,j];
		FinPara
	FinPara
	Escribir '';
	Escribir '';
	Para i<-0 Hasta filas-1 Con Paso 1 Hacer
		Para j<-0 Hasta columnas-1 Con Paso 1 Hacer
			Escribir matriz[i,j], ' 'Sin Saltar;
		FinPara
		Escribir '';
	FinPara
	Escribir '';
FinProceso
