/* 
    File name: Library.java
*/
import java.util.ArrayList;
import java.util.List;

public class Library implements Comparable<Library> {
    private List <LibraryItem> available;
    private List <LibraryItem> onLoan;
    
    public Library(){
        this.available = new ArrayList<>();
        this.onLoan = new ArrayList<>();
    }

    public int getAvailableCount(){
        return available.size();
    }

    public List<LibraryItem> getAvailableList(){
        return available;
    }

    public List<LibraryItem> getOnLoanList(){
        return onLoan;
    }

    public void add(LibraryItem item){
        available.add(item);
    }

    public void loanItem(LibraryItem item) throws LibraryException {
        if(available.contains(item)){
            available.remove(item);
            onLoan.add(item);
        } else {
            throw new LibraryException("Item not available or not on loan");
        }
    }

    public void returnItem(LibraryItem item) throws LibraryException {
        if(onLoan.contains(item)){
            onLoan.remove(item);
            available.add(item);
        } else {
            throw new LibraryException("Item not available or not on loan");
        }
    }

    @Override
    public int compareTo(Library other){
        return Integer.compare(available.size(), other.available.size());
    }
}
