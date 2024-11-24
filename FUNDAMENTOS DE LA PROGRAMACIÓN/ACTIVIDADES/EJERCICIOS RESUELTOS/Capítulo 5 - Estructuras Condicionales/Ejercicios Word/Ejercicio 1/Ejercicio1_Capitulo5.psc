// Capítulo 5 (Estructuras Condicionales), Ejercicio 1.
// Ingresar un número entero y reportar si es par o impar.
Proceso Ejercicio1_Capitulo5
	Definir num Como Entero;
	Escribir 'Ingrese un número:';
	Leer num;
	Si num MOD 2=0 Entonces
		Escribir 'El número ', num, ' es PAR';
	SiNo
		Escribir 'El número ', num, ' es IMPAR';
	FinSi
FinProceso
