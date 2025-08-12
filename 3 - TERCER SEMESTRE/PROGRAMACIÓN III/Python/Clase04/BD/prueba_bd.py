# Importación de Base de Datos - Permite la conexión con PostgreSQL
import psycopg2

# Variable de conexión
conexion = psycopg2.connect(
    user='postgres',
    password='admin',
    host='127.0.0.1',
    port='5432',
    database='Test_BD',
    client_encoding='utf8'
)

# print(conexion)

# Cursor -> Objeto que permite ejecutar sentencias SQL en postgres.
cursor = conexion.cursor()
sentencia = 'SELECT * FROM persona'
# Con .execute() se ejecutará la sentencia.
cursor.execute(sentencia)
# .fetchall() -> Recupera todos los registros de la sentencia que se ha ejecutado.
registros = cursor.fetchall()

print(registros)

# Cierre de la conexión de la base de datos
cursor.close()
conexion.close()
