package com.company;

class Jugador
{
    private String nombre;
    private Integer puntos;

    public Jugador(String nombreJugador)
    {
        nombre = nombreJugador;
        puntos = 0;
    }

    public Boolean SetNombre(String n)
    {
        if(n=="Nadal")
            return false;
        else{
            nombre = n;
            return true;
        }

    }

    public String GetNombre(){
        return nombre;
    }

    public void Puntuar(){
        puntos += 1;
        if(puntos == 10){
            System.out.println(nombre +": Come on!!!");
            puntos = 0;
        }
    }

}


public class Main {

    public static void main(String[] args) {
        Jugador jugador1 = new Jugador("Federer");

        System.out.println(jugador1.GetNombre());
        jugador1.SetNombre("Tsitsipas");
        System.out.println(jugador1.GetNombre());
        jugador1.SetNombre("Nadal");
        System.out.println(jugador1.GetNombre());

    }
}
