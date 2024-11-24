// Capítulo 12 (Modularidad), Ejercicio 4.
// Escribir un subprograma nombrado cambio() que tenga un pará metro en número entero y seis parámetros de
// referencia en números enteros nombrados: cien, cincuenta, veinte, diez, cinco y uno, respectivamente.
// La función tiene que considerar el valor entero transmitido como una cantidad en dólares y convertir
// el valor en el número menor de billetes equivalentes.
SubAlgoritmo pedirDatos(dolares Por Referencia)
	Escribir 'Ingrese la cantidad de dólares: 'Sin Saltar;
	Leer dolares;
FinSubAlgoritmo

SubAlgoritmo cambio(dolares,cien Por Referencia,cincuenta Por Referencia,veinte Por Referencia,diez Por Referencia,cinco Por Referencia,uno Por Referencia)
	cien <- trunc(dolares/100);
	dolares <- dolares MOD 100;
	cincuenta <- trunc(dolares/50);
	dolares <- dolares MOD 50;
	veinte <- trunc(dolares/20);
	dolares <- dolares MOD 20;
	diez <- trunc(dolares/10);
	dolares <- dolares MOD 10;
	cinco <- trunc(dolares/5);
	dolares <- dolares MOD 5;
	uno <- trunc(dolares/1);
	dolares <- dolares MOD 1;
FinSubAlgoritmo

SubAlgoritmo mostrarDatos(cien,cincuenta,veinte,diez,cinco,uno)
	Escribir '';
	Escribir 'La cantidad de billetes necesarios es: ';
	Escribir 'Cien: ', cien;
	Escribir 'Cincuenta: ', cincuenta;
	Escribir 'Veinte: ', veinte;
	Escribir 'Diez: ', diez;
	Escribir 'Cinco: ', cinco;
	Escribir 'Uno: ', uno;
FinSubAlgoritmo

Proceso Ejercicio4_Capitulo12
	Definir dolares Como Real;
	Definir cien, cincuenta, veinte, diez, cinco, uno Como Entero;
	pedirDatos(dolares);
	cambio(dolares,cien,cincuenta,veinte,diez,cinco,uno);
	mostrarDatos(cien,cincuenta,veinte,diez,cinco,uno);
FinProceso
