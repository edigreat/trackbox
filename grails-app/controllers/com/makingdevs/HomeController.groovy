package com.makingdevs

class HomeController {

    def index() {
    	log.debug "Hola mundo en el home controller"
    	render "Hola Mundo"
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
}
