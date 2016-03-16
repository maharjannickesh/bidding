<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="formBody">
<form:form commandName="product" autocomplete="off"
	enctype="multipat/form-data">

	<div>
		<label for="productName"> <spring:message text=""
				code="addProduct.form.productName.label" />
		</label>
		<div>
			<form:input path="productName" required="required" />
			<form:errors path="productName" />
		</div>
	</div>

	<div>
		<label for="productDescription"><spring:message text=""
				code="addProduct.form.productDescription.label" />:</label>
		<div>
			<form:input path="productDescription" required="required" />
			<form:errors path="productDescription" />
		</div>
	</div>

	<div>
		<label for="productImage"><spring:message text=""
				code="addProduct.form.productImage.label" />:</label>
		<div>
			<form:input type="file" path="productImage" required="required" />
			<form:errors path="productImage" />
		</div>
	</div>

	<div>
		<label for="productStartDate"><spring:message text=""
				code="addProduct.form.productStartDate.label" />:</label>
		<div>
			<form:input path="productStartDate" required="required" type="date" />
			<form:errors path="productStartDate" />
		</div>
	</div>

	<div>
		<label for="productEndDate"><spring:message text=""
				code="addProduct.form.productEndDate.label" />:</label>
		<div>
			<form:input path="productEndDate" required="required" type="date" />
			<form:errors path="productEndDate" />
		</div>
	</div>

	<div>
		<label for="productInitialPrice"><spring:message text=""
				code="addProduct.form.productInitialPrice.label" />:</label>
		<div>
			<form:input path="productInitialPrice" required="required" />
			<form:errors path="productInitialPrice" />
		</div>
	</div>

	<div>
		<div>
			<input type="submit" value="Save">
		</div>
	</div>
</form:form>
</div>