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
  
  *{
  margin: 0;
  padding: 0;
  box-sizing: border-box;
  font-family: "Poppins", sans-serif;
}
body{
  display: flex;
  justify-content: center;
  align-items: center;
  min-height: 100vh;
  background-size: cover;
}
.wrapper{
  width: 420px;
  background: rgba(0, 0, 0, 0.5); /* Semi-transparent background */
  border: 2px solid rgba(255, 255, 255, .2);
  color: #fff;
  border-radius: 12px;
  padding: 30px 40px;
}
.wrapper h1{
  font-size: 36px;
  text-align: center;
  margin-bottom: 30px; /* Increase spacing between title and inputs */
}
.wrapper .input-box{
  position: relative;
  width: 100%;
  height: 50px;
  margin: 20px 0; /* Reduce spacing between input boxes */
}
.input-box input{
  width: 100%;
  height: 100%;
  background: transparent;
  border: none;
  outline: none;
  border: 2px solid rgba(255, 255, 255, 0.679);
  border-radius: 40px;
  font-size: 16px;
  color: #eeeaeabe;
  padding: 20px 45px 20px 20px;
}
.input-box input::placeholder{
  color: #5b4c4c;
}
.input-box i{
  position: absolute;
  right: 20px;
  top: 30%;
  transform: translate(-50%);
  font-size: 20px;

}
.wrapper .remember-forgot{
  display: flex;
  justify-content: space-between;
  font-size: 14.5px;
  margin: -15px 0 15px;
}
.remember-forgot label input{
  accent-color: #fff;
  margin-right: 3px;

}
.remember-forgot a{
  color: #fff;
  text-decoration: none;

}
.remember-forgot a:hover{
  text-decoration: underline;
}
.wrapper .btn{
  width: 100%;
  height: 45px;
  background: #ffffff;
  border: none;
  outline: none;
  border-radius: 40px;
  box-shadow: 0 0 10px rgba(48, 33, 33, 0.1);
  cursor: pointer;
  font-size: 16px;
  color: #231313de;
  font-weight: 600;
}
.wrapper .register-link{
  font-size: 14.5px;
  text-align: center;
  margin: 20px 0 15px;

}
.register-link p a{
  color: #fff;
  text-decoration: none;
  font-weight: 600;
}
.register-link p a:hover{
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
    <form action="/save" method="post"> <!-- Specify method as POST -->
      <h1>Login</h1>
      <!-- Add section to display error message -->
      <c:if test="${not empty message}">
          <p style="color: red">${message}</p>
      </c:if>
      <div class="input-box">
        <input type="text" placeholder="Username" name="adminId" required>
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
        <a href="#">Forgot Password</a>
      </div>
      <button type="submit" class="btn">Login</button>
      <div class="register-link">
        <p>Don't have an account? <a href="#">Register</a></p>
      </div>
      
    </form>
  </div>
</body>
</html>