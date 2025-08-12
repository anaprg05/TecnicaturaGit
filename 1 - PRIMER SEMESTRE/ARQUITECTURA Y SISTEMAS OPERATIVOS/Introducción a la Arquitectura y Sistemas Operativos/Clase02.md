# 🏛️ Introducción a la Arquitectura de Sistemas

## 🔍 ¿QUÉ SIGNIFICA ARQUITECTURA?

- **EL ARTE O LA CIENCIA DE LA CONSTRUCCIÓN** ESPECÍFICAMENTE:  
  📐 EL ARTE O LA PRÁCTICA DE DISEÑAR Y CONSTRUIR ESTRUCTURAS Y ESPECIALMENTE LAS HABITABLES.

---

## 💻 ARQUITECTURAS DE LOS SISTEMAS OPERATIVOS

🔄 La arquitectura de los sistemas operativos ha ido evolucionando de la mano del desarrollo del hardware de los sistemas informáticos. Ambas partes no pueden funcionar de forma aislada y dependen la una de la otra.

---

## 🧅 SISTEMAS CON CAPAS O ANILLOS

```ascii
    ┌────────────────┐
    │  Interfaz de   │
    │     Usuario    │
    ├────────────────┤
    │ Sistema de     │
    │   Archivos     │
    ├────────────────┤
    │ Entrada/Salida │
    ├────────────────┤
    │  Manejo de     │
    │   Memoria      │
    ├────────────────┤
    │     Núcleo     │
    └────────────────┘
```

### Estructura Jerárquica:
1. **Núcleo** (base)
2. **Manejo de Memoria**
3. **Entrada/Salida**
4. **Sistema de Archivos**
5. **Interfaz de Usuario** (superior)

- *Presentan estructura en niveles*: Cada capa solo se comunica con la inmediata superior/inferior  
- ✅ Ventaja: Estructura bien definida que facilita corrección de errores  
- ❌ Desventaja: Puede ser lento y complejo de implementar  
- Ejemplos históricos: THE y MULTICS (actualmente en desuso)

---

### 🏗️ CAPAS DETALLADAS

#### 1. **NÚCLEO (Kernel)** 🧠
- Gestiona todos los procesos activos  
- Ejemplo destacado: Windows XP usó núcleo UNIX  

#### 2. **MANEJO DE MEMORIA** 🧠
- Administra memoria RAM y memoria virtual  

#### 3. **ENTRADA/SALIDA** 💾
- Gestiona lectura/escritura en disco  

#### 4. **SISTEMA DE ARCHIVOS** 📂
- Organiza información en archivos  

#### 5. **INTERFAZ DE USUARIO** 👨💻
- CLI (Línea de comandos) o GUI (Interfaz gráfica)  

---

## 🔄 COMPARATIVA DE ARQUITECTURAS

### 🗿 MONOLÍTICOS
- **Característica**: Todo funciona en modo supervisor  
- **Pros**: Alto rendimiento  
- **Contras**: Difícil mantenimiento  
- **Ejemplos**: DOS, UNIX antiguo, Ubuntu  

### 🧩 MICROKERNEL  
- **Característica**: Mínimas funciones en núcleo  
- **Pros**: Mayor seguridad  
- **Contras**: Sobre carga de procesos  
- **Ejemplo**: MINIX  

### ⚡ HÍBRIDOS  
- **Característica**: Combina ambos enfoques  
- **Ejemplos**: Windows NT, macOS  

---

## 📦 COMPONENTES PRINCIPALES
- 📄 Gestión de archivos  
- 🔄 Gestión de procesos  
- ⌨️ Dispositivos E/S  
- 🌐 Redes  
- 🧠 Memoria principal  
- 💾 Almacenamiento  
- 🔒 Seguridad  

---

## 🏆 TOP 5 SISTEMAS OPERATIVOS
1. 🪟 Windows  
2. 🍎 macOS  
3. 🐧 Linux  
4. 🤖 Android  
5. 📱 iOS  
