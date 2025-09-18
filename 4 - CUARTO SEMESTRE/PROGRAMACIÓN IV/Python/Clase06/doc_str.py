# Cadenass de Múltiples Líneas
'''
Documentación con triple comilla simple
'''
"""
Documentación con triple comilla doble
"""
from mi_clase import MiClase

# help(MiClase)

# print(MiClase.__doc__) -> Muestra la documentación
# print(MiClase.__init__.__doc__) -> Muestra la documentación del dunder init
# print(MiClase.mi_metodo.__doc__) -> Muestra la documentación del método
print(MiClase.mi_metodo) # -> Muestra la dirección de donde se guarda el objeto
print(type(MiClase.mi_metodo)) # -> Muestra qué tipo de objeto es
