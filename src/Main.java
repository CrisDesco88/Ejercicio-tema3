public class Main {
    public static void  main(String[] args) {
        suma(10, 30, 50);
        suma(10, 70, 50);
        suma(10, 30, 80);

        Coche miCoche = new Coche();
        miCoche.AgregarPuerta();

        System.out.println(miCoche.NumeroPuertas);
    }

    public static void suma(int a, int b, int c){
        int resultado;
        resultado = a + b + c;

        System.out.println(resultado);
    }

    static class Coche {
        public int NumeroPuertas = 0;

        public void AgregarPuerta() {
            this.NumeroPuertas++;
        }


    }

}