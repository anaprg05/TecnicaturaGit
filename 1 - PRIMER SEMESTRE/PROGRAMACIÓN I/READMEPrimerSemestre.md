# EntregaPrimerSemestreUTN
# CLASE 1
## CREACIÓN DE CARPETAS
### cd ..
### cd ..
### cd /mnt/c
### cd ~ -> Vamos a la raíz
### mkdir Tecnicatura -> Recordar que en window las mayúsculas no tienen relevancia, pero si en Linux
### cd tecnicatura
### mkdir Python
### mkdir Java
### mkdir JavaScript

# CLASE 2
## REPOSITORIO DE GIT Y PRIMER COMMIT
### cd tecnicatura
### mkdir class-git
### cd class-git -> Entramos en la carpeta que necesitamos trabajar
### git init -> Creamos un repositorio en la carpeta central, se crea el archivo .git
### code . -> Abrimos VSC, el punto hace que se abra el archivo en el que estamos situados
### ctrl + n -> Creamos un archivo nuevo y escribimos en el, como lo hicimos antes
### ctrl + s -> Guardamos poniendo el nombre: historia.txt
### git status -> Vemos el estado del proyecto en tiempo real, esta en el área de trabajo
### git add historia.txt -> Enviamos el archivo al área de preparación
### git status -> Para ver el estado de cambios
### git rm --cached historia.txt -> Quitamos el archivo del área de preparación, cached significa que esta en memoria ram
### git config ### Tedremos la lista de como funciona la configuración
### git config --list -> Configuraciones por defecto, faltan cosas importantes
### git config --list --show-origin -> Veremos donde están las configuraciones guardadas
### git config --global user.name "Ana Paula Ríos Garín"
### git config --global user.email "anapaulariosgarin@gmail.com" -> El correo debe ser el mismo que usaremos en GitHub
### git config --list -> Ahora veremos que ya están todos los datos completos
### git add . -> Ingresamos todos los archivos al área de preparación (ram)
### git commit -m "Mensaje importante del commit" -> El primer commit esta hecho
### code . -> Hacemos cambios en el archivo y guardamos
### git status -> Hay cambios para commitear
### git add .
### git commit -m "Mi segundo commit"
### git log historia.txt -> Vemos toda la historia de este archivo, el número largo es el hash del commit

# CLASE 3
## CARGAR LOS COMANDOS EN EL README Y COMMITEAR
### git status
### git add .
### git status
### git commit -m "Cargamos el README dentro del directorio class-git"
### git status
### git log -> Para ver los dos commits hechos: Si tienes commiteada alguna clase anterior veras mas commits de los que yo tengo.
### cd ..
### cd ..

# CLASE 4
### cd tecnicatura
### cd class-git
### ls
### touch historia.txt
### code .
### -> Modificamos el archivo historia.txt colocando lo siguiente: Bienvenido mi nombre es Ana
### ctrl + s
### git status
### git add .
### git status
### git commit -> Sin agregar -m veremos que pasa
### -> Agregar mensaje y salir con
### Esc -> Presionamos Escape 
### :wq! + enter -> Y ya salimos si estamos en git bash con window
### Esc + shift + z + z -> Salimos del mensaje para el commit, en linux, esto anda en algunas terminales
### -> Agregamos otra línea de mensaje en historia.txt desde VSC: estoy estudiando programación
### ctrl + s
### git add .
### git commit
### -> Se abre un editor de código basado en línea de comandos, editor de texto como VSC llamado vim
### Esc + i -> Para comenzar a escribir mensaje del commit, no suele ser necesario
### ctrl + x -> Para salir en linux
### s + enter -> Para decir si al cambio y aceptar el nombre, ósea no cambiamos el nombre, la (s) es de si y la (y) es de yes, no olvidar enter en linux
### git show -> Vemos todos los cambios en el último commit
### git log historia.txt -> Vemos todos los commit
### q -> Para salir del registro de commits
### -> Copiamos un hash mas antoguo y otro reciente, ingresamos el siguiente comando
### git diff hash_commit_numerico hash_commit_numerico -> Comparamos diferentes commits y sus cambios, poner la versión mas vieja primero, luego la mas nueva
### q -> Para salir
### cd ..
### cd ..

# CLASE 5
## CLASE DE TEORÍA
### ¿Qué es Gitflow?
### ¿Qué es branch (rama) y cómo funciona un merge en git?
### Tipos de ramas

