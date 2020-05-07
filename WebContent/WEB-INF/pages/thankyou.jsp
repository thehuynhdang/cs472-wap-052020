<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="layout" tagdir="/WEB-INF/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<layout:pagelayout>
	<div style="padding-top: 1em;" class="container">
        <div class="card">
		  <div class="card-header">
		    Thank you. Your message has been received as follows:
		  </div>
		  <div class="card-body">
		    <h5 class="card-title">Name: <c:out value="${contact.customerName}" /></h5>
		    <p class="card-text">Gender: <c:out value="${contact.gender}" /></p>
		    <p class="card-text">Category: <c:out value="${contact.category}" /></p>
		    <p>Message: <c:out value="${contact.message}" /></p>
		    <br/><br/><br/>
		    
		    <p>Please feel free to <a href="#">Contact Us</a> again</p>
		  </div>
		</div>
  </div>
</layout:pagelayout>