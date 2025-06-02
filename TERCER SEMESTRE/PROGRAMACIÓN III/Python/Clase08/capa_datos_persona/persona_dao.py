class PersonaDAO:
    """
    DAO -> Data Access Object
    CRUD -> Create (Insertar)
         -> Read (Seleccionar)
         -> Update (Actualizar)
    """

    _SELECCIONAR = 'SELECT * FROM persona ORDER BY id_persona'
    _INERTAR = 'INSERT INTO persona(nombre, apellido, email) VALUES (%s, %s, %s)'
    _ACTUALIZAR = 'UPDATE persona SET nombre=%s, apellido=%s, email=%s, WHERE id_persona=%s'
    _ELIMINAR = 'DELETE FROM persona WHERE id_persona=%s'

    