# CLASE 6
### cd tecnicatura
### cd class-git
### ls
### code .
### git log -> Vemos los commit hechos hasta ahora
### Copiar el hash -> El número largo que tiene el commit
### git reset hash-nombre-commit -> Este nos permite volver a una versión anterior, hay 2 tipos de reset: el duro y el suave
### git status
### git add .
### git commit -m "Agregamos datos de estudios en historia.txt"
### git config --list -> Veremos la configuración que ya hemos hecho con en nombre y email
### git reset hash-nombre-commit --hard -> Es el duro, todo vuelve a su estado anterior, es el más usado, desaparece todo
### git reset hash-nombre-commit --soft -> Este es el suave, lo que tengamos en staging segirá allí
### crear un archivo #portafolio.html introducir el código y
### touch portafolio.html
### html : 5 -> Con esto se carga el código básico de html y modificamos
### ctrl + s -> Guardamos
### Clic derecho en VSC Open with Live Server para ver en el navegador
### git status
### ls
### ls -al
### git add .
### git status
### git commit -m "Agregamos el html para nuestro portafolio"
### creamos CSS -> Este es un archivo de estilos, para esto creamos una nueva carpeta llamada css
### mkdir css
### ls
### cd css
### touch style.css -> creamos un archivo dentro: estilos.css le cargamos el código.
### ctrl + s -> abrimos en el navegador y todo esta allí, pero todo esto supuestamente en git no existe.
### git status -> tenemos cosas en el área de trabajo, en staging distintas
### git diff + enter -> y nos muestra los cambios en memoria ram y en disco
### git add . -> Agregamos todo al staging
### git status -> Ya esta todo en memoria ram, a git solo le importan los archivos, guarda las carpetas como rutas y automaticamente las crea
### git commit -m "Creamos el css para darle algo de estilo a nuestro portafolio"
### git log -> vemos lo nuevo que hemos hecho sin lo que borramos con el reset fuerte
### hacer cambios en historia.txt -> Cambiamos la última línea y
### ctrl + s 
### git diff
### git commit -am "cambio en la última línea del historia.txt"
### git log
### q  #Esto para salir
### git log --stat -> veremos los cambios especificos que hicimos en cuales archivos por medio del commit y veremos los cambios en bits
### q -> salimos de la línea de commits, ahora queremos ver como era originalmente el archivo, osea la primera versión, copiamos el nombre del primer commit
### git checkout hash-nombre-commit historia.txt -> Veremos el archivo en su estado original
### git status -> Nos sugiere hacer un commit, si lo hacemos borramos todo lo que hicimos antes, debemos seguir con el siguiente commando
### git checkout master historia.txt -> Volvemos a la versión master del archivo historia.txt, esto es muy peligroso
### git checkout hash-nombre-commit historia.txt -> Volvemos a hacer esto y cambiamos cosas del archivo
### git commit -am "Reemplazo de una versión por otra de la historia"
### git log -> Veremos los cambios sin tocar ningun otro archivo, esta es la forma de volver a una versión hacía atrás y llevarla a la cabeza de la master
### cd ..
### cd ..

# CLASE 7
### mkdir git_reset_test -> Vamos a hacer pruebas, es por esto que creamos una carpeta nueva
### cd git_reset_test -> Entramos en la carpeta
### git init -> Inicializamos el repositorio
### touch reset_file.txt
### git add reset_file.txt
### git commit -m "Iniciando el primer commit"

## CLASE DE TEORÍA
### GIT RESET

# CLASE 8
## COMANDOS PARA TRABAJO REMOTO CON GIT
### git clone url_del_servidor_remoto -> Nos permite descargar los archivos de la última versión de la rama principal y todo el historial de cambios en la carpeta .git
### git push -> Luego de hacer git add y git commit debemos ejecutar este comando para mandar los cambios al servidor remoto.
### git fetch -> Lo usamos para traer actualizaciones del servidor remoto y guardarlas en nuestro repositorio local (en caso de que hayan, por supuesto).
### git merge -> También usamos el comando git merge con servidores remotos. Lo necesitamos para combinar los últimos cambios del servidor remoto y nuestro directorio de trabajo.
### git pull -> Básicamente, git fetch y git merge al mismo tiempo.
### -> Adicionalmente, tenemos otros comandos que nos sirven para trabajar en proyectos muy grandes:
### git log --oneline -> Te muestra el id commit y el título del commit.
### git log --decorate -> Te muestra donde se encuentra el head point en el log.
### git log --stat -> Explica el número de líneas que se cambiaron brevemente.
### git log -p -> Explica el número de líneas que se cambiaron y te muestra que se cambió en el contenido.
### git shortlog -> Indica que commits ha realizado un usuario, mostrando el usuario y el título de sus commits.
### git log --graph --oneline --decorate --all
### git log --pretty=format -> "%cn hizo un commit %h el dia %cd": Muestra mensajes personalizados de los commits.
### git log -3 -> Limitamos el número de commits.
### git log --after=“2018-1-2”
### git log --after=“today” 
### git log --after=“2018-1-2” --before=“today” -> Commits para localizar por fechas.
### git log --author=“Name Author” -> Commits hechos por autor que cumplan exactamente con el nombre.
### git log --grep=“INVIE” -> Busca los commits que cumplan tal cual está escrito entre las comillas.
### git log --grep=“INVIE” –i -> Busca los commits que cumplan sin importar mayúsculas o minúsculas.
### git log – index.html -> Busca los commits en un archivo en específico.
### git log -S “Por contenido” -> Buscar los commits con el contenido dentro del archivo.
### git log > log.txt -> guardar los logs en un archivo txt

