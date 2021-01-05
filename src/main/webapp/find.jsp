
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

        <div>
                <div style="background-color: blue;color: aqua;">
                    <h1>jAVA牛逼到爆的想搜什么搜什么论坛</h1> <a href="login.jsp">登录</a><a href="sign.jsp">注册</a>
                </div>

<c:forEach var="a" items="${list}">
    <tr>
            作者：<td>${a.user.uName}</td><br/>
            标题：<td><a href="select.jsp">${a.pTilte}</a></td>
            内容：<td>${a.pContent}</td>
    </tr>
    <hr>
</c:forEach>
        </div>
</body>
</html>
