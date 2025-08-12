# 🔄 **Diferencias al clonar un repositorio**

- ⚡ **Descargar ZIP** (desde Code → Download ZIP):
  - Descarga solo el **código fuente**
  - ❌ No incluye el repositorio completo (sin historial Git)
  
- 🛠️ **Clonar con Git** (`git clone`):
  ```bash
  git clone https://github.com/usuario/repositorio.git
  ```
- ✅ Descarga repositorio completo (copia exacta del remoto)
- Incluye todo el historial de commits y ramas

---

## **✏️ Modificación de un commit en GitHub**
1. Ve a Commits en tu repositorio
2. Selecciona el commit a modificar
3. Identificación:
      - 🔵 Commit remoto: aparece con nombre de cuenta GitHub
      - 💻 Commit local: aparece con datos del repositorio local
4. Tras modificar, el commit aparecerá en línea roja

---

## **🌿 Actualizar rama nueva de GitHub a local**
### 🔄 Paso 1: Actualizar repositorio
```bash
git pull
```

### 🔍 Paso 2: Ver ramas disponibles
```bash
git branch
```

### ➕ Paso 3: Añadir rama remota
```bash
git checkout nombre-rama-aux
```

### 👀 Paso 4: Ver cambios
```bash
git log --oneline --decorate
```

---

## **🤝 Proceso de Merge (Pull Request)**
1. Se crea Pull Request en GitHub
2. Requiere aprobación del owner/maintainer
3. Examen del código → Aprobación → Merge
4. Opcional: Eliminar rama (botón Delete en GitHub)

---

## **🧹 Eliminar rama localmente**
1. Cambiar a rama principal:
```bash
git switch main
```

2. Eliminar rama auxiliar:
```bash
git branch -d nombre-rama-aux
```

3. Verificar estado final:
```bash
git log --all --oneline --decorate
```

> *💡 Nota: Git no siempre actualiza automáticamente los cambios locales tras un pull.*
