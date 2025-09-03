# 📊 Tipos de Análisis de Datos

## 🎯 Introducción

Existen varios tipos de análisis de datos que se pueden aplicar dependiendo de los objetivos y los datos disponibles.

> *"El contenido generado por IA puede ser incorrecto."*

### 📋 Tipos más comunes:
- **Análisis descriptivo**
- **Análisis inferencial** 
- **Análisis predictivo**
- **Análisis de clustering**
- **Análisis de componentes principales**
- **Análisis de asociación**
- **Análisis de segmentación**

> *"El contenido generado por IA puede ser incorrecto."*

---

## 📊 Análisis Descriptivo
**¿En qué consiste?**
Este tipo de análisis se enfoca en describir y resumir los datos. Incluye estadísticas básicas como los medios, la desviación estándar, el rango y la distribución, así como gráficos como histogramas, gráficos de barras y de dispersión.

---

## 🔍 Análisis Inferencial
Este tipo de análisis se enfoca en hacer inferencias acerca de una población a partir de una muestra de datos. Incluye técnicas como la regresión, la conexión y los análisis de varianza.

---

## 🔮 Análisis Predictivo
Este tipo de análisis se enfoca en utilizar los datos históricos para hacer predicciones sobre el futuro. Incluye técnicas como:
- Regresión lineal
- Regresión logística  
- Análisis de series temporales
- Algoritmos de aprendizaje automático

---

## 🧠 Análisis Prescriptivo
Utiliza tecnología y prácticas de datos de vanguardia. Requiere un gran compromiso organizacional y las empresas deben estar preparadas para invertir el esfuerzo y recursos necesarios.

### 🤖 La IA como ejemplo
La IA es un ejemplo perfecto de análisis prescriptivo. Los sistemas de IA:
- Consumen grandes cantidades de datos para aprender continuamente
- Utilizan esta información para tomar decisiones informadas
- Pueden comunicar decisiones e implementarlas
- Optimizan procesos de negocio sin intervención humana

> *"El contenido generado por IA puede ser incorrecto."*

### 🏢 Adopción en la industria
Empresas líderes (Apple, Facebook, Netflix, etc.) utilizan análisis prescriptivo e IA para mejorar la toma de decisiones. A medida que la tecnología avance, más empresas se adentrarán en el mundo de los datos.

> *"El contenido generado por IA puede ser incorrecto."*

---

## 🎯 Análisis de Clustering
> *"El contenido generado por IA puede ser incorrecto."*

Se enfoca en identificar grupos o clusters similares en los datos. Incluye técnicas como:
- Agrupamiento por k-medias
- Agrupación jerárquica

---

## 📊 Análisis de Componentes Principales
Se enfoca en reducir la dimensionalidad de los datos y extraer las características más importantes. Incluye técnicas como:
- Componentes principales
- Análisis de componentes independientes

---

## 🔗 Análisis de Asociación
Se enfoca en identificar las relaciones entre las variables en los datos. Incluye técnicas como:
- Regla de asociación de Apriori
- Minería de datos

---

## 👥 Análisis de Segmentación
> *"El contenido generado por IA puede ser incorrecto."*

Se enfoca en segmentar una población en grupos más pequeños y similares. Incluye técnicas como:
- Segmentación de clientes
- Segmentación de mercado

---

## 🔄 Conexión entre las Etapas

Cada etapa se construye sobre la anterior:

1. **Descriptiva** → Describes el problema
2. **Diagnóstica** → Analizas sus causas  
3. **Predictiva** → Predices posibles escenarios
4. **Prescriptiva** → Decides qué acciones tomar

> ⚠️ Es crucial seguir este orden lógico

---

## ❓ Preguntas por tipo de análisis

| Tipo | Temporalidad | Pregunta clave |
|------|-------------|----------------|
| **Descriptiva** | PASADO | ¿Qué sucedió? |
| **Diagnóstica** | PASADO | ¿Por qué pasó? |
| **Predictiva** | FUTURO | ¿Qué podría pasar? |
| **Prescriptiva** | FUTURO | ¿Qué debería hacerse? |

---

## ⚠️ Importante
Estos tipos de análisis no son excluyentes y a menudo se combinan para lograr una comprensión más completa de los datos.

---

# 🧠 POO: PILARES DE PROGRAMACIÓN ORIENTADA A OBJETOS

## 🧬 HERENCIA

Consiste en heredar características de una clase Padre a una clase Hija, incluyendo atributos y métodos.

### 💡 Ejemplo práctico:
- **Clase padre**: Vehículo
- **Clase hija**: Motocicleta  
- **Clase hija**: Autobus

### 🚗 Clase Padre (SuperClase)
**Atributos:**
- marca
- modelo
- velocidad
- año

**Métodos:**
- dar_velocidad()
- reducir_velocidad()

### 🔄 Funcionamiento de la herencia
- **Superclase**: Clase base o padre
- **Subclase**: Clase derivada o hija
- Cada subclase hereda características de la superclase
- Implementación varía según el lenguaje

### 🚌 Clases Hijas
Heredan atributos y métodos de la clase padre y añaden características específicas:

**Autobus añade:**
- Atributos: número_de_asientos, peso_máximo
- Métodos: hora_de_salida()

**Motocicleta añade:**
- Atributos: número_de_ruedas
- Métodos: usar_casco()

### ✅ Beneficios de la herencia
- Extiende y modifica comportamiento de clases base
- **Reutilización de código**: Mejora eficiencia y mantenibilidad
- **Jerarquías claras**: Facilita comprensión de la estructura

### 🐍 Ejemplo en Python
```python
class Animal:
    def __init__(self, nombre):
        self.nombre = nombre
    
    def hacer_sonido(self):
        pass  # Método base

class Perro(Animal):
    def hacer_sonido(self):
        return "Woof!"  # Implementación específica
```
