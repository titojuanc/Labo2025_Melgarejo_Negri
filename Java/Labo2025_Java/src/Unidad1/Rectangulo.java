
    public class Rectangulo {
        private double base;
        private double altura;

        public Rectangulo() {
            this.base = 4;
            this.altura = 3.5;
        }

        public Rectangulo(double base, double altura) {
            this.base = base;
            this.altura = altura;
        }

        public double getBase() {
            return base;
        }

        public double getAltura() {
            return altura;
        }

        public void setBase(double base) {
            this.base = base;
        }

        public void setAltura(double altura) {
            this.altura = altura;
        }

        public double calcularArea() {
            double area = this.base * this.altura;
            return area;
        }

        public double calcularPerimetro() {
            double perimetro = 2 * this.base + 2 * this.altura;
            return perimetro;
        }


        public static void main(String[] args) {
            Rectangulo rectangulo1 = new Rectangulo();
            System.out.println("Área: " + rectangulo1.calcularArea());
            System.out.println("Perímetro: " + rectangulo1.calcularPerimetro());
        }
    }


