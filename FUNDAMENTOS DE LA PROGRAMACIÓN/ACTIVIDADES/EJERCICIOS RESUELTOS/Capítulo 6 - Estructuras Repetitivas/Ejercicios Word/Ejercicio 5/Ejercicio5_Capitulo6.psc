// Cap�tulo 6 (Estructuras Repetitivas), Ejercicio 5.
// Calcular la factorial de un n�mero mayor o igual a 0.
Proceso Ejercicio5_Capitulo6
	Definir num Como Entero;
	Definir i, factorial Como Entero;
	Repetir
		Escribir 'Ingrese un n�mero.';
		Leer num;
	Hasta Que num>=0
	i <- 1;
	factorial <- 1;
	Mientras i<=num Hacer
		factorial <- factorial*i;
		i <- i+1;
	FinMientras
	Escribir 'El factorial es ', factorial;
FinProceso
