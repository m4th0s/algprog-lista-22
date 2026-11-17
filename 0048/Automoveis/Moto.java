package Automoveis;

public class Moto  extends Veiculo{

    public Moto( String modelo, String marca, int ano){

        super(marca, modelo, ano);
    }
   
    public void acelerar() {
            System.out.println(modelo +" "+ marca + "está acelerando e empinando a roda dianteira!");

    }
    
}