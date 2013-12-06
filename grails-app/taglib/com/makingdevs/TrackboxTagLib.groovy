package com.makingdevs

class TrackboxTagLib {
    static defaultEncodeAs = 'html'
    //name space de tags, trackbox:repetir
    static namespace="trackbox"
    //static encodeAsForTags = [tagName: 'raw']
   //attrs valores del uso del tag
   //body es la referencia de la parte interna del tag
  def repetir = { attrs,body ->
    attrs.veces?.toInteger().times{ n ->
    	log.debug "en taglib "+n
       out <<  body(n)
    }
  }

//<!--trackbox:repetir veces="5">
//Hola mundo en tag
//</trackbox:repetir-->

  //tamanio de la descripcion , si pasa del size, mostrar un vinculo con tres ...
  def briefDescription = { attrs, body ->
    //...
  }

}
