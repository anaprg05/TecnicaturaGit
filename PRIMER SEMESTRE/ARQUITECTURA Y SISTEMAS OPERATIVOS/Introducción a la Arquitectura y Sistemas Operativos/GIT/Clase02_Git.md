# 🌿 **Comandos Git - Mi Primer Repositorio**  

## 📚 *Conceptos Generales*  
Sistema de control de versiones que permite:  
✔ Ver estado del proyecto  
✔ Rastrear cambios por archivo/autor  
✔ Restaurar versiones anteriores  

### 🔄 *¿Qué es una versión?*  
Conjunto de nuevas funcionalidades disponibles para el usuario final.  

### 💾 *Commit*  
- Registro de cambios en un momento específico.  
- Si un archivo no cambia, Git reusa la versión anterior.  

---

## 🌿 **RAMAS**  

### 🌳 *¿Qué es una Rama?*  
- Conjunto de commits interconectados con cambios independientes.  
- **Ramas auxiliares**:  
  - Punteros ligeros que divergen de la rama principal (*master*).  
  - Permiten trabajar en cambios temporales sin afectar el proyecto principal.  
  - Protegen el código estable en caso de errores.  

### ⏳ *Viaje en el tiempo*  
Git permite navegar el historial de cambios como una línea temporal.  

---

## 🏗️ **Estados de Git**  
Tres espacios clave:  
1. **Espacio de trabajo** (Working Directory)  
2. **Área de preparación** (Staging Area)  
3. **Repositorio** (Carpeta `.git`)  

---

## 🔄 **Flujo de Trabajo en Git**  
1. **Editas** archivos en tu directorio.  
2. **Preparas** cambios con `git add`.  
3. **Confirmas** con `git commit` (guarda instantánea permanente).  

---

## 📂 **Espacios Clave**  

### 🖥️ *Espacio de Trabajo*  
- Archivos visibles en la carpeta.  
- Cambios aún no confirmados ni rastreados por Git.  

### 📥 *Área de Preparación (Staging)*  
```bash
git add <archivo>  # Añade archivos al staging
git rm --cached <archivo>  # Remueve del staging
git reset  # Limpia el área
```
- Zona temporal ("memoria caché") antes del repositorio.
- Archivos listos para commit aparecen en verde (git status).

### 📦 *Repositorio (Carpeta .git)*
- Almacena historial completo de cambios.
- Confirmación final con:
```bash
git commit -m "Mensaje descriptivo"
```

---

## **🛠️ Comandos Esenciales**
### *🧹 Limpieza*
```bash
Ctrl + L  # Limpiar terminal
clear     # Alternativa
q         # Salir de vistas
```

### *📜 Ayuda y Configuración*
```bash
git --help branch  # Manual de Git
```

### *🔍 Git Status*
```bash
git status  # Muestra:
            # - Archivos modificados (rojo)
            # - Archivos en staging (verde)
```

### *📜 Git Log*
```bash
git log  # Muestra historial de commits con:
         # - ID único
         # - Autor/fecha
         # - Mensaje
```

---

## **📝 Editor Vim (para commits)**
1. Se abre automáticamente al ejecutar `git commit`.
2. Primera línea sin `#`: Escribe el mensaje del commit.
3. Comandos útiles:
  - Guardar: `Ctrl + S` o `:w`
  - Salir: `Ctrl + X`

> *💡 Si no se escribe mensaje, no se crea el commit.*

---

## **🚀 Guía Paso a Paso**
### Pasos para primer commit
1. Preparar archivos:
```bash
git add .  # Añade todo
git add <archivo>  # Añade específico
```

2. Verificar estado:
```bash
git status  # Archivos verdes = listos
```

3. Crear commit:
``` bash
git commit -m "Mi primer commit"  # Opción rápida
```
o
```bash
git commit  # Abre Vim para mensaje
```

4. Revisar historial:
```bash
git log
```
