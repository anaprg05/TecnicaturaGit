# Importación de Base de Datos - Permite la conexión con PostgreSQL
import psycopg2 as bd

# Variable de conexión
# Este código puede simplificarse en una sola línea:
# conexion = bd.connect(user='postgres', password='admin', host='127.0.0.1', port='5432', database='Test_BD', client_encoding='utf8')
conexion = bd.connect(
    user='postgres',
    password='admin',
    host='127.0.0.1',
    port='5432',
    database='Test_BD',
    client_encoding='utf8'
)

# print(conexion)

# TRANSACCIONES
# Una transacción es la ejecución de una serie de consultas sobre lo que es la base de datos, las cuales modificarán el estado de la base de datos.
# Bloque try 
try:
    # Bloque With -> Va a permitir que la transacción sea de forma automática
    with conexion:
        with conexion.cursor() as cursor:
            # Inicia la transacción
            sentencia = 'INSERT INTO persona(nombre, apellido, email) VALUES(%s, %s, %s)'
            valores = ('Agustín', 'Cerrano', 'acerrano@gmail.com')
            cursor.execute(sentencia, valores)
            
            sentencia = 'UPDATE persona SET nombre=%s, apellido=%s, email=%s WHERE id_persona=%s'
            valores = ('Illa', 'Ríos', 'irios@gmail.com', 7)
            cursor.execute(sentencia, valores)

# Excepción
except Exception as e:
    print(f'Ocurrió un error: {e}.')
# Bloque finally
finally: 
    # Cierre de la conexión de la base de datos
    conexion.close()

# Se cierra la transacción    
print('Termina la transacción automática.')
