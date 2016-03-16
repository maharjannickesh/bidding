<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<div class="">

<table class="">
<thead>
	<tr>
		<th> <spring:message code="list.product.sno"/> </th>
		<th><spring:message code="list.product.name"/></th>
		<th><spring:message code="list.product.details"/></th>
		<th><spring:message code="list.product.startdate"/> </th>
		<th><spring:message code="list.product.enddate"/></th>
		<th><spring:message code="list.product.delete"/></th>
		
	</tr>

</thead>
<tbody>


${product}

 <c:forEach items="${ product }" var="products">
<tr>
		<td>1</td>
		<td>${products.productName }</td>
		<td>${products.productDescription }</td>
		<td>${products.productStartDate }</td>
		<td>${products.productStartDate }</td>
		<td>${products.productEndDate }</td>
		<td><a href='<c:url value="/product/delete/${products.id }"/>'> Delete </a></td>
		
	</tr>

</c:forEach>  
	
</tbody>

</table>

</div>


</body>
</html>