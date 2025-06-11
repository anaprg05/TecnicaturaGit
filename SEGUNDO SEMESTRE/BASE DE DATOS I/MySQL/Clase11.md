# 📌 **Sentencias SQL**  

## 🔄 **ORDER BY**  
Se utiliza para ordenar de forma ascendente o descendente un campo en una tabla, ya sea alfabéticamente (A-Z / Z-A) o numéricamente (1-∞ / ∞-1).  

### Sintaxis básica:  
```sql
USE <nombre_de_la_base>;
SELECT * FROM <nombre_base>.<nombre_tabla> ORDER BY <nombre_columna> ASC|DESC;
```

### Ejemplos:
- Orden ascendente (ASC):
```sql
USE base1;
SELECT * FROM base1.usuario ORDER BY nombre ASC;
```

- Orden descendente (DESC):
```sql
USE base1;
SELECT * FROM base1.usuario ORDER BY nombre DESC;
```

---

## **❌ SENTENCIA NOT**
Excluye registros que coincidan con un valor específico.

### Sintaxis:
```sql
USE <nombre_de_la_base>;
SELECT * FROM <nombre_base>.<nombre_tabla>
WHERE NOT <columna> = "valor";
```

### Ejemplo:
```sql
USE base1;
SELECT * FROM base1.Usuario
WHERE NOT apellido = "Rojas";
```

---

## **🗑️ SENTENCIA DROP**
Elimina columnas, datos específicos o bases de datos completas.

### Sintaxis para eliminar columnas:
```sql
USE <nombre_de_la_base>;
ALTER TABLE <nombre_tabla>
DROP COLUMN <nombre_columna>;
```

### Ejemplo:
sql
```USE base1;
ALTER TABLE Usuario
DROP COLUMN correo;
```

---

## **🧹 SENTENCIA DELETE**
Elimina registros específicos o todos los datos de una tabla.

### Sintaxis general (elimina todo):
```sql
USE <nombre_de_la_base>;
DELETE FROM <nombre_tabla>;
```

Ejemplo con filtro (`WHERE`):
```sql
USE base1;
DELETE FROM usuario WHERE <columna> = "valor";
```

---

## **📊 Normalización de Bases de Datos**
Proceso para reorganizar atributos y evitar redundancia, optimizando espacio y recursos.

### 🎯 Objetivo
Evitar la repetición de datos y mejorar la eficiencia en el almacenamiento.

### 📌 Tres Formas de Normalización
1️⃣ Primera Forma (1FN)
- Elimina datos repetidos.
- Crea tablas separadas por grupos de datos relacionados.
- Asigna claves primarias a cada grupo.

2️⃣ Segunda Forma (2FN)
- Crea tablas adicionales para datos aplicables a múltiples registros.
- Establece relaciones mediante claves foráneas.

3️⃣ Tercera Forma (3FN)
- Elimina campos que no dependan directamente de la clave primaria.
- Ejemplo: Si `C` depende de `B` y `B` de `A`, al eliminar `B`, `C` mantiene su relación con `A`.

---

## **🔍 Seleccionar Datos de Múltiples Tablas**
### Sintaxis básica:
```sql
USE base1;
SELECT * FROM <tabla1>, <tabla2>;
```

### Ejemplo con campos específicos:
```sql
SELECT 
    usuario.nombre, 
    usuario.apellido, 
    serial.n_serial 
FROM usuario, serial 
WHERE usuario.idusuario = serial.idserial;
```
