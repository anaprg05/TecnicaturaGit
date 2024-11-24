// Capítulo 6 (Estructuras Repetitivas), Ejercicio 11.
// Imprimir la serie de los "N" términos de la serie de Fibonacci.
// 0 1 1 2 3 5 8 13 21
Proceso Ejercicio11_Capitulo6
	Definir n_elementos, i Como Entero;
	Definir a, b, c Como Entero;
	Repetir
		Escribir 'Ingrese el número de elementos.';
		Leer n_elementos;
	Hasta Que n_elementos>2
	a <- 0;
	b <- 1;
	c <- 1;
	Escribir '0';
	Escribir '1';
	i <- 3;
	Repetir
		c <- a+b;
		Escribir c;
		a <- b;
		b <- c;
		i <- i+1;
	Hasta Que i>n_elementos
FinProceso
