package br.com.dio.java.io.IOData;

import java.io.*;
import java.util.Scanner;

public class ExemploIOData {
    public static void incluirProduto() throws IOException {
        File f = new File("C:/Users/USER/OneDrive - Fatec Centro Paula Souza/Documents/1_intro/peca-de-roupa.bin");

        PrintStream ps = new PrintStream(System.out);
        ps.flush();

//        OutputStream os = new FileOutputStream(f.getPath());
//        DataOutputStream dos = new DataOutputStream(os);

        DataOutputStream dos = new DataOutputStream(new FileOutputStream(f.getPath()));

        Scanner scan = new Scanner(System.in);

        ps.printf("Nome da peça: ");
        String nome =  scan.nextLine();
        dos.writeUTF(nome);

        ps.print("Tamanho da peça (P/M/G/U)");
        char tamanho = (char) System.in.read();
        dos.writeChar(tamanho);

        ps.print("Quantidade: ");
        int quant = scan.nextInt();
        dos.writeInt(quant);

        ps.print("Preço Unitário: ");
        double preco = scan.nextDouble();
        dos.writeDouble(preco);

        ps.printf("O arquivo %s foi criado com %d bytes no diretório '%s'.\n",
                f.getName(), f.length(), f.getAbsolutePath());

        lerProduto(f.getPath());

        dos.close();
        scan.close();
        ps.close();
        
    }

    public static void lerProduto(String arquivo) throws IOException {

        File f = new File(arquivo);

//        InputStream is = new FileInputStream(f.getPath());
//        DataInputStream dis = new DataInputStream();
        DataInputStream dis = new DataInputStream(new FileInputStream(f.getPath()));

        String nome = dis.readUTF();
        char tamanho = dis.readChar();
        int quantidade = dis.readInt() ;
        double preco = dis.readDouble();

        System.out.printf("\nNome................: %s", nome);
        System.out.printf("\nQuantidade................: %d", quantidade);
        System.out.printf("\nTamanho................: %s", tamanho);
        System.out.printf("\nPreço................: %.2f\n", preco);
        System.out.println("Total valor das peças: " + (quantidade * preco));

        dis.close();

    }

    public static void main(String[] args) throws IOException {
        incluirProduto();
    }
}
