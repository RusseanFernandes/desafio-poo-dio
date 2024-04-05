import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        Curso curso2 = new Curso();

        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descição do curso java");
        curso1.setCargaHoraria(8);

        curso2.setTitulo("Curso Java Script");
        curso2.setDescricao("Descição do curso java Script");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição mentoria java");
        mentoria.setData(LocalDate.now()); //Atribui a data de criação 2

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devRussean = new Dev();
        devRussean.setNome("Russean");
        devRussean.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Russean:" + devRussean.getConteudosInscritos());

        devRussean.progredir();
        devRussean.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Russean:" + devRussean.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Russean:" + devRussean.getConteudosConcluidos());
        System.out.println("XP:" +devRussean.calcularTotalXp());

        System.out.println("----------");

        Dev devFernandes = new Dev();
        devFernandes.setNome("Fernandes");
        devFernandes.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Fernandes:" + devFernandes.getConteudosInscritos());

        devFernandes.progredir();
        devFernandes.progredir();
        devFernandes.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Fernandes:" + devFernandes.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Fernandes:" + devFernandes.getConteudosConcluidos());
        System.out.println("XP:" +devFernandes.calcularTotalXp());
    }
}