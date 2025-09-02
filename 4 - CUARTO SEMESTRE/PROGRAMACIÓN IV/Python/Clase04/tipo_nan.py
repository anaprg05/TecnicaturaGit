# FORMAS DE TRABAJAR CON EL TIPO NaN (Not a Number)

import math

from decimal import Decimal

a = float('NaN') # No es sensible a mayúsculas
print(f'a: {a}')

print()

# Módulo Math
print('Módulo Math')
a = float('nan')
print(f'¿Es de tipo Nan?\n{math.isnan(a)}')

print()

# Módulo Decimal
print('Módulo Decimal')
a = Decimal('NaN')
print(f'¿Es de tipo Nan?\n{math.isnan(a)}')
