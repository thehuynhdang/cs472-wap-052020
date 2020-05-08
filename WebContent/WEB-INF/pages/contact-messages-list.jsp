<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="layout" tagdir="/WEB-INF/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<layout:pagelayout>
	<jsp:body>
		<div class="container"><br>
		    <h2>List of Contact Messages</h2>
		    <br>
	        <table class="table table-striped">
	            <thead>
	            <tr>
	                <th scope="col">#</th>
	                <th scope="col">Customer Name</th>
	                <th scope="col">Gender</th>
	                <th scope="col">Category</th>
	                <th scope="col">Message</th>
	                <th scope="col">&nbsp;</th>
	                <th scope="col">&nbsp;</th>
	            </tr>
	            </thead>
	            <tbody>
	                <c:forEach var="contactData" items="${contactMessages}" varStatus="iteration">
	                    <tr>
	                        <th scope="row"><c:out value="${iteration.index+1}"></c:out>.</th>
	                        <td><c:out value="${contactData.customerName}"></c:out></td>
	                        <td><c:out value="${contactData.gender}"></c:out></td>
	                        <td><c:out value="${contactData.category}"></c:out></td>
	                        <td><c:out value="${contactData.message}"></c:out></td>
	                        <td>&nbsp;</td>
	                        <td>&nbsp;</td>
	                    </tr>
	                </c:forEach>
	            </tbody>
	        </table>
	    </div>
	</jsp:body>
</layout:pagelayout>