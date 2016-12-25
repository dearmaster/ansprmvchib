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

        <div style="height: 150px;width: 1000px;background-image: url('<%=ctx %>/image/banner.png')"></div>
        <div id="header">
            <ul class="nav nav-pills">
                <li><a href="#/">首页</a></li>
                <li><a href="#/client">客户管理</a></li>
                <li><a href="#/transaction">交易管理</a></li>
                <li><a href="#/report">报表管理</a></li>
                <li><a href="#/other">其他</a></li>
            </ul>
        </div>

        <div id="content" ng-view></div>

    </div>


    <script src="<%= ctx%>/js/angular.js"></script>
    <script src="<%= ctx%>/js/angular-route.js"></script>
    <script src="<%= ctx%>/js/RouteConfigApp.js"></script>
    <script src="<%= ctx%>/controller/ClientController.js"></script>


</body>
</html>