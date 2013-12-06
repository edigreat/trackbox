package com.makingdevs

import grails.transaction.Transactional

@Transactional
class UserStoryService {

   def getTodosLosProyectos(){
   	log.debug "-> Entrando a getTodosLosProyectos ${this.class.name}"
   		Project.list()
   }
}
