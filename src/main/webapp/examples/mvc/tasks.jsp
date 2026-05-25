<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="../../css/project-general-style.css">
    <title>Tasks</title>
</head>
<body>

<h1>Task List</h1>

<ul>

    <c:forEach var="task" items="${tasks}">

        <li>

            ${task.title}

            <c:if test="${task.completed}">
            </c:if>

            <c:if test="${not task.completed}">

            </c:if>

        </li>

    </c:forEach>

</ul>

</body>
</html>