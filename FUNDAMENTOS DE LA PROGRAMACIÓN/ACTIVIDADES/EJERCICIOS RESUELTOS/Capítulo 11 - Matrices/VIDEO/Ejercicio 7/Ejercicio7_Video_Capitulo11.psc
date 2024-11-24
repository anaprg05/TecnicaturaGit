// Capítulo 11 (Matrices), Ejercicio 7 (VIDEO).
// Ejercicio de práctica.
Proceso Ejercicio7_Video_Capitulo11
	Definir matriz1, matriz2, i, j Como Entero;
	Dimensionar matriz1(3,3), matriz2(3,3);
	Escribir 'Ingrese una matriz ascendente.';
	Para i<-0 Hasta 2 Hacer
		Para j<-0 Hasta 2 Hacer
			Escribir 'Ingrese un número [', i, '][', j, ']'Sin Saltar;
			Leer matriz1[i,j];
		FinPara
	FinPara
	Escribir '';
	Escribir 'Ingrese una matriz descendiente.';
	Para i<-0 Hasta 2 Hacer
		Para j<-0 Hasta 2 Hacer
			Escribir 'Ingrese un número [', i, '][', j, ']: 'Sin Saltar;
			Leer matriz2[i,j];
		FinPara
	FinPara
	Escribir '';
	Para i<-0 Hasta 2 Hacer
		Para j<-0 Hasta 2 Hacer
			Escribir matriz1[i,j], ' ';
		FinPara
		Escribir '';
	FinPara
	Escribir '';
	Para i<-0 Hasta 2 Hacer
		Para j<-0 Hasta 2 Hacer
			Escribir matriz2[i,j], ' ';
		FinPara
		Escribir '';
	FinPara
	Para i<-0 Hasta 2 Hacer
		Para j<-0 Hasta 2 Hacer
			Escribir matriz1[i,j]+matriz2[i,j], ' ';
		FinPara
	FinPara
	Escribir '';
FinProceso
