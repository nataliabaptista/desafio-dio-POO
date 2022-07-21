import java.time.LocalDate;

import dominio.Bootcamp;
import dominio.Curso;
import dominio.Dev;
import dominio.Mentoria;

public class Main{
    public static void main(String[] args) {
        Curso curso1 = new Curso();

        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso");
        curso1.setCargaHoraria(7);


        Curso curso2 = new Curso();

        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descrição curso 2");
        curso2.setCargaHoraria(5);

       /*System.out.println(curso1);
        System.out.println(curso2);*/


        Mentoria mentoria1 = new Mentoria();

        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("Mentoria java");
        mentoria1.setData(LocalDate.now());


        //System.out.println(mentoria1);

        Bootcamp bootcamp1 = new Bootcamp();
        bootcamp1.setNome("Bootcamp Java Developer");
        bootcamp1.setDescricao("Descrição bootcamp Java Developer");
        bootcamp1.getConteudos().add(curso1);
        bootcamp1.getConteudos().add(curso2);
        bootcamp1.getConteudos().add(mentoria1);

        Dev devNatalia = new Dev();
        devNatalia.setNome("Natália");
        devNatalia.increverBootcamp(bootcamp1);
        devNatalia.progredir();
        devNatalia.progredir();
        System.out.println("Conteúdos Inscritos Natália" +devNatalia.getConteudoInscrito()+ "\n");
        System.out.println("Conteúdos Concluídos " +devNatalia.getConteudoConcluido()+ "\n\n\n\n");

        Dev devHeitor = new Dev();
        devHeitor.setNome("Heitor");
        devHeitor.increverBootcamp(bootcamp1);
        devHeitor.progredir();
        System.out.println("Conteudos Inscritos Heitor"+devHeitor.getConteudoInscrito()+ "\n");
        System.out.println("Conteúdos Concluídos " +devHeitor.getConteudoConcluido()+ "\n");

        
















    }

}