package com.makingdevs

@groovy.transform.ToString
class Project {

	String owner
	String codeName
	String description
	Boolean publicVisible

	Date dateCreated
	Date lastUpdated


    static hasMany = [
    sprints : Sprint,
    userStories : UserStory
  ]
    static constraints = {
    owner blank:false,size:1..100
    codeName blank:false,size:1..50,unique:true
    description blank:true,size:1..1000
    publicVisible()

    }



}
