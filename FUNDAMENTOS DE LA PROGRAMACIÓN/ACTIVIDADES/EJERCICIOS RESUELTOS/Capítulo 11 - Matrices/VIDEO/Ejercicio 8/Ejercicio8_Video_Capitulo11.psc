// Cap�tulo 11 (Matrices), Ejercicio 8 (VIDEO).
// Ejercicio de pr�ctica.
Proceso Ejercicio8_Video_Capitulo11
	Definir matriz1, matriz2, filas, columnas, i, j Como Entero;
	Definir band Como Cadena;
	Dimensionar matriz1(100,100), matriz2(100,100);
	band <- 'F';
	Escribir 'Ingrese un n�mero de filas: 'Sin Saltar;
	Leer filas;
	Escribir 'Ingrese un n�mero de columnas: 'Sin Saltar;
	Leer columnas;
	Para i<-0 Hasta filas-1 Con Paso 1 Hacer
		Para j<-0 Hasta columnas-1 Con Paso 1 Hacer
			Escribir 'Ingrese un n�mero [', i, '][', j, ']: 'Sin Saltar;
			Leer matriz1[i,j];
			matriz2[i,j]<-matriz1[i,j];
		FinPara
	FinPara
	Escribir '';
	Para i<-0 Hasta filas-1 Con Paso 1 Hacer
		Para j<-0 Hasta columnas-1 Con Paso 1 Hacer
			Escribir matriz2[i,j], ' 'Sin Saltar;
		FinPara
		Escribir '';
	FinPara
	Si filas=columnas Entonces
		Para i<-0 Hasta filas-1 Con Paso 1 Hacer
			Para j<-0 Hasta columnas-1 Con Paso 1 Hacer
				Si i<>j Y matriz1[i,j]=matriz2[i,j] Entonces
					band <- 'V';
				FinSi
			FinPara
		FinPara
	FinSi
	Escribir '';
	Si band='V' Entonces
		Escribir 'La matriz es sim�trica.';
	SiNo
		Escribir 'La matriz no es sim�trica.';
	FinSi
FinProceso
