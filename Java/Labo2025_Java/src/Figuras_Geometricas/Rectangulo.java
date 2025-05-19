package Figuras_Geometricas;

public class Rectangulo extends FiguraGeometrica {
        private double base;
        private double altura;

        public Rectangulo() {
            super();
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
            super.setArea(this.base * this.altura);
            return super.getArea();
        }

        public double calcularPerimetro() {
            super.setPerimetro(2 * this.base + 2 * this.altura);
            return super.getPerimetro();
        }
    }


