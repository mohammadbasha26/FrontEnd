<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


	<nav class="navbar navbar-inverse">
		<div class="container-fluid">
			<div class="navbar-header">

				<li class="active"><a class="navbar-brand"
					href="${pageContext.request.contextPath}/">Toy's Store</a></li>
			</div>
			<ul class="nav navbar-nav">
			
			
			
			<%-- <c:set var="contextRoot" value="${pageContext.request.contextPath}"></c:set>
    
      <li class="active"><a href="${contextRoot}/home">Home</a></li>
      
        
       <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">List <span class="caret"></span></a>
        <ul class="dropdown-menu">
        <li>HHHH</li>
          <c:forEach var="catVal" items="${catList}">
                          <li><a href="${contextRoot}/productCustList?cid=${catVal.categoryID}">${catVal.categoryName}</a></li>
                     </c:forEach>
                    
        </ul>
      
			</li> --%>
			
			
			
				<li class="active"><a
					href="${pageContext.request.contextPath}/home"><span
						class="glyphicon glyphicon-home">&nbsp</span>Home</a></li>

				  <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">List <span class="caret"></span></a>
        <ul class="dropdown-menu">
     
             <c:forEach var="catVal" items="${catList}">
                          <li><a href="${pageContext.request.contextPath}/productCustList?cid=${catVal.categoryID}">${catVal.categoryName}</a></li>
                     </c:forEach>
        </ul>
      </li> 
      
    <li><a href="#">Page 2</a></li>          
				<li class="active"><a
					href='<c:url value="/admin/product"></c:url>'><span
						class="glyphicon glyphicon-pencil">&nbsp</span>Product</a></li>
				<li class="active"><a
					href='<c:url value="/admin/category"></c:url>'><span
						class="glyphicon glyphicon-pencil">&nbsp</span>Category</a></li>
				<li class="active"><a
					href='<c:url value="/admin/supplier"></c:url>'><span
						class="glyphicon glyphicon-import">&nbsp</span>Supplier</a></li>
			</ul>
			<ul class="nav navbar-nav navbar-right">
				<c:if test="${pageContext.request.userPrincipal.name!= null}">

					<li><a>Welcome: ${pageContext.request.userPrincipal.name}</a></li>
					
				</c:if>
				<c:if test="${pageContext.request.userPrincipal.name== null}">

					<li><a href="register"><span
							class="glyphicon glyphicon-user"></span> Sign Up</a></li>
					<li><a href="login"><span
							class="glyphicon glyphicon-log-in"></span> Login</a></li>
				</c:if>
				<li><a href="about"><span class="glyphicon glyphicon-about"></span>
						About Us</a></li>
				<c:if test="${pageContext.request.userPrincipal.name!= null}">

					<li><a href="${pageContext.request.contextPath}/logout"><span
							class="glyphicon glyphicon-about"></span> Logout</a></li>
				</c:if>
			</ul>
		</div>


	</nav>

	<div class="container">
		<h3>Welcome to the Kids World</h3>
		<p>Enjoy with your Dreams</p>
	</div>
