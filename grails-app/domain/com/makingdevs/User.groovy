package com.makingdevs

class User {

  String username
  String password
 
  Date dateCreated
  Date lastUpdated


  static hasMany = [
    projects : Project
  ]
  
  static belongsTo = [ Task ]


    static constraints = {
    username blank:false, size:1..50, unique:true
    //val valor actual del campo, obj referencia al objeto
    password blank:false, size:1..50, validator: { val, obj ->
      	if(val == obj.username) {
        return false
      		}
    	}
    }

}
