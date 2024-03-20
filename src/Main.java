public class Main {
    public static void main(String[] args) {
        Movie topGun = new Movie();
        topGun.title = "Top Gun Maverick";
        topGun.plot = "Thirty years of service leads Maverick to train a group of elite TOPGUN graduates to prepare for a high-profile mission while Maverick battles his past demons.";
        topGun.yearReleased = 2022;
        topGun.includedInPlan = true;
        topGun.durationInMinutes = 140;
        topGun.rating = 8.2;
        topGun.totalRatings = 3520;

        System.out.println(topGun.toString());
    }
}