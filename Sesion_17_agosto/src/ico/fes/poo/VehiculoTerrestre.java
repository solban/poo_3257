/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.poo;

/**
 *
 * @author Solba
 */
public class VehiculoTerrestre extends Vehiculo{
    private int tipo;// 0: neumaticos, 1: vias Ferreas, 2:Magnetico
    private String kmPorHora;

    public VehiculoTerrestre() {
    }

    public VehiculoTerrestre(int tipo, String kmPorHora) {
        this.tipo = tipo;
        this.kmPorHora = kmPorHora;
    }
    

    public VehiculoTerrestre(int tipo, String kmPorHora, String decripcion,
            String fabricante, String material) {
        super(decripcion, fabricante, material);
        this.tipo = tipo;
        this.kmPorHora = kmPorHora;
    }

    public String getKmPorHora() {
        return kmPorHora;
    }

    public void setKmPorHora(String kmPorHora) {
        this.kmPorHora = kmPorHora;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "VehiculoTerrestre{" + "tipo=" + tipo + ", kmPorHora=" + kmPorHora +
                '}'+super.toString();
    }
    public int viajar (){
            System.out.println("El vehiculo terrestre esta viajando por");
            switch(this.tipo){
                case 0:
                    System.out.println("Carretera");
                    break;
                case 1:
                    System.out.println("Viajando por vias Ferreas");
                    break;
                case 2:
                    System.out.println("Vias Magneticas");
                    break;
                default :
                    System.out.println("No reconocible");
            }
            return 100;
            
        
    }
    @Override
    public void usar(){
        System.out.println("Utilizando el ferrocarril que viaja en vias ferreas"
                + "de la marca "+this.getFabricante());
    }
    
}
