# 🗃️ **MySQL - Operaciones con Tablas**

## 📊 **TABLAS**

### 🔹 USE
_Posicionarse en una base de datos específica_
```sql
USE <nombre_de_la_base>;
```

---

## **📥 CARGAR DATOS EN TABLAS**
```sql
INSERT INTO <nombre_tabla> VALUES (<valores>);
```

**Notas importantes:**
- 🔢 Datos numéricos: se escriben directamente
- 🔤 Datos tipo texto: entre comillas simples ('Ejemplo')
- ⚡ Ejecutar con el ícono del rayo después de completar todos los valores

---

## **👁️ VISUALIZAR DATOS**
### 🔍 SELECT * FROM
Muestra todos los datos de una tabla

```sql
SELECT * FROM <nombre_tabla>;
```
- Usar el rayo con cursor para ejecutar solo la última línea

---

## **🎯 SELECT ESPECÍFICO**
*Mostrar columnas específicas*
```
sql
SELECT <columna> FROM <base_de_datos>.<nombre_tabla>;
```

Ejemplo múltiples columnas:
```sql
SELECT columna1, columna3, columna5 FROM base1.usuarios;
```

### 🔄 Renombrar Columnas
Una columna:
```sql
SELECT <columna> AS <nuevo_nombre> FROM <base>.<tabla>;
```

Múltiples columnas:
```sql
SELECT 
    columnaA AS 'Nombre Nuevo A',
    columnaB AS 'Nombre Nuevo B' 
FROM base1.usuarios;
```

---

## **🔎 FILTRAR DATOS**
### WHERE
Filtrar resultados específicos
```sql
SELECT * FROM base1.usuario WHERE nombre = "Romina";
```

### DISTINCT
Mostrar valores únicos (sin repeticiones)
```sql
SELECT DISTINCT <columna> FROM <tabla>;
```

---

✨ Tip: Usa `F5` para refrescar y ver los cambios después de cada operación.
