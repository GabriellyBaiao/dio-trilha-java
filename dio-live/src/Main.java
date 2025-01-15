import one.digitalinovation.dominio.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Curso cursoJavaBasico = new Curso();
        cursoJavaBasico.setTitulo("Java Básico");
        cursoJavaBasico.setDescricao("Aprenda os conceitos básicos sobre Java");
        cursoJavaBasico.setCargaHoraria(8);

        Curso cursoDotNet = new Curso();
        cursoDotNet.setTitulo(".NET Básico");
        cursoDotNet.setDescricao("Aprenda os conceitos básicos sobre C#");
        cursoDotNet.setCargaHoraria(8);

        Curso cursoJavaAvancado = new Curso();
        cursoJavaAvancado.setTitulo("Java avançado");
        cursoJavaAvancado.setDescricao("Aprenda os conceitos básicos sobre Java Avançadp");
        cursoJavaAvancado.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Aprendendo orientação a objs com Java");
        mentoria.setDescricao("Imersão sobre os pilares de orietação a objetos");
        mentoria.setDate(LocalDateTime.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("GET START WITH JAVA");
        bootcamp.setInicio(LocalDate.now());
        bootcamp.setFim(bootcamp.getInicio().plusDays(45));

        List<Conteudo> conteudosBootcamp = Arrays.asList(cursoJavaBasico, cursoJavaAvancado, mentoria);
        bootcamp.setConteudos(conteudosBootcamp);

        Dev gabrielly = new Dev();
        gabrielly.setNome("Gaby");
        gabrielly.inscrever(cursoDotNet);
        gabrielly.inscrever(bootcamp);
        gabrielly.progredir();
        gabrielly.progredir();

        Dev steff = new Dev();
        steff.setNome("Steff");
        steff.progredir();
        steff.progredir();
        steff.progredir();

        System.out.println(String.format("XP gabrielly: %.2f", gabrielly.calcularTotalXp()));
        System.out.println(String.format("XP steff: %.2f", steff.calcularTotalXp()));

        List<Dev> ranking = Arrays.asList(gabrielly, steff).stream()
                .sorted((dev1, dev2) -> Double.compare(dev1.calcularTotalXp(), dev2.calcularTotalXp()))
                .collect(Collectors.toList());

        for ( Dev dev : ranking) {
            System.out.println(dev.getNome());
        }

    }
}