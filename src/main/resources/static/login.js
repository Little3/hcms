layui.use(['form','layer','jquery'],function(){
    var form = layui.form,
        layer = parent.layer === undefined ? layui.layer : top.layer
        $ = layui.jquery;
    window.onload = function(){
        //配置
        var config = {
            vx: 4,//点x轴速度,正为右，负为左
            vy:  4,//点y轴速度
            height: 3,//点高宽，其实为正方形，所以不宜太大
            width: 2,
            count: 200,//点个数
            color: "121, 162, 185",//点颜色
            stroke: "130,255,255",//线条颜色
            dist: 6000,//点吸附距离
            e_dist: 20000,//鼠标吸附加速距离
            max_conn: 10//点到点最大连接数
        }
        //调用
        CanvasParticle(config);
    }

    $(function() {
    	if ($.cookie("remember_users")) {
    		$("#remember_user").prop("checked",true);
    		$("#username").val($.cookie("user_name"));
    		$("#userpsw").val($.cookie("user_password"));
    	}
    });
    function saveUserInfo() {
    	if ($("#remember_user").prop("checked") == true) {
    		var user_name = $("#username").val();
    		var user_password = $("#userpsw").val();
    		$.cookie("remember_users", "true", {
    			expires: 7
    		}); // 存储一个带7天期限的 cookie
    		$.cookie("user_name", user_name, {
    			expires: 7
    		}); // 存储一个带7天期限的 cookie
    		$.cookie("user_password", user_password, {
    			expires: 7
    		}); // 存储一个带7天期限的 cookie
    	} else {
    		$.cookie("remember_users", "false", {
    			expires: -1
    		}); // 删除 cookie
    		$.cookie("user_name", '', {
    			expires: -1
    		});
    		$.cookie("user_password", '', {
    			expires: -1
    		});
    	}
    }
    //登录按钮
    form.on("submit(login)",function(data){
    	$.ajax({
    		type:"post",
    		url:"../LoginServlet",
    		data:data.field,        
    		dataType:"json",
    		success:function(data){
    			if(data.status==100){
    				layer.alert("此用户已被禁用,请联系管理员解除",{icon:4});
    			} else if(data.status==200){
    				saveUserInfo();
    				window.location.href = "/MySTI/index.html";
    			} else{
    				layer.msg("用户名或密码错误",{icon:5,time:1000});
    			}
    		}
    	});
    	return false;
    })
})
