<%@tag description="Page Layout" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@attribute name="header" fragment="true" %>
<%@attribute name="footer" fragment="true" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Customer Contact Form</title>
    
    <link href="https://stackpath.bootstrapcdn.com/bootswatch/4.4.1/spacelab/bootstrap.min.css" rel="stylesheet" integrity="sha384-nl8CRcNYOGaXP68QRJeVTXCWAhwqBhRha0QbuubX1qDQpGT3GgclpvyzkR2JzyfZ" crossorigin="anonymous">
    <link rel="stylesheet" href="./css/main-styles.css">
    
    <script defer src="https://code.jquery.com/jquery-3.4.1.js" integrity="sha256-WpOohJOqMqqyKL9FccASB9O0KwACQJpFTUBLTYOVvVU=" crossorigin="anonymous"></script>
    <script defer src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
    <script defer src="js/app.js"></script>
</head>
<body>
    <header>
        <!-- Start Navbar -->
        <nav class="navbar navbar-expand-lg navbar-dark bg-primary">
            <a style="padding-right: 2em;" class="navbar-brand" href="index.html">CS472-WAP ::: Lab 11</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarColor01"
                    aria-controls="navbarColor01" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse" id="navbarColor01">
                <ul class="navbar-nav mr-auto">
                    <li class="nav-item" style="border-left: white 1px solid; padding-left: 2em; padding-right: 2em;">
                        <a class="nav-link" href="/cs472lab/viewhome">Home</a>
                    </li>
                    <li class="nav-item active" style="border-left: white 1px solid; padding-left: 2em; padding-right: 2em;">
                        <a class="nav-link" href="/cs472lab/viewcontactus">Contact Us</a>
                    </li>
                </ul>
                <form class="form-inline my-2 my-lg-0">
                	<input class="form-control" type="text" name="search" id="search" placeholder="search">&nbsp;
                    <button id="btnSearch" type="submit" class="btn btn-secondary btn-inline">Search</button>       
                    
                </form>
            </div>
        </nav>    
        <!-- End Navbar -->
    </header>

    <!-- Start main-content -->
    <main>
        <div id="pageheader">
	      <jsp:invoke fragment="header"/>
	    </div>
	    
	    <div id="pageErrorMessage" style="background-color: yellow;">
			<ul style="color: red;">
				<c:forEach var="message" items="${errorMessages}">
					<li>${message }</li>
				</c:forEach>
			</ul>
		</div>
	    <div id="body">
	      <jsp:doBody/>
	    </div>
	    <div style="padding-top: 1em;" class="container">
        	<br><hr>
            <div class="row">
                 <div class="col-md-6">
                    <p>Hit count for this page: <c:out value="${hitCount}" /></p>
                </div>
                <div class="col-md-6">
                    <p style="float:right;">Hit Count for the entire WebApp: <c:out value="${appHitCount}" /> </p>
                </div>
            </div>
        </div>
	    <div id="pagefooter">
	      <jsp:invoke fragment="footer"/>
	    </div>
    </main>
    <!-- End main-content -->

    <!-- Start footer -->
    <footer>
        <div>
            <span style="margin-left: 1em;">O. Kalu ::: CS472-WAP</span>
            <span style="float: right;margin-right: 1em;">&copy; April 2020</span>
        </div>
    </footer>
</body>
</html>