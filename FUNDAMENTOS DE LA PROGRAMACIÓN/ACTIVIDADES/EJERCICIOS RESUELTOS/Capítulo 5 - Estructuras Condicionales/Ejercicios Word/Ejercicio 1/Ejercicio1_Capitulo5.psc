// Cap�tulo 5 (Estructuras Condicionales), Ejercicio 1.
// Ingresar un n�mero entero y reportar si es par o impar.
Proceso Ejercicio1_Capitulo5
	Definir num Como Entero;
	Escribir 'Ingrese un n�mero:';
	Leer num;
	Si num MOD 2=0 Entonces
		Escribir 'El n�mero ', num, ' es PAR';
	SiNo
		Escribir 'El n�mero ', num, ' es IMPAR';
	FinSi
FinProceso
