// Cap�tulo 5 (Estructuras Condicionales), Ejercicio (VIDEO).
// Ejercicio de pr�ctica.
Proceso EjercicioVideo_Capitulo5
	Definir num1, num2, num3 Como Real;
	Escribir 'Ingrese tres n�meros diferentes: ';
	Leer num1, num2, num3;
	Si num1>num2 Y num1>num3 Entonces
		Escribir 'El n�mero mayor es: ', num1;
	SiNo
		Si num2>num1 Y num2>num3 Entonces
			Escribir 'El n�mero mayor es: ', num2;
		SiNo
			Escribir 'El n�mero mayor es: ', num3;
		FinSi
	FinSi
FinProceso
