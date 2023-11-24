import Animais.Cachorro;

public class Main {

//AGORA NO MAIN NÓS VAMOS DAR VIDA AQUILO QUE PROJETAMOS TRAREMOS A VIDA NOSSO PROJETO...
    public static void main(String[] args) {

        Cachorro cachorro1 = new Cachorro();
        Cachorro cachorro2 = new Cachorro("Pet", "Preto", 10, 9.8, 5);

        System.out.println(cachorro2.getNome());
        System.out.println(cachorro2.getPeso());

        System.out.println(cachorro1);
        //sout é para criar System.out.println

        cachorro1.latir();
        cachorro1.peidar();
        cachorro1.nome();
        System.out.println("O Cachorro pegou uma " +  cachorro1.pegar() + " esse cachorro é esperto!!");

        System.out.println("O Cachorro esta " + cachorro1.interagir( "feliz"));
        System.out.println("O Cachorro esta " + cachorro1.interagir( "Nada"));
        System.out.println("O Cachorro esta " + cachorro1.interagir( "vai dormir"));
        System.out.println("Meu cachorro quando falo ele dá " + cachorro1.falar( "olhar"));
        System.out.println("Meu cachorro é desobediente quando falo ele " + cachorro1.falar( "deitar"));
        System.out.println("Quando falo pra meu cachorro fazer o numero 1 ele faz " + cachorro1.obediente( "xixi"));
        System.out.println("Quando falo pra meu cachorro fazer o numero 2 ele faz " + cachorro1.obediente( "coco"));
        System.out.println("Ou mando ele deitar " + cachorro1.obediente("Deitar"));








    }
}