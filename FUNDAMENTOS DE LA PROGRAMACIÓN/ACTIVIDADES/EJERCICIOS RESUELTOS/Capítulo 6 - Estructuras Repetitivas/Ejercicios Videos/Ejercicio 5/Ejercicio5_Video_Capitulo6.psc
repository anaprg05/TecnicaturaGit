// Cap�tulo 6 (Estructuras Repetitivas), Ejercicio 5 A�o Bisiesto (Video).
// Dise�ar un programa que ingresado un a�o, nos devuelva por consola si es un a�o bisiesto o no,
// repetir la acci�n hasta que el usuario lo decida.
Proceso Ejercicio5_Video_Clase5
	Definir num, opcion Como Entero;
	Escribir 'Comprobar que anio es bisiesto';
	Repetir
		Escribir 'Ingrese el anio.';
		Leer num;
		Si ((num MOD 4=0) Y (num MOD 100<>0) O num MOD 400=0) Entonces
			Escribir 'El anio es bisiesto';
		SiNo
			Escribir 'El anio no es bisiesto';
		FinSi
		Escribir 'Para seguir adelante, ingrese la opcion 1.';
		Leer opcion;
	Hasta Que opcion<>1
FinProceso
