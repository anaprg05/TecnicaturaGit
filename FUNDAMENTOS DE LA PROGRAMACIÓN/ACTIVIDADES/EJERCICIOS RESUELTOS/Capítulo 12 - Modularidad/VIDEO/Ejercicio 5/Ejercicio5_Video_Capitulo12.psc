// Cap�tulo 12 (Modularidad), Ejercicio 5 (VIDEO).
// Ejercicio de pr�ctica.
SubAlgoritmo aumento <- aumentar(num Por Valor)
	Definir aumento Como Entero;
	aumento <- num+10;
FinSubAlgoritmo

SubAlgoritmo pedirDatos(num Por Referencia)
	Escribir 'Ingrese un n�mero: 'Sin Saltar;
	Leer num;
FinSubAlgoritmo

Proceso Ejercicio5_Video_Capitulo12
	Definir num Como Entero;
	pedirDatos(num);
	Escribir 'El aumento es: ', aumentar(num);
FinProceso
