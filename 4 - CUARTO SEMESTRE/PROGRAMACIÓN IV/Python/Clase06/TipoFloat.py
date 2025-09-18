# Profundización en el Tipo Float

a = 3.0
# Para indicar más cantidad de ceros, por ejemplo .00, hay que poner :. cantidadDeCeros f
print(f"a: {a:.2f}")

# Constructor de Tipo Float -> Puede recibir int y str, siempre y cuando sen numéricos
a = float(10) # -> Tipo entero
a = float('10') # -> Tipo str
print(f"a: {a:.2f}")

# Notación Exponencial (Valores Positivos o Negativos)
# Agregar valores positivos (en este caso, cinco ceros)
a = 3e5
print(f"a: {a:.2f}")

# Simplificación de números
# Si son demasiados ceros, la impresión cambia mostrando la cantidad de ceros que tendría en un entero
a = 3e50
print(f"a: {a}")

# Agregar valores negativos (en este caso, cinco ceros)
a = 3e-5
print(f"a: {a:.5f}")

# Cualquier cálculo que incuya un float, todo cambia a float
a = 4.0 + 5
print(a)
print(type(a))
