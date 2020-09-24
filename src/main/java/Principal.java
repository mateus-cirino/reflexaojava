import java.time.ZonedDateTime;
import java.util.Collections;
import java.util.GregorianCalendar;

public class Principal {

    public static void main(final String... args) throws IllegalAccessException {
        final AlunoReflectionExemplo alunoReflectionExemplo = new AlunoReflectionExemplo();
        alunoReflectionExemplo.setCodigo(22);
        alunoReflectionExemplo.setDataMatricula(GregorianCalendar.from(ZonedDateTime.now()));
        alunoReflectionExemplo.setNome("Mateus Cirino");
        alunoReflectionExemplo.setNumMatricula("2154866598");
        alunoReflectionExemplo.setValor(254858);

        Reflexao.refletirObjeto(alunoReflectionExemplo, alunoReflectionExemplo.getClass());
    }
}
