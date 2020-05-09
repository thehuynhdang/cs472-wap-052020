<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="layout" tagdir="/WEB-INF/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<layout:elibrarylayout>
	<jsp:attribute name="header">
		<div class="container">
			<h2 class="text-info">Books in our Collection</h2>
		</div>
	</jsp:attribute>
	<jsp:body>
		<div class="container">
			<div style="margin-top: 1em;" id="divCitizensList" style="font-size: 1em">
                <table class="table table-striped" id="dataTable">
                    <thead>
                        <tr>
                            <th scope="col">Citizen ID</th>
                            <th scope="col">Social Security</th>
                            <th scope="col">Full Name</th>
                            <th scope="col">State</th>
                            <th scope="col">Senior</th>
                            <th scope="col"></th>
                        </tr>
                    </thead>
                    <tbody id="tbodyCitizensList">
                        <tr style="display: none;">
                            <td class="colCitizenId"></td>
                            <td class="colSSN"></td>
                            <td class="colFullName"></td>
                            <td class="colState"></td>
                            <td class="colSenior"></td>
                            <td class="colRemove">Remove</td>
                        </tr>
                    </tbody>
                </table>
            </div>
		</div>
	</jsp:body>
</layout:elibrarylayout>