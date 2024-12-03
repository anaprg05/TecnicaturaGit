# ***COMANDOS GIT Y RAMAS AUXILIARES***
### *¿Cuándo se inicia la rama Main?*
- Recuerden que al iniciar nuestro repositorio estamos iniciando nuestra rama Main!​
- Es importante recordar que cada vez que creamos un repositorio nuevo debemos configurar nuestro usuario y correo.
- Comando:

      git add . 

​- Me permite añadir modificaciones desde mi área de trabajo a mi área de preparación, para luego ser confirmados y enviados a mi repositorio.
- No es posible enviar un documento desde mi área de trabajo al repositorio sin antes ser añadido y confirmado.

 
      git commit
- Una vez que tenemos confirmadas las modificaciones los documentos estarán en colore verde listos para ser confirmados o commiteados. ​
- No podremos realizar una confirmación si no tenemos configurado con anterioridad mi usuario y correo.​
- Solo si los documentos y modificaciones han sido añadidas a mi área de preparación ya podremos confirmar los cambios​


### *Comando que me Permite Visualizar Todas las Ramas y Commit*
      git log
- Si sólo utilizamos Git log veremos solo los commit con su autor y correo. Para poder visualizar todas las ramas y commits vamos a utilizar ​

      git log --oneline --all --graph --decorate 
      git tag

- Son las etiquetas o versiones que nos permite tener Git en nuestro proyecto.
- Podemos eliminar las etiquetas si lo creemos necesario.
- Nos permiten versionar nuestro proyecto. Esto nos facilita poder dividirlo  en diferentes etapas.

## **Ramas Auxiliares**
- Las Ramas Auxiliares nos permitirán realizar cualquier tipo de modificaciones sin afectar nuestro proyecto final. Nos permitirán tomar decisiones antes de ser confirmadas y enviadas al proyecto final​
- Las ramas auxiliares pueden ser eliminadas una vez que ya hemos confirmados las actualizaciones y mergeado a la Rama Main.
