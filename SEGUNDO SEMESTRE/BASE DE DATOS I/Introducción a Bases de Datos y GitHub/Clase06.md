# 📊 **RDB, RDBMS e Introducción a MySQL**  

## 🔍 ¿Qué es RDB y RDBMS?  

### 🛠️ **RDBMS (Relational Database Management System)**  
Es un programa que se encarga de cumplir las reglas de códigos. Hay diferentes tipos de manejadores de datos relacionales, como:  
- Oracle  
- PostgreSQL  
- MySQL  

---  

## 🔄 **Diferencia entre RDB y RDBMS**  

### 🗃️ **RDB (Base de Datos Relacional)**  
Es un conjunto de datos perteneciente a un mismo contexto que guarda información para un posterior uso en forma **persistente**.  

### 💻 **RDBMS (Sistema Manejador)**  
- Nos permite acceder a nuestra base de datos.  
- Es un *software* o herramienta que sirve de conexión entre la base de datos y el usuario.  
- Nos presenta una interfaz para poder gestionarla.  

---  

## 🐬 **MySQL**  
Es un sistema **open source** de administración de bases de datos, desarrollado y soportado por **Oracle**.  

### 📜 **Su Origen**  
- MySQL fue lanzado originalmente en **1995**.  
- Pasó por varios cambios de propiedad antes de ser adquirido por **Oracle Corporation** en **2010**.  
- Sigue siendo **software open source**, lo que significa que puede ser usado y modificado libremente.  

#### ✨ **Curiosidad**  
El nombre proviene de:  
- **"My"**: nombre de la hija del co-fundador.  
- **"SQL"**: abreviatura de *Structured Query Language*.  

---  

### 📂 **Bases de Datos Relacionales**  
MySQL utiliza un enfoque llamado **base de datos relacional**, donde los datos se dividen en **tablas separadas** en lugar de almacenarse en una sola unidad.  

#### 🔑 **Ejemplo Práctico**  
Supongamos que queremos almacenar:  
1. **Clientes**: nombre, dirección, detalles, etc.  
2. **Pedidos**: productos comprados, precio, cliente asociado, etc.  

🔹 **Problemas de almacenarlos juntos**:  
- Datos distintos y duplicados.  
- Falta de organización.  

✅ **Solución**:  
- Tablas separadas para **clientes** y **pedidos**.  
- Uso de **llaves** (IDs únicos) para relacionar los datos.  

> *"La llave – el número ID – es lo que conecta todo. Así es como se 'relacionan' los datos, aunque estén en tablas diferentes."*  

![Ejemplo de tablas relacionadas](https://github.com/user-attachments/assets/ffca5d6b-5522-41da-a2a7-fd52b7b9bf1f)  

---  

### ⚙️ **Modelo Cliente-Servidor**  
MySQL sigue el modelo **cliente-servidor**:  
- **Servidor**: almacena los datos.  
- **Cliente**: solicita datos mediante consultas **SQL**.  

#### 🔄 **Ejemplo en WordPress**  
Cuando un usuario visita un blog:  
1. Consulta `wp_posts` para obtener el contenido.  
2. Consulta `wp_users` para información del autor (usando la llave de relación).  

---  

## 📜 **SQL vs. NoSQL**  

### 🔷 **SQL**  
- Lenguaje estándar para consultar bases de datos relacionales.  
- Permite operaciones flexibles y potentes.  
- Ampliamente utilizado en la historia de la informática.  

### 🔶 **NoSQL**  
- Evolución más compleja, basada en SQL.  
- Optimizado para manejar grandes volúmenes de datos no estructurados.  
- Ofrece mayor escalabilidad en ciertos escenarios.  
