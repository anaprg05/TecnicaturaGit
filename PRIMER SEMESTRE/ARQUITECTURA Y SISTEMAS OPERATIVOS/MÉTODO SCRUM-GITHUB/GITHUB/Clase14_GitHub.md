# 🔄 **Comandos de Sincronización en GIT**

---

## ⬇ **Git Pull**  
### _¿Qué hace este comando?_  
- Descarga automáticamente los últimos cambios del repositorio remoto  
- Sincroniza tu versión local con los cambios en GitHub  

```bash
git pull
```

Flujo típico:
1. Tus colaboradores suben cambios a GitHub
2. Ejecutas git pull en tu terminal
3. ¡Tu repositorio local se actualiza!

---

## **🔍 Git Fetch**
*Diferencia clave con Pull*
- Solo verifica los cambios remotos
- No aplica automáticamente los cambios a tu código
- Perfecto para revisar actualizaciones antes de integrarlas
```bash
git fetch
```

¿Cuándo usarlo?
- Cuando quieres inspeccionar cambios antes de fusionarlos
- Para comparar diferencias entre local y remoto
- Antes de hacer `git pull` para evitar sorpresas

---

## **📊 Comparación Rápida**
| Comando | Acción                | Afecta tu código |  
|---------|-----------------------|------------------|
| `pull`  | Descarga **y fusiona** | ✅ Sí            |
| `fetch` | Solo **detecta** cambios | ❌ No          |

> *💡 Tip: Usa `git fetch` + `git diff` para revisar cambios antes de hacer `pull`*
