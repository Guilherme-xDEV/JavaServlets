<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="../../css/project-general-style.css">
    <title>Task Form</title>
</head>
<body>

<h1>Tasks List</h1>

<form action="${pageContext.request.contextPath}/tasks" method="POST">

    <label>Task title:</label>

    <input type="text" name="title">

    <br><br>

    <button type="submit">
        Send
    </button>

</form>

</body>
</html>