<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Starbuck's</title>
</head>
<body>
<c:if test="${username != null}">
    <h2>Dear: ${username}</h2>
</c:if>

<h2>Ask for advice about your favorite roast:</h2>
<p />
<form action = "action/advice" method="get">
    <select name="roast" <c:if test="${username == null}"> disabled = "disabled" </c:if> >
        <option value="-">--Choose Roast--</option>
        <option value="dark">Dark</option>
        <option value="medium">Medium</option>
        <option value="light">Light</option>
    </select>
    <br/><br/>
    <input type="submit" value = "Submit" <c:if test="${username == null}"> disabled = "disabled" </c:if> />
</form>
    <div id="logout">
        <c:if test="${username != null}">
        <p />
        <form action="action/logout" method="get">
            <input type="submit" value="Logout">
        </form>
    </div>
</c:if>

<c:if test="${username == null}">
<div id='login'>

    <p />
    Login:
    <form action = "action/login" method = "post">
        Name: <input type = "text" name = "name" size = "9" /><br/>
        Password: <input type = "password" name = "password" size = "9" /><br/>
        <br/>
        <input type="submit" value = "Log In"/>
    </form>
</div>
</c:if>
</body>
</html>
