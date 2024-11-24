// Capítulo 12 (Modularidad), Ejercicio 2.
// Diseñe un algoritmo que muestre un menú al usuario con las siguientes opciones:
// potenciación, raíz cuadrada y terminar, que cada opción la realice una función
// o un procedimiento.
Proceso Ejercicio2_Capitulo12
	menu();
	Escribir '';
FinProceso

SubAlgoritmo menu
	Definir opcion Como Entero;
	Definir num, exponente Como Real;
	Repetir
		Escribir 'MENÚ';
		Escribir '1. Potenciación.';
		Escribir '2. Raíz Cuadrada';
		Escribir '3. Salir';
		Escribir 'Seleccione una opción: 'Sin Saltar;
		Leer opcion;
		Escribir '';
		Segun opcion Hacer
			1:
				Escribir 'Ingrese un número: 'Sin Saltar;
				Leer num;
				Escribir 'Ingrese un exponente: 'Sin Saltar;
				Leer exponente;
				Escribir 'La potencia es: ', potencia(num,exponente);
			2:
				Escribir 'Ingrese un número: 'Sin Saltar;
				Leer num;
				Escribir 'La raíz cuadrada es: ', raizCuadrada(num);
			3:
				Escribir '¡Hasta luego!';
			De Otro Modo:
				Escribir 'Esta opción no está en el menú, seleccione otra.';
		FinSegun
		Escribir '';
	Hasta Que opcion=3
FinSubAlgoritmo

SubAlgoritmo pot <- potencia(num,exponente)
	Definir pot Como Real;
	pot <- num^exponente;
FinSubAlgoritmo

SubAlgoritmo raizC <- raizCuadrada(num)
	Definir raizC Como Real;
	raizC <- rc(num);
FinSubAlgoritmo
