<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Angel Prints</title>
    <style>
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }
        body {
            display: flex;
            flex-direction: column;
            min-height: 100vh; /* Make body at least viewport height */
            overflow: hidden; /* Prevent overflow from causing scrolling */
            background-color: #000; /* Set body background color to black */
            color: #fff; /* Set text color to white */
        }
        #wrapper {
            width: 100%;
            height: 100vh;
            display: flex;
            justify-content: center;
            align-items: center;
        }
        #background-animation {
            position: absolute;
            top: 0;
            left: 0;
            width: 100%;
            height: 100%;
            z-index: -1; /* Ensure it stays behind other content */
            animation: backgroundAnimation 10s infinite; /* Adjust animation duration as needed */
        }
        @keyframes backgroundAnimation {
            0% { background-color: #000; } /* Black */
            50% { background-color: #222; } /* Dark Gray */
            100% { background-color: #000; } /* Black */
        }
        #content {
            z-index: 1; /* Ensure content appears above background animation */
            text-align: center;
        }
        #header {
            background-color: #208059;
            padding: 20px 0;
        }
        #header h1 {
            font-family: Verdana;
            color: #fff; /* White text color */
        }
        #center-box {
            background-color: rgba(255, 255, 255, 0.1); /* Transparent white */
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(255, 255, 255, 0.1); /* Add shadow effect */
            display: inline-block;
        }
        #center-box form a {
            display: inline-block;
            background: #48bfcf; /* Light blue background color */
            text-decoration: none;
            border: 1px solid #48bfcf; /* Set border color */
            margin: 10px;
            padding: 10px 20px;
            border-radius: 5px;
            text-align: center;
            font-size: 20px;
            color: #fff; /* White text color */
            transition: background-color 0.3s ease; /* Add transition effect */
        }
        #center-box form a:hover {
            background: #356d35; /* Dark green background color on hover */
            border-color: #356d35; /* Set border color on hover */
        }
        #foot {
            background-color: #208059;
            padding: 20px 0;
            color: #fff; /* White text color */
        }
    </style>
</head>
<body>
    <div id="wrapper">
        <div id="background-animation"></div>
        <div id="content">
            <div id="header">
                <h1>Angel Print</h1>
            </div>
            <div id="center-box">
                <form action="">
                    <a href="login">Login</a>
                    <a href="reset">Reset Password</a>
                    <a href="forget">Forgot Password</a>
                </form>
            </div>
        </div>
    </div>
</body>
</html>
