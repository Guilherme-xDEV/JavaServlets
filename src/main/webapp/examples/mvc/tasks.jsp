<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="../../css/project-general-style.css">
    <title>Tasks</title>
</head>
<body>
<div class="intro-container">

    <div class="title">
        <h1>Task List</h1>
    </div>


    <c:if test="${empty tasks}">

        <div class="empty-state">
            No tasks created yet.
        </div>

    </c:if>

    <div class="task-list">

        <c:forEach var="task" items="${tasks}">

            <div class="task-card">

                <div class="task-header">

                    <h2>${task.title}</h2>

                    <c:choose>

                        <c:when test="${task.completed}">
                            <span class="completed">
                                Completed
                            </span>
                        </c:when>

                        <c:otherwise>
                            <span class="pending">
                                Pending
                            </span>
                        </c:otherwise>

                    </c:choose>

                </div>

                <p class="description">

                    ${task.description}

                </p>

            </div>

        </c:forEach>

    </div>

</div>

</body>
</html>