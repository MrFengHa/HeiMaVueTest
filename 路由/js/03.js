const login = {
    template:'<h1>用户登录</h1>',
    created(){
        console.log("------------------>"+this.$route.query.id)
    }
}
const register = {
    template:'<h1>用户注册</h1>',
    created() {
        console.log(this.$route.params.id)
    }
}

const router = new  VueRouter({
    routes:[
        // {path:"/",component:login},
        //{path:"/",redirect:"login"},
        {path:"/login",component:login},
        {path:"/register/:id",component:register}
    ]
})

const app = new Vue({
    el:"#app",
    data:{},
    methods:{},
    router
})