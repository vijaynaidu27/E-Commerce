<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
        <html>

        <head>
            <title>sudo Admin Management Application</title>
            <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        </head>

        <body>

            <header>
                <nav class="navbar navbar-expand-md navbar-dark" style="background-color: tomato">
                    <div>
                        <h1> Edit Sudo Admin Details </h1>             
      				 </div>               
                </nav>
            </header>
            
            <br>
            
            <div class="container col-md-5">
                <div class="card">
                    <div class="card-body">                      
                       
                        <form action="updated" method="post">   
                        
                        <fieldset class="form-group">
                            <label>User </label> <input type="text"   class="form-control" name="uid" value="${user.userLoginId}" readonly />
                        </fieldset>

                        <fieldset class="form-group">
                            <label>password </label> <input type="text"   class="form-control" name="password" value="${user.userPassword}" hidden />
                        </fieldset>
              
                        <fieldset class="form-group">
                            <label>User Role Name</label> <input type="text"   class="form-control" name="rolename" value="${user.userRoleName}"  readonly/>
                        </fieldset>

                        <fieldset class="form-group">
                            <label>User  Name</label> <input type="text"   class="form-control" name="name" value="${user.userName}" />
                        </fieldset>

                        <fieldset class="form-group">
                            <label>User Mobile Num</label> <input type="text" class="form-control" name="mobilenum" value="${user.userContactMobileNumber}"/>
                        </fieldset>

                        <fieldset class="form-group">
                            <label>User Email Id </label> <input type="text"  class="form-control" name="emailid" value="${user.userContactEmailId}" />
                        </fieldset>

                        	<button type="submit" class="btn btn-success">Save</button> 

                                <a href="<%=request.getContextPath()%>/sudoadmin?name=Vijay" class="btn btn-danger">Back</a>

                        </form>
                    </div>
                </div>
            </div>
        </body>

        </html>s