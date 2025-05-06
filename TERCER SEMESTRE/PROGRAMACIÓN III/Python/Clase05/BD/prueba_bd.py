# Importación de Base de Datos - Permite la conexión con PostgreSQL
import psycopg2

# Variable de conexión
# Este código puede simplificarse en una sola línea:
# conexion = psycopg2.connect(user='postgres', password='admin', host='127.0.0.1', port='5432', database='Test_BD', client_encoding='utf8')
conexion = psycopg2.connect(
    user='postgres',
    password='admin',
    host='127.0.0.1',
    port='5432',
    database='Test_BD',
    client_encoding='utf8'
)

# print(conexion)

# Bloque try 
try:
    # Bloque With
    # Gracias al with, no hay que cerrar manualmente el cursor.
    with conexion:
        with conexion.cursor() as cursor:
            # Cursor -> Objeto que permite ejecutar sentencias SQL en postgres.
            # cursor = conexion.cursor()
            sentencia = 'SELECT * FROM persona'
            # Con .execute() se ejecutará la sentencia.
            cursor.execute(sentencia)
            # .fetchall() -> Recupera todos los registros de la sentencia que se ha ejecutado.
            registros = cursor.fetchall()

            print(registros)
# Excepción
except Exception as e:
    print(f'Ocurrió un error: {e}.')
# Bloque finally
finally: 
    # Cierre de la conexión de la base de datos
    # cursor.close() -> Gracias al with, no es necesario utilizar esta línea.
    conexion.close()

# Documentación psycopg2
# https://www.psycopg.org/docs/usage.html
