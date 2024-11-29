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
  <div id="main" class="text-white">
  	<div class="d-flex flex-column justify-content-center align-items-center">
  		<h3 class="m-4">Fill The Feedback Form</h3>
  		<form action="<%= application.getContextPath()%>/feedback" method="post" >
  <div class="mb-3">
    <label for="exampleInputEmail1" class="form-label">Email address</label>
    <input name="email" type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
    <div id="emailHelp" class="form-text text-white">We'll never share your email with anyone else.</div>
  </div>
  <div class="mb-3">
    <label for="exampleInputPassword1" class="form-label">Contact Number</label>
    <input name="contact" type="text" class="form-control" id="exampleInputPassword1">
  </div>
   <div class="mb-3">
    <label for="examplefieldtext" class="form-label">FeedBack Message</label>
    <textarea name="feed" rows="10" cols="" placeholder="type here" class="form-control"></textarea>
 	<div class="container text-center">
 		 <button type="submit" class="btn btn-outline-info m-2">Submit</button>
 		 <button type="submit" class="btn btn-outline-light">Clear</button>
 	</div>
</form>
  	</div>
  </div>
  <%@ include file="scripts.jsp" %>
  </body>
</html>