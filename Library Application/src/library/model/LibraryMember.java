package library.model;

public class LibraryMember {
    private String name;
    private String surname;
    private String memberId;
    private int noOfBooks;
    private final int BOOK_LIMIT = 3;
    private Book[] books = new Book[BOOK_LIMIT];

    public LibraryMember(String name, String surname, String memberId) {
        this.name = name;
        this.surname = surname;
        this.memberId = memberId;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getMemberId() {
        return memberId;
    }

    public boolean borrowBook(Book book){
       for (int i = 0; i < books.length; i++) {
           if (books[i] == null) {
               books[i] = book;
               noOfBooks++;
               return true;
           }
       }
       return false;
    }

    public void printBorrowedBooks(){
        for (int i = 0; i < books.length; i++){
            System.out.println(books[i]);
        }
    }
}
