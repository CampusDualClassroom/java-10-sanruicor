package com.campusdual.classroom;

import java.util.concurrent.ThreadLocalRandom;

public class Exercise10 {

    //TODO ↓
    // Imprimir el color de las pelotas que salgan, hasta que salgan 2 de color azul
    // El mensaje a imprimir es → La bola es de color: COLOR_BOLA
    // COLOR_BOLA puede ser → rojo, azul, verde
    public static void main(String[] args) {

            int blueBalls = 0;
            do {
                String colorBall = getBall();
                System.out.println("La bola es de color: " + colorBall);
                if (colorBall.equals("azul")) {
                    blueBalls++;
                }
            } while (blueBalls < 2);
    }

    //TODO ↓
    // Un método que devuelva una cadena de texto con el color de una pelota (en minúscula). Dicho color se escogerá de
    // manera aleatoria. Se empleará el método randomWithRange(int min, int max) para escoger un número aleatorio, que
    // lo asociaremos al valor de un color de la siguiente manera:
    // 1 → rojo
    // 2 → azul
    // 3 → verde
    public static String getBall() {

        int color = randomWithRange(1,4);
        String colorBall = "";
        switch (color) {
            case 1:
                colorBall = "rojo";
                break;
            case 2:
                colorBall = "azul";
                break;
            case 3:
                colorBall = "verde";
                break;
        }
        return colorBall;
    }

    public static int randomWithRange(int min, int max) {

        return ThreadLocalRandom.current().nextInt(min,max);
    }
}