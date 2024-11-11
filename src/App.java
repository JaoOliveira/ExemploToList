import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class App {
    public static void main(String[] args) throws Exception {

        Curso curso = new Curso();
        curso.setTitulo("Java");
        curso.setDescricao("Curso java orientado a objetos.");
        curso.setCargaHoraria(72);

        Curso curso2 = new Curso();
        curso2.setTitulo("JS");
        curso2.setDescricao("Curso javaScript para todos e para tudo.");
        curso2.setCargaHoraria(10);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de Java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("mentoria de js");
        mentoria2.setDescricao("descrição mentoria js");
        mentoria2.setData(LocalDate.now());

        /*System.out.println(curso);
        System.out.println(curso2);
        System.out.println(mentoria);
        System.out.println(mentoria2);*/

        Bootcamp bootcamp1 = new Bootcamp();
        bootcamp1.setNome("Bootcamp JAva Developer");
        bootcamp1.setDescricao("Botcamp JAva Develper, Descrição");
        bootcamp1.getConteudos().add(mentoria2);
        bootcamp1.getConteudos().add(curso);
        bootcamp1.getConteudos().add(curso2);

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp1);
        System.out.println("conteúdos Inscritos: " + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("conteúdos Inscritos: " + devJoao.getConteudosInscritos());
        System.out.println("conteúdos Concluidos: " + devJoao.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.calculartotalXp());

        System.out.println("----------");

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp1);
        System.out.println("conteúdos Inscritos: " + devCamila.getConteudosInscritos());
        devCamila.progredir();
        System.out.println("-");
        System.out.println("conteúdos Inscritos: " + devCamila.getConteudosInscritos());
        System.out.println("conteúdos Concluidos: " + devCamila.getConteudosConcluidos());
        System.out.println("XP: " + devCamila.calculartotalXp());
    }
}
