<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
</head>
<body>

<h1>Registration Form</h1><br />

<form:form modelAttribute="student" method="post">
    <form:errors path="*" cssStyle="color : red;" />
    <p>ID:
        <form:input path="id"></form:input>
        <form:errors path="id" cssStyle="color : red;" />
    </p>
    <p>First Name:
        <form:input path="firstName"></form:input>
        <form:errors path="firstName" cssStyle="color:red;" />
    </p>
    <p>Last Name:
        <form:input path="lastName"></form:input>
        <form:errors path="lastName" cssStyle="color : red;" />
    </p>
    <p>Phone:
        <form:input path="phone.area" />-<form:input path="phone.prefix" />-<form:input path="phone.number" />
        <form:errors path="phone.area" cssStyle="color : red;" />
        <form:errors path="phone.prefix" cssStyle="color : red;" />
        <form:errors path="phone.number" cssStyle="color : red;" />
    </p>
    <p>Email:
        <form:input path="email"></form:input>
        <form:errors path="email" cssStyle="color : red;" />
    </p>
    <p>Birthday:
        <form:input path="birthday"></form:input>
        <form:errors path="birthday" cssStyle="color : red;" />
    </p>
    <p>Gender:
        <form:select path="gender">
            <form:option value="f" label="Female" />
            <form:option value="m" label="Male" />
        </form:select>
        <form:errors path="gender" cssStyle="color : red;" />
    </p>

    <p>
        <input type="submit" value="Register">
    </p>

</form:form>
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
 
</body>
</html>