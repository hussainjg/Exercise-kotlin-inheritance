import library.*

fun main() {
    var newBook = Book("Life and Challenges", "Hussain", "172-283820-9822929")
        newBook.displayInfo()

    var ficBook = FictionBook("Life and Challenges", "Hussain", "172-283820-9822929")
    ficBook.drama()
    ficBook.displayInfo()

    var nonficBook = NonFictionBook("Life and Challenges", "Hussain", "172-283820-9822929")
    nonficBook.science()
    nonficBook.displayInfo()
}