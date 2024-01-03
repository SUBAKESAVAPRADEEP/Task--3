    package Pradeep;
class Library {
    private Book[] books;
    private int count;

    public Library(int maxSize) {
        books = new Book[maxSize];
        count = 0;
    }

    public void addBook(Book book) {
        if (count < books.length) {
            books[count] = book;
            count++;
            System.out.println("Book added successfully.");
        } else {
            System.out.println("Library is full. Cannot add more books.");
        }
    }

    public void removeBook(int bookID) {
        int index = findBookIndex(bookID);
        if (index != -1) {
            books[index].setAvailable(false);
            System.out.println("Book removed successfully.");
        } else {
            System.out.println("Book not found.");
        }
    }

    public void searchBook(int bookID) {
        int index = findBookIndex(bookID);
        if (index != -1) {
            System.out.println("Book found:");
            System.out.println(books[index]);
        } else {
            System.out.println("Book not found.");
        }
    }

    public void displayBooks() {
        System.out.println("Books in the library:");
        for (int i = 0; i < count; i++) {
            System.out.println(books[i]);
        }
    }

    private int findBookIndex(int bookID) {
        for (int i = 0; i < count; i++) {
            if (books[i].getBookID() == bookID) {
                return i;
            }
        }
        return -1;
    }
}