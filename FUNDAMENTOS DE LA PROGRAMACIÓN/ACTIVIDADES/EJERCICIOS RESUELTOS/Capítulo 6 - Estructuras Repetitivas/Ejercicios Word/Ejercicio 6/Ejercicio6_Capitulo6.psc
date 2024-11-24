// Capítulo 6 (Estructuras Repetitivas), Ejercicio 6.
// Calcular la siguiente sumatoria de los "N" elementos: S = 1+4+9...
Proceso Ejercicio6_Capitulo6
	Definir n_elementos Como Entero;
	Definir i, suma Como Entero;
	Escribir 'Ingrese la cantidad de elementos a sumarse.';
	Leer n_elementos;
	i <- 1;
	suma <- 0;
	Mientras i<=n_elementos Hacer
		suma <- suma+i^2;
		i <- i+1;
	FinMientras
	Escribir 'La suma es: ', suma;
FinProceso
