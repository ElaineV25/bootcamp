import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDecricao("descricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2= new Curso();
        curso2.setTitulo("curso javascript");
        curso2.setDecricao("descricao curso javascript");
        curso2.setCargaHoraria(4);



        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descricao mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devElaine = new Dev();
        devElaine.setNome("Elaine");
        devElaine.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos" + devElaine.getConteudoInscritos());
        devElaine.progredir();
        devElaine.progredir();
        System.out.println("Conteúdos Inscritos" + devElaine.getConteudoInscritos());
        System.out.println("Conteúdos Concluidos" + devElaine.getConteudoConcluidos());
        System.out.println("XP:" + devElaine.calcularTotalXp());

        System.out.println("----------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println(("Conteúdos Inscritos" + devJoao.getConteudoInscritos()));
        devJoao.progredir();
        System.out.println(("Conteúdos Inscritos" + devJoao.getConteudoInscritos()));
        System.out.println(("Conteúdos Concluidos" + devJoao.getConteudoConcluidos()));
        System.out.println("XP:" + devJoao.calcularTotalXp());
    }

}
