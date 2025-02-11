import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        //usar getParent(); buscar o caminho
        //usar getFileName(); buscar o nome
        Path arquivo = Paths.get("configuracao.txt");
    }
    try{
        List<String> conteudo = Files.readAllLines(arquivo);
        Map<String,String> configuracoes = new HashMap<>();
        String[] linhaQuebrada = linha.split(";");
        configuracoes.put(linhaQuebrada[0],linhaQuebrada[1].strip());
    }
    catch(IOException e){
        System.out.println("Erro ao ler o arquivo");
        e.printStackTrace();
    }

    try{
        String conteudoString = Files.readString(arquivo)
    }catch(IOException e){
        System.out.println("Erro ao ler o arquivo");
        e.printStackTrace();
    }

    try{
        Files.writeString(arquivo,"Nova String no meu arquivo")
    }
    catch(IOException e){
        System.out.println("Erro ao ler o arquivo");
        e.printStackTrace();
    }

}