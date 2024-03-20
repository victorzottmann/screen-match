public class Movie {
    String title;
    String plot;
    int yearReleased;
    boolean includedInPlan;
    int durationInMinutes;
    double rating;
    int totalRatings;

    @Override
    public String toString() {
        return String.format("""
                        
                        title: %s
                        plot: %s
                        yearReleased: %d
                        includedInPlan: %b
                        durationInMinutes %d
                        rating %.1f
                        totalRatings %d
                        """,
                title, plot, yearReleased, includedInPlan, durationInMinutes, rating, totalRatings);
    }
}
