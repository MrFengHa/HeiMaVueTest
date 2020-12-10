let app = new Vue({
    el: "#app",
    data: {
        users: [],//数据的赋值应该来源于后端接口，在页面加载完成之后必须完成赋值操作
        user: {},//用来完成数据交换 数据的双向绑定
        id:""

    },
    methods: {
        saveUserInfo() {
            let _this = this;
            axios.post("http://localhost:8989/user/user/save", this.user).then(function (response) {
                console.log(response.data)
                if (response.data.success) {
                    _this.findAll();
                    _this.user = {}
                } else {
                    alert(response.data.message)
                }
            }).catch(function (err) {
                console.log(err)
            })
        },
        //重置表单数据
        restUserInfo() {
            this.user = {}
        },
        findAll() {
            let _this = this;
            axios.get("http://localhost:8989/user/user/findAll").then(function (response) {
                _this.users = response.data;
            }).catch(function (err) {
                console.log(err)
            });
        },
        //根据用户id删除用户信息
        deleteUserInfo(id){

            //使用axios发动请求删除用户信息
            let _this = this;
            axios.post("http://localhost:8989/user/user/delete","id="+id).then(function (response) {
                console.log(response.data)
               if (response.data.success){
                   _this.findAll();
               }else
               {
                   alert(response.data.message)
               }
            }).catch(function (err) {
                console.log(err)
            });
        },
        findOneUserInfo(id){
            let _this = this;
            axios.get("http://localhost:8989/user/user/findUserById?id="+id).then(function (response) {
                _this.user = response.data
                console.log(response.data)
            })
        },
    },
    created() {

        this.findAll();
    }
})
