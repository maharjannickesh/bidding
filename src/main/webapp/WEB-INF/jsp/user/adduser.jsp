<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div>

	<form:form commandName="user"
		cssClass="form-horizontal registrationForm" autocomplete="off">

		<div class="form-group">
			<label for="userName" class="col-sm-2 control-label"> <spring:message
					text="" code="addUser.form.userName.label" />
			</label>
			<div class="col-sm-10">
				<form:input path="userName" cssClass="form-control"
					required="required" />
				<form:errors path="userName" />
			</div>
		</div>

		<div class="form-group">
			<label for="userEmail" class="col-sm-2 control-label"><spring:message
					text="" code="addUser.form.userEmail.label" />:</label>
			<div class="col-sm-10">
				<form:input path="userEmail" cssClass="form-control"
					required="required" />
				<form:errors path="userEmail" />
			</div>
		</div>

		<div class="form-group">
			<label for="userPassword" class="col-sm-2 control-label"><spring:message
					text="" code="addUser.form.userPassword.label" />:</label>
			<div class="col-sm-10">
				<form:input path="userPassword" cssClass="form-control"
					required="required" type="password" />

				<form:errors path="userPassword" />
			</div>
		</div>

		<div class="form-group">
			<label for="password" class="col-sm-2 control-label"><spring:message
					text="" code="adduser.form.userConfirmPassword.label" /> :</label>
			<div class="col-sm-10">
				<input type="password" id="password_again" class="form form-control"
					name="password-again" required="required">
			</div>
		</div>

		<div class="form-group">
			<label for="userRole" class="col-sm-2 control-label"><spring:message
					text="" code="adduser.form.userRole.label" /> :</label>
			<div class="col-sm-10">
				<form:radiobutton path="userRole" value="ROLE_ADMIN"
					required="required" />
				Admin
				<form:radiobutton path="userRole" value="ROLE_USER"
					required="required" />
				User

			</div>
		</div>

		<div class="form-group">

			<div class="col-sm-10">
				<input type="submit" value="Save" class="btn btn-large btn-primary">
			</div>

		</div>



	</form:form>

</div>

</body>
</html>