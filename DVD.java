/*
    File name: DVD.java
*/
import java.util.Objects;

public class DVD extends LibraryItem {
    private final String director;
    private final float dvdCost;

    public DVD(String title, String director, float dvdCost){
        super(title);
        this.director = director;
        this.dvdCost = dvdCost;
    }

    public String getDirector(){
        return director;
    }

    @Override
    public float getCost(){
        return dvdCost;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj)
            return true;
        if(obj == null || getClass() != obj.getClass())
            return false;

        DVD dvd = (DVD) obj;

        return Objects.equals(getTitle(), dvd.getTitle()) &&
        Objects.equals(this.director, dvd.director);
    }
}
