<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>



<div id="header">
	<h1>HOPE IS ALIVE</h1>

</div>
<div id="menu">
	<a href="welcome.jsp"><button>HOME</button></a> <a href="#"><button>MY
			PROFILE</button></a> <a href="#"><button>CONTACT US</button></a> <a href="#"><button>ABOUT
		</button></a>
</div>


<legend>
	<div id="section">
		<h2>${product.productName }</h2>
		<p>
			<img src=" " />
		</p>
		<div>
			<em>About: </em>
			<p>${product.productDescription }</p>
		</div>
		<div>
			<em>Inital Price: </em> ${product.productInitialPrice }
		</div>
		<div>
			<em>Bid EndTime: </em> ${product.productEndDate }
		</div>



		<div>


			<form:form commandName="bid" method="POST">

				<div>
					<label>Bid Amount: </label> 
					<form:input path="bidAmount" type="number" min="100" />

				</div>

				<div>
					<input type="submit" value="Bid">

				</div>

			</form:form>



		</div>
	</div>
</legend>
