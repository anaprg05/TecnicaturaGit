// Cap�tulo 5 (Estructuras Condicionales), Ejercicio 8.
// Elaborar un programa que me muestre el significado de aniversario de cada d�cada hasta los 60.
// Bodas de Hojalata, 10 a�os.
// Bodas de Porcelana, 20 a�os.
// Bodas de Perlas, 30 a�os.
// Bodas de Rub�, 40 a�os.
// Bodas de Oro, 50 a�os.
// Bodas de Diamante, 60 a�os.
Proceso Ejercicio8_Capitulo5
	Definir decada Como Entero;
	Escribir 'Ingrese la d�cada.';
	Leer decada;
	Segun decada Hacer
		10:
			Escribir 'Bodas de Hojalata.';
		20:
			Escribir 'Bodas de Porcelana.';
		30:
			Escribir 'Bodas de Perlas.';
		40:
			Escribir 'Bodas de Rub�.';
		50:
			Escribir 'Bodas de Oro.';
		60:
			Escribir 'Bodas de Diamante';
		De Otro Modo:
			Escribir 'Error: La d�cada ingresada no existe.';
	FinSegun
FinProceso
