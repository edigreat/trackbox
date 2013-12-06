<g:if test="${userStoryInstance}">
<fieldset>
		<legend>Datos de historia del usuario </legend>

  <label> title </label>
  <span><g:fieldValue bean="${userStoryInstance}" field="title"/></span>
  <br />
  <label> description  </label>
  <br />
  <label> prioridad     </label>
  <br />
  <label> esfuerzoEnPuntos  </label>
  <br />
  <label> criteriosDeAceptacion  </label>
  <br />
</fieldset>		
</g:if>