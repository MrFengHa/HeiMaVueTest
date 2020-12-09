let app = new Vue({
    el: "#app",
    data: {
        users: [],//数据的赋值应该来源于后端接口，在页面加载完成之后必须完成赋值操作

    },
    methods: {},
    created() {
        axios.get("").then(function (response) {
            console.log(response)
        }).catch(function (err) {
            console.log(err)
        })
    }
})
