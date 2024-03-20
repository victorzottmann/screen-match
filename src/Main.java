public class Main {
    public static void main(String[] args) {
        Movie topGun = new Movie("Top Gun Maverick", 2022, true, 140);
        topGun.plot = "Thirty years of service leads Maverick to train a group of elite TOPGUN graduates to prepare for a high-profile mission while Maverick battles his past demons.";
        topGun.rate(8);
        topGun.rate(5);
        topGun.rate(10);

        System.out.println("Sum of ratings: " + topGun.sumOfRatings);
        System.out.println("Total ratings: " + topGun.totalRatings);
        System.out.println("Average rating: " + topGun.getAverageRating());
    }
}