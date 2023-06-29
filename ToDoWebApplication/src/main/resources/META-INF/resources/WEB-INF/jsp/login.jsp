<html>
<head>
    <style>
        body {
            background-color: #222;
            color: #fff;
        }
        .container {
            width: 400px;
            margin: 0 auto;
            padding: 20px;
        }
        h1 {
            text-align: center;
        }
        input {
            width: 100%;
            padding: 10px;
            margin-bottom: 10px;
            border: 1px solid #ccc;
        }
        input[type="submit"] {
            background-color: #000;
            color: #fff;
            border: none;
            cursor: pointer;
        }
    </style>
    <title>Login Page</title>
</head>
<body>
<div class="container">
    <h1>Login</h1>
    <pre>${errorMessage}</pre>
    <form action="" method="post">
        <input type="text" name="username" placeholder="Username">
        <input type="password" name="password" placeholder="Password">
        <input type="submit" value="Login">
    </form>
</div>
</body>
</html>
