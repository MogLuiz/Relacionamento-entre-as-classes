import java.util.Random;

public class Luta {
    //Atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    //Métodos
    public void marcarLuta(Lutador l1,Lutador l2 ){
        if (l1.getCategoria().equals(l2.getCategoria())
             && l1 != l2) {
            this.aprovada = true ;
            this.desafiado = l1;
            this.desafiante = l2;
        }
        else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }
    public void lutar(){
        if (this.aprovada){
            System.out.println("### Desafiado ###");
            this.desafiado.apresentar();
            System.out.println("### Desafiante ###");
            this.desafiante.apresentar();
            System.out.println("========= Resultado da Luta ========");
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3); //0 1 ou 2
            switch(vencedor) {
                case 0 :
                    System.out.println("A luta empatou");
                    this.desafiante.empatarLuta();
                    this.desafiado.empatarLuta();
                    break;
                case 1:
                    System.out.println("Vitória do" + this.desafiado);
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 3:
                    System.out.println(" Vitória do " + this.desafiante);
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;
            }
            System.out.println("====================================");


        } else {
            System.out.println("Essa Luta não pode acontecer");
        }

    }

    //Métodos especiais
    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador des) {
        this.desafiado = des;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador fiante) {
        this.desafiante = fiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rou) {
        this.rounds = rou;
    }

    public boolean getAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean apr) {
        this.aprovada = apr;
    }

}
