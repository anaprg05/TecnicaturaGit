// Capítulo 5 (Estructuras Condicionales), Ejercicio 2.
// Realizar un programa para ingresar el radio de un circulo y se reporte su área y la longitud de la circunferencia.
Proceso Ejercicio2_Capitulo5
	Definir nota1, nota2, nota3 Como Real;
	Definir promedio Como Real;
	Escribir 'Ingrese las tres calificaciones:';
	Leer nota1, nota2, nota3;
	promedio <- (nota1+nota2+nota3)/3;
	Si promedio>=70 Entonces
		Escribir 'El alumno aprobó con: ', promedio;
	SiNo
		Escribir 'El alumno desaprobó con; ', promedio;
	FinSi
FinProceso
