<%@ page contentType="text/html;charset=UTF-8" %>

<!DOCTYPE html>
<html>
<head>

    <title>Create Task</title>

    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/css/project-general-style.css">

</head>
<body>

<div class="intro-container">

    <h1>Create Task</h1>

    <form action="${pageContext.request.contextPath}/tasks"
          method="POST"
          class="task-form">

        <label>Task title</label>

        <input
            type="text"
            name="title"
            required>

        <label>Description</label>

        <textarea
            name="description"
            rows="5"
            placeholder="Describe the task..."></textarea>

        <button type="submit">
            Create Task
        </button>

    </form>

</div>
</body>
</html>