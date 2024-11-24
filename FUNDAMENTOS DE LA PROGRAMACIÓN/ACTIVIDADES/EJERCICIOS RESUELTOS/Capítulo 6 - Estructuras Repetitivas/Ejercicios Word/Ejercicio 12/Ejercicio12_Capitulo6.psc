// Capítulo 6 (Estructuras Repetitivas), Ejercicio 12.
// Calcular la sumatoria:
// S = 1 + (x/1!) + (x^2/2!) + (x^3/3!) + ... (x^n/n!) 
Proceso Ejercicio12_Capitulo6
	Definir num, factorial, i Como Entero;
	Definir numx, suma, potencia Como Real;
	Repetir
		Escribir 'Ingrese el valor del número.';
		Leer num;
	Hasta Que num>0
	Escribir 'Ingrese el valor del numero x';
	Leer numx;
	suma <- 1;
	i <- 1;
	factorial <- 1;
	Repetir
		factorial <- factorial*i;
		potencia <- numx^i;
		suma <- suma+potencia/factorial;
		i <- i+1;
	Hasta Que i>num
	Escribir 'La sumatoria final es: ', suma;
FinProceso
