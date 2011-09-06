package com.mysema

import scala.collection.JavaConversions._

class CatServiceImpl extends CatService {
    override def getAll: java.util.List[Cat] = {
        println("Retrieving all dogs...");
        List(new Cat("Garfield"), new Cat("Fluffy"))
    }
}