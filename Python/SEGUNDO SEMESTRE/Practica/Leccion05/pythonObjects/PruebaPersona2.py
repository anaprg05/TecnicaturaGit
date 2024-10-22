# Uso de clases y módulos
# El módulo puede contener más de una clase, entonces se pueden llamar varias clases
# Para hacer esto, en vez de poner
# from Persona2 import Persona2
# Habría que poner
# from Persona2 import *

# Importar clase o módulo a otro archivo
from Persona2 import Persona2

# Creador de objetos
print('Creación de Objetos'.center(50, '-'))

if __name__ == '__main__':
    persona5 = Persona2('Lucas', 'Cerbino', 20)
    persona5.mostrarDetalles()

    print(__name__)

# Destructor de objetos
print('Eliminación de Objetos.'.center(50, '-'))

# Esto no es muy común, no es muy visto
del persona5
