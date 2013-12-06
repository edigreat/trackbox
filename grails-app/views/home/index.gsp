<%@ page contentType="text/html; charset=UTF-8" %>
<html>
<head>
<meta name="layout" content="trackbox"/> 
<title>Projects</title>
</head>
<body> 
<g:if test="${flash.status}">
  ${flash.status}
</g:if>

<h1>Proyectos en MakingDevs </h1>
<g:if test="${!projects.size()}" >
      <h2> No hay proyecto </h2>
</g:if>
<g:elseif test="${projects.size()==1}">
 <h2> Proyecto principal </h2>
</g:elseif>
<g:else>
<h2>Numero de proyectos: ${projects.size()}</h2>
</g:else>

<g:form action="save" name="createForm">
	<g:render template="formaProyecto" />
</g:form>
 
 	<div class='container'> 
 		<div class="row">
        	<div class="col-md-4">
			<g:render template="proyectos" model="[projects:projects]" />
			</div>
			<div class="col-md-4" >
				<g:render template="showUserStory" model="[userStoryInstance:userStoryInstance]" />
			</div>
		</div> 	
	</div>

</body>
</html>