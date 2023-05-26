public class Test {
    public static void main(String[] args) {
        Trabajador carpintero = new Trabajador("fernando", "perez", "11111111-1", "123456789", 30);
        Trabajador panadera = new Trabajador("paula", "asmun", "2222222-2", "123456000", 60);
        Trabajador profesor = new Trabajador("jacinto", "jirafales", "3333333-3", "123000789", 20);

        System.out.println(carpintero.toString());
        System.out.println(panadera.toString());
        System.out.println(profesor.toString());
    }
}
