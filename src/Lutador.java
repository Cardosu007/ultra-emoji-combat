import java.sql.SQLOutput;

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

    public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe);
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
    }

    public void apresentar (){
        System.out.println("----------PREPARE-SE A LUTA VAI COMEÇAR!----------");
        System.out.println("ENTRANDO NO RINGUE AGORA " + this.getNome());
        System.out.println("VINDO DIRETAMENTE " + this.getNacionalidade());
        System.out.println("COM " + this.getIdade() + " ANOS!");
        System.out.println(this.getAltura() + " DE ALTURA!");
        System.out.println("PESANDO! " + this.getPeso() + " NA CATEGORIA " + this.getCategoria());
        System.out.println("COM UM TOTAL DE " + this.getVitorias() + " VITÓRIAS!");
        System.out.println("E COM " + this.getDerrotas() + " DERROTAS!");
        System.out.println("E " + this.getEmpates() + " EMPATES!");
        System.out.println("HOJE COMEÇA MAIS UMA LUTA NA ARENA ULTRA EMOJI COMBAT!");
    }

    public void status (){
        System.out.println("----------PREPARE-SE A LUTA VAI COMEÇAR!----------");
        System.out.println("ENTRANDO NO RINGUE AGORA " + this.getNome());
        System.out.println("VINDO DIRETAMENTE " + this.getNacionalidade());
        System.out.println("COM " + this.getIdade() + " ANOS!");
        System.out.println(this.getAltura() + "DE ALTURA!");
        System.out.println("PESANDO! " + this.getPeso());
        System.out.println("COM UM TOTAL DE " + this.getVitorias() + " VITÓRIAS!");
        System.out.println("E COM" + this.getDerrotas() + " DERROTAS!");
        System.out.println("E " + this.getEmpates() + "EMPATES!");
        System.out.println("HOJE COMEÇA MAIS UMA LUTA NA ARENA ULTRA EMOJI COMBAT!");
    }

    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);
    }

    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() + 1);
    }

    public void empatarLuta(){
        this.setEmpates(this.getEmpates() + 1);
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String no) {
        this.nome = no;
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

    public void setAltura(float al) {
        this.altura = al;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float pe) {
        this.peso = pe;
        setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if(this.peso < 52.2){
            this.categoria = "Inválido";
        } else if(this.peso <= 70.3){
            this.categoria = "Leve";
        } else if(this.peso <= 83.9){
            this.categoria = "Médio";
        } else if(this.peso <= 120.2){
            this.categoria = "Pesado";
        } else {
            this.categoria = "Inválido";
        }
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

    public void setEmpates(int em) {
        this.empates = em;
    }
}
