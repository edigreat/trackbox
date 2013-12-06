modules = {
    application {
        resource url:'js/application.js'
    }

    trackbox{
    	dependsOn 'jquery'
    	resource url:'css/bootstrap.css'
    	resource url:'css/my.css'
    	resource url:'js/bootstrap.js'

    }
}