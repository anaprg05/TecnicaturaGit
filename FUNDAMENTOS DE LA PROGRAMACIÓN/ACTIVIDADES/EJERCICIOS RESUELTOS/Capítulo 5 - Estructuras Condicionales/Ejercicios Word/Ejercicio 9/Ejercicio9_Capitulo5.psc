// Capítulo 5 (Estructuras Condicionales), Ejercicio 9.
// Elaborar un programa que tenga un menú con las siguientes opciones:
// Opción 1: Elevar un número a una potencia X.
// Opción 2: Sacar la raíz cuadrada de un número.
// Opción 3: Salir.
Proceso Ejercicio9_Capitulo5
	Definir opcion Como Entero;
	Escribir 'MENÚ';
	Escribir '1. Elevar un número a una potencia x.';
	Escribir '2. Sacar la raíz cuadrada de un número.';
	Escribir '3. Salir.';
	Escribir 'Seleccione una de las opciones.';
	Leer opcion;
	Segun opcion Hacer
		1:
			Definir num, potencia, resultado Como Real;
			Escribir 'Ingrese un número.';
			Leer num;
			Escribir 'Ingrese una potencia.';
			Leer potencia;
			resultado <- num^potencia;
			Escribir 'El resultado es: ', resultado;
		2:
			Definir num, resultado Como Real;
			Escribir 'Ingrese un número.';
			Leer num;
			resultado <- raiz(num);
			Escribir 'El resultado es: ', resultado;
		3:
			Escribir 'Ha salido de la lista.';
		De Otro Modo:
			Escribir 'Error: El número seleccionado no está en la lista.';
	FinSegun
FinProceso
