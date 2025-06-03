# 🌐 **VIRTUALIZACIÓN**  
**La virtualización** es un proceso que permite una utilización más eficiente del hardware físico de la computadora y es la base de la computación en la nube.  

---

## 🛠 **¿Cómo funciona?**  
- El software de virtualización crea una **capa de abstracción** sobre el hardware de la computadora.  
- Permite dividir los elementos de hardware (procesadores, memoria, almacenamiento, etc.) en **múquinas virtuales (VM)**.  
- Cada VM ejecuta su propio **sistema operativo (SO)** y se comporta como una computadora independiente.  

---

## 💡 **Beneficios**  
### 🏢 **Para las empresas**  
- Mayor eficiencia en el uso del hardware.  
- Retorno de inversión optimizado.  
- Permite a proveedores de la nube ofrecer servicios con infraestructura física existente.  

### 🖥 **Para operadores de datos y proveedores de servicios**  
- **Eficiencia de recursos**: Ejecuta múltiples aplicaciones en VMs independientes sin sacrificar confiabilidad.  
- **Máxima utilización** del hardware físico.  

---

## 📊 **Su Gestión**  
- **Gestión más sencilla**: Las VMs definidas por software permiten flujos de trabajo automatizados.  
  - Ejemplo: Plantillas de software para implementar servicios sin configuración manual.  
- **Tiempo de inactividad mínimo**:  
  - Ejecución de VMs redundantes para migración por error.  
- **Aprovisionamiento más rápido**:  
  - Automatización mediante software de gestión.  

---

## 🛠 **Soluciones**  
Empresas líderes en virtualización:  
- **VMware**: Virtualización de servidores, desktop, redes y almacenamiento.  
- **Citrix**: Virtualización de aplicaciones, servidores y desktop.  
- **Microsoft (Hyper-V)**: Virtualización de servidores y desktop integrada en Windows.  

---

## 🖥 **Máquinas virtuales (VM)**  
Entornos virtuales que simulan computación física mediante software. Incluyen:  
- Configuración de la VM.  
- Almacenamiento virtual.  
- Instantáneas (snapshots) para conservar estados.  

---

## 🔧 **Hipervisores**  
Capa de software que coordina las VMs. Funciones:  
- Interfaz entre VMs y hardware físico.  
- Garantiza asignación de recursos sin interferencias.  

### 📌 **Tipos de hipervisores**  
1. **Tipo 1 (Bare-metal)**:  
   - Reemplaza el SO tradicional.  
   - Usado en servidores virtuales.  
2. **Tipo 2**:  
   - Se ejecuta como aplicación en un SO existente.  
   - Usado en dispositivos de punto final (ej: ejecutar SO alternativos).  

---

## 🗂 **Tipos de virtualización**  
- Virtualización de desktop.  
- Virtualización de red.  
- Virtualización de almacenamiento.  
- Virtualización de datos.  
- Virtualización de aplicaciones.  
- Virtualización del centro de datos.  
- Virtualización de CPU.  
- Virtualización de GPU.  
- Virtualización de Linux.  
- Virtualización en la nube.  

---

## 🚀 **Las VMs en distintos entornos**  
- **PCs**: Ejecutar SO alternativos (ej: Windows en Mac).  
- **Servidores locales**: Consolidar múltiples servidores físicos.  
- **Cloud computing**: Escalabilidad bajo demanda (IaaS).  

> *"Las VMs proporcionan entornos aislados, ideales para flexibilidad y eficiencia en TI."*  

---

## ⚖ **DIFERENCIA: Virtualización vs. Contenedores**  
| **Virtualización** | **Contenedores** |  
|--------------------|------------------|  
| Emula hardware completo. | Comparte kernel del SO host. |  
| SO completo por VM. | Solo ejecuta app + dependencias. |  
| Mayor aislamiento. | Más liviano y rápido. |  
| Ideal para SO múltiples. | Ideal para microservicios/cloud. |  

### 📦 **¿Qué es un contenedor?**  
- Aísla aplicaciones y dependencias (sin emular hardware).  
- Usa orquestadores como **Kubernetes** o **Docker**.  

---

## 🐳 **¿Qué es Docker?**  
Plataforma para desarrollar, enviar y ejecutar aplicaciones distribuidas en contenedores.  

### 🔑 **4 componentes clave**  
1. **Containers**: Entorno de ejecución aislado.  
2. **Image**: Artefacto para empaquetar/distribuir contenedores.  
3. **Data Volumes**: Acceso seguro al sistema de archivos del host.  
4. **Network**: Comunicación entre contenedores/exterior.  

### 🏗 **Arquitectura Docker**  
- **Cliente-Servidor** (API REST).  
- **Componentes**:  
  - **Servidor** (`dockerd`): Gestiona imágenes, contenedores, redes.  
  - **API Rest**: Interfaz para comandos.  
  - **Cliente** (`docker`): CLI para gestionar el ciclo de vida.  

### 📚 **Registros Docker**  
- Almacenan imágenes (ej: **Docker Hub**).  
- Algunas imágenes están certificadas por Docker.  
