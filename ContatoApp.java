import agenda.Agenda;
import contatos.Contato;
import contatos.Endereco;

public class ContatoApp {
    public static void main(String[] args) {
        Endereco e1 = new Endereco("Avenida Treze de Maio", 999, "60822-199", "Fortaleza", "CE");
        Endereco e2 = new Endereco("Rua Floriano Peixoto", 988, "60922-299", "Fortaleza", "CE");
        Contato c1 = new Contato("Cesar", 999859898, "cesar@daiacesar.com", e1);
        Contato c2 = new Contato("Olavo", 999888499, "olavoca@lalal.com", e2);
        agenda.Agenda a1 = new Agenda(2);

        a1.listarContatos();

        System.out.println("\n");

        a1.adicionarContato(c1);
        a1.listarContatos();

        System.out.println("\n");

        a1.adicionarContato(c2);
        a1.listarContatos();



    }
}
