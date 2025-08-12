# 🧮 **Normalización de Bases de Datos**

## 🔍 Concepto Básico
▫️ Proceso de descomposición de tablas en estructuras más pequeñas y especializadas  
▫️ Se establecen relaciones mediante claves (IDs)  
▫️ **Beneficio clave:** Actualizar un dato en un solo lugar propaga los cambios automáticamente  

---

## 📉 Ejemplo Inicial (Tabla Sin Normalizar)
![Tabla sin normalizar](https://github.com/user-attachments/assets/4156dbc9-9211-40c3-ac97-ef9b4cc9ef73)

**Problemas evidentes:**
- Datos repetidos
- Estructura anidada
- Dificultad para actualizar

---

## 📐 Formas Normales

### 1️⃣ **Primera Forma Normal (1FN)**
```mermaid
erDiagram
    ALUMNOS_1FN {
        int id_alumno PK
        varchar nombre
        varchar nivel_curso
        varchar nombre_curso
        varchar materia
    }
```
Reglas:
- ✅ Eliminar valores repetidos y no atómicos
- ✅ Cada campo no clave debe depender únicamente de la clave primaria
- ✅ Los datos mantienen significado al reordenar registros/columnas

Resultado:
![image](https://github.com/user-attachments/assets/8cc7a9eb-fe01-4370-a568-b7432f3f0584)

---

### 2️⃣ **Segunda Forma Normal (2FN)**
```mermaid
erDiagram
    ALUMNOS ||--o{ MATERIAS : "cursa"
    ALUMNOS {
        int id_alumno PK
        varchar nombre
        varchar nivel_curso
        varchar nombre_curso
    }
    MATERIAS {
        int id_materia PK
        int id_alumno FK
        varchar materia
    }
```
Reglas:
- ✅ Cumplir 1FN
- ✅ Cada campo debe depender completamente de la clave primaria
- ✅ Separar entidades independientes

Resultado:
![image](https://github.com/user-attachments/assets/e16f99be-e058-4a08-b902-6c47d487c1b1)

---

### 3️⃣ **Tercera Forma Normal (3FN)**
```mermaid
erDiagram
    ALUMNOS ||--o{ CURSOS : "asiste"
    ALUMNOS ||--o{ MATERIAS : "cursa"
    CURSOS {
        int id_curso PK
        varchar nivel_curso
        varchar nombre_curso
    }
```
Reglas:
- ✅ Cumplir 2FN
- ✅ Eliminar dependencias transitivas (campos que no dependen de la clave)
- ✅ Separar conceptos lógicos

Resultado:
- 3FN aplicada

---

### 4️⃣ **Cuarta Forma Normal (4FN)**
```mermaid
erDiagram
    ALUMNOS ||--o{ ALUMNO_MATERIA : "tiene"
    MATERIAS ||--o{ ALUMNO_MATERIA : "pertenece"
    ALUMNO_MATERIA {
        int id_alumno FK
        int id_materia FK
    }
```
Reglas:
- ✅ Cumplir 3FN
- ✅ Atomizar datos multivaluados
- ✅ Eliminar toda redundancia mediante tablas puente

Resultado:
- 4FN aplicada

---

## **💡 Beneficios de la Normalización**
1. 🚫 Elimina redundancia de datos
2. 🔄 Facilita actualizaciones (cambios en un solo lugar)
3. 🛡️ Protege la integridad de los datos
4. 💾 Optimiza espacio de almacenamiento
5. ⚡ Reduce complejidad en revisiones
6. 🛑 Previene borrados accidentales
