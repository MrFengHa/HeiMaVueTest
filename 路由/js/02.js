const login = {
    template:'<h1>用户登录</h1>',
}
const register = {
    template:'<h1>用户注册</h1>',
}

const router = new  VueRouter({
    routes:[
        // {path:"/",component:login},
        {path:"/",redirect:"login"},
        {path:"/login",component:login},
        {path:"/register",component:register}
    ]
})

const app = new Vue({
    el:"#app",
    data:{},
    methods:{},
    router
})