# CLASE 9
## CLASE DE TEORÍA
### REPASO
### Abrir como adminstrados git bash #En window
### cd Tecnicatura
### cd class-git
### code . -> En ubuntu
### code . -> En window, abrir como administrador
### ctrl + s -> Guardamos
### clic mouse derecho -> Abrimos en el navegador con Live Server vemos los cambios
### git status
### git commit -am "mensaje del commit" -> Este solo funciona con archivos creado previamente
### git commit -a -m "Mensaje del commit" -> Esto es lo mismo que el anterior
### git commit -a + enter -> Se abrira el entorno para editar el vim con el mensaje
### Escribir el mensaje
### ctrl + x
### s + enter -> No cambiar el nombre ni ruta de ubicación
### git log -> Veremos los cambios guardados
### q -> Para salir
### git log --stat -> Veremos los cambios nombrando cada archivo
### q -> Para salir
### git branch -> Muestra en la rama que estamos, desde aquí crearemos una nueva
### git show -> Muestra el último cambio que hicimos, esto significa que desde el HEAD -> master es que haremos cambios
### q -> Para salir
### ctrl + l -> Limpiamos consola
### git branch segunda -> creamos una nueva rama
### git show -> Nos muestra ahora que esta en el HEAD -> master, cabecera aquí es donde esta apuntando, es decir el último commit esta pegado a dos ramas distintas, aunque todavía estemos en master
### q -> Para salir
### git status -> No hay nada para hacer commit
### git chekout segunda -> Nos movemos hacía otras ramas, en este caso a segunda, esto no se ve en mac ni en ubuntu, para ver donde estamos hay que ingresar...
### git branch -> veremos en que rama estamos ubicados o ingresando...
### git status -> Veremos en que HEAD estamos apuntando
### VSC -> hacemos cambios que veremos con Nico

# CLASE 10
## CLASE DE TEORÍA
# FUNCIONAMIENTO DE GIT MERGE
## COMANDOS BÁSICOS DE GITHUB
### git init -> crear un repositorio, si ya esta en la nube traerlo sin hacer git init
### git add . -> agregar un archivo a staging.
### git commit -m “mensaje” -> guardar el archivo en git con un mensaje.
### git branch nombre_rama -> crear una nueva rama.
### git checkout nombre_rama -> moverse entre ramas.
### git push origin rama -> mandar cambios a un servidor remoto.
### git fetch -> traer actualizaciones del servidor remoto y guardarlas en nuestro repositorio local.
### git merge rama -> tiene dos usos. Uno es la fusión de ramas, funcionando como un commit en la rama actual, trayendo la rama indicada. Su otro uso es guardar los cambios de un servidor remoto en nuestro directorio.
### git pull origin rama -> fetch y merge al mismo tiempo.
### git checkout “codigo de version” “nombre del archivo” -> volver a la última versión de la que se ha hecho commit.
### git reset -> vuelve al pasado sin posibilidad de volver al futuro, se debe usar con especificaciones.
### git reset --soft -> vuelve a la versión en el repositorio, pero guarda los cambios en staging. Así, podemos aplicar actualizaciones a un nuevo commit.
### git reset --hard -> todo vuelve a su versión anterior
### git reset HEAD -> saca los cambios de staging, pero no los borra. Es lo opuesto a git add.
### git rm -> elimina los archivos, pero no su historial. Si queremos recuperar algo, solo hay que regresar. se utiliza así:
### git rm --cached -> elimina los archivos en staging pero los mantiene en el disco duro.
### git rm --force -> elimina los archivos de git y del disco duro.
### git status -> estado de archivos en el repositorio.
### git log -> historia entera del archivo.
### git log --stat -> cambios específicos en el archivo a partir de un commit.
### git show -> cambios históricos y específicos hechos en un archivo.
### git diff “codigo de version 1” “codigo de version 2” -> comparar cambios entre versiones.
### git diff -> comparar directorio con staging.

