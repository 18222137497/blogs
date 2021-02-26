//读html
$(document).ready(function () {
    $("#top-header").load("/top");//用controller
    $("#weather").load("/weather");
})
//更改头像
function imgChange(e) {
    var dom =$("input[id^='imgTest']")[0];
    var reader = new FileReader();
    reader.onload = (function (file) {
        return function (e) {
            $.ajax({
                type:'POST',
                url:'/uploadHead',
                dataType:'json',
                data:{
                    img:this.result
                },
                success:function (data) {
                    if(data['status'] == 101){ // 登录状态为未登录
                        $.get("/toLogin",function(data,status,xhr){//跳转登录
                            window.location.replace("/login");
                        });
                    } else if(data['status'] == 103){//服务器异常
                        dangerNotice(data['message'] + " 更改头像失败");//抛出修改失败的弹窗
                    } else {
                        $('#headPortrait').attr("src",data['data']);//设置属性
                        successNotice("更改头像成功");//抛出修改成功的弹窗
                    }

                },
                error:function () {
                }
            });
        };
    })(e.target.files[0]);
    reader.readAsDataURL(e.target.files[0]);
}
