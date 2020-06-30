package Problem2;

public class Bicyclist {
    private String firstName;
    private String lastName;
    private String teamName;
    private Time startTime;
    private Time endTime;

    /**
     * Constructor that creates a new bicyclist object with the specified
     * first name, last name, and team name
     *
     * @param firstName - bicyclist's first name
     * @param lastName - bicyclist's last name
     * @param teamName - bicyclist's team name
     */
    public Bicyclist(String firstName, String lastName, String teamName, Time startTime, Time endTime) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.teamName = teamName;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    /**
     * Returns bicyclist's first name
     * @return - bicyclist's first name
     */
    public String getFirstName() {
        return this.firstName;
    }

    /**
     * Returns bicyclist's last name
     * @return - bicyclist's last name
     */
    public String getLastName() {
        return this.lastName;
    }

    /**
     * Returns bicyclist's team name
     * @return - bicyclist's team name
     */
    public String getTeamName() {
        return this.teamName;
    }

    public String getDuration() {
        Integer finalHours = endTime.getHours() - startTime.getHours();
        Integer finalMinutes = endTime.getMinutes() - startTime.getMinutes();
        Integer finalSeconds = endTime.getSecond() - startTime.getSecond();
        return String.format("%02d:%02d:%02d", finalHours, finalMinutes, finalSeconds);
    }
}
