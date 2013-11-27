package com.makingdevs

class UserStory {

	String title
  String description
  Integer prioridad
  Integer esfuerzoEnPuntos
  String criteriosDeAceptacion
 
  Date dateCreated
  Date lastUpdated

static belongsTo = [
    project : Project
  ]
  static hasMany = [
    tasks : Task
  ]
    static constraints = {

    title blank:false, size:1..100
    description blank:false, size:1..1000
    prioridad min:1, max:10
    esfuerzoEnPuntos blank:false, range:1..5
    criteriosDeAceptacion blank:true, size:1..1000
    
    }


}
