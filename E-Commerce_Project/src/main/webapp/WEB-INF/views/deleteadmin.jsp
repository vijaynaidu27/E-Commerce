<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>

<head>
    <title>sudo Admin Management Application</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

    <script>
        function confirmDelete() {
            if (confirm("Are you sure you want to delete?")) {
                return true;
            } else {
                redirectToSudoList(); // Call function to redirect
                return false; // Prevent form submission
            }
        }
    
        function redirectToSudoList() {
            window.location.href = "/deletecancle"; // Redirect to SudoList.jsp
        }
    </script>
</head>

<body>

    <header>
        <nav class="navbar navbar-expand-md navbar-dark" style="background-color: tomato">
            <div>
                <h1> Delete Sudo Admin Details </h1>
            </div>
        </nav>
    </header>

    <br>

    <div class="container col-md-5">
        <div class="card">
            <div class="card-body">

                <form action="delete" method="post" onsubmit="return confirmDelete()">

                    <fieldset class="form-group">
                        <label>Id</label> <input type="text" value="<c:out value='${sudo.userLoginId}' />" class="form-control" name="userid" readonly>
                    </fieldset>

                    <fieldset class="form-group">
                        <label>Password</label> <input type="password" value="<c:out value='${sudo.userLoginId}' />" class="form-control" name="pwd" hidden>
                    </fieldset>

                    <fieldset class="form-group">
                        <label> Role Name</label> <input type="text" value="<c:out value='${sudo.userRoleName}' />" class="form-control" name="rname" readonly>
                    </fieldset>

                    <fieldset class="form-group">
                        <label> User Name </label> <input type="text" value="<c:out value='${sudo.userName}' />" class="form-control" name="name" readonly>
                    </fieldset>

                    <fieldset class="form-group">
                        <label>Mobile Number </label> <input type="number" value="<c:out value='${sudo.userContactMobileNumber}' />" class="form-control" name="phno" readonly>
                    </fieldset>

                    <fieldset class="form-group">
                        <label> Email Id</label> <input type="text" value="<c:out value='${sudo.userContactEmailId}' />" class="form-control" name="email" readonly>
                    </fieldset>

                    <button type="submit" class="btn btn-danger" name="action" value="delete">Delete</button>

                    <a href="/deletecancle" class="btn btn-secondary"> cancle </a>
                  

                </form>
            </div>
        </div>
    </div>
</body>

</html>