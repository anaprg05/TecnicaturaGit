# 📊 Introducción al Análisis de Datos

## ❓ ¿Por qué debería hacer un análisis exploratorio de datos?

### 🔍 Razones para realizar un análisis exploratorio de datos

#### 📋 Organizar y entender las variables
- Identificar los distintos tipos de variables (categóricas, continuas, etc.)
- Determinar qué tipo de análisis puedes realizar con ellas

> *"El contenido generado por IA puede ser incorrecto."*

#### 🔗 Establecer relaciones entre variables
- Descubrir si las variables cambian al analizarse juntas
- Identificar asociaciones o patrones ocultos en los datos que podrían pasar desapercibidos

> *"El contenido generado por IA puede ser incorrecto."*

#### 📈 Seleccionar el modelo adecuado
- Un AED te ayuda a identificar qué variables son útiles y cómo están relacionadas
- Esto evita construir modelos deficientes y asegura que el modelo seleccionado sea el más adecuado para la tarea

> *"El contenido generado por IA puede ser incorrecto."*

#### ✅ Tomar decisiones fundamentadas
- Las decisiones basadas en datos son más confiables
- Un AED te permite fundamentar tus decisiones en patrones, relaciones y análisis sólidos

> *"El contenido generado por IA puede ser incorrecto."*

---

## 🚀 PASOS PARA REALIZAR UN ANÁLISIS EXPLORATORIO DE DATOS

> *"El contenido generado por IA puede ser incorrecto."*

El proceso de un AED puede dividirse en cinco pasos principales:

### 1️⃣ Hacer preguntas
Define qué quieres descubrir en los datos:
- ¿Qué información necesitas?
- ¿Qué preguntas quieres responder?
- ¿Cuál es el objetivo de tu análisis?

### 2️⃣ Determinar el tamaño de los datos
Analiza la cantidad de observaciones y variables:
- ¿Cuántas observaciones existen?
- ¿Cuántas variables hay?
- ¿Existen datos que puedes eliminar por ser irrelevantes?

### 3️⃣ Categorizar las variables
Clasifica las variables según su tipo:
- ¿Cuántas son categóricas? ¿Cuántas son continuas?
- ¿Qué métodos de análisis son más adecuados según cada categoría?

### 4️⃣ Limpieza y validación de datos
Asegúrate de que los datos estén en buen estado:
- ¿Hay datos faltantes? Si es así, ¿cómo los manejarás?
- ¿Existen valores anómalos que debas tratar?
- Analiza la proporción y distribución de los datos

### 5️⃣ Establecer relaciones entre variables
Examina cómo las variables interactúan entre sí:
- ¿Existe relación entre la variable X y la Y?
- ¿Qué sucede al considerar otras variables como Z?
- Identifica patrones y agrupaciones en los datos

---

## 🔄 UN PROCESO CÍCLICO, PERO CON UN FINAL

El análisis exploratorio de datos no es lineal, sino cíclico. Esto significa que:
- Comenzarás formulando preguntas
- Ajustarás los datos (tamaño, limpieza, categorización)
- Identificarás relaciones entre las variables
- Luego, se repite el ciclo con nuevas preguntas y ajustes

Es importante también saber cuándo detenerse. Un AED interminable no genera resultados útiles, así que se debe decidir cuándo es suficiente para avanzar y compartir los hallazgos.

> *"El contenido generado por IA puede ser incorrecto."*

El proceso de realizar un análisis exploratorio de datos (EDA) puede variar dependiendo del tipo de datos y de los objetivos específicos del análisis, pero en general, el EDA sigue los siguientes pasos básicos:

### 📥 Importación y limpieza de datos
Antes de realizar cualquier análisis, es importante asegurarse de que los datos estén en un formato adecuado y limpio. Esto puede incluir la eliminación de valores perdidos, la corrección de valores inconsistentes y la transformación de variables si es necesario.

> *"El contenido generado por IA puede ser incorrecto."*

### 📊 Análisis univariado
Este tipo de análisis se enfoca en una sola variable a la vez. Por ejemplo, se puede calcular la media, la desviación estándar, el rango y la distribución de una variable. También se pueden crear gráficos de barras, histogramas, gráficos de densidad, entre otros, para visualizar la distribución de la variable.

