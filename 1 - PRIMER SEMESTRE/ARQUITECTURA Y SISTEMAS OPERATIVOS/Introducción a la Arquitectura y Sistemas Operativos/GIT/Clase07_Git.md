# 💻 **Comandos Git Esenciales**

## 📝 **Sintaxis en Git**
- El símbolo `~` representa el **path absoluto** (ruta completa) del usuario actual  
  *Ejemplo:*  
  ```bash
  NombreUsuario@nattylucero ~ (master)
  ```

## **🛠️ Guía de Comandos Básicos**
| Comando | Función                     | Variantes                     |
|---------|-----------------------------|-------------------------------|
| `pwd`   | Muestra ruta actual         | -                             |
| `cat`   | Ver contenido de archivos   | -                             |
| `cd`    | Navegar entre directorios   | `cd ..`<br>`cd -`             |
| `ls`    | Listar archivos             | `ls -l` (vista detallada)     |
| `clear` | Limpiar terminal            | -                             |

---

## **🗃️ Repositorios Git**
### ¿Qué ocurre al crear un repositorio?
- Se crea una carpeta oculta `.git` en tu directorio de usuario
- Contiene toda la metadata del control de versiones

### ⚙️ Configuración Inicial
```bash
git config --global user.name "Tu Nombre"
git config --global user.email "tu@email.com"
```
> *Importante: Configurar antes del primer commit*

---

## **🔄 Los 3 Estados de Git**
1. Working Directory (Modificaciones locales)
2. Staging Area (`git add`)
3. Repository (`git commit`)

---

## **💾 Comandos Clave**
```bash
git add .         # Añade todos los cambios
git commit -m "mensaje"  # Confirma cambios con descripción
```

---

## **🌿 Trabajo con Ramas**
### Estructura básica
- Master/Main: Rama principal (solo código estable)
- Ramas auxiliares: Para desarrollo/experimentación

### 🔧 Comandos de Ramas
```bash
git branch                  # Lista ramas
git checkout -b nueva-rama  # Crea rama nueva
git merge nombre-rama       # Fusiona ramas
```

### 🏷️ Versionado (Tags)
```bash
git tag v1.0              # Crea versión
git tag -d v1.0           # Elimina versión
```

---

## **💡 Buenas Prácticas**
- Nunca trabajar directamente en `master`
- Eliminar ramas auxiliares después de fusionar
- Usar tags para versiones importantes
- Los líderes aprueban cambios a `master`






