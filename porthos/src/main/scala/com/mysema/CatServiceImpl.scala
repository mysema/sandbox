package com.mysema

import scala.collection.JavaConversions._

class CatServiceImpl extends CatService {
    override def getAll: java.util.List[Cat] = {
        System.err.println("Retrieving (hopefully) all cats...");
        List(new Cat("Garfield"), new Cat("Fluffy"))
    }
}