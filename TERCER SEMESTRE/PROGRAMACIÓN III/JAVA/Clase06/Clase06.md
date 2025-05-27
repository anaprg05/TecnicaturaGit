# 🚀 Clase 06 - Introducción a Docker en Java

![Docker Logo](https://www.docker.com/wp-content/uploads/2022/03/vertical-logo-monochromatic.png)

En esta clase realizamos la instalación y configuración inicial de Docker, una herramienta fundamental para el desarrollo moderno de aplicaciones.

## 🌟 Introducción a Docker

Docker es una plataforma revolucionaria que permite:
- 🚢 **Empaquetar** aplicaciones y sus dependencias en contenedores
- ⚡ **Ejecutar** aplicaciones de forma rápida y consistente
- 🔄 **Distribuir** software de manera eficiente

> "Docker simplifica el proceso de desarrollo, despliegue y ejecución de aplicaciones usando tecnología de contenedores."

## 🐳 Conceptos Fundamentales

### 🔷 ¿Qué es un contenedor?
Un contenedor es una unidad estándar de software que empaqueta código y todas sus dependencias, permitiendo que la aplicación se ejecute de manera rápida y confiable de un entorno a otro.

### 🆚 Contenedores vs Máquinas Virtuales
| Característica       | Contenedores                  | Máquinas Virtuales           |
|----------------------|-------------------------------|------------------------------|
| **Tamaño**          | MBs (Livianos)               | GBs (Pesados)               |
| **Arranque**        | Segundos                     | Minutos                     |
| **Rendimiento**     | Casi nativo                  | Overhead por hipervisor      |
| **Sistema Operativo** | Comparte el kernel del host  | Sistema operativo completo  |

## 🛠️ Componentes Clave de Docker

### 📜 Dockerfile
Archivo de texto que contiene todas las instrucciones para construir una imagen. Ejemplo básico:

```dockerfile
FROM openjdk:17
WORKDIR /app
COPY . /app
RUN javac Main.java
CMD ["java", "Main"]
```

## 🖼️ Imágenes
Plantillas inmutables que definen cómo se creará un contenedor. Se pueden:

- Descargar desde Docker Hub (`docker pull`)
- Construir localmente (`docker build`)
- Subir a registros (`docker push`)

## 📦 Contenedores
Instancias en ejecución de una imagen. Comandos básicos:

```bash
docker run -d --name myapp myimage  # Ejecutar en segundo plano
docker ps                          # Listar contenedores activos
docker stop myapp                  # Detener contenedor
```

# 💻 Uso de Docker en Desarrollo Java

## Beneficios para proyectos Java:

✅ **Entornos consistentes**: Mismo comportamiento en desarrollo, test y producción  
✅ **Dependencias aisladas**: Diferentes versiones de JDK/JRE sin conflictos  
✅ **Integración con herramientas**: Maven/Gradle pueden usar Docker en el build  

## Ejemplo práctico:

```bash
# Ejecutar Java en un contenedor
docker run -it --rm -v "$PWD":/app -w /app openjdk:17 javac Main.java
```

## 🚀 Casos de Uso Comunes
### Pruebas multi-entorno:

```bash
docker run -it openjdk:8 java -version
docker run -it openjdk:11 java -version
docker run -it openjdk:17 java -version
```

### Microservicios: Cada servicio en su propio contenedor

### CI/CD: Integración continua usando contenedores preconfigurados

### Bases de datos:

```bash
docker run -d -p 5432:5432 -e POSTGRES_PASSWORD=secret postgres
```

## 📚 Recursos Adicionales
- [Documentación Oficial de Docker](https://docs.docker.com/)
- [Docker Hub (Repositorio de imágenes)](https://hub.docker.com/)

