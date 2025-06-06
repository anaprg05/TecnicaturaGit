# 📚 **Wiki en GitHub**

## ¿Qué es una Wiki en GitHub?
- Documentación esencial para proyectos de software
- Incluye manuales de usuario, guías para desarrolladores y documentación técnica
- Parte integral de cualquier proyecto profesional
- Permite llevar el **historial del proyecto** (no confundir con historial de commits)

---

## 🔄 Diferencia entre Commit e Historial
| 🔹 **Commit** | 🔹 **Historial** |
|--------------|-----------------|
| Confirmación de cambios específicos | Evolución completa del proyecto |
| Registro técnico de modificaciones | Documentación narrativa del desarrollo |
| Parte del control de versiones | Parte de la documentación |

---

## 🛠️ **Cómo crear una Wiki en GitHub**

### Requisitos previos
- El repositorio debe ser **público** (Settings → Change repository visibility)

### Pasos para creación:
1. Accede a la pestaña **Wiki** en tu repositorio
2. Haz clic en **Create the first page**
3. Configura tu página:
   - 📝 Asigna un nombre descriptivo
   - ✍️ Escribe la documentación completa
   - 🔗 Añade hipervínculos: `[texto](URL)`
   - 🖼️ Inserta imágenes y otros recursos
4. Usa formato Markdown para:
   ```markdown
   # Encabezados
   - Listas
   **Negritas** y *cursivas*
   ```
5. Previsualiza con Preview
6. Guarda con Save Page

### 🦶 Añadir Footer personalizado
1. Selecciona Add a custom footer
2. Ingresa información del autor/propietario
3. Previsualiza y guarda

---

## **🌐 GitHub Pages**
### Características principales:
- ☑️ Hosting gratuito para contenido estático
- ☑️ Soporta HTML, CSS y JavaScript
- ❌ No soporta backend (PHP, Django, etc.)
- ❌ No apto para testing dinámico

### Configuración:
1. Ve a Settings → Pages
2. Selecciona:
  - Branch: `main`
  - Folder: `/root` (para archivo index.html)
3. Haz clic en Save
  - Accede a tu sitio en: `https://[usuario].github.io/[repositorio]`

> *💡 Nota: Debes ser el propietario del repositorio para habilitar GitHub Pages.*







