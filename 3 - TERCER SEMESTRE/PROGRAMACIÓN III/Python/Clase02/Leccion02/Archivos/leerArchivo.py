# Hay varias formas de leer un archivo. 
# 1. R (Read) -> Es el modo por default. Abre un archivo para lectura y, en caso de que ese archivo sea inexistente, manda un error. 
# 2. A (Append) -> Abre un archivo para agregar más información o lo crea en caso de no existir dicho archivo. Permite anexar información a un archivo que contiene cierta información. De esta manera, cuando se escribe información, no se va a eliminar la anterior, sino que se va a anexar.
# 3. X -> Envía una excepción. Crea el archivo que se especifica, sin embargo regresa un error si ese archivo no existe.
# 4. T (Text) -> Permite especificar el tipo de archivo con el que se va a trabajar.
# 5. B (Binary) -> Permite especificar el tipo de archivo con el que se va a trabajar.
# W+ -> Sirve tanto para leer como para escribir información.
# R+ -> Sirve tanto para escribir como para leer información.

# En caso de necesitar especificar la dirección del archivo, se agrega acá.
try: 
    archivo = open('prueba.txt', 'r', encoding = 'utf8')
    # Read default
    # print(archivo.read())

    # Read de la cantidad de letras seleccionada.
    # print(archivo.read(16))

    # Read que agrega caracteres despues del Read de la cantidad de letras seleccionada.
    # Es decir que continua desde la línea anterior.
    # print(archivo.read(10))

    # Read que permite leer las lineas completas.
    # print(archivo.readline()) # Primer linea.
    # print(archivo.readline()) # Segunda linea.

    # Iteración del archivo.
    # for linea in archivo:
        # Cada una de las líneas. No afecta si se le agrega nueva información.
        # print(linea)
        # En forma de lista. No es necesario que se encuentre dentro del for.
        # Para mostrar correctamente el elemento deseado, hay que indicar su número dentro de los corchetes.
        # print(archivo.readlines()[])

    # Creación de un archivo nuevo, una copia, y se anexa la info. del archivo original.
    # Con 'a', las veces que se inicie el programa será la cantidad de veces que el archivo original sea copiado.
    # En cambio si se utiliza la 'w', solo se copiará una vez.
    archivo2 = open('copia.txt', 'w', encoding = 'utf8')
    archivo2.write(archivo.read())

except Exception as e:
    print(e)

finally: 
    # Cierre del primer y segundo archivo
    archivo.close()
    archivo2.close()

    print('Se ha finalizado el proceso de leer y copiar archivos.')
