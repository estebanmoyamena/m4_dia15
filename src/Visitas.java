public class Visitas {
    public static void main(String[] args) {
        if (args.length > 0)
            prom(args);
    }

    private static void prom(String[] visitas) {
        int total = 0;

        for (String visita: visitas){
            total += Integer.parseInt(visita);
        }

        System.out.println("El promedio de visitas es: " + total/visitas.length);
    }
}