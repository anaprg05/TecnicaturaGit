//Capítulo 2 (Entidades Primitivas), Ejercicio 3.
	//Hacer un programa para intercambiar el valor de 2 variables.

Proceso Ejercicio3_Capitulo2
	Definir a, b, reemplazo Como Entero;	
	
	Escribir "Inserte el valor de a: ";
	Leer a;
	Escribir "Inserte el valor de b: ";
	Leer b;

	reemplazo <- a;
	a <- b;
	b <- reemplazo;
	
	Escribir "El  nuevo valor de a es: ", a;
	Escribir "El  nuevo valor de b es: ", b;
FinProceso
