package library.model;

import library.model.Book;
import library.model.Library;
import library.model.LibraryMember;

import java.util.Scanner;

public class LibraryApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Library library = new Library(12, 4);

        main:
        while (true){
            adminMenu();
            String choice = input.nextLine();
            switch (choice){
                case "1" : {
                    System.out.println("Books title : ");
                    String title = input.nextLine();
                    System.out.println("Books author : ");
                    String author = input.nextLine();
                    System.out.println("published year : ");
                    int year = Integer.parseInt(input.nextLine());

                    Book newBook = new Book(title, author, year);
                    if(library.addBookToCatalog(newBook)){
                        System.out.println("Book added successfully!");
                    }else {
                        System.out.println("Not enough space to add book!");
                    }
                    break;
                }
                case "2" : {
                    String name, surname, idNumber;

                    System.out.println("Please enter the name : ");
                    name = input.nextLine();
                    System.out.println("Please enter the surname : ");
                    surname = input.nextLine();
                    System.out.println("Please enter the idNumber");
                    idNumber = input.nextLine();

                    LibraryMember member = new LibraryMember(name, surname, idNumber);
                    if(library.registerMember(member)){
                        System.out.println("Member Registered!");
                    }else {
                        System.out.println("No Space for new member");
                    }
                    break;
                }
                case "3" : {}
                case "4" : {}
                case "5" : {
                    System.out.println("Please enter the member ID : ");
                    String memberId = input.nextLine();
                    LibraryMember loggedInMember = null;
                    for (LibraryMember member)
                }
                case "6" : {
                    break main;
                }
            }
        }
    }
    public static void adminMenu(){
        System.out.println("+----------------------+");
        System.out.println("| 1. Add Book          |");
        System.out.println("| 2. Register User     |");
        System.out.println("| 3. view all books    |");
        System.out.println("| 4. view all users    |");
        System.out.println("| 5. User management   |");
        System.out.println("| 6. Exit              |");
        System.out.println("+----------------------+");
    }
    public static void userMenu(){
        System.out.println("+------------------------+");
        System.out.println("| 1. Borrow a book       |");
        System.out.println("| 2. view borrowed books |");
        System.out.println("| 3. Exit                |");
        System.out.println("+------------------------+");
    }
    public static void space(){
        for (int i = 0; i < 1000; i++) {
            System.out.println();
        }
    }
}