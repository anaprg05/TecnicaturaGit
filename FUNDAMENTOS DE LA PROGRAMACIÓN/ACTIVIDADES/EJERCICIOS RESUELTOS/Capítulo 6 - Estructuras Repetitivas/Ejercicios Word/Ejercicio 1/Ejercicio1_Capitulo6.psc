// Cap�tulo 6 (Estructuras Repetitivas), Ejercicio 1.
// Calcular la suma de los "N" primeros n�meros.
Proceso Ejercicio1_Capitulo6
	Definir N, suma, i Como Entero;
	Escribir 'Ingrese la cantidad de n�meros que quiere sumar.';
	Leer N;
	suma <- 0;
	Para i<-1 Hasta N Con Paso 1 Hacer
		suma <- suma+i;
	FinPara
	Escribir 'El resultado de la suma es: ', suma;
FinProceso
