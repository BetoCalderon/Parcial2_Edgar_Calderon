<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
	<!DOCTYPE html>

	<html>
	<script src="http://code.jquery.com/jquery-latest.js"></script>
	<meta charset="ISO-8859-1">
	<title>Muestra de Datos</title>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet"
		integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl" crossorigin="anonymous">
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.bundle.min.js&quot; integrity="
		sha384-b5kHyXgcpbZJO/tY9Ul7kGkf1S0CWuKcCD38l8YkeH8z8QjE0GmW1gYU5S9FOnJ0" crossorigin="anonymous"></script>
	</head>

	<body>

		<script type="text/javascript">
			$(document).ready(function () {
				$.post('ControllerMostrarInformacion', {

				}, function (response) {
					let datos = JSON.parse(response);

					console.log(datos);

					var tabla = document.getElementById('tablaDatos');
					for (let item of datos) {
						tabla.innerHTML +=
							`
					<tr>
						<td>${item.idUsuario}</td>
						<td>${item.Usuario}</td>
						<td>${item.Pass}</td>
						<td><a href="ControllerMostrarInformacion?usu=${item.idUsuario}" class="btn btn-danger">Eliminar</a></td>
						<td><a href="" class="btn btn-warning">Editar</a></td>
					</tr>
					`
						console.log(item.Pass);
					}
				});
			});
		</script>
		<h1 align="center">Bienvenido</h1>
		<h2 align="center">(Personas! )</h2>
		<table class="table table-dark table-striped" id="tablaDatos">
			<thead>
				<th>ID_PERSONA</th>
				<th>NOMBRE</th>
				<th>APLLIDO</th>
				<th>EDICION</th>
			</thead>
		</table>
	</body>

	</html>