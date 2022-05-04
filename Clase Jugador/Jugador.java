package pract8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Jugador {
    private String namePlayer;
    private int uniformNum;
    private int scored;
    private String position;
    private float height;
    private int aux;
    private static int counter = 0;
    private List<String> names = new ArrayList<>();
    private List<Integer> uniforms = new ArrayList<>();

    public Jugador() {
    }

    public Jugador(int scored, String namePlayer, int uniformNum) {
        this.scored = scored;
        this.uniformNum = uniformNum;
        this.namePlayer = namePlayer;
        this.aux = ++counter;
        this.names.add(namePlayer);
        this.uniforms.add(uniformNum);
    }

    public Jugador(int scored) {
        this.scored = scored;
    }

    public Jugador(String namePlayer) {
        this.namePlayer = namePlayer;
        this.aux = ++counter;
        this.names.add(namePlayer);
    }

    public Jugador(String namePlayer, int uniformNum, int scored, String position, float height) {
        this.namePlayer = namePlayer;
        this.uniformNum = uniformNum;
        this.scored = scored;
        this.position = position;
        this.height = height;
        this.aux = ++counter;
        this.names.add(namePlayer);
        this.uniforms.add(uniformNum);
    }

    public String getNamePlayer() {
        return namePlayer;
    }

    public void setNamePlayer(String namePlayer) {
        this.namePlayer = namePlayer;
    }

    public int getUniformNum() {
        return uniformNum;
    }

    public void setUniformNum(int uniformNum) {
        this.uniformNum = uniformNum;
    }

    public int getScored() {
        return scored;
    }

    public void setScored(int scored) {
        this.scored = scored;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public int getAux() {
        return aux;
    }

    public void setAux(int aux) {
        this.aux = aux;
    }

    public void captureData(Jugador[] jugador) {

        for (int i = 0; i < jugador.length; i++) {
            System.out.println("\nNombre completo: ");
            Scanner nombre = new Scanner(System.in);
            jugador[i].setNamePlayer(nombre.nextLine());

            System.out.println("\nNumero de uniforme: ");
            Scanner uniforme = new Scanner(System.in);
            jugador[i].setUniformNum(uniforme.nextInt());

            System.out.println("\nPuntos anotados: ");
            Scanner puntos = new Scanner(System.in);
            jugador[i].setScored(puntos.nextInt());

            System.out.println("\nPosicion: ");
            Scanner posicion = new Scanner(System.in);
            jugador[i].setPosition(posicion.next());

            System.out.println("\nEstatura: ");
            Scanner estatura = new Scanner(System.in);
            jugador[i].setHeight(estatura.nextFloat());

            nombre.close();
            uniforme.close();
            puntos.close();
            posicion.close();
            estatura.close();
        }
    }

    @Override
    public String toString() {
        return "NOMBRE DEL JUGADOR: " + namePlayer + "\nNUMERO DE UNIFORME: " + uniformNum + "\nHEIGHT: " + height +
                "\nPOSICION: " + position + "\nPUNTOS: " + scored;
    }

    public void validateName() {
        for (int i = 0; i < names.size(); i++) {
            for (int j = i; j < names.size(); j++) {
                if (names.get(i) == names.get(j)) {
                    System.out.println("El jugador " + names.get(i) + " registrado");
                } else {
                    System.out.println("El jugador " + names.get(i) + " no esta registrado");

                }
            }
        }
    }

    public void validateUniform() {
        for (int i = 0; i < uniforms.size(); i++) {
            for (int j = i; j < uniforms.size(); j++) {
                if (uniforms.get(i) == uniforms.get(j)) {
                    System.out.println("El uniforme  " + uniforms.get(i) + " lo usa "+ names.get(i));
                } else {
                    System.out.println("El uniforme  " + uniforms.get(i) + " no esta en uso");
                }
            }
        }
    }

}