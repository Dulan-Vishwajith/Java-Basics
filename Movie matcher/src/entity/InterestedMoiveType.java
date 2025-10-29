package entity;

public class InterestedMoiveType {
    private int minimumReleaseYear;
    private int maximumReleaseYear;
    private String genre;
    private String language;

    public int getMinimumReleaseYear() {
        return minimumReleaseYear;
    }

    public void setMinimumReleaseYear(int minimumReleaseYear) {
        this.minimumReleaseYear = minimumReleaseYear;
    }

    public int getMaximumReleaseYear() {
        return maximumReleaseYear;
    }

    public void setMaximumReleaseYear(int maximumReleaseYear) {
        this.maximumReleaseYear = maximumReleaseYear;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void display(){
        System.out.println("Minimum release year : "+minimumReleaseYear);
        System.out.println("Maximum release year : "+maximumReleaseYear);
        System.out.println("Genre : "+genre);
        System.out.println("Language : "+language);
        System.out.println();
    }
}
