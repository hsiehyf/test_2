<%--
  Created by IntelliJ IDEA.
  User: 谢宇飞
  Date: 2019/10/18
  Time: 11:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Title</title>
  </head>
  <body>
     <form name="phoneNum" action="servlets/Servlet" method="post">
       姓名:<input name="name" type="text"><br>
       电话:<input name="phone" type="text">(格式为ddd-dddd-dddd)<br>
       <input type="submit" value="提交">
     </form>
  </body>
</html>
