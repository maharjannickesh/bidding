<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<div id="header">
	<h1>HOPE IS ALIVE</h1>

</div>
<div id="menu">
	<a href="welcome.jsp"><button>HOME</button></a> <a href="#"><button>MY
			PROFILE</button></a> <a href="#"><button>CONTACT US</button></a> <a href="#"><button>ABOUT
		</button></a>
</div>

<!-- <div id="nav">
		<table class="test">
			<tr>
				<td><a href="addProduct.jsp">Add Product</a></td>
			<td>	<a href="welcome.jsp"><button>Add Product</button></a></td>
			</tr>
			<tr>
				<td>	<a href="welcome.jsp"><button>View  Products</button></a></td>
			</tr>
			<tr>
				<td>	<a href="welcome.jsp"><button>Auction Products</button></a></td>
			</tr>
			<tr>
				<td>	<a href="welcome.jsp"><button>Marie Claire</button></a></td>
			</tr>
			<tr>
				<td>	<a href="welcome.jsp"><button>Krishna</button></a></td>
			</tr>
			<tr>
				<td>	<a href="welcome.jsp"><button>Nikesh</button></a></td>
			</tr>
		</table>
	</div>
 -->
<c:forEach items="${product }" var="products">

	<legend>
	<div id="section">
		<h2>${products.productName }</h2>
		<p>
			<img src=" " />
		</p>
		<div>
			<em>About: </em>
			<p>${products.productDescription }</p>
		</div>
		<div>
			<em>Inital Price: </em>  ${products.productInitialPrice }
		</div>
		<div>
			<em>Bid EndTime: </em>  ${products.productEndDate }
		</div>
		<div>
		<a href='<c:url value="/bid/details/${products.id }"/>'> 	<button >Bid Now</button> </a>
		</div>
	</div>
	</legend>
</c:forEach>
