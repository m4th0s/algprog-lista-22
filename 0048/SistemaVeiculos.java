
import Automoveis.Caminhao;
import Automoveis.Carro;
import Automoveis.Moto;
import Automoveis.Veiculo;

public class SistemaVeiculos {
    public static void main(String[] args) {
    
    Carro carro = new Carro("Fiat", "Toro", 2020);
    Moto moto = new Moto("Honda", "CG 160", 2024);
    Caminhao caminhao = new Caminhao("Volvo", "FH 540", 2019);

    System.out.println("------ TESTE  CARRO ------");
    carro.acelerar();
    carro.exibirDetalhes();

    System.out.println("------ TESTE MOTO ------");
    moto.acelerar();
    moto.exibirDetalhes();

    System.out.println("------ TESTE CAMINHÃO ------");
    caminhao.acelerar();
    caminhao.exibirDetalhes();
  
    }

}
