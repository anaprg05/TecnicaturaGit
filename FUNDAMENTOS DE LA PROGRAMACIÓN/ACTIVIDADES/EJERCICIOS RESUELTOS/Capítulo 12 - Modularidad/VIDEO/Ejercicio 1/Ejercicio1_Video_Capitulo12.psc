// Capítulo 12 (Modularidad), Ejercicio 1 (VIDEO).
// Ejercicio de práctica.
SubAlgoritmo suma <- sumar(num1,num2)
	Definir suma Como Entero;
	suma <- num1+num2;
FinSubAlgoritmo

Proceso Ejercicio1_Video_Capitulo12
	Definir num1, num2, resultado Como Entero;
	Escribir 'Ingrese un número: 'Sin Saltar;
	Leer num1;
	Escribir 'Ingrese otro número: 'Sin Saltar;
	Leer num2;
	resultado <- sumar(num1,num2);
	Escribir 'El resultado de la suma es: ', resultado;
FinProceso
