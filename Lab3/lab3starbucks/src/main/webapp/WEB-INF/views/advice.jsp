<%--
  Created by IntelliJ IDEA.
  User: 凯
  Date: 2019/5/27
  Time: 17:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Starbuck's</title>
</head>
<body>
    <h2>Ask for advise about your favorite roast</h2>
    <form action="../action/advice" method="get">
        <select name="roast">
            <c:forEach var="opt" items="${options}">
                <option value="${opt[0]}">${opt[1]}</option>
            </c:forEach>
        </select><br><br>
        <input type="submit" value="Submit">
    </form>
</body>
</html>
