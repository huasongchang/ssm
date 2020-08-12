<%--
  Created by IntelliJ IDEA.
  User: my-deepin
  Date: 18-4-7
  Time: 下午9:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path;
%>
<html>
<link rel="stylesheet" href="<%=basePath%>/lib/bootstrap.min.css"/>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
    <script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<!-- 导航栏 -->
<div class="sidebar text-left">
    <nav class="navbar navbar-default " role="navigation">
        <div class="container-fluid">
            <div class="navbar-header">
                <a class="navbar-brand">SSM整合</a>
            </div>
            <div>
                <ul class="nav navbar-nav">
                    <li><a href="<%=basePath%>/customer/toSavePage.do"><strong>添加信息功能</strong></a></li>
                    <li><a href="<%=basePath%>/customer/toListPage.do"><strong>分页查询功能</strong></a></li>
                    <li><a>Create by TyCoding</a></li>
                </ul>
            </div>
        </div>
    </nav>
</div>
<!--div class="dropdown">
    <button type="button" class="btn dropdown-toggle" id="dropdownMenu1"
            data-toggle="dropdown">
        SSM整合
        <span class="caret"></span>
    </button>
    <ul class="dropdown-menu" role="menu" aria-labelledby="dropdownMenu1">
        <li role="presentation">
            <a role="menuitem" tabindex="-1" href="<%=basePath%>/customer/toSavePage.do">添加信息功能</a>
        </li>
        <li role="presentation" class="divider"></li>
        <li role="presentation">
            <a role="menuitem" tabindex="-1" href="<%=basePath%>/customer/toListPage.do">分页查询功能</a>
        </li>
    </ul>
</div-->

<br/>
<br/>
<br/>
<h1 class="text-center">${message}</h1>


</body>
</html>
