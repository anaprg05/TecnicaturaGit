# 🌳 **Comandos Git - Viaje en el Tiempo y Ramas**

## ⏳ **Viajando en el Tiempo entre Commits**
Cada commit tiene un **ID único** (hash) que nos permite navegar por el historial.

### 🔍 Comandos clave:
```bash
git checkout <7-primeros-dígitos-hash>  # Ver proyecto en estado pasado
git checkout master                     # Volver al presente (último commit)
```

### 📜 Visualización avanzada del historial:
```bash
git log --raw          # Muestra cambios específicos por commit
git log --oneline      # Resume commits en una línea (hash corto)
git log --oneline -n 5 # Muestra los últimos 5 commits
git log --pretty=format:"%h - %an, %ar : %s"  # Formato personalizado
```

---

## **🌿 Trabajo con Ramas**
- Las ramas son líneas temporales independientes que permiten desarrollar sin afectar la rama principal.

### 🌱 Crear y navegar ramas:
```bash
git checkout -b nueva-rama  # Crea y cambia a nueva rama
git branch                  # Lista todas las ramas
git checkout master         # Vuelve a la rama principal
```

### 📊 Visualización gráfica:
```bash
git log --oneline --all --graph         # Muestra estructura de ramas
git log --oneline --all --graph --decorate  # Versión con decoradores
```

*Ejemplo de salida:*
```
* 1a2b3c4 (HEAD -> nueva-rama) Mensaje commit
| * d5e6f7a (master) Último commit master
|/
* 8h9i0j1 Commit base
```

---

## **🔄 Flujo de Trabajo en Ramas**
1. Crear rama para nuevas funcionalidades/correcciones
2. Trabajar independientemente:
```bash
git add .                 # Preparar cambios
git commit -m "Mensaje"   # Confirmar en la rama
```

3. Visualizar diferencias:
```bash
git diff master..nueva-rama  # Comparar con rama principal
```

---

## **💡 Beneficios de las Ramas**
- 🛡️ Protege tu rama principal (master)
- 🧪 Permite experimentar sin riesgos
- 👥 Facilita el trabajo en equipo
- 🔀 Posibilidad de fusionar (merge) cambios después
