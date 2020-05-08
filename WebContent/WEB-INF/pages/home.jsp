<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="layout" tagdir="/WEB-INF/tags" %>
<%@taglib prefix="ct" uri="http://cs.mum.edu/cs472/jsp/custom/core" %>

<layout:pagelayout>
	<jsp:attribute name="header">
		<h2>Welcome CS472 JSP/Servlet</h2>
	</jsp:attribute>
	<jsp:body>
		<div style="padding-top: 1em;" class="container">
			<p>Home page <ct:currentDateTime color="blue" size="14px"/></p>
		</div>
    </jsp:body>
</layout:pagelayout>