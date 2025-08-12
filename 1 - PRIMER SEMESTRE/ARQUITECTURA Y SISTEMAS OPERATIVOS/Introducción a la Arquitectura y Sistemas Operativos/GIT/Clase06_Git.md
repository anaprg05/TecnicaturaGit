# 🌿 **Comandos y Funcionalidades Git**

## 🌳 **Funcionalidades de Ramas**
- **Rama** = Espacio temporal para nuevas funcionalidades
- **Main/Master** = Rama principal del proyecto
- Git permite:
  - Avance cronológico
  - Viaje en el tiempo (consultar versiones anteriores)

### ⏳ *Rama Main como Espacio Temporal*
- Cada commit = punto de avance/nueva funcionalidad
- Cambios se realizan de forma lineal
- **Regla de oro**: Nunca trabajar directamente en Main

> 💡 Las ramas auxiliares permiten probar cambios sin afectar el proyecto principal

---

## 🔄 **Funcionalidad del Merge**
- Unión de rama temporal → Main
- Los commits de la rama auxiliar se integran al historial principal

```bash
git merge nombre-rama
```

---

## **👥 Flujo de Trabajo con Ramas**
### Estructura recomendada:
- Main: Solo para código estable
- Ramas auxiliares: Desarrollo de nuevas features

### Roles:
- Líderes: Únicos autorizados para modificar Main
- Desarrolladores: Trabajan en ramas específicas

### Comandos clave:
```bash
git checkout -b nueva-rama  # Crear rama
git branch                 # Listar ramas
git checkout main          # Volver a main
```

---

## **📛 Git Ignore**
Archivo para excluir archivos/carpetas del tracking:

```bash
.gitignore
```

### Características:
- Archivos ignorados no aparecen en git status
- No se incluyen en `git add`
- Permanecen en tu equipo local

---

## **🏷️ Trabajo con Tags (Versiones)**
### Crear versión:
```bash
git tag v1.0               # Etiqueta simple
git tag -a v1.1 -m "Mensaje"  # Etiqueta con descripción
```

### Gestionar tags:
```bash
git tag                         # Listar tags
git show v1.0                   # Detalles del tag
git tag -d v1.0                 # Eliminar tag
git tag v1.0 <commit-hash>      # Tag en commit específico
```

### Visualización:
```bash
git log --oneline --all --graph  # Ver tags en el historial
```

---

## **🧺 Git Stash (Cambios temporales)**
Guarda cambios pendientes para atender urgencias:
```bash
git stash       # Guardar cambios actuales
git stash pop   # Recuperar cambios guardados
```

Flujo típico:
1. Trabajas en una feature
2. Surge urgencia → `git stash`
3. Atiendes urgencia → commit
4. `git stash pop` → Continúas tu trabajo

---

## **🔄 Resumen de Comandos Clave**
| 🔄 **Acción**          | 💻 **Comando**                   |
|-----------------------|-----------------------------------|
| Crear rama            | `git checkout -b nombre-rama`     |
| Listar ramas          | `git branch`                      |
| Fusionar ramas        | `git merge nombre-rama`           |
| Crear versión         | `git tag v1.0`                    |
| Guardar temporales    | `git stash`                       |
| Ignorar archivos      | Crear `.gitignore`                |