## COMANDO EN PRODUCCIÓN: TUVE QUE SOLUCIONAR UN CONFLICTO
### git status -> En rama segunda: hacemos cambios en el archivo y guardamos
### git commit -am "Finalizado el cambio en rama segunda" -> enter
### git status
### git checkout master #perdemos todo lo que ya habíamos hecho, hacemos cambios en el archivo agregando un nuevo parrafo y guardamos
### git commit -am "Agregado el contenido adicional del archivo y un mejor aporte"
### git checkout segunda -> vemos como desaparecen los cambios
### git checkout master -> Aquí es que vamos a hacer el merge
### git merge segunda -> En mi caso tuve algunos conflictos que solucione a través de VSC, aclaro que nunca debemos utilizar Fusionar los dos cambios
### git commit -am "Arreglando conflicto" -> Una vez solucionado debemos commitear
### git status -> Debemos revisar en el navegador y en el código si algo quedo mal y cambiarlo
### git commit -am "Solucionado el conflicto 2"
### git merge segunda -> ahora todo va bien
### git commit -am "Volvi a comentar en este caso de mi area laboral" -> Añado información al archivo
### git log
### q -> Para salir
### git commit -am "Para guardar estos cambios en el README.md"
### git checkout segunda
### git merge master -> Traemos todos los cambios
### git commit -am "Cargamos esto ahora" #vamos a master y mergeamos
### git checkout master
### git merge segunda -> y terminamos con esto

# CLASE 11
### Abrimos el html y modificamos estando en la rama segunda
### Luego commiteamos en la rama segunda y pasamos a la rama master, guardar y commitear, hacer un merge estando en master: pongo en orden los comandos abajo.
### ctrl + s -> Guardamos los cambios en la rama segunda, ponemos cambios en css
### git commit -am "Modifique el css y el color del texto" es un ejemplo
### git checkout master -> Modificamos el html, ponemos código y css ponemos texto blue
### ctrl + s -> Guardamos los cambios
### git commit -am "Agregue suscripción, cambie el código y puse todo azul en css"
### git merge segunda -> Hacemos un merge estando en master y veremos el conflicto

### Para solucionar el conflicto podemos abrir el archivo con el editor de texto y modificar lo que nos este señalando y guardamos, esto en el css y en el html, lo podemos hacer desde VSC seleccionando: el cambio entrante.

### Debemos ahora commitear estos cambios, abajo pongo los comandos.
### git status
### git commit -am "Solución de conflictos al mergear las ramas"
### git checkout segunda -> Seguiremos con la versión anterior, porque el merge fue en master
### git merge master -> Ahora pasamos los cambios a la rama segunda.

# CLASE 12
## CLASE TEÓRICA
### ¿CÓMO FUNCIONAN LAS LLAVES PÚBLICAS Y PRIVADAS?

# CLASE 13
## CÓMO GENERAR LLAVES SSH
### a. Generar tus llaves SSH
### Recuerda que es muy buena idea proteger tu llave privada con una contraseña.
### ssh-keygen -t rsa -b 4096 -C "tu@email.com"

### b. Terminar de configurar nuestro sistema.
### En Windows y Linux:
### Encender el “servidor” de llaves SSH de tu computadora:
### eval $(ssh-agent -s)
### Añadir tu llave SSH a este “servidor”:
### ssh-add ruta-donde-guardaste-tu-llave-privada

### Por último les quiero hablar del 2FA: Segundo Factor de Autenticación. Este se puede hacer con varios dispositivos, y deberías hacerlo, ante el robo o perdida de un celular o ordenador, deberías tener un respaldo ante esto, este 2FA se puede hacer con diferentes generadores de códigos  de seguridad.
### Para añadir un 2FA:
### 1. Clic en nuestro perfil, arriba y a la derecha, seleccionamos...
### 2. Settings
### 3. Password and Authentication
### 4. GitHub Mobile: GitHub Mobile can be used for two-factor authentication by installing the GitHub Mobile app and signing in to your account. -> GitHub Mobile se puede utilizar para la autenticación de 2FA instalando la aplicación GitHub Mobile e iniciando sesión en su cuenta.
### Esto quiere decir que también se utiliza la app de GitHub donde al iniciar sesión desde cualquier dispositivo nos muestra un número que debemos ingresar en la app de nuestro dispositivo celular.
### 5. Authenticator app: Edit
### Esto para agregar a través de un QR una app que genere cada 1 segundo nuevos códigos numéricos para la autenticación, yo recomiendo la aplicación: Twilio Authy Authenticator
### Es recomendable iniciar sesión, osea registrarnos y guardar estos datos para que al cambiar un dispositivo sigamos teniendo acceso.
