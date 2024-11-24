// Capítulo 12 (Modularidad), Ejercicio 4 (VIDEO).
// Ejercicio de práctica.
SubAlgoritmo aumento <- aumentar(num)
	Definir aumento Como Entero;
	aumento <- num+10;
FinSubAlgoritmo

Proceso Ejercicio4_Video_Capitulo12
	Definir num Como Entero;
	Escribir 'Ingrese un número: 'Sin Saltar;
	Leer num;
	Escribir 'El aumento es: ', aumentar(num);
FinProceso
