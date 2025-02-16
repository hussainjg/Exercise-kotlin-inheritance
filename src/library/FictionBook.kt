package library

class FictionBook(title: String, author: String, ISBN: String)
    : Book(title, author, ISBN) {
    var attributes = ""

    fun sciencefiction() {
        attributes = "Science Fiction"
    }

    fun fantasy() {
        attributes = "Fantasy"
    }

    fun drama() {
        attributes = "Drama"
    }
    override fun displayInfo() {
        if (attributes == "") {
            println("$title, by $author ($ISBN)")
        } else {
            println("$title, by $author ($ISBN) ($attributes)")
        }
    }
}