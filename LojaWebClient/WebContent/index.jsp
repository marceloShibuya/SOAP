<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>PESQUISA</title>
</head>
<body>
	<div>
		<form action="prod" method="post">
			<fieldset>
				<legend>TERMINAL DE CONSULTA</legend>
				<div>
					<label>Digite o código do produto</label>
					<input type="text" placeholder="Digite o código do produto" required="required" name="codTxt">
				</div>
					<input type="submit" value="Enviar">
			</fieldset>
		</form>
	</div>
</body>
</html>