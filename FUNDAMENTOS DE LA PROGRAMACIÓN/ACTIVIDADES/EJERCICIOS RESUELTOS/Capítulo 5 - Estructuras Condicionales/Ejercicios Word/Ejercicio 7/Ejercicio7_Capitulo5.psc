// Cap�tulo 5 (Estructuras Condicionales), Ejercicio 7.
// Elaborar un programa que me muestre los d�as de las semanas cuando ingrese los 7 primeros n�meros.
Proceso Ejercicio7_Capitulo5
	Definir num Como Entero;
	Escribir 'Ingrese un n�mero del d�a de la semana (1-7)';
	Leer num;
	Segun num Hacer
		1:
			Escribir 'Lunes.';
		2:
			Escribir 'Martes.';
		3:
			Escribir 'Mi�rcoles.';
		4:
			Escribir 'Jueves.';
		5:
			Escribir 'Viernes.';
		6:
			Escribir 'S�bado.';
		7:
			Escribir 'Domingo.';
		De Otro Modo:
			Escribir 'Error: No existe un d�a para el n�mero ingresado.';
	FinSegun
FinProceso
