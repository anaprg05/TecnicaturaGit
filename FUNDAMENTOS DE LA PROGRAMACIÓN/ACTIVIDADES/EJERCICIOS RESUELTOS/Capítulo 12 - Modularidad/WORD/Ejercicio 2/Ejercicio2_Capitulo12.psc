// Cap�tulo 12 (Modularidad), Ejercicio 2.
// Dise�e un algoritmo que muestre un men� al usuario con las siguientes opciones:
// potenciaci�n, ra�z cuadrada y terminar, que cada opci�n la realice una funci�n
// o un procedimiento.
Proceso Ejercicio2_Capitulo12
	menu();
	Escribir '';
FinProceso

SubAlgoritmo menu
	Definir opcion Como Entero;
	Definir num, exponente Como Real;
	Repetir
		Escribir 'MEN�';
		Escribir '1. Potenciaci�n.';
		Escribir '2. Ra�z Cuadrada';
		Escribir '3. Salir';
		Escribir 'Seleccione una opci�n: 'Sin Saltar;
		Leer opcion;
		Escribir '';
		Segun opcion Hacer
			1:
				Escribir 'Ingrese un n�mero: 'Sin Saltar;
				Leer num;
				Escribir 'Ingrese un exponente: 'Sin Saltar;
				Leer exponente;
				Escribir 'La potencia es: ', potencia(num,exponente);
			2:
				Escribir 'Ingrese un n�mero: 'Sin Saltar;
				Leer num;
				Escribir 'La ra�z cuadrada es: ', raizCuadrada(num);
			3:
				Escribir '�Hasta luego!';
			De Otro Modo:
				Escribir 'Esta opci�n no est� en el men�, seleccione otra.';
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
