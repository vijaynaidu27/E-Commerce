<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Login Form</title>
  <link href='https://unpkg.com/boxicons@2.1.4/css/boxicons.min.css' rel='stylesheet'>
  
  <style type="text/css">
  
  * {
  margin: 0;
  padding: 0;
  box-sizing: border-box;
  font-family: "Poppins", sans-serif;
}

body {
  display: flex;
  justify-content: center;
  align-items: center;
  min-height: 100vh;
  background-color: #f2f2f2; /* Light gray background */
}

.wrapper {
  width: 400px;
  background: #fff; /* White background */
  border: 2px solid #3498db; /* Border color */
  color: #333; /* Text color */
  border-radius: 10px;
  padding: 30px;
  box-shadow: 0 0 20px rgba(0, 0, 0, 0.1); /* Box shadow */
}

.wrapper h1 {
  font-size: 28px;
  text-align: center;
  margin-bottom: 20px;
  color: #3498db; /* Title color */
}

.wrapper .input-box {
  position: relative;
  margin-bottom: 20px;
}

.input-box input {
  width: 100%;
  height: 40px;
  background: #f9f9f9; /* Light gray background */
  border: 1px solid #ccc; /* Border color */
  outline: none;
  border-radius: 5px;
  padding: 10px;
  font-size: 16px;
  color: #555; /* Text color */
}

.input-box input::placeholder {
  color: #aaa; /* Placeholder color */
}

.input-box i {
  position: absolute;
  right: 10px;
  top: 50%;
  transform: translateY(-50%);
  font-size: 18px;
  color: #777; /* Icon color */
}

.remember-forgot {
  display: flex;
  justify-content: space-between;
  align-items: center;
  margin-bottom: 20px;
}

.remember-forgot label {
  font-size: 14px;
  color: #555; /* Text color */
}

.remember-forgot a {
  color: #3498db; /* Link color */
  text-decoration: none;
}

.remember-forgot a:hover {
  text-decoration: underline;
}

.btn {
  width: 100%;
  height: 40px;
  background: #3498db; /* Button background color */
  border: none;
  outline: none;
  border-radius: 5px;
  cursor: pointer;
  font-size: 16px;
  color: #fff; /* Button text color */
  transition: background-color 0.3s;
}

.btn:hover {
  background-color: #2980b9; /* Hover background color */
}

.register-link {
  text-align: center;
}

.register-link p {
  font-size: 14px;
  color: #555; /* Text color */
}

.register-link p a {
  color: #3498db; /* Link color */
  text-decoration: none;
}

.register-link p a:hover {
  text-decoration: underline;
}

  
  </style>
</head>
<script>
  function togglePassword() {
      var passwordField = document.querySelector('input[name="pwd"]');
      if (passwordField.type === "password") {
          passwordField.type = "text";
      } else {
          passwordField.type = "password";
      }
  }
</script>

<body>
  <div class="wrapper">
    <form action="/SudoAdmin" method="post"> <!-- Specify method as POST -->
      <h1>Dashboard Management Login</h1>
      <!-- Add section to display error message -->
      <c:if test="${not empty message}">
          <p style="color: red">${message}</p>
      </c:if>
      <div class="input-box">
        <input type="text" placeholder="Login Id" name="adminId" required>
        <i class='bx bxs-user'></i>
      </div>
      <div class="input-box">
        <input type="password" placeholder="Password"  name="pwd" required>
        <i class='bx bxs-lock-alt' ></i>
      </div>
      <div class="remember-forgot">
        <label>
          <input type="checkbox" id="showPassword" class="show-password" onclick="togglePassword()">
          Show Password
      </label>
      </div>
      <button type="submit" class="btn">Login</button>
    </form>
  </div>
</body>
</html>