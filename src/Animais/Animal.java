package Animais;


//Animal seria a classe PAI de cachorro, passaro, e gato, para não dar erro usei um modificador
// de acesso(PROTECTED)

public class Animal {
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

    protected void soar(){
        System.out.println("alguma coisa....");


    }
}
