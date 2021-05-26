<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List,br.com.alura.gerenciador.modelo.Empresa" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:import url="Logout-parcial.jsp"/>
	Usuario Logado: ${usuarioLogado.login }

	<c:if test="${not empty empresa }">
		empresa ${empresa} foi cadastrada!
	</c:if>
<br>
	
Lista de empresas:<br>
	<ul>
		<c:forEach items="${empresas}" var="empresa">
			
			<li>${empresa.nome} <fmt:formatDate value="${empresa.dataAbertura }" pattern="dd/MM/yyyy"/>
			<a href="/gerenciador/entrada?acao=RemoveEmpresa&id=${empresa.id }">remover</a>
			<a href="/gerenciador/entrada?acao=MostraEmpresa&id=${empresa.id }">editar</a>
			 </li>
		</c:forEach>
	</ul>
	<form action="/gerenciador/entrada" >
	<input type="hidden" name="acao" value="NovaEmpresaForm">			
		<input type="submit" value="Nova Empresa">
	</form>


</body>
</html>