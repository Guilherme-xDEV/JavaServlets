<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="../../css/project-general-style.css">
    <title>MVC Register</title>
</head>
<body>

    <h1>Register User</h1>

    <form action="/servlet/register" method="POST">
        
        <label>Name:</label>
        <input type="text" name="name">

        <label>Email:</label>
        <input type="email" name="email">

        <button type="submit">Register</button>

    </form>
    
</body>
</html>