class Aritmetica:
    '''
    El nombre de este tipo de comentario es: DocString, es una forma de documentar para la clase en Python 

    Operaciones que se realizarán en esta clase:
        - Suma
        - Resta
        - Multiplicación
        - División
    '''

    # Elemento inicializador
    def __init__(self, operandoA, operandoB):
        self.operandoA = operandoA
        self.operandoB = operandoB

    # Método de Suma
    def sumar(self):
        return self.operandoA + self.operandoB
    
    # Método de Resta
    def restar(self):
        return self.operandoA - self.operandoB
    
    # Método de Multiplicación
    def multiplicar(self):
        return self.operandoA * self.operandoB
    
    # Método de División
    def dividir(self):
        return self.operandoA / self.operandoB
    
# Creación de objeto/instancia de la clase Aritmetica
# A este, se le pasan los argumentos de los operandos A y B
aritmetica1 = Aritmetica(7, 9)

print(f'La suma de los números es: {aritmetica1.sumar()}')
print(f'La resta de los números es: {aritmetica1.restar()}')
print(f'La multiplicación de los números es: {aritmetica1.multiplicar()}')
# :.2f -> dos números flotantes después del punto
print(f'La división de los números es: {aritmetica1.dividir():.2f}')
