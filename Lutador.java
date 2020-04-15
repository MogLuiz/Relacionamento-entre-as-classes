import java.util.Spliterator;

public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    public void apresentar() {
        System.out.println("----------------------------------");
        System.out.println("CHEGOU A HORA! Apresentamos o lutador " + this.getNome() );
        System.out.println("Diretamente de : " + this.getNacionalidade());
        System.out.println("Com " + this.getIdade() + " Anos e " + this.getAltura() + " de altura");
        System.out.println("Pesando : " + this.getPeso() + "Kg");
        System.out.println(this.getVitorias() + " Vitórias ");
        System.out.println(this.getDerrotas() + " Derrotas e ");
        System.out.println(this.getEmpates() + " Empates !" );

    }

    public void status() {
        System.out.println(getNome() + " É um peso " + this.getCategoria());
        System.out.println("Vitorias : " + this.getVitorias() );
        System.out.println("Derrotas : " + this.getDerrotas());
        System.out.println("Empates : " + this.getEmpates());
    }

    public void ganharLuta() {
        setVitorias(getVitorias() + 1);
    }

    public void perderLuta() {
        setDerrotas(getDerrotas() + 1);
    }

    public void empatarLuta() {
        setEmpates(getEmpates() + 1);
    }

    //Métodos especiais

    public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em) {
        nome = no;
        nacionalidade = na;
        idade = id;
        altura = al;
        setPeso(pe);
        vitorias = vi;
        derrotas = de;
        empates = em;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String no) {
        this.nome = no;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float pe) {
        this.peso = pe;
        setCategoria();
    }

    public void setCategoria() {

        if (this.peso < 52.2) {
            this.categoria = "Inválido";
        } else if (peso <= 70.3) {
            this.categoria = "Leve";
        } else if (peso <= 83.9) {
            this.categoria = "Médio";
        } else if (peso <= 120.2) {
            this.categoria = "Pesado";
        } else {
            this.categoria = "Inválido";
        }
    }



        public String getCategoria () {
            return categoria;
        }


    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String na) {
        this.nacionalidade = na;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int id) {
        this.idade = id;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float alt) {
        this.altura = alt;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vi) {
        this.vitorias = vi;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int de) {
        this.derrotas = de;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int em){
        this.empates = em;
    }




}


