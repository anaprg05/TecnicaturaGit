# 🌿 **Git Bash**  

Una herramienta de control de versiones que permite alojar proyectos y gestionar modificaciones de forma sencilla y gráfica.  

*Desarrollada por **Linus Torvalds*** (creador del núcleo Linux).  

---

## 📖 **Definición, clasificación y funcionamiento**  

El **control de versiones** gestiona cambios en elementos de un producto o configuración. Una *versión* es el estado del producto en un momento dado de su desarrollo.  

🔹 **Tipos de sistemas de control de versiones (SCV):**  
- Manual  
- Automatizado (*CVS, Subversion, SourceSafe, ClearCase, Darcs, Bazaar, Plastic SCM, Git, Mercurial, Perforce*)  

### 🧭 **Git como diario de viaje**  
- **Bitácora** que registra cada modificación (*commit*).  
- Permite rastrear historial completo de cambios.  

### 🚀 **Ventajas de Git**  
- Trabajo local sin afectar repositorio principal.  
- Colaboración independiente hasta integración final.  
- Seguimiento optimizado del desarrollo.  

---

## 📜 **Terminología**  

### **Repositorio ("repository")**  
Lugar donde se almacenan datos actualizados e históricos.  

#### 🖥️ **1. Repositorios Locales**  
- Cambios guardados *localmente*.  
- No compartidos con otros.  
- Modelo sencillo (poco recomendable para equipo).  

#### 🌐 **2. Repositorios Centralizados**  
- **Servidor único** gestiona cambios.  
- Menos flexibilidad (decisiones requieren aprobación).  

#### 🔄 **3. Repositorios Distribuidos** *(Más usado)*  
- Cada usuario tiene su repositorio.  
- Sincronización mediante repositorio principal.  

---

## ⚙️ **Comandos para configuración de GIT**  

### `git config`  
Configura comportamiento de Git (*local*, *global* o *system*).  

#### 🔹 **Jerarquía de configuración**  
```bash
Prioridad: Local > Global > System
```

- Local `(--local)`: Solo para el repositorio actual.
- Global `(--global)`: Para todos los proyectos del usuario.
- System `(--system)`: Para todos los usuarios del sistema (requiere admin).

### 🔧 Configuración básica
```bash
git config --local user.name "Nombre Apellido"
git config --local user.email "tuemail@ejemplo.com"
```

### 📋 Ver configuraciones
```bash
git config --list  # Muestra todas las configuraciones
git config --l     # Atajo
```

---

## **🛠️ Crear tu primer repositorio**
1. Listar archivos:
```bash
ls
```

2. Crear carpeta:

```bash
mkdir nombre-del-proyecto
```

3. Entrar a carpeta:
```bash
cd nombre-del-proyecto/
```

4. Inicializar Git:
```bash
git init
```

> *💡 Todos los archivos/carpetas que empiezan con . (punto) están ocultos.*

