package br.com.dio.java.io.IOObject;

import java.io.*;

public class ExemploIObject {
    public static void serializacao() throws IOException {
        Gato gato = new Gato("Sima", 6, "amarelado" );

        File f = new File("gato");

//        OutputStream os = new FileOutputStream(f.getName());
//        ObjectOutputStream oos = new ObjectOutputStream(os);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f.getName()));

        oos.writeObject(gato);

        PrintStream ps = new PrintStream(System.out);
        ps.printf("Arquivo \"%s\" criado com sucesso! Tamanho '%d' bytes.", f.getName(), f.length());

        oos.close();
        ps.close();

    }

    public static void desserializacao(String arquivo){}

    public static void main(String[] args) throws IOException {
        serializacao();
    }
}
