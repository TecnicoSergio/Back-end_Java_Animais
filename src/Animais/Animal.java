package Animais;


//Animal seria a classe PAI de cachorro, passaro, e gato, para não dar erro usei um modificador
// de acesso(PROTECTED)

public abstract class Animal {
    protected String nome;
    protected String cor;
    protected int altura;
    protected double peso;
    protected int tamanhoDoRabo;

    protected String estadoDeEspirito;

    public Animal() {
    }

    protected void comer(){}
    protected void dormir(){}
    //protected  void soar(){}


    public Animal(String nome, String cor, double peso) {
        super();
        this.nome = nome;
        this.cor = cor;
        this.peso = peso;
        //super(nome, cor, peso);

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getTamanhoDoRabo() {
        return tamanhoDoRabo;
    }

    public void setTamanhoDoRabo(int tamanhoDoRabo) {
        this.tamanhoDoRabo = tamanhoDoRabo;
    }

    public String getEstadoDeEspirito() {
        return estadoDeEspirito;
    }

    public void setEstadoDeEspirito(String estadoDeEspirito) {
        this.estadoDeEspirito = estadoDeEspirito;
    }

    protected abstract void soar();
}
