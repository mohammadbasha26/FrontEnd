<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<html>
   <head>
<%-- <link  href="<c:url value="/resources/css/bootstrap.min.css"></c:url>" rel="stylesheet"/>
 --%>
 
 	<link href="<c:url value="/resources/css/bootstrap.min.css"  />" rel="stylesheet">
	<script type="text/javascript" src="<c:url value="/resources/js/jquery-3.2.1.js"/>"></script>
	<script type="text/javascript" src="<c:url value="/resources/js/bootstrap.min.js"/>"></script>
  
      <title>Hello Spring MVC</title>
   </head>
   <body>
   <a  href="" class="btn-primary"> HHHHHH</a>
   
   
   

<div class="container">
  <h2>Vertical (basic) form</h2>
  <form action="/action_page.php">
    <div class="form-group">
      <label for="email">Email:</label>
      <input type="email" class="form-control" id="email" placeholder="Enter email" name="email">
    </div>
    <div class="form-group">
      <label for="pwd">Password:</label>
      <input type="password" class="form-control" id="pwd" placeholder="Enter password" name="pwd">
    </div>
    <div class="checkbox">
      <label><input type="checkbox" name="remember"> Remember me</label>
    </div>
    <button type="submit" class="btn btn-default">Submit</button>
  </form>
</div>
   
   </body>
</html>