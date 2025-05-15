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
    # En caso de que 'conexion.autocommit = True' no se tendría que hacer el commit manualmente (conexion.commit()), pero no es una buena práctica
    # Con esta línea se indica que, si no se realiza un commit, los cambios no se guardarán 
    # Inicia la transacción
    conexion.autocommit = False
    cursor = conexion.cursor()
    sentencia = 'INSERT INTO persona(nombre, apellido, email) VALUES(%s, %s, %s)'
    valores = ('Kimura', 'Cerbino', 'kcerbino@gmail.com')
    cursor.execute(sentencia, valores)
    # Con esta línea se realiza el commit manualmente
    # Se cierra la transacción
    conexion.commit()

    print('Termina la transacción.')

# Excepción
except Exception as e:
    # .rollback() -> Es el proceso que permite deshacer o revertir cambios realizados en la base de datos dentro de una transacción.
    # Si no se realiza el commit manualmente, se hace un rollback
    conexion.rollback()
    print(f'Ocurrió un error, se hizo un rollback: {e}.')
# Bloque finally
finally: 
    # Cierre de la conexión de la base de datos
    conexion.close()
