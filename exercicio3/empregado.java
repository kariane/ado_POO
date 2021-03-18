package exercicio3;

public class empregado{
    private String primeiro_nome;
    private String segundo_nome;
    private float salario_mensal;
    private float sal_anual;
    public empregado(String primeiro_nome, String segundo_nome, float salario_mensal){
    this.primeiro_nome=primeiro_nome;
    this.segundo_nome=segundo_nome;

    
    if(salario_mensal<0){
        salario_mensal=0;
    }
    else{
        this.salario_mensal=salario_mensal;
    }
}
    public float sala_anual(){
        sal_anual=this.salario_mensal*13;
        //13 com o 13º salario
        return sal_anual;
        
    }
    public float sala_aumento() {
        salario_mensal=(float) (salario_mensal+salario_mensal*0.10);
    return salario_mensal;
}
       public float sala_aumentoanual() {
        salario_mensal=(float) (salario_mensal+salario_mensal*0.10)*13;
        //13 com o 13º salario
    return salario_mensal;
       }
    public String getinformacoes1func(){
     return "-------------------------------"+
             "\nNome : " + primeiro_nome +
             "\nSobrenome " + segundo_nome+
             "\nSalario Mensal: " + salario_mensal + 
             "\nSalario Anual: " + sala_anual()+
             "\nSalario Mensal com aumento: " +sala_aumento() 
             +"\nSalário Anual com aumento: "+ sala_aumentoanual();
     
 }
}
