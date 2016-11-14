<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<div class="well" align="center">
	<h2>Login</h2>
	<form class="form-inline">
		<label for="email">Email address:</label> 
		<input type="email"	class="form-control" id="email"> <br /> 
		<label for="pwd">Password:</label>
		<input type="password" class="form-control" id="pw"> <br /><br />
		<div class="checkbox">
			<label><input type="checkbox"> Remember me</label>
		</div>
		<button type="submit" class="btn btn-default">Submit</button>
	</form>
	<form action="/member/join" method="post">
		<input type="submit" value="회원가입"/>
	</form>
</div>