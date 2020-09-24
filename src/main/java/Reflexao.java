import java.lang.reflect.Field;

public class Reflexao {

    public static void refletirObjeto(final Object objeto, final Class classe) throws IllegalAccessException {
        System.out.println("Nome da classe: " + classe.getName());
        System.out.println("Nome da classe (simples): " + classe.getSimpleName());
        System.out.println("Nome da classe (canonical): " + classe.getResource(classe.getName()));
        System.out.println("Nome da classe (canonical): " + classe.getCanonicalName());
        System.out.println("Tipo: " + classe.getTypeName());
        System.out.println("=============================");
        System.out.println("Atributos");
        final Field[] atributos = classe.getDeclaredFields();
        for(final Field F : atributos) {
            F.setAccessible(true);
            System.out.println(F.getName() + ": " + F.getType().getTypeName() + " ( primitivo: " + F.getType().isPrimitive() + ") -> " + F.get(objeto));
        }
    }
}
