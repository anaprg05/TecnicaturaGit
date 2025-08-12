# 🗑 **Eliminar Ramas en GitHub**

---

## 🛠 **Eliminación Manual de Ramas**

### 📝 Pasos a seguir:
1. **Ir** a la página principal del repositorio
2. **Hacer clic** en `Branch/Rama` (encima de la lista de archivos)
3. **Buscar** la rama a eliminar
4. **Hacer clic** en el icono de basura 🗑
5. **Confirmar** la eliminación

> 💡 *Verás una notificación confirmando la acción realizada*

---

## ⚡ **Eliminación Automática de Ramas**

### 🔧 Configuración:
1. Ir a `Settings/Configuración`
2. Navegar hasta "Solicitudes de extracción"
3. Activar/desactivar:
   ```markdown
   [✓] Eliminar automáticamente las ramas principales
   ```
Requisitos:
- 🔒 Necesitas permisos de administrador
- ⚙️ Configurable por repositorio

---

## **🛡 Ramas Protegidas**
Características principales:
- 🔐 Protección contra eliminación
   -Los colaboradores no pueden borrar ramas protegidas
- � Restricciones de push
  - No se permiten pushes forzados
- ✔ Requisitos para merge
  - Pueden incluir:
    - ✅ Revisiones aprobatorias
    - ✔ Checks de CI
    - ✍️ Firmas de commits

> *Nota: Solo administradores pueden configurar protecciones*
