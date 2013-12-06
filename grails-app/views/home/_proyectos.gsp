<h4> Lista de proyectos </h4>
<ul>
<g:each in="${projects}" var="project" >
<li>
	<!--
    <a href="${createLink(controller:'userStory',action:'forProject' )} / ${project.codeName}" />
	-->
	<href="${createLink(mapping:'forProjectAlias' )} / ${project.codeName}}" />
	<g:link  controller="userStory" action="forProject" id="${project.id}" >
 	${project.description} <i> ${project.owner}</i>
	</g:link>
</li>
</g:each>
</ul>
