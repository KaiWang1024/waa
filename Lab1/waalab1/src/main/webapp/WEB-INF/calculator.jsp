<%--
  Created by IntelliJ IDEA.
  User: 凯
  Date: 2019/5/27
  Time: 16:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
<form action="calc2" method="post">
    <input type = "text" name = "add1" size = "2"  value = "" />+
    <input type = "text" name = "add2" value = "" size = "2"/>=<input type = "text" name = "sum" value = ""  size = "2" readonly/><br/>
    <input type = "text" name = "mult1" value = "" size = "2"/>*
    <input type = "text" name = "mult2" value = ""  size = "2"/>=<input type = "text" name = "product" value = ""   size = "2" readonly/><br/>
    <input type = "submit" value = "Submit"/>

</form>
</body>
</html>
