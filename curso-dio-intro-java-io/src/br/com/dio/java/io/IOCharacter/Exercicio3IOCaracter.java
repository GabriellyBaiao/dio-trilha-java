package br.com.dio.java.io.IOCharacter;

import java.io.*;

public class Exercicio3IOCaracter {
    public static void copiarArquivo() throws IOException {
        File f = new File("C:\\ws-intelliJ\\curso\\dio-trilha-java\\curso-dio-intro-java-io\\recomendacoes.txt");
        if (!f.exists()) {
            System.err.println("Arquivo original não encontrado: " + f.getAbsolutePath());
            return;
        }

        String nomeArquivo = f.getName();

        // Leitura do arquivo original
        try (BufferedReader br = new BufferedReader(new FileReader(f))) {
            // Nome do arquivo de cópia
            String nomeArquivoCopy = nomeArquivo.substring(0, nomeArquivo.indexOf(".")).concat("-copy.txt");
            File fcopy = new File(f.getParent(), nomeArquivoCopy);

            // Escrita no arquivo de cópia
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(fcopy))) {
                String line = br.readLine();
                while (line != null) {
                    bw.write(line);
                    bw.newLine();
                    line = br.readLine();
                }
            }

            System.out.printf("Arquivo \"%s\" copiado com sucesso! Com o tamanho '%d' bytes.\n", fcopy.getName(), fcopy.length());

            // Adicionando informações ao arquivo
            System.out.println("Recomende 3 livros (digite 'fim' para terminar): ");
            adicionarInfoNoArquivo(fcopy);

            System.out.printf("Ok! Tudo certo. Tamanho final do arquivo: %d bytes.\n", fcopy.length());
        }
    }

    public static void adicionarInfoNoArquivo(File arquivo) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo, true))) {
            String line = br.readLine();
            while (!line.equalsIgnoreCase("fim")) {
                bw.write(line);
                bw.newLine();
                line = br.readLine();
            }
        }
    }

    public static void main(String[] args) throws IOException {
        copiarArquivo();
    }
}
