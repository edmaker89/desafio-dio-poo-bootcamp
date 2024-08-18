import java.time.LocalDate;

import br.com.desafio.dominio.Bootcamp;
import br.com.desafio.dominio.Curso;
import br.com.desafio.dominio.Dev;
import br.com.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("curso de java basico");
        curso1.setCargaHoraria(8);
        
        Curso curso2 = new Curso();
        curso2.setTitulo("Javascript");
        curso2.setDescricao("curso de Javascript basico");
        curso2.setCargaHoraria(10);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("Descrição mentoria java");
        mentoria.setData(LocalDate.now());;

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("BootCamp de Java - Claro");
        bootcamp.setDescricao("Descrição bootcamp");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev();
        dev1.setNome("Vanessa G. Nascimento");
        dev1.inscreverBootCamp(bootcamp);
        System.out.println("Conteudos inscritos: " + dev1.getConteudosInscritos());
        dev1.progredir();
        dev1.progredir();
        System.out.println("Conteudos concluidos: " + dev1.getConteudosConcluidos());
        System.out.println("XP: " + dev1.calcularTotalXp());
        System.out.println("----------------------------------------------------");
        
        Dev dev2 = new Dev();
        dev2.setNome("Douglsa E. Silva");
        dev2.inscreverBootCamp(bootcamp);
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        System.out.println("Conteudos concluidos: " + dev2.getConteudosConcluidos());
        System.out.println("Conteudos inscritos: " + dev2.getConteudosInscritos());
        System.out.println("XP: " + dev2.calcularTotalXp());
        
    }
}
