package library

open class Book constructor(var title: String, var author: String, var ISBN: String) {

    open fun displayInfo(){
        println("$title, by $author ($ISBN)")
    }

}