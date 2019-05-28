<%--
  Created by IntelliJ IDEA.
  User: 凯
  Date: 2019/5/27
  Time: 16:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
<form action="doCalculate" method="post">
    <input type = "text" name = "add1" size = "2"  value = "${calculator.add1}" />+
    <input type = "text" name = "add2" value = "${calculator.add2}" size = "2"/>=<input type = "text" name = "sum" value = "${calculator.sum}"  size = "2" readonly/><br/>
    <input type = "text" name = "mult1" value = "${calculator.mult1}" size = "2"/>*
    <input type = "text" name = "mult2" value = "${calculator.mult2}"  size = "2"/>=<input type = "text" name = "product" value = "${calculator.product}"   size = "2" readonly/><br/>
    <input type = "submit" value = "Submit"/>

</form>

<div>
    <ul>
        <c:forEach items="${errors}" var="error">
            <li>${error}</li>
        </c:forEach>
    </ul>
</div>

</body>
</html>
