package Animais;
//A CLASSE É PARA DEFINIR ALGUMA COISA PROJETAR ALGUMA COISA SEJA ANIMAL, PLANTA, ALGUMA COISA....
public class Cachorro extends Animal{
    //ATRIBUTOS

    private int tamanhoDoRabo;

    static int numeroDeCachorro;

    //Construtores padrão
    public Cachorro(){}

    private String estadoDeEspirito;

    //CONSTRUTORES: É O QUE CONSTROI O PROJETO COMO SE FOSSE O PEDREIRO

    //Construtores adicionados
    public Cachorro(String nome, String cor, int altura, double peso, int tamanhoDoRabo) {
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
        this.tamanhoDoRabo = tamanhoDoRabo;

        numeroDeCachorro ++;
    }

    public static int getNumeroDeCachorro() {
        return numeroDeCachorro;
    }

    public static void setNumeroDeCachorro(int numeroDeCachorro) {
        Cachorro.numeroDeCachorro = numeroDeCachorro;
    }

    //METODOS

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

    public String getAtencaoDoCachorro() {
        return atencaoDoCachorro;
    }

    public void setAtencaoDoCachorro(String atencaoDoCachorro) {
        this.atencaoDoCachorro = atencaoDoCachorro;
    }

    public String getFisiologicas() {
        return fisiologicas;
    }

    public void setFisiologicas(String fisiologicas) {
        this.fisiologicas = fisiologicas;
    }

    private String atencaoDoCachorro;
    private String fisiologicas;

    //NA CRIAÇÃO DOS METODOS NOS VAMOS DAR AÇÃO AO NOSSO PROJETO
    public void comer(){}

    public void latir(){
        System.out.println("au au au");
    }
    public void peidar(){
        System.out.println("pum pum");
    }
    public void nome(){
        System.out.println("Fifi");
    }

    public String pegar(){

        return "Bolinha";
    }

    @Override
    public String toString() {
        return "Cachorro{" +
                "cor='" + cor + '\'' +
                ", altura=" + altura +
                ", peso=" + peso +
                ", tamanhoDoRabo=" + tamanhoDoRabo +
                ", estadoDeEspirito='" + estadoDeEspirito + '\'' +
                ", atencaoDoCachorro='" + atencaoDoCachorro + '\'' +
                ", fisiologicas='" + fisiologicas + '\'' +
                '}';
    }
    @Override
    public void soar(){
        System.out.println("au aua au");
    }

    public String interagir(String acao){

        switch (acao){
            case "carinho": this.estadoDeEspirito = "feliz"; break;
            case "vai dormir": this.estadoDeEspirito = "Bravo"; break;
            case "Pisar no rabo": this.estadoDeEspirito = "Morder"; break;
            case "vai beber agua": this.estadoDeEspirito = "Bebendo agua"; break;
            default: this.estadoDeEspirito = "Neutro";break;
        }
        return this.estadoDeEspirito;
    }

    public String falar(String acao){
        if (acao.equals("olhar")){
            this.atencaoDoCachorro = "atenção";
        }else{
            this.atencaoDoCachorro = "abaixa cabeça";
        }
        return atencaoDoCachorro;


    }

    public String obediente(String acao){
        if (acao.equals("fazer numero1")){
            this.fisiologicas = "XIXI";
        }else if(acao.equals("fazer numero2")){
            this.fisiologicas = "COCO";
        }else{
            this.fisiologicas = "vai deitar";
        }
        return fisiologicas;

    }


}
