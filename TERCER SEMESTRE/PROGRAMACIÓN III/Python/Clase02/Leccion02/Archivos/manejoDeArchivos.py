# Declaración de variable para abrir un archivo.
# Método open -> Sirve para abrir un archivo que existe o que no existe. También para otros parámetros como leer de un archivo o escribir información hacia un archivo.
# Este método puede arrojar una excepción, así que lo común es que se encuentre dentro de un bloque try catch.
try:
    # A partir de las comillas se indica que si el archivo existe lo va a buscar y, si no existe, lo va a crear.
    # w -> Write (Permite escribir información hacia el archivo.)
    # Con encoding = 'utf8' se podrán utilizar los acentos sin problemas.
    archivo = open('prueba.txt', 'w', encoding = 'utf8')
    # Agregar información al archivo.
    archivo.write('Programamos con diferentes tipos de archivos, ahora en txt. \n')
    # Especificar el juego de caracteres en un texto a través de una modificación. Por ejemplo los acentos.
    archivo.write('Los acentos son importantes para las palabras.\n')
    archivo.write('Como por ejemplo: acción, ejecución y producción.\n')
    archivo.write('Las letras son:\n W(Write),\n R(Read),\n A(Append),\n X,\n T(Text),\n B (Binary),\n W+,\n R+.\n')
    archivo.write('¡Saludos a todos los alumnos de la tecnicatura!\n')
    archivo.write('Con esto terminamos.')

except Exception as e:
    print(e)

# Finally -> Siempre se ejecuta.
finally:
    # Al ejecutarse el finally, el archivo creado se cerrará. Incluso si existe un error.
    archivo.close()

# Linea fuera de todos los bloques anteriores.
# Saltará error ya que no se puede modificar un archivo que se cerró con anterioridad.
# archivo.write('Todo quedó perfecto.')
