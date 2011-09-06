package com.mysema

import java.util.List

trait CatService {
    def getAll: List[Cat]
}