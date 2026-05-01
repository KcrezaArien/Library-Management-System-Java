/*
    File name: Book.java
*/
import java.util.Objects;

public class Book extends LibraryItem {
    private final String author;
    private final float bookCost;

    public Book (String title, String author, float bookCost){
        super(title);
        this.author = author;
        this.bookCost = bookCost;
    }

    public String getAuthor(){
        return author;
    }

    @Override
    public float getCost(){
        return bookCost;
    }

    @Override
        public boolean equals(Object obj){
            if(this == obj)
                return true;
            if(obj == null || getClass() != obj.getClass())
                return false;

            Book book = (Book) obj;

            return Objects.equals(getTitle(), book.getTitle()) &&
            Objects.equals(this.author,book.author);
        }
    }

