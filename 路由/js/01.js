
const login = {
    template: '<h1>用户登录{{name}}{{username}}</h1>',
    props: ["username"],
    data() {
        return {
            name: "小黑"
        }
    }
}

const register = {
    template: '<h1>用户注册</h1>'
}

const router = new VueRouter({
    routes:[
        {path:'/login',component:login},
        {path:'/register',component:register}
    ]
})

const app = new Vue({
    el: "#app",
    data: {
        username: "小陈"
    },
    methods: {},
    components: {
        login,
        register
    },
    router:router
})

