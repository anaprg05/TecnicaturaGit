# 🍴 **FORK**

## ¿Qué es un Fork?
- Es una **copia de un repositorio público** que puedes llevar a tu cuenta de GitHub para trabajar en él.

## 🛠️ Proceso para hacer un Fork
1. Busca un proyecto público en GitHub
2. Haz clic en el botón **Fork**
3. Selecciona **Create Fork** para copiar el proyecto a tu cuenta

## 📥 Clonar el Fork localmente
```bash
mkdir nombre-repositorio
cd nombre-repositorio
git clone https://github.com/tu-usuario/repositorio-forkeado.git
```

## **🔍 Ver historial de commits**
```bash
git log --oneline --all
```

### ✨ Añadir cambios
1. Crear nuevo archivo:
```bash
touch "nombre.ext"
```

2. Subir cambios:
```bash
git push
```

---

## **🐞 ISSUES**
### ¿Para qué sirven?
- Rastrear ideas, feedback, tareas o bugs
- Alertar a desarrolladores sobre errores
- Organizar el trabajo del equipo (especialmente testers)

### 🏷️ Crear un Issue
1. Selecciona New Issue
2. Completa:
  - Título (ej: "Bug en script.js")
  - Descripción detallada
  - Asignar responsable
  - Seleccionar Labels (etiquetas)

### 🎨 Crear Labels personalizados
1. Ve a Labels → New Label
2. Completa:
  - Nombre (ej: "Función sin retorno")
  - Descripción
  - Color distintivo

### 🗓️ Milestones
Funcionalidad que permite:
- Establecer plazos para resolver issues
- Organizar el flujo de trabajo

Crear un Milestone:
1. New Milestone
2. Completa:
  - Título (ej: "Solventar bug de función")
  - Fecha límite
  - Descripción del objetivo

---

> *💡 Consejo: Usa milestones para gestionar sprints o hitos importantes en tu proyecto.*
