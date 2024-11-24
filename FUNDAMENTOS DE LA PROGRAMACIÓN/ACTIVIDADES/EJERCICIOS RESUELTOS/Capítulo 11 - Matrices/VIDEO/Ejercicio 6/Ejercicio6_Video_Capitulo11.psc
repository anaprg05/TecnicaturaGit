// Capítulo 11 (Matrices), Ejercicio 6 (VIDEO).
// Ejercicio de práctica.
Proceso Ejercicio6_Video_Capitulo11
	Definir matriz, i, j Como Entero;
	Dimensionar matriz(3,3);
	Para i<-0 Hasta 2 Hacer
		Para j<-0 Hasta 2 Hacer
			Escribir 'Ingrese un número [', i, '][', j, ']: 'Sin Saltar;
			Leer matriz[i,j];
		FinPara
	FinPara
	Escribir ' ';
	Para i<-0 Hasta 2 Hacer
		Para j<-0 Hasta 2 Hacer
			Escribir matriz[j,i], ' ';
		FinPara
		Escribir ' ';
	FinPara
	Escribir '';
FinProceso
