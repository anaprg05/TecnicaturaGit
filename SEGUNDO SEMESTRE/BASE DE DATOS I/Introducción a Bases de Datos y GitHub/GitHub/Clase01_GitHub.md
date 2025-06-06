# 👥 **INVITANDO A COLABORADORES AL REPOSITORIO**

Una forma de trabajar más eficiente en **GitHub** es invitando a otros desarrolladores a colaborar en un proyecto.​

---

## 🛠️ **¿CÓMO LO REALIZAREMOS?**

1. **Accede** a tu repositorio `Hola-Mundo` en GitHub y selecciona ⚙️ **Settings**.
2. En el menú lateral, elige 👥 **Collaborators**.
3. **Agrega colaboradores** mediante:
   - Su correo electrónico  
   - Su nombre de usuario en GitHub  

> 📬 Una vez enviada la invitación, el colaborador recibirá un correo y deberá **aceptar** la invitación.

✅ **Cuando la invitación sea aceptada**, el colaborador aparecerá en la lista con acceso al repositorio.

---

## 🏷️ **¿CÓMO SUBIR TAGS A GITHUB?**

GitHub no sube automáticamente las **tags** (etiquetas de versión).  
Para subirlas, sigue estos pasos desde **Git Bash**:

### 🔄 **Subir tags al repositorio remoto**
```bash
git push --tags
```

## **🔍 Verificar tags locales**
```bash
git log --oneline
```

### 📌 Pasos completos:
1. Verifica tus tags locales con `git log --oneline.`
2. Usa `git push --tags` para subirlas a GitHub.
3. Actualiza tu repositorio en GitHub y ¡las tags aparecerán! 🎯

