package com.makingdevs

class UserStoryController {

    def index() { }

    def save(){
    	def userStory = new UserStory(params)
    	log.debug userStory
    	userStory.save()
    	userStory.properties.each{
    		log.debug it
    	}
    }

    def forProject(){
    	def id = params.long('id')
    	log.debug  id
        def userStoryInstance = UserStory.get(id)
    	redirect(controller: "home", action: "index", model:[params:params,userStoryInstance:userStoryInstance])


    }

}
