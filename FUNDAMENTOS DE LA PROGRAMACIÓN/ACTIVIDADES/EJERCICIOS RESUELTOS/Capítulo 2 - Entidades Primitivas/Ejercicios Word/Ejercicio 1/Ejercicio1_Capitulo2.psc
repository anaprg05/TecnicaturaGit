// Cap�tulo 2 (Entidades Primitivas), Ejercicio 1.
// Escribir la f�rmula resolvente en forma de expresi�n algor�tmica.
Proceso Ejercicio1_Capitulo2
	Definir a, b, c, resultado Como Real;
	Escribir 'Inserte el valor de a: ';
	Leer a;
	Escribir 'Inserte el valor de b: ';
	Leer b;
	Escribir 'Inserte el valor de c: ';
	Leer c;
	resultado <- (-b+raiz(b^2-4*a*c))/(2*a);
	Escribir 'El resultado final es: ', resultado;
	resultado <- (-b-raiz(b^2-4*a*c))/(2*a);
	Escribir 'El resultado final es: ', resultado;
FinProceso
