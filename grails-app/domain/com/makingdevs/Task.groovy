package com.makingdevs

class Task {

String description
 
  Date dateCreated
  Date lastUpdated

  TaskStatus status

  	static hasMany = [
    participants : User
  ]

  static belongsTo = [
    userStory : UserStory
  ]
    static constraints = {
    	description blank:false, size:1..1000
  	}


    
}
