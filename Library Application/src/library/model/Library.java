package library.model;

public class Library {
    private Book[] libraryBooks;
    private LibraryMember[] members;



    public boolean addBookToCatalog(Book book) {
        for (int i = 0; i < libraryBooks.length; i++) {
            if (libraryBooks[i] == null) {
                libraryBooks[i] = book;
                return true;
            }
        }
        return false;
    }

    public boolean registerMember(LibraryMember member) {
        for (int i = 0; i < members.length; i++) {
            if (members[i] == null) {
                members[i] = member;
                return true;
            }
        }
        return false;
    }
}
