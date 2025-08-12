# 🗄️ **MySQL**  
## *Gestor de Bases de Datos*  

### 📌 **Definición**  
- Un **Sistema Gestor de Bases de Datos (SGBD)** es un conjunto de programas que permiten el **almacenamiento, modificación y extracción** de información en una base de datos.  
- Es un *software* que nos permite gestionar una base de datos, ya sea **ingresar, crear, eliminar o modificar** datos o la estructura misma de la base.  

---

## 🔧 **Gestores de Bases de Datos**  
Algunos de los gestores más conocidos son:  

![Gestores de Bases de Datos](https://github.com/user-attachments/assets/3df16a85-5fa5-479b-b50a-3e8d1f2aa168)  

---

## 🗃️ **Base de Datos**  
- Es una **unidad** donde se almacena información de manera estructurada.  

### 🔄 **Clasificación**  
Las bases de datos pueden ser:  

#### **1. Relacionales**  
- Tienen un **esquema definido y estable**.  
- Utilizan **identificadores (claves primarias)** para relacionar tablas.  
- Ejemplo: MySQL, PostgreSQL, Oracle.  

#### **2. No Relacionales (NoSQL)**  
- **Sin estructura fija**, orientadas a documentos o objetos.  
- **Flexibles**, sin relaciones predefinidas como en las relacionales.  
- Ejemplo: MongoDB, Cassandra, Redis.  

### ⚖️ **Diferencia entre ambos gestores**  
| **Relacional** | **No Relacional** |  
|---------------|-------------------|  
| Estructura fija | Estructura flexible |  
| SQL como lenguaje | No usa SQL (o lo adapta) |  
| Ideal para datos estructurados | Ideal para datos dinámicos |  

> **Nota:** Es importante elegir el gestor adecuado según el tipo de base de datos que necesitemos.  

---

## 📊 **Conceptos Clave**  

### 🔢 **¿Qué es un dato?**  
- Es una **representación** de una variable (cuantitativa o cualitativa).  
- Puede ser **numérico, alfabético o alfanumérico**.  
- **Ejemplo:**  
  - *Juan tiene 15 años.* → El dato es `15` (valor numérico).  

### 📋 **Tablas**  
- Espacio donde se organiza la información.  
- Compuesta por:  
  - **Columnas (atributos)**  
  - **Filas (registros)**  

### 🏷️ **Entidad**  
- Objeto del mundo real del cual almacenamos datos (ej: *clientes, facturas, productos*).  

### 🔑 **Claves en Bases de Datos**  
| Tipo | Descripción |  
|------|------------|  
| **Primaria** | Identificador único (no repetible). |  
| **Foránea** | Referencia a una clave primaria en otra tabla. |  

#### 🔗 **Relación entre Entidades**  
- Las entidades se vinculan mediante **claves foráneas**.  
- Permiten combinar datos de múltiples tablas.  

---

## 🛠️ **Guía Práctica: Crear una Base de Datos en MySQL**  

1. **Nueva Conexión**  
   - Haz clic en `+` → Asigna un nombre (ej: *Dato*).  
   - Selecciona *Test Connection* e ingresa la contraseña.  

2. **Crear Base de Datos**  
   - Ejecuta: `CREATE DATABASE Datos;`  

3. **Crear Tabla**  
   - Ubícate en la base *Datos* y crea una tabla:  
     ```sql
     CREATE TABLE Estudiantes (
       nombre VARCHAR(50) NOT NULL,
       apellido VARCHAR(50) NOT NULL,
       edad INT NOT NULL
     );
     ```  
   - Configura:  
     - Tipo de dato en `edad`: **INT**.  
     - Marca **NN (NOT NULL)** en todas las columnas.  

4. **¡Listo!**  
   - La tabla `Estudiantes` estará disponible en la base de datos.  

---

✨ **¡Ahora puedes gestionar tus datos de manera eficiente!**  
