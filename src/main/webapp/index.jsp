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
</head>
<body ng-app="RouteConfigApp">

<h2>AngularJS 路由应用</h2>
<ul>
    <li><a href="#/">首页</a></li>
    <li><a href="#/client">客户管理</a></li>
    <li><a href="#/transaction">交易管理</a></li>
    <li><a href="#/report">报表管理</a></li>
    <li><a href="#/other">其他</a></li>
</ul>

<div ng-view></div>
<script src="<%= ctx%>/js/angular.js"></script>
<script src="<%= ctx%>/js/angular-route.js"></script>
<script src="<%= ctx%>/js/RouteConfigApp.js"></script>
<script src="<%= ctx%>/controller/ClientController.js"></script>


</body>
</html>