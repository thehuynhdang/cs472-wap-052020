<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="layout" tagdir="/WEB-INF/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<layout:pagelayout>
	<jsp:body>
		<!-- Start main-content -->
	    <div style="padding-top: 1em;" class="container">
	        <!-- TODO: Add main content here -->
	        <h3>Customer Contact Form</h3>
	        <hr>
	        <form action="submitcontactus" id="censusForm" method="post">
	            <fieldset>
	                <legend></legend>
	                <div class="row">
	                    <div class="col-md-12">
	                        <div class="form-group">
	                            <label for="customerName">*Name:</label>
	                            <input class="form-control" value='<c:out value="${formBean.customerName}"></c:out>' type="text" name="customerName" id="customerName" placeholder="Enter your name" autofocus>
	                            <small class="form-text text-muted">Enter your Name</small>
	                        </div>
	                    </div>
	                </div>
	                <div class="row">
	                    <div class="col-md-12">
	                        <label>*Gender</label><br>
	                        <div class="form-group">
	                            <div class="custom-control custom-radio custom-control-inline">
	                            	<c:choose>
	                            		<c:when test="${formBean.gender == 'Male'}">
	                            			<input type="radio" name="gender" id="radioMale" class="custom-control-input" value="Male" checked >
	                            		</c:when>
	                            		<c:otherwise>
	                            			<input type="radio" name="gender" id="radioMale" class="custom-control-input" value="Male" >
	                            		</c:otherwise>
	                            	</c:choose>
	                                <label for="radioMale" class="custom-control-label">Male</label>
	                            </div>
	                            <div class="custom-control custom-radio custom-control-inline">
	                            	<c:choose>
	                            		<c:when test="${formBean.gender == 'Female'}">
	                            			<input type="radio" name="gender" id="radioFemale" class="custom-control-input" value="Female" checked>
	                            		</c:when>
	                            		<c:otherwise>
	                            			<input type="radio" name="gender" id="radioFemale" class="custom-control-input" value="Female">
	                            		</c:otherwise>
	                            	</c:choose>
	                                <label for="radioFemale" class="custom-control-label">Female</label>
	                            </div>
	                        </div>
	                    </div>
	                </div>
	                <div class="row">
	                    <div class="col-md-12">
	                        <div class="form-group">
	                            <label for="ddlState">*Category:</label>
	                            <select class="form-control" id="category" name="category">
	                                <option value="">Select...</option>
	                                <option value="Feedback" ${formBean.category == 'Feedback'? 'selected' : '' } >Feedback</option>
	                                <option value="Inquiry" ${formBean.category == 'Inquiry'? 'selected' : '' }>Inquiry</option>
	                                <option value="Complaint" ${formBean.category == 'Complaint'? 'selected' : '' }>Complaint</option>
	                            </select>
	                        </div>
	                    </div>
	                </div>
	                <div class="row">
	                     <div class="col-md-12">
	                        <div class="form-group">
	                            <label for="message">*Message:</label>
	                            <textarea class="form-control" name="message" id="message"><c:out value="${formBean.message}"></c:out></textarea>
	                        </div>
	                    </div>
	                </div>
	                <div class="row">
	                    <div class="col-md-6">
	                        &nbsp;
	                    </div>
	                    <div style="text-align: right;" class="col-md-6">
	                        <button style="margin-left: 1em; padding: .5em 4em;" id="btnSubmit" type="submit" class="btn btn-primary btn-inline">Submit</button>
	                    </div>
	                </div>
	            </fieldset>
	        </form>
	    </div>
	    <!-- End main-content -->
	
	</jsp:body>
</layout:pagelayout>