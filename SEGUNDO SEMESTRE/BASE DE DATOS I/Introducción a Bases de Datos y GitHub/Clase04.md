# 🗄️ **Datos**

## 📝 Tipos de Datos de Texto

### `CHAR(n)`
- 🔹 Almacena caracteres y cadenas de texto de longitud fija
- 🔹 Reserva espacio de memoria exacto para `n` caracteres
- 🔸 Ejemplo: `CHAR(10)` siempre usará espacio para 10 caracteres

### `VARCHAR(n)`
- 🔹 Almacena cadenas de texto de longitud variable
- 🔹 Reserva espacio mínimo y crece según necesidad (hasta 255 caracteres)
- 🔹 Más eficiente para textos de longitud variable
- 🔸 Ejemplo: `VARCHAR(100)` puede almacenar desde 1 hasta 100 caracteres

### `TEXT`
- 🔹 Diseñado para cadenas de texto muy largas (+1000 caracteres)
- 🔹 Ideal para contenido extenso como artículos o descripciones largas

---

## 🔢 Tipo de Datos Numéricos

| Tipo         | Descripción                                  | Ejemplo           |
|--------------|---------------------------------------------|-------------------|
| `INTEGER`    | Números enteros sin decimales               | `42`, `-15`       |
| `BIGINT`     | Enteros de gran magnitud                    | `9999999999`      |
| `SMALLINT`   | Enteros pequeños (<100)                     | `25`, `99`        |
| `DECIMAL(n,s)`| Números con precisión exacta (n=total, s=decimales) | `DECIMAL(5,2)` → `123.45` |
| `NUMERIC(n,s)`| Equivalente a DECIMAL                       | `NUMERIC(7,3)` → `1234.567` |

---

## 📅 Tipo de Datos de Fecha y Hora

### `DATE`
- 📌 Solo almacena fecha (AAAA-MM-DD)
- 🔹 Útil para fechas de nacimiento, eventos, etc.

### `TIME`
- 📌 Solo almacena hora (HH:MM:SS)
- 🔹 Ideal para horarios de apertura/cierre

### `DATETIME`
- 📌 Combina fecha y hora (AAAA-MM-DD HH:MM:SS)
- 🔹 Perfecto para registros de actividad

### `TIMESTAMP`
- 📌 Segundos desde la época Unix (01/01/1970)
- 🔹 Automático en muchos sistemas
- 🔹 Ideal para auditorías y logs

---

## ✔️ Tipos de Datos Lógicos

### `BOOLEAN`
- 🔘 Solo dos valores posibles: `TRUE`/`FALSE` o `1`/`0`
- 🔹 Uso común:
  - Activo/Inactivo
  - Sí/No
  - Habilitado/Deshabilitado

---

# 🔐 **Constraints (Restricciones)**

## 🔒 Restricciones Básicas

| Restricción  | Función                                     | Ejemplo                 |
|--------------|--------------------------------------------|-------------------------|
| `NOT NULL`   | Obliga a que el campo tenga siempre valor   | `nombre VARCHAR(50) NOT NULL` |
| `UNIQUE`     | Garantiza valores únicos en la columna      | `email VARCHAR(100) UNIQUE` |
| `PRIMARY KEY`| Identificador único + NOT NULL + UNIQUE     | `id INT PRIMARY KEY`    |

## 🔗 Foreign Key (Llave Foránea)

- 🌉 Establece relaciones entre tablas
- 🔹 Debe coincidir con una PRIMARY KEY en otra tabla
- 🔸 Ejemplo: 
  ```sql
  FOREIGN KEY (user_id) REFERENCES users(id)
  ```

### ⚙️ Otras Restricciones
`CHECK`
- ✅ Valida que los datos cumplan una condición
- 🔹 Ejemplo:
```sql
edad INT CHECK (edad >= 18)
```

`DEFAULT`
- ⚖️ Establece un valor predeterminado
- 🔹 Ejemplo:
```sql
activo BOOLEAN DEFAULT TRUE
```

`INDEX`
- 🚀 Acelera búsquedas pero ralentiza inserciones
- 🔹 Uso típico:
```sql
CREATE INDEX idx_nombre ON usuarios(nombre);
```
