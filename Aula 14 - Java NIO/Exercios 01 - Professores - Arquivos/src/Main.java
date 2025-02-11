import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        //um program para ler o arquivo, adicionar o conteudo em hashmap e imprimir o conteudo hashmap
        Path arquivo = Paths.get("professores_disciplinas.txt");
        //usar quebra de linha em " = "
        try{
            //da para fazer sem usar o list desde do java 11
            List<String> conteudo = Files.readAllLines(arquivo);
            Map<String,String> professores = new HashMap<>();

            //use o metodos split essa função do apenas le
            conteudo.forEach((linha)->{
                String[] linhaQuebrada = linha.split(" = ");
                professores.put(linhaQuebrada[0], linhaQuebrada[1].strip());
            });

            //para isso usaremos essa função for each para pegar as informações e mostrar
            professores.forEach((professor, disciplina)->{
                System.out.println(professor+" = "+disciplina);
            });
        }
        //trate corretamente as exceptions
        catch(IOException e){
            e.printStackTrace();
        }

    }
}