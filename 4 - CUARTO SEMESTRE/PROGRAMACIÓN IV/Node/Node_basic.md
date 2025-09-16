# Node.js 🟢

## ¿Qué es? ❓

Node.js es un entorno de ejecución multiplataforma basado en JavaScript, es de código abierto y principalmente se usa para servidores web. 🌐

## CONCEPTOS BÁSICOS 📚

Gracias a Node.js se puede **utilizar JavaScript fuera del navegador** 🚀, pudiendo usarse en cualquier plataforma como una aplicación más. Esto le da a JavaScript la capacidad de hacer las mismas cosas que otros lenguajes de scripting como Python. 🐍

Uno de los usos más comunes de Node.js es el desarrollo de servidores web. En un servidor web tradicional se tendría un hilo por cada usuario. Con Node.js solo se tiene un hilo, pero su diseño hace que las tareas de I/O no bloqueen el hilo y pueda continuar con unas peticiones mientras espera a otras. ⚡

## VENTAJAS ✅

- 🧵 Node funciona en un solo hilo. Usa un bucle de eventos para procesar las llamadas no bloquearles de I/O de forma concurrente en un solo hilo. Esto tiene la ventaja de tener menos coste de memoria que si usara varios hilos.
- 🚀 Para interpretar JavaScript utiliza el motor V8, creado para Chrome, que está muy optimizado.
- 📦 Los desarrolladores pueden crear paquetes y subirlos a un repositorio (llamado npm) para distribuirlos.

## LIMITACIONES ⚠️

- ⚡ Cuando nos encontramos con tareas intensivas en CPU, Node.js tiene el módulo de Worker Threads para crear nuevos hilos. Cada hilo tiene su propia instancia de Node y del motor de JavaScript (para evitar problemas de concurrencia), por lo que tiene un impacto en la memoria.
- 📊 Calidad irregular en los módulos de npm. Existen paquetes muy estables y también otros que están poco probados y no tienen mucha documentación.

```
flowchart TD
    subgraph Input [Entrada]
        A[Function]
        B[Request]
        C[Event]
    end

    subgraph Processing [Procesamiento]
        D[Event Queue]
    end

    subgraph Core [Núcleo]
        E[Event Loop]
    end

    subgraph ThreadPool [Pool de Hilos]
        F[DB Ops]
        G[File Ops]
        H[Slow Ops]
        I[Ops Thread]
    end

    A --> D
    B --> D
    C --> D
    D --> E
    E --> ThreadPool
    ThreadPool -.-> E

    style Input fill:#e1f5fe
    style Processing fill:#fff3e0
    style Core fill:#f1f8e9
    style ThreadPool fill:#ffebee
```