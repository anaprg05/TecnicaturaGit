// Cap�tulo 5 (Estructuras Condicionales), Ejercicio 9.
// Elaborar un programa que tenga un men� con las siguientes opciones:
// Opci�n 1: Elevar un n�mero a una potencia X.
// Opci�n 2: Sacar la ra�z cuadrada de un n�mero.
// Opci�n 3: Salir.
Proceso Ejercicio9_Capitulo5
	Definir opcion Como Entero;
	Escribir 'MEN�';
	Escribir '1. Elevar un n�mero a una potencia x.';
	Escribir '2. Sacar la ra�z cuadrada de un n�mero.';
	Escribir '3. Salir.';
	Escribir 'Seleccione una de las opciones.';
	Leer opcion;
	Segun opcion Hacer
		1:
			Definir num, potencia, resultado Como Real;
			Escribir 'Ingrese un n�mero.';
			Leer num;
			Escribir 'Ingrese una potencia.';
			Leer potencia;
			resultado <- num^potencia;
			Escribir 'El resultado es: ', resultado;
		2:
			Definir num, resultado Como Real;
			Escribir 'Ingrese un n�mero.';
			Leer num;
			resultado <- raiz(num);
			Escribir 'El resultado es: ', resultado;
		3:
			Escribir 'Ha salido de la lista.';
		De Otro Modo:
			Escribir 'Error: El n�mero seleccionado no est� en la lista.';
	FinSegun
FinProceso
