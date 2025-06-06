# 🐬 **MySQL**  
## 🔷 ELEMENTO FUNDAMENTAL DE UNA BASE DE DATOS RELACIONAL  

- El elemento fundamental del método relacional de una base de datos es una **tabla relacional**.  

---

## 📊 **TABLA**  
![Tabla](https://github.com/user-attachments/assets/cba330d8-019b-4be2-a99e-01c7fc3c2927)  

- Espacio donde se organiza la información dentro de la base de datos.  
- Compuesta por:  
  - **Columnas (atributos)**  
  - **Filas (registros o tuplas)**  

### 🔗 **TABLA RELACIONAL**  
![Tabla Relacional](https://github.com/user-attachments/assets/847de1cb-160b-46f4-a0f7-9ebe0cabcd39)  

- Representación extensional de una relación definida sobre un dominio específico.  
- Los datos se normalizan y distribuyen en múltiples tablas relacionadas.  

---

## 🏷️ **ENTIDAD**  
- Representación de un **objeto o concepto del mundo real** en la base de datos.  
- **Ejemplos:** `Alumno`, `Empleado`, `Artículo`, `Noticia`.  
- Cada entidad está compuesta por **atributos**.  

---

## 🔧 **ATRIBUTOS**  
- Propiedades que describen una entidad.  
- Se definen en la estructura de la base de datos mediante un **modelo de datos**.  

### 🖼️ Representación Gráfica  
![Atributos Gráficos](https://github.com/user-attachments/assets/5fa93ac9-6254-403c-bf5c-ca6cf2875566)  

### 📋 Representación en Tablas  
![Atributos en Tabla](https://github.com/user-attachments/assets/bf8b12f7-0711-4803-b11b-d13667d73ce3)  

---

## 🔑 **CLAVES EN BASES DE DATOS**  

### 🗝️ **Clave Primaria (PK)**  
- Identificador **único y no repetible** de un registro.  
- Permite relacionar datos entre tablas.  

### 🔄 **Clave Foránea (FK)**  
- Campo que referencia la **clave primaria de otra tabla**.  
- Establece relaciones entre entidades.  

> **Las entidades se vinculan mediante claves foráneas.**  

---

## 📌 **METADATOS**  
- **Datos sobre los datos**:  
  - Tipo de dato almacenado (*texto, número, fecha*).  
  - Nombre de cada campo (*ej: `nombre`, `apellido`, `edad`*).  

---

## 🔍 **OPERADORES LÓGICOS**  
- Permiten definir sentencias y consultar datos.  

### ⚙️ Función de los Operadores  
- Toman entre **1 y 3 argumentos** y devuelven un valor.  
- Cuando se usa un operador en SQL, el servidor ejecuta automáticamente su función asociada.  

---

## 🛠️ **OPERACIONES FUNDAMENTALES**  

### 🔎 **SELECCIÓN**  
- Extrae **filas específicas** de una tabla.  
- **Ejemplos:**  
  ```sql
  SELECT * FROM estudiantes; -- Todos los datos
  SELECT * FROM estudiantes WHERE nombre = 'Juan'; -- Filtrado
  ```
### 🎯 **PROYECCIÓN**
- Extrae columnas específicas de una tabla.
- Ejemplos:
  ```sql
    SELECT nombre FROM estudiantes;
    SELECT nombre, edad FROM estudiantes WHERE nombre = 'Ana';
  ```

---

## **➕ INGRESAR DATOS EN TABLAS**
1. Configurar Auto-Incremento en la columna `id_estudiante`:
   - Marcar la opción AI (Auto Incrementable).
2. Aplicar cambios.
3. Insertar datos mediante:
```sql
INSERT INTO estudiantes (nombre, apellido, edad) 
VALUES ('Carlos', 'Pérez', 20);
```

---

✨ ¡Listo! Ahora puedes gestionar y consultar tus datos eficientemente.
