# 🌿 **Comandos Git y Trabajo con Git**

## 💾 *Commit*
Un conjunto de cambios confirmados que se almacenan para referencia futura. Los commits se relacionan entre sí formando un historial de cambios.

## 🎯 **El concepto de HEAD**
- Referencia al commit actual en tu repositorio
- Normalmente coincide con el último commit de tu rama actual
- Puede moverse a commits anteriores

## ➖ *Guiones en Git*
| Sintaxis | Uso | Ejemplo |
|----------|-----|---------|
| `-` (un guión) | Opciones cortas | `git checkout -b` |
| `--` (dos guiones) | Opciones largas | `git log --oneline` |

> 📌 **Nota**: `git log` muestra el HEAD indicando tu rama actual

## 🗑️ *Eliminar un commit*
```bash
git reset <hash-del-commit>
```
> Elimina la modificación commiteada manteniendo los cambios en staging

---

## **🌳 Ramas en Git**
### 🔀 Rama principal
- Nombre histórico: `master` (hasta 2020)
- Nombre actual: `main`
- Considerada la rama "definitiva" que va a producción

#### 🛠️ Comandos básicos:
```bash
git checkout -b nombre-rama  # Crea nueva rama
git branch                  # Lista todas las ramas
```

#### 📊 Visualización:
```bash
git log --oneline --all --graph --decorate
```
> Muestra estructura completa de ramas y commits

---

## **🔄 Git Merge**
### 🤝 ¿Qué es?
Comando para fusionar ramas independientes en una sola

### 🔧 Cómo funciona:
1. Encuentra commit base común
2. Crea nuevo commit de fusión
3. Combina cambios secuencialmente

💻 Uso básico:
```bash
git merge nombre-rama  # Fusiona con rama actual
```
> ⚠️ Precaución: Conflictos ocurren cuando se modifican los mismos archivos en ambas ramas

🔙 Deshacer merge:
```bash
git merge --abort
```

🗑️ Eliminar rama:
```bash
git branch -D nombre-rama  # -D debe ser mayúscula
```
> *(No se puede eliminar la rama actual)*

---

## **⚔️ Resolución de Conflictos**
Cuando ocurre un conflicto durante merge:
1. Git marca archivos conflictivos con:

```diff
<<<<<<< HEAD (Current Change)
[cambios actuales]
=======
[cambios entrantes]
>>>>>>> nombre-rama (Incoming Change)
```

2. Editar manualmente el archivo:
  - Decidir qué cambios conservar
  - Eliminar marcadores de conflicto

3. Guardar cambios y completar merge
