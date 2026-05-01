/* 
    File name: LibraryApp.java
    Main File
*/

import java.util.Scanner;

public class LibraryApp {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        while (true) {
            System.out.println("\n===== LIBRARY MENU =====");
            System.out.println("1. Add Book");
            System.out.println("2. Add DVD");
            System.out.println("3. Loan Item");
            System.out.println("4. Return Item");
            System.out.println("5. Show Available Items Count");
            System.out.println("0. Exit");
            System.out.println("Choose option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // to clear buffer

            try{
                switch (choice) {
                    case 1:
                        System.out.println("Enter title: ");
                        String bTitle = scanner.nextLine();

                        System.out.println("Enter author: ");
                        String author = scanner.nextLine();
                        
                        System.out.println("Enter cost: ");
                        float bCost = scanner.nextFloat();
                        scanner.nextLine();

                        library.add(new Book(bTitle,author,bCost));
                        System.out.println("Book added successfully.");
                        break;

                    case 2:
                        System.out.println("Enter title: ");
                        String dTitle = scanner.nextLine();

                        System.out.println("Enter director: ");
                        String director = scanner.nextLine();
                        
                        System.out.println("Enter cost: ");
                        float dCost = scanner.nextFloat();
                        scanner.nextLine();

                        library.add(new DVD(dTitle,director,dCost));
                        System.out.println("DVD added successfully.");
                        break;

                    case 3:
                        System.out.println("Enter title to loan: ");
                        String loanTitle = scanner.nextLine();

                        loanItemByTitle(library,loanTitle);
                        System.out.println("Item loaned sucessfully.");
                        break;
                    
                    case 4:
                        System.out.println("Enter title to return: ");
                        String returnTitle = scanner.nextLine();

                        returnItemByTitle(library,returnTitle);
                        System.out.println("Item returned sucessfully.");
                        break;

                    case 5: 
                        System.out.println("Available items: " +library.getAvailableCount());
                        break;

                    case 0:
                        System.out.println("Exiting system...");
                        scanner.close();
                        return;

                    default:
                        System.out.println("Invalid Option.");
                }
            } catch (LibraryException e){
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    // Helper method
    private static void loanItemByTitle(Library library, String title) throws LibraryException{
        for(LibraryItem item : library.getAvailableList()){
            if(item.getTitle().equals(title)){
                library.loanItem(item);
                return;
            }
        }
        throw new LibraryException("Item not found in available list.");
    }

    private static void returnItemByTitle(Library library, String title) throws LibraryException{
        for (LibraryItem item : library.getOnLoanList()){
            if(item.getTitle().equals(title)){
                library.returnItem(item);
                return;
            }
        }
        throw new LibraryException("Item not found in loaned list.");
    }
}
