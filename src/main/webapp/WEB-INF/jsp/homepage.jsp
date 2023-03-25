<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2023/3/14
  Time: 12:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>首页</title>

    <meta name="renderer" content="webkit|ie-comp|ie-stand"> //元数据 告诉浏览器以什么内核模式打开网页 meta也可以设置网页关键词和描述
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"> //如果安装了谷歌GCF，则使用GCF来渲染页面，如果未安装GCF则使用最高版本的IE内核来进行渲染。（解决浏览器不兼容问题）
    <meta name="viewport" content="width=device-width,user-scalable=yes,minimum-scale=0.4.initial-scale=0.8,target-densitydpi=low-dpi">//设置移动端的显示

    <link rel="icon" href="/images/favicon.ico" sizes="32*32">
    <link rel="stylesheet" href="/css/font.css">
    <link rel="stylesheet" href="/css/xadmin.css">

    <script type="text/javascript" src="/js/jquery-1.3.2.min.js"></script> //type指定javascript，不过不写type默认的话也是
    <script type="text/javascript" src="/js/xadmin.js"></script>
    <script src="/LayUI/layui/layui.js"></script> //模块化引用layui主要js
    <script src="/LayUI/layui_exts/excel.js"></script>  //引用layui拓展模块excel.js

    <style>
        .o_div{
            background: url("/images/01.jpg") no-repeat;
        }
        o.span{
            display: block;
            text-align: center;
            font-size: 20px;
            letter-spacing: 8px;
        }
    </style>
</head>
<body>
<!--顶部-->
<div class="container">
    <div class="logo"><a>宿舍管理系统</a></div>
    <div class="left_open">
        <i title="展开左侧栏" class="iconfont"></i> <%--斜体字--%>
    </div>

<%--    <ul class="layui-nav right" lay---%>

</div>
</body>
</html>
