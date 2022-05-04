package pract8;

public class Torneo extends Jugador {
    private String tournamentName;
    private String region;
    private int numberOfParticipants;
    private int gamesPlayed;
    private int pendingMatches;

    public Torneo() {
    }

    public String getTournamentName() {
        return tournamentName;
    }

    public void setTournamentName(String tournamentName) {
        this.tournamentName = tournamentName;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public int getNumberOfParticipants() {
        return numberOfParticipants;
    }

    public void setNumberOfParticipants(int numberOfParticipants) {
        this.numberOfParticipants = numberOfParticipants;
    }

    public int getGamesPlayed() {
        return gamesPlayed;
    }

    public void setGamesPlayed(int gamesPlayed) {
        this.gamesPlayed = gamesPlayed;
    }

    public int getPendingMatches() {
        return pendingMatches;
    }

    public void setPendingMatches(int pendingMatches) {
        this.pendingMatches = pendingMatches;
    }

}
