package library

class NonFictionBook(title: String, author: String, ISBN: String)
    : Book(title, author, ISBN) {
    var attributes = ""
    fun history() {
        attributes = "History"
    }

    fun science() {
        attributes = "Science"
    }

    fun math() {
        attributes = "Math"
    }
    override fun displayInfo() {
        if (attributes == "") {
            println("$title, by $author ($ISBN)")
        } else {
            println("$title, by $author ($ISBN) ($attributes)")
        }
    }
}