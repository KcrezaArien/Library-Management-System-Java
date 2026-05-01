/*
    File name: LibraryItem.java
*/

import java.util.Objects;

public abstract class LibraryItem {
    private String title;

    public LibraryItem(String title){
        this.title = title;
    }

    public String getTitle(){
        return title;
    }

    public abstract float getCost();

    @Override
    public boolean equals (Object obj){
        if(this == obj)
            return true;

        if(obj == null || getClass() != obj.getClass())
            return false;

        LibraryItem that = (LibraryItem) obj;
        return Objects.equals(this.title, that.title);

    }
}
