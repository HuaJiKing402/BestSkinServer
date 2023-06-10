import { createApp } from 'vue'
import { createPinia } from 'pinia'

import VueAxios from 'vue-axios'
import axios from 'axios'

import App from './App.vue'
import router from './router'

const app = createApp(App)
app.prototype.axios = axios;
app.use(VueAxios,axios)
app.use(createPinia())
app.use(router)

app.mount('#app')
