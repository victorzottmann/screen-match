package screenmatch.models;

public class Movie {
    public String title;
    public String plot;
    public int yearReleased;
    public boolean includedInPlan;
    public int durationInMinutes;
    private double averageRating;
    private int totalRatings;
    private double sumOfRatings;

    public Movie(String title, int yearReleased, boolean includedInPlan, int durationInMinutes) {
        this.title = title;
        this.yearReleased = yearReleased;
        this.includedInPlan = includedInPlan;
        this.durationInMinutes = durationInMinutes;
    }

    @Override
    public String toString() {
        String includedInPlanText = includedInPlan ? "Yes" : "No";
        return String.format("""   
                        Title: %s
                        Plot: %s
                        Year Released: %d
                        Duration (minutes): %d
                        Rating: %.1f
                        Total ratings: %d
                        Included in Plan: %s
                        """,
                this.title,
                this.plot,
                this.yearReleased,
                this.durationInMinutes,
                this.averageRating,
                this.totalRatings,
                includedInPlanText
                );
    }
    
    public double getAverageRating() {
        if (totalRatings == 0) {
            return 0.0;
        }
        this.averageRating = sumOfRatings / totalRatings;
        return Double.parseDouble(String.format("%.1f", averageRating));
    }

    public void setAverageRating(double rating) {
        this.sumOfRatings += rating;
        totalRatings++;
    }

    public double getSumOfRatings() {
        return sumOfRatings;
    }

    public double getTotalRatings() {
        return totalRatings;
    }
}
