<%--
  Created by IntelliJ IDEA.
  User: ttn
  Date: 18/3/19
  Time: 10:49 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student Controller</title>
</head>
<body>
    <a href="student">
        <b>Click here to view student controller via method 'student'</b>
    </a><br>
    <a href="responseMultiActionController">
        <b>Click here to view student controller via method 'responseMultiActionController'</b>
    </a><br>
    <a href="hello">
        <b>Click here to view student controller via method 'hello'</b>
    </a><br>
    <a href="helloWorld">
        <b>Click here to view student controller via method 'hello'</b>
    </a><br><br>

    <form method="post" action="/requestParam" style="display: inline-block; border: black 1px solid; width: 300px; padding: 10px">
        <b>REQUEST PARAM EXAMPLE</b><br><br>
        Username : <input type="text" name="username"><br><br>
        Age : <input type="text" name="age"><br><br>
        <input type="submit" value="Submit"/>
    </form>

    <form method="post" action="/submit" style="display: inline-block; border: black 1px solid; width: 460px; padding: 10px">
        <b>Student CO(Command Object) EXAMPLE with @ModelAttribute</b><br><br>
        Username : <input type="text" name="name"><br><br>
        Age : <input type="text" name="age"><br><br>
        <input type="submit" value="Submit"/>
    </form>
</body>
</html>