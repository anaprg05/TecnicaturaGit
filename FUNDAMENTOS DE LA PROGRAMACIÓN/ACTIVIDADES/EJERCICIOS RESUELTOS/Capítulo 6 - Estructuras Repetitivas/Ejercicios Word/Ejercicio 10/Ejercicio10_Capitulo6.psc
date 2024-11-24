// Capítulo 6 (Estructuras Repetitivas), Ejercicio 10.
// Ingresar "N" números, calcular el máximo y mínimo de ellos.
Proceso Ejercicio10_Capitulo6
	Definir n_elementos, i Como Entero;
	Definir num, mayor, menor Como Real;
	Repetir
		Escribir 'Ingrese el número de elementos.';
		Leer n_elementos;
	Hasta Que n_elementos>0
	Escribir '1. Ingrese un número.';
	Leer num;
	mayor <- num;
	menor <- num;
	i <- 2;
	Repetir
		Escribir i, '. Ingrese un número.';
		Leer num;
		Si num>mayor Entonces
			mayor <- num;
		SiNo
			Si num<menor Entonces
				menor <- num;
			FinSi
		FinSi
		i <- i+1;
	Hasta Que i>n_elementos
	Escribir 'El mayor de los números ingresados es: ', mayor;
	Escribir 'El menor de los números ingresados es: ', menor;
FinProceso
