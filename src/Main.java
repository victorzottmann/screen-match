import screenmatch.models.Movie;

public class Main {
    public static void main(String[] args) {
        Movie topGun = new Movie("Top Gun Maverick", 2022, true, 140);
        topGun.plot = "Thirty years of service leads Maverick to train a group of elite TOPGUN graduates to prepare for a high-profile mission while Maverick battles his past demons.";
        topGun.setAverageRating(8);
        topGun.setAverageRating(5);
        topGun.setAverageRating(10);

        System.out.println("Sum of ratings: " + topGun.getSumOfRatings());
        System.out.println("Total ratings: " + topGun.getTotalRatings());
        System.out.println("Average rating: " + topGun.getAverageRating());
    }
}