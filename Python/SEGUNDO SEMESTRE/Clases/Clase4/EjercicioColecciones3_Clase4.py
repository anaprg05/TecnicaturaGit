# Ejercicio 3: Colecciones - Agregar personajes a una lista
# Escribir un  programa donde se cree una lista con los siguientes personajes de 'El Señor de los Anillos'
#   Nombre: Aragon
#   Clase: Guerrero
#   Raza: Dúnadan del norte
# -----------------------------
#   Nombre: Gandalf
#   Clase: Mago
#   Raza: Istar
# -----------------------------
#   Nombre: Legolas
#   Clase: Arquero
#   Raza: Elfo Sindar

personajes = []

personaje1 = {'Nombre': 'Aragon', 'Clase': 'Guerrero', 'Raza': 'Dúnadan del norte'}
personaje2 = {'Nombre': 'Gandalf', 'Clase': 'Mago', 'Raza': 'Istar'}
personaje3 = {'Nombre': 'Legolas', 'Clase': 'Arquero', 'Raza': 'Elfo Sindar'}

personajes.append(personaje1)
print(f'Se añadió el personaje: {personaje1}')
personajes.append(personaje2)
print(f'Se añadió el personaje: {personaje2}')
personajes.append(personaje3)
print(f'Se añadió el personaje: {personaje3}')

print('')
print(f'La lista finalmente quedaría así:\n {personajes}')

# Agregar otros tres personajes más

personaje4 = {'Nombre': 'Galadriel','Clase': 'Maga de Luz', 'Raza': 'Elfo Noldor'}
personaje5 = {'Nombre': 'Gimli', 'Clase': 'Guerrero', 'Raza': 'Enano'}
personaje6 = {'Nombre': 'Sauron', 'Clase': 'Hechicero Oscuro', 'Raza': 'Ainur'}

print('')
personajes.append(personaje4)
print(f'Se añadió el personaje: {personaje4}')
personajes.append(personaje5)
print(f'Se añadió el personaje: {personaje5}')
personajes.append(personaje6)
print(f'Se añadió el personaje: {personaje6}')

print('')
print(f'La lista finalmente quedaría así:\n {personajes}')
