package entity;
import java.util.Scanner;
import entity.Movie;
import entity.InterestedMoiveType;
import entity.MovieMatcher;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        //Movie inputs
        Movie movie=new Movie();

        System.out.println("-----Movie Details-----\n");

        System.out.print("Enter movie name :");
        movie.setMovieName(input.nextLine());

        System.out.print("Enter released year :");
        movie.setReleasedYear(Integer.parseInt(input.nextLine()));
        //movie.setReleasedYear(input.nextInt());

        System.out.print("Enter language :");
        movie.setLanguage(input.nextLine());

        System.out.print("Enter movie genre separated by comma :");
        String[] genres =input.nextLine().split(",");
        movie.setGenre(genres);
        
        System.out.println("-----Movie Details-----");
        movie.display();
        System.out.println("\n");


        //Interested Movie Type inputs
        InterestedMoiveType interestedMoiveType = new InterestedMoiveType();

        System.out.println("-----User Preference-----\n");

        System.out.print("Enter minimum release year :");
        interestedMoiveType.setMinimumReleaseYear(Integer.parseInt(input.nextLine()));

        System.out.print("Enter maximum release year :");
        interestedMoiveType.setMaximumReleaseYear(Integer.parseInt(input.nextLine()));

        System.out.print("Enter language : ");
        interestedMoiveType.setLanguage(input.nextLine());

        System.out.print("Enter genre : ");
        interestedMoiveType.setGenre(input.nextLine());

        System.out.println("-----User Preference-----");
        interestedMoiveType.display();
        System.out.println("\n");

        MovieMatcher movieMatcher1 = new MovieMatcher(movie,interestedMoiveType);
        movieMatcher1.validation();

        input.close();
    }
}
