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

## **✏️ Cambiar nombres de columnas y tablas**
### 🔄 Renombrar una columna
```sql
USE nombre_base;
ALTER TABLE nombre_tabla 
CHANGE nombre_columna nuevo_nombre_columna VARCHAR(50);
SELECT * FROM nombre_tabla;  -- Verificar cambios
```

### 🏷️ Renombrar una tabla completa
```sql
ALTER TABLE nombre_tabla 
RENAME TO nuevo_nombre_tabla;
```

- Nota: Refresca la base de datos para visualizar los cambios.

---

## **📚 Resumen de operadores**
| Operador | Función                          | Ejemplo        | Explicación                                                                 |
|----------|----------------------------------|----------------|-----------------------------------------------------------------------------|
| `%`      | Coincidencia parcial de texto    | `"J%"`         | Busca valores que **empiecen** con "J" (Ej: "Juan", "Julia")                |
|          |                                  | `"%a"`         | Busca valores que **terminen** con "a" (Ej: "Maria", "Andrea")              |
|          |                                  | `"%e%"`        | Busca valores que **contengan** "e" (Ej: "Pedro", "Elena")                 |
| `_`      | Carácter individual              | `"A___"`       | Busca valores de **4 letras** que empiecen con "A" (Ej: "Ana ", "Alma")    |
|          |                                  | `"____"`       | Busca valores con **exactamente 4 caracteres** (Ej: "Juan", "Luis")        |
| `CHANGE` | Renombrar columna                | `CHANGE columna_antigua nueva_columna VARCHAR(50)` | Modifica el nombre y tipo de dato de una columna existente |
| `RENAME` | Renombrar tabla                  | `RENAME TO nueva_tabla` | Cambia el nombre de una tabla completa                                      |

