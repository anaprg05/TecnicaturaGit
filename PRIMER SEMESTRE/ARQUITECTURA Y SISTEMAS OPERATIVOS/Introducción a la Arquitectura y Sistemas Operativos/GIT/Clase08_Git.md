# 🌿 **COMANDOS GIT Y RAMAS AUXILIARES**

## 🌱 *Inicio de la Rama Main*
- Se crea automáticamente al inicializar un repositorio
- **Configuración inicial obligatoria**:
  ```bash
  git config --global user.name "Tu Nombre"
  git config --global user.email "tu@email.com"
  ```

## **🔄 Flujo Básico de Trabajo**
1. Añadir cambios
```bash
git add .  # Mueve modificaciones al área de staging
```
> *📌 No se puede saltar este paso para enviar al repositorio*

2. Confirmar cambios
```bash
git commit -m "Mensaje descriptivo"
```
- Archivos en verde = listos para commit
- Requiere configuración previa de usuario/correo

📊 Visualización Avanzada
```bash
git log  # Muestra commits básicos
git log --oneline --all --graph --decorate  # Versión completa con:
                                           # - Ramas
                                           # - Tags
                                           # - Estructura gráfica
```

### 🏷️ Control de Versiones (Tags)
```bash
git tag  # Lista todas las versiones
git tag -d v1.0  # Elimina versión (si es necesario)
```
- Permiten dividir el proyecto en etapas
- Flexibilidad para crear/eliminar

## **🌿 Ramas Auxiliares**
### Beneficios clave:
- 🛡️ Protegen la rama Main
- 🧪 Permiten experimentar sin riesgos
- 🔄 Se pueden eliminar después del merge
- ✔️ Facilitan la revisión de cambios

### Buenas prácticas:
1. Crear rama para cada feature/corrección
```bash
git checkout -b nueva-feature
```
2. Trabajar independientemente
3. Fusionar a Main cuando esté listo
4. Eliminar rama auxiliar después
