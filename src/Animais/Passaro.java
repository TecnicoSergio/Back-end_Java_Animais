package Animais;

public class Passaro extends Animal {


    private String estadoDeEspirito;

    static int numeroDePassaro;

    public Passaro(String estadoDeEspirito) {
        this.estadoDeEspirito = estadoDeEspirito;
    }

    public String getEstadoDeEspirito() {
        return estadoDeEspirito;
    }

    public void setEstadoDeEspirito(String estadoDeEspirito) {
        this.estadoDeEspirito = estadoDeEspirito;
    }

    public Passaro(String nome, String cor, double peso) {
        this();
        this.nome = nome;
        this.cor = cor;
        this.peso = peso;




        numeroDePassaro ++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static int getNumeroDePassaro() {
        return numeroDePassaro;
    }

    public static void setNumeroDePassaro(int numeroDePassaro) {
        Passaro.numeroDePassaro = numeroDePassaro;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    public Passaro(){
        //super(nome, cor, peso);
    }

    public void piar(){
        System.out.println("Piu Piu Piu");
    }

    public String interagir(String acao){
        switch (acao){
            case "Alpiste":this.estadoDeEspirito = "come";break;
            case "carinho":this.estadoDeEspirito = "Canta"; break;


        }
        return this.estadoDeEspirito;
    }

    @Override
    public String toString() {
        return "Passaro{" +
                "nome='" + nome + '\'' +
                ", cor='" + cor + '\'' +
                ", peso=" + peso +
                ", estadoDeEspirito='" + estadoDeEspirito + '\'' +
                '}';
    }

    @Override
    public void soar(){
        System.out.println("miau e piu piu");
    }
}
