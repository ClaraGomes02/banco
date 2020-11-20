/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author clara
 */
public class ContaBanco {
    
//    Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    public float v;
    
//    Método Construtor

    public ContaBanco(float saldo, boolean status) {//Predefinição de saldo inicial 0.0 e conta fechada pois não existe.
        
        this.saldo = 0;
        this.status = false;
        
    }
    
//    Métodos
    
    public void estadoAtual(){
        
        System.out.println("Número: "+getNumConta());
        System.out.println("Proprietário: "+getDono());
        System.out.println("Tipo: "+getTipo());
        System.out.println("Saldo atual: "+getSaldo());
        System.out.println("Status: "+getStatus());
        
    }
    
    public void abrirConta(String t){//Quando esse método for chamado, ele irá:
        
        this.setTipo(t);//Modificar o tipo "t".
        this.setStatus(true);//Abrir a conta "true".
        
        if ("CC".equals(t)){//Se a conta for corrente "CC", irá:
            
            this.setSaldo(50);//Adicionar 50 ao saldo da conta.
            
        }else if("CP".equals(t)){//Se a conta for corrente "CP", irá:
            
            this.setSaldo(150);//Adicionar 150 ao saldo da conta.
            
        }
        
        System.out.println("Conta aberta com sucesso!");
        
    }
    
    public void fecharConta(){//Quando esse método for chamado, ele irá:
        
        if (this.getSaldo() > 0){//Verificar se a conta ainda tem saldo.
            
            System.out.println("A conta não pode ser fechada, ainda há saldo.");
            
        }else if(this.getSaldo() < 0){//Verificar se a conta está no saldo negativo.
            
            System.out.println("A conta não pode ser fechada, conta no negativo.");
            
        }else{//Se o saldo estiver em 0.0, a conta será desativada.
            
            this.setStatus(false);
            
            System.out.println("Conta fechada com sucesso!");
            
        }
        
    }
    
    public void depositar(float v){//Quando esse método for chamado, ele irá verificar:
        
        if (this.getStatus() == true){//Se a conta está aberta "true":
            
            this.setSaldo(this.getSaldo() + v);//Pegue o saldo "getSaldo", some o valor "v" e mande para "setSaldo".
            
        }else{//Se não:
            
            System.out.println("Erro. Conta fechada.");
            
        }
        
    }
    
    public void sacar(float v){//Quando esse método for chamado, ele irá verificar:
        
        if (this.getStatus() == true){//Se a conta está aberta.
            
            if (this.getSaldo() >= v){//Se estiver, irá verificar se o saldo é maior que v (valor desejado).
                
                this.setSaldo(this.getSaldo() - v);//Pegue o saldo "getSaldo", diminua o valor "v" e mande para "setSaldo".
                
            }else{//Se o saldo for menor que o valor desejado para sacar:
                
                System.out.println("Saldo insuficiente.");
                
            }
            
        }else{//Se a conta estiver fechada:
            
            System.out.println("Impossível sacar de uma conta fechada.");
            
        }
        
    }
    
    public void pagarMensal(){//Quando esse método for chamado, ele irá:
        
        if("CC".equals(tipo)){//Se a conta for do tipo corrente:
            
            if (this.getSaldo() > 12){//Se saldo maior que 12:
                
                this.setSaldo(this.getSaldo() - 12);//Pegue o saldo "getSaldo", diminua o valor 12 e mande para "setSaldo".
                
                System.out.println("Mensalidade paga com sucesso.");
                
            }else{//Se o saldo for menor que 12:
                
                this.setStatus(this.getStatus() == false);//Conta fechada.
                
                System.out.println("Mensalidade não paga, conta fechada.");
                
            }
            
        }else{//Se a conta for do tipo polpança:
            
            if (this.getSaldo() > 20){//Se saldo maior que 20:
                
                this.setSaldo(this.getSaldo() - 20);//Pegue o saldo "getSaldo", diminua o valor 20 e mande para "setSaldo".
                
                System.out.println("Mensalidade paga com sucesso.");
                
            }else{
                
                this.setStatus(this.getStatus() == false);//Se saldo menor que 20:
                
                System.out.println("Mensalidade não paga, conta fechada.");//Conta fechada.
                
            }
            
        }
        
    }
    
//    Métodos Getters e Setters.
    public int getNumConta() {
        return this.numConta; //Retorna o número da conta.
    }

    public void setNumConta(int n) {//"n" é uma váriável.
        this.numConta = n; //a conta receberá "n".
    }

    public String getTipo() {
        return this.tipo; //Retorna o tipo da conta.
    }

    public void setTipo(String t) {//"t" é uma váriável.
        this.tipo = t; //a conta receberá "t".
    }

    public String getDono() {
        return this.dono; //Retorna o dono da conta.
    }

    public void setDono(String d) {//"d" é uma váriável.
        this.dono = d; //a conta receberá "d".
    }

    public float getSaldo() {
        return this.saldo; //Retorna o saldo da conta.
    }

    public void setSaldo(float s) {//"s" é uma váriável.
        this.saldo = s; //a conta receberá "s".
    }

    public boolean getStatus() {
        return this.status; //Retorna o status da conta.
    }

    public void setStatus(boolean st) {//"st" é uma váriável.
        this.status = st; //a conta receberá "st".
    }
    
}
