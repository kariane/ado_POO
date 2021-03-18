package exercicio1;

import java.util.*;
public class aluno {
    private String nome_aluno;
    private Date data_nascimento;
    private String nome_faculdade;
    private String nome_curso;
    private Date data_ingresso;

 
    
    public aluno(String nome_aluno,Date data_nascimento,String nome_faculdade
            ,String nome_curso,Date data_ingresso){
    this.nome_aluno=nome_aluno;
    this.data_nascimento=data_nascimento;
    this.nome_faculdade=nome_faculdade;
    this.nome_curso=nome_curso;
    this.data_ingresso=data_ingresso;

}
 public long getidade(){
        Date idade= new Date();
        long da=(idade.getTime()-data_nascimento.getTime())+3600000;
        long di= ((da/ 86400000L)/360);
    return di;
}
    public long getingressao(){
        Date ingr_data= new Date();
        long da=(ingr_data.getTime()-data_ingresso.getTime())+3600000;
        long di= ((da/ 86400000L)/30);
    return di;
}
 
 public String getinformacoesaluno(){
     return "Nome Completo: " + nome_aluno +
             "\nData de nascimento: " + data_nascimento +
             "\nIdade: "+ getidade()+
             "\nNome da faculdade: " + nome_faculdade + 
             "\nNome do Curso: " + nome_curso+
             "\nData que ingressou no curso: " +data_ingresso 
             +"\n Tempo que ingressou no curso: "+ getingressao();
     
 }
}

