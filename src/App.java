import java.time.LocalDate;

import br.com.dio.desafio.dominio.Curso;
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

        System.out.println(curso);
        System.out.println(curso2);
        System.out.println(mentoria);
        System.out.println(mentoria2);
    }
}
