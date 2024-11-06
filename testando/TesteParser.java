import java.io.*;

public class TesteParser {

    public static void main(String[] args) throws Exception {
        // Caminho para o arquivo com o código JavaScript
        String filePath = "program.js"; // Substitua pelo seu caminho do arquivo .js
        
        // Abrindo o arquivo com o código JavaScript
        FileReader fr = new FileReader(filePath);
        BufferedReader br = new BufferedReader(fr);
        
        // Lendo o código JavaScript
        StringBuilder code = new StringBuilder();
        String line;
        while ((line = br.readLine()) != null) {
            code.append(line).append("\n");
        }
        br.close();
        
        // Agora o código pode ser passado para o parser
        // Aqui você deve substituir esse código com a parte que chama o parser gerado pelo JavaCC
        // O parser gerado com o Javacc pode ser usado para analisar o código
        
        // Exemplo simples de execução do código
        System.out.println("Código lido: ");
        System.out.println(code.toString());
        
        // Aqui você deve passar o código lido para o seu analisador do JavaCC
        // E executar a lógica correspondente para interpretar esse código
    }
}
