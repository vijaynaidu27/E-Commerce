<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
        <html>

        <head>
            <title>sudo admin Management Application</title>
            <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        </head>

        <body>

            <header>
                <nav class="navbar navbar-expand-md navbar-dark" style="background-color: tomato">
                    <div>
                        <h1> sudo admin Management App </h1>             
      				 </div>               
                </nav>
            </header>
            
            <br>
            
            <div class="container col-md-5">
                <div class="card">
                    <div class="card-body">                      
                       
                        <form action="/insert" method="post"> 
                            
                            <fieldset class="form-group">
                                <label>User Id</label> <input type="text"   class="form-control" name="id" required="required"/>
                            </fieldset>

                            <fieldset class="form-group">
                                <label>User Password</label> <input type="text"   class="form-control" name="pass" required="required"/>
                            </fieldset>
              


                       <fieldset class="form-group">
                            		<label for="cars">Choose a Sudo Admin Role:</label>
    <select id="roleName" name="roleName">
        <c:forEach var="role" items="${roleList}">
        	
            <option value="${role.roleName}">${role.roleName}</option>
            
        </c:forEach>
       
    </select><br><br>
    </fieldset>



                        <fieldset class="form-group">
                            <label>User Name</label> <input type="text" class="form-control" name="name"/>
                        </fieldset>

                        <fieldset class="form-group">
                            <label>User Mobile Num </label> <input type="text"  class="form-control" name="mobilenum"/>
                        </fieldset>

                        <fieldset class="form-group">
                            <label>User Email Id </label> <input type="text"  class="form-control" name="emailid"/>
                        </fieldset>

                        	<button type="submit" class="btn btn-success">Save</button>

                                <a href="<%=request.getContextPath()%>/sudoadmin?name=Vijay" class="btn btn-danger">Back</a>
                        </form>
                    </div>
                </div>
            </div>
        </body>

        </html>