> *"El contenido generado por IA puede ser incorrecto."*

### 🔗 Análisis bivariado
En este tipo de análisis, se estudian dos variables simultáneamente. Se pueden crear gráficos de dispersión, matrices de diagramación de pares, y se pueden calcular medidas de correlación para explorar la relación entre las dos variables.

### 🌐 Análisis multivariado
En este tipo de análisis, se estudian varias variables a la vez. Se pueden realizar técnicas como los componentes principales, la agrupación (clustering) y la reducción de dimensionalidad para identificar patrones y tendencias en los datos.

### 📱 Visualización y comunicación de resultados
Una vez realizado el análisis, es importante visualizar y comunicar los resultados de manera clara y concisa. Esto puede incluir la creación de gráficos, tablas y resúmenes para presentar los resultados.

> *"El contenido generado por IA puede ser incorrecto."*

Es importante destacar que el EDA es un proceso iterativo, lo que significa que puede ser necesario volver a revisar los datos y ajustar el análisis en función de los hallazgos. Además, el EDA no es un proceso lineal y es posible que se salten algunos pasos o se realice un análisis más detallado en función de los datos y objetivos específicos del proyecto.

---

## 🧠 POO (Programación Orientada a Objetos)

- El concepto de POO se puede aplicar a cualquier lenguaje de programación que soporte su paradigma

### 🧩 Objetos
- Dentro de la POO y retomando lo visto en la clase anterior mencionamos que tenemos objetos
- Decimos que un OBJETO dentro de la POO se lo conoce como CLASE
- Esto quiere decir que ambos son objetos

### 📋 Copias de Objetos
¿Qué pasa cuando nosotros le sacamos una copia a una clase?
- Vamos a obtener una copia de un objeto
- Cada copia que nosotros hagamos de un objeto va a ser un objeto a las cuales llamaremos INSTANCIAS

### 🎯 Instancia
- Decimos entonces que cada vez que realizamos una copia a una clase, ésta será una copia de un molde o plantilla de mi clase. A esto llamamos INSTANCIA
- Podemos cargar en ella los atributos de la plantilla original
- Cada copia será una instancia de la clase y todas las clases que podemos definir van a tener su copia, ósea todas las instancias que podemos tener dentro de un proyecto

### 💡 Por ejemplo:
Tenemos la **CLASE USUARIO** donde vemos que tiene:
- **5 atributos**: nombre, apellido, correo, contraseña y teléfono
- **3 métodos**: encriptar contraseña, verificar contraseña y obtener por correo

### 🚀 Iniciando INSTANCIAS:
Cuando creamos una copia de nuestra plantilla original de usuario, podemos conservar el nombre pero añadiremos algunos cambios. Por ejemplo:
- Usuario 1
- En caso de necesitar más copias puedo seguir utilizando el mismo nombre pero variando

### ⚠️ Importante!
Es importante saber que cada instancia tendrá los mismos atributos o datos que la clase usuario y los mismos métodos o funcionalidades que la clase que se utilizó como plantilla o molde.

### 🔧 Otro ejemplo sería:
```python
mi_coche = Coche("Toyota", "Corolla")
print(mi_coche.describir())  # Salida: Este coche es un Toyota Corolla
```
> En el ejemplo 'Coche', 'marca' y 'modelo' son atributos, mientras que 'describir()' es un método.

---

# 🏛️ Los 4 Pilares de la POO

## 🔍 Abstracción

Si bien una clase puede tener infinitos atributos, la abstracción se basa en elegir los atributos más importantes o la información de nuestra clase que vamos a manipular.

## 💡 Por ejemplo:

Si retomamos el ejemplo de la **CLASE USUARIO**, lo que nos permite la abstracción es sólo enfocarnos en lo más importante tanto en las características como en los métodos que son relevantes en nuestros objetos.

### ✅ Atributos relevantes o más importantes serían:
- **Nombre**
- **Apellido** 
- **Correo**
- **Contraseña**
- **Teléfono**

### ⚠️ Atributos no tan importantes serían:
- Color de piel
- Estatura  
- Lunares

### 🔧 Métodos importantes:
- **Encriptar contraseña**
- **Verificar contraseñas**
- **Obtener por correo**

> ⚡ Utilizar un método sin sentido no tendría relevancia en nuestra clase
