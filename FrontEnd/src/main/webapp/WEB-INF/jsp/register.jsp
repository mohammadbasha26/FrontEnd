<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>


 	<link href="<c:url value="/resources/css/bootstrap.min.css"  />" rel="stylesheet">
	<script type="text/javascript" src="<c:url value="/resources/js/jquery-3.2.1.js"/>"></script>
	<script type="text/javascript" src="<c:url value="/resources/js/bootstrap.min.js"/>"></script>
  


<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<div class="container">
            <f:form class="form-horizontal" role="form" method="post" modelAttribute="u" action="saveRegister">
                <h2>Registration Form</h2>
                <div class="form-group">
                    <label for="firstName" class="col-sm-3 control-label">User Name</label>
                    <div class="col-sm-9">
                        <f:input path="UserName"  placeholder="User Name" class="form-control" />
                        <span class="help-block"> </span>
                    </div>
                </div>
                <div class="form-group">
                    <label for="email" class="col-sm-3 control-label">Email</label>
                    <div class="col-sm-9">
                        <f:input  path="EmailID" id="email" placeholder="Email" class="form-control"/>
                    </div>
                </div>
                <div class="form-group">
                    <label for="password" class="col-sm-3 control-label">Password</label>
                    <div class="col-sm-9">
                        <f:input path="Password" id="password" placeholder="Password" class="form-control"/>
                    </div>
                </div>
                
                
                
                
                  <div class="form-group">
                    <label for="firstName" class="col-sm-3 control-label">Mobile</label>
                    <div class="col-sm-9">
                        <f:input path="MobileNO" placeholder="Mobile" class="form-control"/>
                    </div>
                </div>
               
              
                <div class="form-group">
                    <label class="control-label col-sm-3">Gender</label>
                    <div class="col-sm-6">
                        <div class="row">
                            <div class="col-sm-4">
                                <label class="radio-inline">
                                   <f:radiobutton path="gender" value="F"/>Female
                                </label>
                            </div>
                            <div class="col-sm-4">
                                <label class="radio-inline">
                                   <f:radiobutton path="gender" value="M"/>Male
                                </label>
                            </div>
                                                 </div>
                    </div>
                </div> <!-- /.form-group -->
              <div class="form-group">
                                  <label for="address" class="col-sm-3 control-label">Addess</label>
                                                      <div class="col-sm-9">
                                  
              <f:textarea path="UserAddress" class="form-control" placeholder="address"/>
              </div>
              </div>
                <div class="form-group">
                    <div class="col-sm-9 col-sm-offset-3">
                        <button type="submit" class="btn btn-primary btn-block">Register</button>
                    </div>
                </div>
            </f:form> <!-- /form -->
        </div> <!-- ./container -->
</body>
</html>