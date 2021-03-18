package exercicio2;

import java.util.*;
import java.text.*;
public class voo {
    
    private int identificador_voo;
    private Date data_voo;
    private String horario_Voo;
    private int ocupacaoVoo;
    private LinkedList<String> vagaLivre = new LinkedList<String>();
    
    voo(int id_voo, Date data_voo, String horario_Voo) {
    
        this.identificador_voo = id_voo;
        this.data_voo = data_voo;
        this.horario_Voo = horario_Voo;
        this.ocupacaoVoo = 0;
        
        for (int i = 0; i < 100; i++) {
            vagaLivre.add(Integer.toString(i + 1));
        }
      
    }
    
    public int getVoo() {
        return this.identificador_voo;
    }
    
    public void setVoo(int idVoo) {
        this.identificador_voo = idVoo;
    }
    
    public String getData() {

        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
 
        return formato.format(this.data_voo);
    }
    
    public void setData(int data_voo) {
        this.identificador_voo = data_voo;
    }

    public int proximoLivre() {
    
        if (this.ocupacaoVoo < 100) {
            return Integer.parseInt(vagaLivre.getFirst());
        }
        return 0;
    }

    public String verifica(int vaga) {
    
        if (vaga <= 0 || vaga > 100) {
            return "Vaga inexistente!";
        } else {
            if (vagaLivre.contains(Integer.toString(vaga))) {
                return "Essa vaga está livre.";
            } else {
                return "Vaga utilizada por outro passageiro.";
            }
        }
    }

    public boolean ocupa(int vaga) {
    
        if (verifica(vaga).equals("Vaga inexistente!")|| verifica(vaga).equals("Essa vaga está ocupada.")) { 
            return false;  
        } else {  
            this.vagaLivre.remove(Integer.toString(vaga));
            this.ocupacaoVoo++;
            return true;  
        }
            
    }

    public int vagas() {
        return 100 - this.ocupacaoVoo;  
    }

    public voo clone(voo voo) {
        voo novo = new voo(voo.identificador_voo, voo.data_voo, voo.horario_Voo);
        novo.ocupacaoVoo = voo.ocupacaoVoo;
        novo.vagaLivre = voo.vagaLivre;
        return novo;
    }
    
}

