<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div>
	<form:form commandName="product" enctype="multipart/form-data">

		<div class="">
			<label for="productName" class=" "> <spring:message text=""
					code="addProduct.form.productName.label" />
			</label>
			<div class=" ">
				<form:input path="productName" cssClass=" " required="required" />
				<form:errors path="productName" />
			</div>
		</div>

		
		<div class="">
			<label for="productDescription" class=" "> <spring:message
					text="" code="addProduct.form.productDescription.label" />
			</label>
			<div class=" ">
				<form:textarea path="productDescription" cssClass=" "
					required="required"  />
				<form:errors path="productDescription" />
			</div>
		</div>



 		<div class="">
			<label for="productEndDate" class=" "> <spring:message
					text="" code="addProduct.form.productEndDate.label" />
			</label>
			<div class=" ">
				<form:input path="productEndDate" cssClass=" " required="required"
					type="" />
				<form:errors path="productEndDate" />
			</div>
		</div>
		
		<div class="">
			<label for="productInitialPrice" class=" "> <spring:message
					text="" code="addProduct.form.productInitialPrice.label" />
			</label>
			<div class=" ">
				<form:input path="productInitialPrice" cssClass=" "
					required="required" type="number" />
				<form:errors path="productInitialPrice" />
			</div>
		</div>

	
		 <div class="">
			<label for="productImage" class=" "> <spring:message text=""
					code="addProduct.form.productImage.label" />
			</label>
			<div class=" ">
				<form:input path="productImage" cssClass=" " required="required"
					type="file" />
				<form:errors path="productImage" />
			</div>
		</div>

	
		
		<div class="">

			<div class=" ">
				<input type="submit" value="Save" class=" ">
			</div>

		</div>




	</form:form>



</div>

