// Cap�tulo 6 (Estructuras Repetitivas), Ejercicio 10.
// Ingresar "N" n�meros, calcular el m�ximo y m�nimo de ellos.
Proceso Ejercicio10_Capitulo6
	Definir n_elementos, i Como Entero;
	Definir num, mayor, menor Como Real;
	Repetir
		Escribir 'Ingrese el n�mero de elementos.';
		Leer n_elementos;
	Hasta Que n_elementos>0
	Escribir '1. Ingrese un n�mero.';
	Leer num;
	mayor <- num;
	menor <- num;
	i <- 2;
	Repetir
		Escribir i, '. Ingrese un n�mero.';
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
	Escribir 'El mayor de los n�meros ingresados es: ', mayor;
	Escribir 'El menor de los n�meros ingresados es: ', menor;
FinProceso
