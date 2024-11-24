// Capítulo 5 (Estructuras Condicionales), Ejercicio 8.
// Elaborar un programa que me muestre el significado de aniversario de cada década hasta los 60.
// Bodas de Hojalata, 10 años.
// Bodas de Porcelana, 20 años.
// Bodas de Perlas, 30 años.
// Bodas de Rubí, 40 años.
// Bodas de Oro, 50 años.
// Bodas de Diamante, 60 años.
Proceso Ejercicio8_Capitulo5
	Definir decada Como Entero;
	Escribir 'Ingrese la década.';
	Leer decada;
	Segun decada Hacer
		10:
			Escribir 'Bodas de Hojalata.';
		20:
			Escribir 'Bodas de Porcelana.';
		30:
			Escribir 'Bodas de Perlas.';
		40:
			Escribir 'Bodas de Rubí.';
		50:
			Escribir 'Bodas de Oro.';
		60:
			Escribir 'Bodas de Diamante';
		De Otro Modo:
			Escribir 'Error: La década ingresada no existe.';
	FinSegun
FinProceso
