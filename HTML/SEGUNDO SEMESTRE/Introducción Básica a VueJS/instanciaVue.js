const holaMundo ={
    data(){
        return{
            mensaje: 'Hola Mundo'
        }
    }
}

// createApp, mount -> métodos propios de Vue
Vue.createApp(holaMundo).mount('#app')
