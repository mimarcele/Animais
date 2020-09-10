package Bichos;

public abstract class Animal {
        //ATRIBUTOS
        protected float peso;
        protected int idade;
        protected int membros;
        protected String nome;

        public void status(){
            System.out.println("=====================");
            System.out.println("Eu sou o: " + this.getNome());
            System.out.println("Tenho: " + this.getIdade() + " anos");
            System.out.println("Peso: " + this.getPeso() + " kg");
            System.out.println("Tenho: " + this.getMembros() + " membros");
            System.out.println("=====================");


        }

        //METODO
        public abstract void emitirSom();



        //METODOS ESPECIAIS
        public void setPeso(float peso){
            this.peso = peso;
        }
        public float getPeso(){
            return this.peso;
        }
        public void setIdade(int idade){
            this.idade = idade;
        }
        public int getIdade(){
            return this.idade;
        }
        public void setMembros(int membros){
            this.membros = membros;
        }
        public int getMembros(){
            return this.membros;
        }
        public void setNome(String nome){
            this.nome = nome;
        }
        public String getNome(){
            return this.nome;
        }


    }


