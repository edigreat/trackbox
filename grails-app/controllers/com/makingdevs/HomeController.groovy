package com.makingdevs

class HomeController {
 
 UserStoryService userStoryService


    def index() {
    	log.debug "Hola mundo en el home controller"
    	//render "Hola Mundo"
    	def projects = userStoryService.getTodosLosProyectos()
    	log.debug projects
    	[projects:projects]
     }

     def save(){
     	def project = new Project(params)
     	if(project.save()){
     		flash.status="El proyecto ha sido creado"
     			//render view:'index', model:[project:project]
     			redirect action:'index'
     		}else
     		{
     			flash.status="No se pudo guardar el proyecto"
     			//render view:'index', model:[project:project]
     			redirect action:'index',params:params + [project:project]
     		}
     }

     def explorarRequest(){
		log.debug	actionName
		log.debug	actionUri
		log.debug	controllerName
		log.debug	controllerUri
		log.debug	flash
		log.debug	log
		log.debug	params
		log.debug	request
		log.debug	response
		log.debug	session
		log.debug	servletContext

		render "Atributos del request"
     }

    def accion1(){
    log.debug actionName
  	flash.variable = "Estare disponible en el siguiente request"
  	redirect action:"accion2" // Generando un nuevo request
	}
 
	def accion2(){
		log.debug actionName
  	log.debug flash.variable // "Estaré disponible en el siguiente request"
	}

	def recibe(){
		log.debug params.int('parametro',0)
		log.debug params.double('parametro',0d)
		log.debug params.float('parametro',0f)
		log.debug params.long('parametro',0l)
	}


}
