//Capítulo 2 (Entidades Primitivas), Ejercicio 2.
	//Determinar la solución lógica de la siguiente operación: ((3+5*8)<3 y (((-6/3)*4+2<2)) o (a>b).
Proceso Ejercicio2_Capitulo2
	Definir a, b Como Real;
	Definir resultado Como Logico;

	Escribir "Inserte el valor de a: ";
	Leer a;
	Escribir "Inserte el valor de b: ";
	Leer b;

	resultado <- ((3+5*8)<3 Y ((-6/3*4)+2<2)) O (a>b);

	Escribir "El resultado final es: ", resultado;
FinProceso
