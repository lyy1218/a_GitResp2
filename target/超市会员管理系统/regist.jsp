<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <link rel="stylesheet" href="css/style.css">

    <title>注册页</title>
</head>

<body>
<section>
    <!-- 背景颜色 -->
    <div class="color"></div>
    <div class="color"></div>
    <div class="color"></div>
    <div class="box">
        <!-- 背景圆 -->
        <div class="circle" style="--x:0"></div>
        <div class="circle" style="--x:1"></div>
        <div class="circle" style="--x:2"></div>
        <div class="circle" style="--x:3"></div>
        <div class="circle" style="--x:4"></div>
        <!-- 登录框 -->
        <div class="container">
            <div class="form">
                <h2>注册</h2>
                <form action="usercontroller/testRegist">
                    <div class="inputBox">
                        <input type="text"  name="name">
                    </div>
                    <div class="inputBox">
                        <input type="password"  name="password">
                    </div>
                    <div class="inputBox">
                        <input type="submit" value="注册">
                    </div>
                    <p class="forget">忘记密码?<a href="#">
                        点击这里
                    </a></p>
                    <p class="forget">已注册?点击这里登录<a href="index.jsp">
                        登录
                    </a></p>
                </form>
            </div>
        </div>
    </div>
</section>
</body>

</html>