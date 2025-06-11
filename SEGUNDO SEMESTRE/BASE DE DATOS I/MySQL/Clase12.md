# 🔍 **Sentencias SQL Avanzadas**

## 🎯 Búsqueda de datos específicos con `LIKE`
Para traer datos específicos de una o varias tablas usando patrones:

```sql
USE base1;
SELECT * FROM usuario WHERE nombre LIKE "J%";
```

📌 Uso del símbolo `%`
- `"LETRA%"`
  - Busca datos que empiecen con la letra especificada.
  - Ejemplo: `"J%"` encuentra "Juan", "Julia", etc.

- `"%LETRA"`
  - Busca datos que terminen con la letra especificada.
  - Ejemplo: `"%a"` encuentra "Maria", "Andrea", etc.

- `"%letra%"`
  - Busca datos que contengan la letra en cualquier posición.
  - Ejemplo: `"%e%"` encuentra "Pedro", "Elena", "Marta".

---

## **🔢 Búsqueda por longitud de caracteres**
Usando _ (guión bajo) para especificar la cantidad exacta de caracteres:
```sql
USE base1;
SELECT * FROM usuario WHERE nombre LIKE "_____";  -- 5 caracteres exactos
Cada _ representa un carácter. Ejemplo: "___" busca nombres de 3 letras.
```

---

✏️ Cambiar nombres de columnas y tablas
🔄 Renombrar una columna
sql
USE nombre_base;
ALTER TABLE nombre_tabla 
CHANGE nombre_columna nuevo_nombre_columna VARCHAR(50);

SELECT * FROM nombre_tabla;  -- Verificar cambios
🏷️ Renombrar una tabla completa
sql
ALTER TABLE nombre_tabla 
RENAME TO nuevo_nombre_tabla;
Nota: Refresca la base de datos para visualizar los cambios.

---

📚 Resumen de operadores
Operador	Función	Ejemplo
%	Coincidencia parcial de texto	"J%", "%a"
_	Carácter individual	"A___"
CHANGE	Renombrar columna	SQL arriba
RENAME	Renombrar tabla	SQL arriba

