// Cap�tulo 12 (Modularidad), Ejercicio 6 (VIDEO).
// Ejercicio de pr�ctica.
SubAlgoritmo retorno <- factorial(num)
	Definir retorno Como Entero;
	Si num=0 Entonces
		retorno <- 1;
	SiNo
		retorno <- num*factorial(num-1);
	FinSi
FinSubAlgoritmo

Proceso Ejercicio6_Video_Capitulo12
	Definir num Como Entero;
	Escribir 'Ingrese un n�mero: 'Sin Saltar;
	Leer num;
	Escribir 'El factorial del n�mero es: ', factorial(num);
FinProceso
