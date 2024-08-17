import java.time.LocalDate;

import br.com.desafio.dominio.Curso;
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

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);

    }
}
