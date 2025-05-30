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
    # Inicia la transacción
    conexion.autocommit = False
    cursor = conexion.cursor()
    sentencia = 'INSERT INTO persona(nombre, apellido, email) VALUES(%s, %s, %s)'
    valores = ('Kimura', 'Cerbino', 'kcerbino@gmail.com')
    cursor.execute(sentencia, valores)
    
    sentencia = 'UPDATE persona SET nombre=%s, apellido=%s, email=%s WHERE id_persona=%s'
    valores = ('Freddy', 'Ríos', 'frios@gmail.com', 9)
    cursor.execute(sentencia, valores)

    # Se cierra la transacción
    conexion.commit()
    
    print('Termina la transacción.')

# Excepción
except Exception as e:
    # Si no se realiza el commit manualmente, se hace un rollback
    conexion.rollback()
    print(f'Ocurrió un error, se hizo un rollback: {e}.')
# Bloque finally
finally: 
    # Cierre de la conexión de la base de datos
    conexion.close()
