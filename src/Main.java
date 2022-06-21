public class Main {
    public static void main(String[] args) {
        int numeroIf = 0;

        if (numeroIf > 0){
            System.out.println("El numero es positivo");
        } else if (numeroIf == 0) {
            System.out.println("El numero es 0");
        } else {
            System.out.println("El numero es negativo");
        }

        while (numeroIf < 3){
            numeroIf++;
            System.out.println(numeroIf);
        }

        numeroIf = 0;

        do {
            numeroIf++;
            System.out.println(numeroIf);
        } while (numeroIf > 3);

        for (int numeroFor = 0; numeroFor <= 3; numeroFor++){
            System.out.println(numeroFor);
        }

        String estacion = "Verano";

        switch (estacion){
            case "Verano":
                System.out.println("La estacion es verano");
                break;
            case "Primavera":
                System.out.println("La estacion es primavera");
                break;
            case "Invierno":
                System.out.println("La estacion es invierno");
                break;
            case "Otoño":
                System.out.println("La estacion es otoño");
                break;
            default:
                System.out.println("El valor de la variable no es una estacion");
        }
    }
}