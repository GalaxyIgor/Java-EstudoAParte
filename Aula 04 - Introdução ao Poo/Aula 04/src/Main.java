//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Professor extends Pessoa{
    String nome;

    public void ministrarAula() {
        //ministrar aula de poo

    }
    public class Faculdade{
        public String nome;
        private Professor professor;//Associação
        public void ministrarAulas(){
            professor.ministrarAula();//Quem ministra aula é o professor
        }
    }

}
