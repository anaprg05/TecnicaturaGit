// Capítulo 5 (Estructuras Condicionales), Ejercicio (VIDEO).
// Ejercicio de práctica.
Proceso EjercicioVideo_Capitulo5
	Definir num1, num2, num3 Como Real;
	Escribir 'Ingrese tres números diferentes: ';
	Leer num1, num2, num3;
	Si num1>num2 Y num1>num3 Entonces
		Escribir 'El número mayor es: ', num1;
	SiNo
		Si num2>num1 Y num2>num3 Entonces
			Escribir 'El número mayor es: ', num2;
		SiNo
			Escribir 'El número mayor es: ', num3;
		FinSi
	FinSi
FinProceso
