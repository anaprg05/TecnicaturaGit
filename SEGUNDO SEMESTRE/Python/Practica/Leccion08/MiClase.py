class MiClase:
    # Variable de Clase
    # Este es un atributo que le dará a cada objeto el mismo valor
    # Contexto estático -> no pueden acceder al dinámico
    variableClase = 'Esta es una variable de clase'

    # Variable de Instancia
    # Este es un atributo que le dará a cada objeto diferentes valores
    # Contexto dinámico -> pueden acceder al estático
    def __init__(self, variableInstancia):
        self.variableInstancia = variableInstancia
    
    # Métodos estáticos -> se asocian a la clase
    # Estos métodos no utilizan la palabra self ya que no son dinámicos
    # Decorador
    @staticmethod
    def metodoEstatico():
        print(MiClase.variableClase)

    # Métodos de clase
    # cls -> contexto de clase, es una referencia a la clase en si misma
    # Decorador
    @classmethod
    def metodoClase(cls):
        print(cls.variableClase)

    def metodoInstancia(self):
        self.metodoClase()
        self.metodoEstatico()
        print(self.variableClase)
        print(self.variableInstancia)

# Siempre mostrará el mensaje de 'Esta es una variable de clase'
print(MiClase.variableClase)

miClase1 = MiClase('Esta es una variable de instancia')
print(miClase1.variableInstancia)

# Si se crean más objetos, seguirá mostrando el mensaje de 'Esta es una variable de clase'
miClase2 = MiClase('Esta es otra prueba de una variable de instancia')
print(miClase2.variableInstancia)
print(miClase2.variableClase)

# Las variables de clase pueden crearse en cualquier lado
# Sin embargo, no es muy común hacerlo
MiClase.variableClase2 = 'Valor de variable de clase2'
print(MiClase.variableClase2)
print(miClase1.variableClase2)
print(miClase2.variableClase2)

# Llamado al método estático
MiClase.metodoEstatico()

# Llamado al método de clase
MiClase.metodoClase()

# Contexto estático y Dinámico
miObjeto1 = MiClase('Variable de instancia')
miObjeto1.metodoClase()
miObjeto1.metodoInstancia()
