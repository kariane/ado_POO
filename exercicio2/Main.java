package exercicio2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Main {
    
    public static void main(String[] args) throws ParseException {
        
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Date dataVoo = format.parse("17/03/2019");

 
        voo metodo = new voo(4567803,dataVoo,"22:43");
   
        System.out.println("Proximo vaga no voo livre: "+metodo.proximoLivre() +
        "\nOcupar vaga? "+metodo.ocupa(1)
        +"\nVaga ocupada? "+metodo.verifica(1)+
        "\nQuantidade de vagas livres: "+metodo.vagas()+    
        "\nNúmero do Voo: "+metodo.getVoo()+
        "\nData do Voo: "+metodo.getData()+
        "\nIdentificação da passagem: "+metodo.clone(metodo));
       
    }
}
