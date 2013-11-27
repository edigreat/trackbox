package com.makingdevs

class Sprint {

Date startDate
  Date endDate
  String title
  String description
 
  Date dateCreated
  Date lastUpdated

//Sprint tiene muchos userStory
// y cuando se borra, solo se borra la referencia
// de sprintBacklog 

 static hasMany = [
    sprintBacklog : UserStory
  ]

  Integer getDuracionEnDias(){
  	endDate - startDate
  }

  static transients = ["duracionEnDias"]

  static constraints = {
    	startDate()
    	endDate validator: { val, obj ->
    		if(val <= obj.startDate){
    			return false
    		}
    	}
    	title blank:false, size:1..50
    	description blank:true,size:1..1000
    }



   
}
