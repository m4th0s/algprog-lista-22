package Automoveis;

public class Carro extends Veiculo{

    public Carro(String modelo, String marca, int ano){
        super(marca, modelo, ano);
    }

    public void acelerar() {
        System.out.println(modelo + " "+ marca + "está acelerando de 0 a 100 km/h" + "em X segundos.\"");

    }
}