import br.com.dio.desafio.dominio.BootCamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("Curso basico java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso1.setTitulo("JavaScript");
        curso1.setDescricao("Curso basico javaScript");
        curso1.setCargaHoraria(10);

        Curso curso3 = new Curso();
        curso1.setTitulo("JavaScript");
        curso1.setDescricao("Curso basico javaScript");
        curso1.setCargaHoraria(10);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("titulo");
        mentoria.setDescricao("descricao");
        mentoria.setData(LocalDate.now());
        System.out.println(mentoria);
       // System.out.println(curso1);

        BootCamp bootCamp = new BootCamp();
        bootCamp.setNome("Bootcamp Java Developer");
        bootCamp.setDescricao("Descrição Bootcamp  Java Developer");
        bootCamp.getConteudos().add(curso1);
        bootCamp.getConteudos().add(curso2);
        bootCamp.getConteudos().add(curso3);

        Dev devCamila=new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootCamp);
        System.out.println("conteúdos inscritos camila"+ devCamila.getConteudosInscritos());
        System.out.println("Conteudos concluidos: " + devCamila.getConteudosConcluidos());
        devCamila.progredir();
        System.out.println("--");
        System.out.println("conteúdos inscritos camila"+ devCamila.getConteudosInscritos());
        System.out.println("Conteudos concluidos: " + devCamila.getConteudosConcluidos());



        Dev devJoao=new Dev();;
        devJoao.setNome("Camila");
        devJoao.inscreverBootcamp(bootCamp);
        System.out.println("conteúdos inscritos joao"+ devJoao.getConteudosInscritos());
        devJoao.progredir();
        System.out.println("Conteudos concluidos joao: " + devJoao.getConteudosConcluidos());




    }
}
