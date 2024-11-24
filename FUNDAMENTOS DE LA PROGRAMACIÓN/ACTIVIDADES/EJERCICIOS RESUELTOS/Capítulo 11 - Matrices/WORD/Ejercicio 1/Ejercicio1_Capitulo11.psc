// Capítulo 11 (Matrices), Ejercicio 1.
// Hacer un algoritmo que almacene números en una matriz de 3*4. 
// Imprimir la suma de los números pares almacenados en la matriz.
Proceso Ejercicio1_Capitulo11
	Definir num, i, j, suma Como Entero;
	Dimensionar num(3,4);
	Para i<-0 Hasta 2 Con Paso 1 Hacer
		Para j<-0 Hasta 3 Con Paso 1 Hacer
			Escribir 'Ingrese un número [', i, '][', j, ']: 'Sin Saltar;
			Leer num[i,j];
		FinPara
	FinPara
	Escribir '';
	Para i<-0 Hasta 2 Con Paso 1 Hacer
		Para j<-0 Hasta 3 Con Paso 1 Hacer
			Escribir num[i,j]Sin Saltar;
		FinPara
		Escribir '';
	FinPara
	suma <- 0;
	Para i<-0 Hasta 2 Con Paso 1 Hacer
		Para j<-0 Hasta 3 Con Paso 1 Hacer
			Si num[i,j] MOD 2=0 Entonces
				suma <- suma+num[i,j];
			FinSi
		FinPara
	FinPara
	Escribir '';
	Escribir 'La suma de los pares es: ', suma;
FinProceso
