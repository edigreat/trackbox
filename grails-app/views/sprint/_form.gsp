<%@ page import="com.makingdevs.Sprint" %>



<div class="fieldcontain ${hasErrors(bean: sprintInstance, field: 'description', 'error')} ">
	<label for="description">
		<g:message code="sprint.description.label" default="Description" />
		
	</label>
	<g:textField name="description" value="${sprintInstance?.description}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: sprintInstance, field: 'endDate', 'error')} required">
	<label for="endDate">
		<g:message code="sprint.endDate.label" default="End Date" />
		<span class="required-indicator">*</span>
	</label>
	<g:datePicker name="endDate" precision="day"  value="${sprintInstance?.endDate}"  />
</div>

<div class="fieldcontain ${hasErrors(bean: sprintInstance, field: 'startDate', 'error')} required">
	<label for="startDate">
		<g:message code="sprint.startDate.label" default="Start Date" />
		<span class="required-indicator">*</span>
	</label>
	<g:datePicker name="startDate" precision="day"  value="${sprintInstance?.startDate}"  />
</div>

<div class="fieldcontain ${hasErrors(bean: sprintInstance, field: 'title', 'error')} ">
	<label for="title">
		<g:message code="sprint.title.label" default="Title" />
		
	</label>
	<g:textField name="title" value="${sprintInstance?.title}"/>
</div>

