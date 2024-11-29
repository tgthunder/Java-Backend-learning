<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap demo</title>
    
    <%@ include file="components/links.jsp" %>
  </head>
  <body>
  <%@ include file="header.jsp" %>
  <div id="main">
  	<div style="height: 100vh" class="d-flex flex-column justify-content-center align-items-center">
  		<a href="<%= application.getContextPath()%>/feedback.jsp" class="btn btn-outline-info">Give us a FeedBack</a>
  		<a href="<%= application.getContextPath()%>/servlet1" class="btn  mt-4 btn-outline-info">Run Servlet 1</a>
  		<a href="<%= application.getContextPath()%>/servlet2" class="btn mt-4 btn-outline-info">Run Servlet 2</a>
  	</div>
  </div>
  <%@ include file="scripts.jsp" %>
  </body>
</html>