# 🗃️ **LENGUAJE SQL**  

## 📜 Historia y Definición
- **Orígenes**: Nació en los años 70 en IBM para gestionar datos en System R.  
- **Propósito**: Lenguaje para manipular, crear, modificar y gestionar bases de datos relacionales.  
- **Enfoque**: Trabaja con conjuntos de datos y sus relaciones.  

---

## 💡 **¿Qué nos permite SQL?**
- Modelado de datos **relacionales** (entidades, tablas, columnas interconectadas).  
- Garantiza que la información tenga **coherencia conjunta**.  

---

## 🛠️ **¿Para qué se utiliza?**
- Describir conjuntos de datos para resolver consultas.  
- Requiere **sintaxis precisa** para interactuar con bases de datos.  

---

## ✍️ **SINTAXIS**  
- Basada en reglas similares al inglés.  
- Combina elementos de lenguajes como Visual Basic.  

---

## 🔧 **ELEMENTOS DE SQL**

### 1. 📟 **Línea de Comandos (CLI)**
- Interfaz para ejecutar comandos de gestión.  

### 2. 🔍 **Queries (Consultas)**
- Sentencias que recuperan datos según criterios específicos.  
- Ejemplo: `SELECT * FROM usuarios WHERE edad > 25;`  

### 3. 📑 **Cláusulas SQL**
- Monitorean el estado de ejecución de queries.  
- Detectan errores de sintaxis.  
![Cláusulas SQL](https://github.com/user-attachments/assets/be4f6799-4271-4cd0-b7b7-e7b935928dd0)  

### 4. ⚙️ **Comandos (Sentencias)**
#### Tipos Principales:
| Tipo | Descripción | Comandos Clave |
|------|------------|----------------|
| **DDL** (Definición) | Gestiona estructura de BD | `CREATE`, `DROP`, `ALTER` |
| **DML** (Manipulación) | Opera con datos | `INSERT`, `UPDATE`, `DELETE` |

### 5. ➕ **Expresiones**
- Generan valores escalares o tablas completas.  

### 6. 🔄 **Predicados**
- Condiciones que limitan el alcance de comandos.  

### 7. 🔌 **Instancia**
- Conexión activa a una base de datos.  

---

## 🖥️ **PRÁCTICA EN WORKBENCH**  

### 🔄 Crear Nueva Conexión  
1. Haz clic en `+` → Nombra (ej: "Práctica").  
2. Testea conexión (`Test Connection`) → Ingresa clave.  

### 🗃️ Crear Base de Datos  
```sql
CREATE DATABASE base1;
-- Ejecutar con el ícono de rayo ⚡
-- Refrescar para ver cambios
```

### 📊 Crear Tabla
```sql
USE base1;
CREATE TABLE usuario(
  id INT(2) PRIMARY KEY,
  nombre VARCHAR(50),
  apellido VARCHAR(50),
  correo VARCHAR(100)
);
-- Ejecutar y refrescar****
```

---

> *✨ ¡Ahora dominas los fundamentos de SQL!*
