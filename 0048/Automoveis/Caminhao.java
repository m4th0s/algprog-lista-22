package Automoveis;

public class Caminhao extends Veiculo {

    public Caminhao(String modelo, String marca, int ano){
        super(marca, modelo, ano);
    }
    
    public void acelerar() {
        System.out.println(modelo + " " + marca + " Está engrenando a proxima marcha e acelerando lentamente.");

    }
}