package exercicio1;

import java.util.*;
import java.text.*;
public class Main {
    public static void main(String[] args) throws ParseException{
        SimpleDateFormat form=new SimpleDateFormat("dd/MM/yyyy");
        Date ingr_data=form.parse("01/10/2019");
        Date idade=form.parse("20/11/2002");
        aluno aluno=new aluno("Kariane Coura Cunha", idade, "Senac", "Sistemas de informação", ingr_data);
        System.out.println(aluno.getinformacoesaluno());
        aluno.getingressao();
    }
    
}
