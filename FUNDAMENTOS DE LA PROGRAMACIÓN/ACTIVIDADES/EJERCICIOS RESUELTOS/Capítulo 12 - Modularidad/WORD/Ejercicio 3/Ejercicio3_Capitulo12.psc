// Capítulo 12 (Modularidad), Ejercicio 3.
// Desarrollar un programa que pueda calcular el valor deltipo de cambio de moneda 
// (de la moneda del programador - hacia el dólar y viceversa).
Proceso Ejercicio3_Capitulo12
	menu();
FinProceso

SubAlgoritmo menu
	Definir opcion Como Entero;
	Repetir
		Escribir 'MENÚ';
		Escribir '1. Cambiar pesos a dólares.';
		Escribir '2. Cambiar dólares a pesos.';
		Escribir '3. Salir';
		Escribir 'Seleccione una opción del menú.';
		Leer opcion;
		Escribir '';
		Segun opcion Hacer
			1:
				cambioPesosADolares();
			2:
				cambioDolaresAPesos();
			3:
				Escribir '¡Hasta luego!';
			De Otro Modo:
				Escribir 'La opción seleccionada no está en el menú, seleccione de nuevo.';
		FinSegun
	Hasta Que opcion=3
FinSubAlgoritmo

SubAlgoritmo cambioPesosADolares
	Definir pesos, dolares Como Real;
	Escribir 'Ingrese la cantidad de pesos: 'Sin Saltar;
	Leer pesos;
	dolares <- pesos/800;
	Escribir 'El cambio a dólar es: $', dolares;
	Escribir '';
FinSubAlgoritmo

SubAlgoritmo cambioDolaresAPesos
	Definir pesos, dolares Como Real;
	Escribir 'Ingrese la cantidad de dólares: 'Sin Saltar;
	Leer dolares;
	pesos <- dolares*800;
	Escribir 'El cambio a pesos es: $', pesos;
	Escribir '';
FinSubAlgoritmo
