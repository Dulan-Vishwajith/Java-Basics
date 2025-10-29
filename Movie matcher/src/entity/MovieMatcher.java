package entity;

class MovieMatcher {
    private Movie movie;
    private InterestedMoiveType interestedMoiveType;

    public MovieMatcher(Movie movie, InterestedMoiveType interestedMoiveType) {
        this.movie = movie;
        this.interestedMoiveType = interestedMoiveType;
    }

    private Boolean languageChecker() {
        return (movie.getLanguage().equalsIgnoreCase(interestedMoiveType.getLanguage()));
    }

    private Boolean releaseChecker() {
        return (movie.getReleasedYear() <= interestedMoiveType.getMaximumReleaseYear() &&
                movie.getReleasedYear() >= interestedMoiveType.getMinimumReleaseYear());
    }

    private Boolean genreChecker() {
        for (String g : movie.getGenre()) {
            if (g.equalsIgnoreCase(interestedMoiveType.getGenre())) {
                return true;
            }
        }
        return false;
    }

    public void validation(){
        if(languageChecker() && releaseChecker() && genreChecker()){
            System.out.println("The given movie is suitable for user...!");
        }
        else {
            System.out.println(movie.getMovieName()+"is not suitable for user....!");
        }
    }
}