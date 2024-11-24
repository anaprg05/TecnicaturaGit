// Capítulo 5 (Estructuras Condicionales), Ejercicio 7.
// Elaborar un programa que me muestre los días de las semanas cuando ingrese los 7 primeros números.
Proceso Ejercicio7_Capitulo5
	Definir num Como Entero;
	Escribir 'Ingrese un número del día de la semana (1-7)';
	Leer num;
	Segun num Hacer
		1:
			Escribir 'Lunes.';
		2:
			Escribir 'Martes.';
		3:
			Escribir 'Miércoles.';
		4:
			Escribir 'Jueves.';
		5:
			Escribir 'Viernes.';
		6:
			Escribir 'Sábado.';
		7:
			Escribir 'Domingo.';
		De Otro Modo:
			Escribir 'Error: No existe un día para el número ingresado.';
	FinSegun
FinProceso
