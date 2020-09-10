package Bichos;

public class Aula13 {
        public static void main(String[] args) {
            //PROGRAMA PRINCIPAL
            Cachorro c1 = new Cachorro();
            c1.setCorPelo("Preto");
            c1.setNome("Scooby");
            c1.setIdade(7);
            c1.setMembros(4);
            c1.setPeso(13f);
            c1.reagir("Olá");
            c1.reagir("Está de castigo");
            c1.reagir(7, 13f);
            c1.reagir(true);
            c1.reagir(21,45);
            c1.emitirSom();
            //c1.status();

        }
    }
