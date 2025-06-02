# 🌿 **GIT - Manejo de Modificaciones**

## 📂 **Modificaciones de Carpetas**

### 🔄 ¿Qué pasa al modificar archivos commiteados?
- Archivos nuevos/modificados aparecen en **rojo** con `git status`.
- Verifica cambios antes de proceder:

```bash
git status
```

## **🚀 Proceso para actualizar cambios:**
1. Añadir al staging area:
```bash
git add .              # Todos los archivos
git add <nombre-archivo>  # Archivo específico
```

2. Confirmar cambios:
  - Mensaje corto:
```bash
git commit -m "Descripción breve"
```

  - Mensaje extenso (abre editor Vim):
```bash
git commit
```

- Comandos Vim:
  1. Guardar: `Ctrl + S` o `:w`
  2. Salir: `Ctrl + X` o `Esc + :wq!`

---

## **🔍 Diferenciar Archivos vs Carpetas**
## En terminal Git Bash:
- `/nombre-archivo` → Archivo
- `../` → Carpeta superior/subdirectorio

---

## **💾 Guardar Modificaciones**
- Para archivos existentes:
```bash
git commit -am "Agregué una línea a mi repositorio"
```
> *⚠ No funciona con archivos nuevos.*

### 📝 Crear nuevo archivo:
- Usa cualquier editor:
  - Visual Studio Code
  - Sublime Text
  - Bloc de notas

---

⚠ Precauciones con `git add .`
- Solo afecta archivos en la carpeta **actual**.
- Ejemplo: En `subcarpeta/`, no añade archivos de otras ubicaciones.

---

## **📜 Visualizar Historial**
```bash
git log   # Muestra línea de commits
q         # Salir del historial
```

---

## **🔄 Comandos Avanzados**
### ↩️ Deshacer Cambios
- Archivos modificados:
```bash
git checkout <archivo>  # Elimina cambios locales
git checkout -f         # Borra TODOS los cambios recientes
```
> *No aplica para archivos nuevos.*

- Quitar del staging:
```bash
git restore --staged <archivo>  # Vuelve al área de trabajo
```

### 🔍 Comparar Cambios (git diff)
- Modificaciones detalladas:
```bash
git diff
```

- Resumen estadístico:
```bash
git diff --stat       # Cambios por archivo
git diff --numstat    # Líneas añadidas/eliminadas
```
