package Bichos;

public class Mamifero extends  Animal{
        //ATRIBUTO
        protected String corPelo;

        @Override
        public void emitirSom() {
            System.out.println("SOM DE MAMÍFERO");
        }

        public void setCorPelo(String corPelo){
            this.corPelo = corPelo;
        }
        public String getCorPelo(){
            return this.corPelo;
        }
    }
