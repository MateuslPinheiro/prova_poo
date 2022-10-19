package agenda;


import contatos.Contato;

public class Agenda {
    private int capacidadeAgenda;
    private int numContatos;
    private Contato[] contatos;

    public Agenda(int capacidadeAgenda) {
        this.capacidadeAgenda = capacidadeAgenda;
        this.contatos = new Contato[capacidadeAgenda];
    }

    public void adicionarContato(Contato c){
        if(this.numContatos<capacidadeAgenda){
            this.contatos[this.numContatos] = c;
            this.numContatos++;
        }
    }

    public void listarContatos(){
        if (this.numContatos==0){
            System.out.println("A agenda está vazia.");
        } else if (this.numContatos<=this.capacidadeAgenda) {
            int i;
            for (i=0;i<this.capacidadeAgenda; i++){
                System.out.println(this.contatos[i]);
                if (i==this.numContatos-1){break;}
            }
        }
    }
}
