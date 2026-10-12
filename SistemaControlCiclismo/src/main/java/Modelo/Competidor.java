/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author 57323
 */
public class Competidor extends Atleta {


    private int ranking;
    private double estatura;
    private double peso;


    public Competidor(String nombre, int edad, String pais,
                      int ranking, double estatura, double peso) {

        super(nombre, edad, pais);

        this.ranking = ranking;
        this.estatura = estatura;
        this.peso = peso;
    }

    public void actualizarRanking(int puntosObtenidos){

        ranking -= puntosObtenidos;

        if(ranking < 1){
            ranking = 1;
        }
    }
    public void actualizarRanking(int puntosObtenidos, boolean ganoMedalla){


        int puntosFinales = puntosObtenidos;


        if(ganoMedalla){

            puntosFinales += 20;
            if(puntosObtenidos > 50){
                puntosFinales += 30;
            }else{

                puntosFinales += 10;
            }
        }

        ranking -= puntosFinales;


        if(ranking < 1){

            ranking = 1;

        }

    }

    public int getRanking(){

        return ranking;

    }

    @Override
    public String toString(){

        return super.toString()
                + "\nRanking: " + ranking
                + "\nEstatura: " + estatura + " m"
                + "\nPeso: " + peso + " kg";
    }

}