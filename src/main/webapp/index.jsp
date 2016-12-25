<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%
    String ctx = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>This is index page</title>
    <link rel="stylesheet" href="<%= ctx%>/css/bootstrap.css">
    <link rel="stylesheet" href="<%= ctx%>/css/ash.css">
</head>
<body ng-app="RouteConfigApp">

    <div id="main">

        <div id="banner">
            <div id="log-reg">
                <a href="#/user/login">登录</a>
                |
                <a href="#/user/register">注册</a>
            </div>
        </div>
        <div id="nav">
            <ul class="nav nav-pills">
                <li><a href="#/">首页</a></li>
                <li><a href="#/client">客户管理</a></li>
                <li><a href="#/transaction">交易管理</a></li>
                <li><a href="#/report">报表管理</a></li>
                <li><a href="#/other">其他</a></li>
            </ul>
        </div>

        <div class="panel panel-primary" id="main-container">
            <div class="panel-heading" data-toggle="collapse" href="#content">
                <%--<h3 class="panel-title">所有用户</h3>--%>
            </div>
            <div class="panel-body panel-collapse collapse in" id="content">
                <div ng-view></div>
            </div>
        </div>

    </div>


    <script src="<%= ctx%>/js/angular.js"></script>
    <script src="<%= ctx%>/js/angular-route.js"></script>
    <script src="<%= ctx%>/js/RouteConfigApp.js"></script>
    <script src="<%= ctx%>/js/jquery-2.1.1.js"></script>
    <script src="<%= ctx%>/js/bootstrap.js"></script>
    <script src="<%= ctx%>/controller/ClientController.js"></script>


</body>
</html>