package entity;

public class Movie {
    private int releasedYear;
    private String movieName;
    private String[] genre;
    private String language;

    public void setReleasedYear(int releasedYear) {
        this.releasedYear = releasedYear;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public void setGenre(String[] genre) {
        this.genre = genre;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getReleasedYear() {
        return releasedYear;
    }

    public String getMovieName() {
        return movieName;
    }

    public String[] getGenre() {
        return genre;
    }

    public String getLanguage() {
        return language;
    }


    public void display(){
        System.out.println("Movie name :"+movieName);
        System.out.println("Released year : "+releasedYear);
        System.out.println("Language : "+language);
        System.out.println("Genre : ");
        for (String genre:this.genre){
            System.out.print(genre+" ");
        }
        System.out.println();
    }

}
