// Capítulo 11 (Matrices), Ejercicio 6.
// Hacer un algoritmo que llene una matriz de 5*5 y que almacene
// la diagonal principal unos y en las demás posiciones ceros.
Proceso Ejercicio6_Capitulo11
	Definir matriz, i, j Como Entero;
	Dimension matriz[5,5];
	Para i<-0 Hasta 4 Con Paso 1 Hacer
		Para j<-0 Hasta 4 Con Paso 1 Hacer
			Si i = j Entonces
				matriz[i,j] <- 1;
			SiNo
				matriz[i,j] <- 0;
			FinSi
		FinPara
	FinPara
	Escribir "";
	Escribir "La matriz es: ";
	Para i<-0 Hasta 4 Con Paso 1 Hacer
		Para j<-0 Hasta 4 Con Paso 1 Hacer
			Escribir Sin Saltar matriz[i,j], " ";
		FinPara
		Escribir "";
	FinPara
	Escribir "";
FinProceso
