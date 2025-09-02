# Exiten varios tipos de sistemas de numeración
# 1. Sistema Decimal -> Sistema de numeración en base 10 (utiliza diez símbolos).
print("----- SISTEMA DECIMAL -----")

a = 10
print(f"Sistema Decimal - a: {a}")

# Constructor de Clase Int
a = int('23', 10)
print(f"Constructor Int, Base Decimal - a: {a}")

print()

# 2. Sistema Binario - Sistema de numeración que utiliza únicamente dos símbolos, 0 y 1.
print("----- SISTEMA BINARIO -----")
# 0b indica que es binario
a = 0b1010
print(f"Sistema Binario - a: {a}")

# Constructor de Clase Int
a = int('1010', 2)
print(f"Constructor Int, Base Binario - a: {a}")

print()

# 3. Sistema Octal - Sistema de numeración en base 8 (utiliza ocho símbolos).
print("----- SISTEMA OCTAL -----")
# 0o indica que es octal
a = 0o12
print(f"Sistema Octal - a: {a}")

# Constructor de Clase Int
a = int('27', 8)
print(f"Constructor Int, Base Octal - a: {a}")

print()

# 4. Sistema Hexadecimal - Sistema de numeración en base 16 (utiliza dieciséis símbolos).
print("----- SISTEMA HEXADECIMAL -----")
# 0x indica que es hexadecimal
a = 0xA
print(f"Sistema Hexadecimal - a: {a}")

# Constructor de Clase Int
a = int('17', 16)
print(f"Constructor Int, Base Hexadecimal - a: {a}")

print()

# 5. Sistema Quinario - Sistema de numeración en base 5 (utiliza cinco símbolos).
print("----- SISTEMA QUINARIO -----")
# No hay prefijo especial para quinario en Python, usamos int() directamente
a = int('20', 5)  # 2*5^1 + 0*5^0 = 10 en decimal
print(f"Sistema Quinario - a: {a}")

# Constructor de Clase Int
a = int('43', 5)
print(f"Constructor Int, Base Quinario - a: {a}")
