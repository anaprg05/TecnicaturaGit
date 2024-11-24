// Capítulo 11 (Matrices), Ejercicio 1 (VIDEO).
// Ejercicio de práctica.
Proceso Ejercicio1_Video_Capitulo11
	Definir num, i, j Como Entero;
	Dimensionar num(3,3);
	Para i<-0 Hasta 2 Con Paso 1 Hacer
		Para j<-0 Hasta 2 Con Paso 1 Hacer
			Escribir 'Ingrese un número[', i, '][', j, ']: 'Sin Saltar;
			Leer num[i,j];
		FinPara
	FinPara
	Para i<-0 Hasta 2 Con Paso 1 Hacer
		Para j<-0 Hasta 2 Con Paso 1 Hacer
			Escribir num[i,j], ' 'Sin Saltar;
		FinPara
		Escribir '';
	FinPara
	Escribir '';
FinProceso
