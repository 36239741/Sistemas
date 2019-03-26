<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Login</title>
</head>
<body>
<%
	String get = request.getParameter("success");
	if(get != null){
		out.print("<div class='alert alert-success' role='alert' align='center'>");
		 out.print("Cadastrado com Sucesso!!");
		out.print("</div>");
	}


%>
	<div class="container">
		<%@ include file="menu_index.jsp"%>
		<br>
		<div class="row">
			<div class="col-lg-3 offset-lg-4">
				<form>
					<div class="form-group">
						<label for="login">Login:</label> <input type="text"
							class="form-control" id="login" name="login" required>
						</div>
							<div class="form-group">
								<label for="pass">Senha:</label> <input type="text"
									class="form-control" id="pass" name="pass" required>
								</div>
								<button type="submit" class="btn btn-primary">Logar</button>
				</form>
			</div>

		</div>
		<br>
	<%@ include file="rodape.jsp" %>
	</div>

	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
		integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
		integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
		integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
		crossorigin="anonymous"></script>
</body>
</html>