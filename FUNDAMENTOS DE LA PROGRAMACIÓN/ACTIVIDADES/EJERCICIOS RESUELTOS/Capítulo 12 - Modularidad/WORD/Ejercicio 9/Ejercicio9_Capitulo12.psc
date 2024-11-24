// Capítulo 12 (Modularidad), Ejercicio 9.
// Implementar un subprograma recursivo que permita sumar los 
// dígitos de un número.
Proceso Ejercicio9_Capitulo12
	Definir num, suma Como Entero;
	pedirDatos(num);
	suma <- 0;
	sumaDigitos(num,suma); // Inicializamos la suma antes de llamar a la función
	Escribir 'La suma es: ', suma; // Pasamos la suma como referencia
FinProceso

SubAlgoritmo pedirDatos(num Por Referencia)
	Escribir 'Ingrese un número: 'Sin Saltar;
	Leer num;
FinSubAlgoritmo

SubAlgoritmo sumaDigitos(num,suma Por Referencia)
	Si num<10 Entonces
		suma <- suma+num;
	SiNo
		sumaDigitos(trunc(num/10),suma);
		suma <- suma+(num MOD 10); // Llamada recursiva con el nuevo valor de num
	FinSi
FinSubAlgoritmo
