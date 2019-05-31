<%--
  Created by IntelliJ IDEA.
  User: 凯
  Date: 2019/5/27
  Time: 17:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Starbuck's</title>
    <style>
        .evenRow {background-color: cyan;}
        .oddRow {background-color: yellow;}
    </style>
</head>
<body>
    <h2>Dear: ${username}</h2>
    <form action="../action/login" method="get">
    Starbuck's ${roast} Roast Coffees:
        <table>
        <c:forEach items="${advice}" var="obj" varStatus="status">
            <tr class="${status.index % 2 == 0 ? 'evenRow' : 'oddRow'}">
                <td>${obj}</td>
            </tr>
        </c:forEach>
        </table>
        <input type="submit" value="Back">
    </form>

</body>
</html>
