package pract8;

public class Equipo {
    private String nameOfTeam;
    private String division;
    private String nameOfTrainer;
    private int tournaments;
    private int won;
    private int lost;

    public Equipo() {
    }

    public String getNameOfTeam() {
        return nameOfTeam;
    }

    public void setNameOfTeam(String nameOfTeam) {
        this.nameOfTeam = nameOfTeam;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public String getNameOfTrainer() {
        return nameOfTrainer;
    }

    public void setNameOfTrainer(String nameOfTrainer) {
        this.nameOfTrainer = nameOfTrainer;
    }

    public int getTournaments() {
        return tournaments;
    }

    public void setTournaments(int tournaments) {
        this.tournaments = tournaments;
    }

    public int getWon() {
        return won;
    }

    public void setWon(int won) {
        this.won = won;
    }

    public int getLost() {
        return lost;
    }

    public void setLost(int lost) {
        this.lost = lost;
    }

    public int totalPlayers(Jugador[] jugador) {
        int aux = 0;
        for (int i = 0; i < jugador.length; i++) {
            aux = jugador[i].getAux();
        }
        return aux;
    }

    public int totalPoints(Jugador[] jugador) {
        int aux = 0;
        for (int i = 0; i < jugador.length; i++) {
            aux += jugador[i].getScored();
        }
        return aux;
    }

}
