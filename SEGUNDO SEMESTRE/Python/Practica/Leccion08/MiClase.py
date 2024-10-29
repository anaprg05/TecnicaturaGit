class MiClase:
    # Variable de Clase
    # Este es un atributo que le dará a cada objeto el mismo valor
    variableClase = 'Esta es una variable de clase'

    # Variable de Instancia
    # Este es un atributo que le dará a cada objeto diferentes valores
    def __init__(self, variableInstancia):
        self.variableInstancia = variableInstancia

# Siempre mostrará el mensaje de 'Esta es una variable de clase'
print(MiClase.variableClase)

miClase1 = MiClase('Esta es una variable de instancia')
print(miClase1.variableInstancia)

# Si se crean más objetos, seguirá mostrando el mensaje de 'Esta es una variable de clase'
miClase2 = MiClase('Esta es otra prueba de una variable de instancia')
print(miClase2.variableInstancia)
print(miClase2.variableClase)
