# Manejo de valores infinitos

import math
from decimal import Decimal

# El valor positivo infinito es el más grande
infinitoPositivo = float('inf') # -> 'inf' es el valor que representa el positivo infinito
print(f"Infinito Positivo: {infinitoPositivo}")
print(f"¿Es infinito?: {math.isinf(infinitoPositivo)}")

print()

# El valor negativo infinito es el más chico
infinitoNegativo = float('-inf') # -> '-inf' es el valor que representa el negativo infinito
print(f"Infinito Negativo: {infinitoNegativo}")
print(f"¿Es infinito?: {math.isinf(infinitoNegativo)}")

print()

# Módulo Math
infinitoPositivo = math.inf # Se asigna el valor infinito positivo desde el Módulo Math
print(f"¿Es infinito?: {math.isinf(infinitoPositivo)}")

print()

infinitoNegativo = -math.inf # Se asigna el valor infinito negativo desde el Módulo Math
print(f"¿Es infinito?: {math.isinf(infinitoNegativo)}")

print()

# Módulo Decimal
infinitoPositivo = Decimal('Infinity') # -> Valor infinito decimal
print(f"Infinito Positivo: {infinitoPositivo}")
print(f"¿Es infinito?: {math.isinf(infinitoPositivo)}")

print()

infinitoNegativo = Decimal('-Infinity') # -> Valor infinito decimal
print(f"Infinito Positivo: {infinitoNegativo}")
print(f"¿Es infinito?: {math.isinf(infinitoNegativo)}")
