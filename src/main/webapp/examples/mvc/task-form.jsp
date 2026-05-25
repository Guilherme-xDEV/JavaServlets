<!DOCTYPE html>
<html>
<head>
    <title>Task Form</title>
</head>
<body>

<h1>Create Tasks</h1>

<form action="/servlet/tasks" method="POST">

    <label>Task title:</label>

    <input type="text" name="title">

    <br><br>

    <button type="submit">
        Send
    </button>

</form>

</body>
</html>