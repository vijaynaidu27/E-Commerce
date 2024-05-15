<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
  <html>

        <head>
            	<title>sudo admin Management App</title>
               
                <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
       
        </head>

        <body>

            <header>
                <nav class="navbar navbar-expand-md navbar-dark" >
                    <div>
                         <h1>  sudo admin Management App </h1> 
                    </div>
                    
                </nav>
            </header>
            
            
            <br>

            <div class="row">

                <div class="container">
                    <h3 class="text-center">List of Users</h3>
                    <hr>
                    <div class="container text-left">

                       <a href="<%=request.getContextPath()%>/newuser" class="btn btn-success">Add
     New Admin User</a> 
                       <a href="<%=request.getContextPath()%>/roleAdmin" class="btn btn-secondary">Role UserManagement
    </a> 
                    <a href="<%=request.getContextPath()%>/adminpanel" class="btn btn-danger"> LogOut </a> 
<div class="container text-right">
     <h4> Root Admin Name : <c:out value="${name}" /> </h4>
</div>
                    </div>
                    <br>
                    <table class="table table-bordered">
                        <thead>
                            <tr>
                                <th>ID </th>
                                <th>ROLE NAME </th>
                                <th>NAME</th>
                                <th>MOBILE NO </th>                
                                <th>EMAIL ID </th>  
                                <th>ACTION </th>                         
                                
                            </tr>
                        </thead>
                        <tbody>
                            <!--   for (Todo todo: todos) {  -->
                            <c:forEach var="sudo" items="${sudoAdminList}">

                                <tr>
                                    <td>
                                        <c:out value="${sudo.userLoginId}" />
                                    </td>
                                    
                                    <td>
                                        <c:out value="${sudo.userRoleName}" />
                                    </td>
                                    <td>
                                        <c:out value="${sudo.userName}" />
                                    </td>
                                    <td>
                                        <c:out value="${sudo.userContactMobileNumber}" />                                   
                            
                                    </td>
                                    
                                     <td>
                                        <c:out value="${sudo.userContactEmailId}" />                        
                          
                                    </td>
                                    
                             
                                     
                                    
                                    <td> <a href="editadmin?userid=<c:out value='${sudo.userLoginId}' />"> Edit </a> &nbsp;&nbsp;&nbsp;&nbsp; 
                                        
                                        <a href="deleteadminid?userid=<c:out value='${sudo.userLoginId}' />">Delete</a> &nbsp;&nbsp;&nbsp; <a href="changePassword?adminid=<c:out value='${sudo.userLoginId}' />"> changepassword</a>
                                    </td>
                                </tr>
                            </c:forEach>
                            
                        </tbody>

                    </table>
                </div>
            </div>
        </body>

   </html>