class UrlMappings {

	static mappings = {
        "/admin/$controller/$action?/$id?(.${format})?"{
            constraints {
                // apply constraints here
            }
        }

        name forProjectAlias : "/showUserStoriesForProject/$id"{
        	controller="userStory"
        	action="forProject"
        }

        "/"(controller:"home")
        "500"(view:'/error')
	}
}
 