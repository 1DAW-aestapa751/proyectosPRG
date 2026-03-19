public class Electrodomestico {
    double precio;
    colores color;
    char consumo;
    int peso;

    public Electrodomestico(){
        this.precio = 100;
        this.color = colores.blanco;
        this.consumo = 'F';
        this.peso = 5;
    }

    public Electrodomestico(double precio, int peso){
        this.precio = precio;
        this.color = colores.blanco;
        this.consumo = 'F';
        this.peso = peso;
    }

    public Electrodomestico(double precio, colores color, char consumo, int peso){
        this.precio = precio;
        this.color = color;
        if(consumo >= 'A' && consumo <= 'F'){
            this.consumo = consumo;
        } else{
            this.consumo = 'F';
        }
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public colores getColor() {
        return color;
    }

    public char getConsumo() {
        return consumo;
    }

    public int getPeso() {
        return peso;
    }

    public double getPrecioFinal(){
        double precioFinal = this.precio;
        switch (this.consumo){
            case 'A':
                precioFinal += 100;
                break;
            case 'B':
                precioFinal += 80;
                break;
            case 'C':
                precioFinal += 60;
                break;
            case 'D':
                precioFinal += 50;
                break;
            case 'E':
                precioFinal += 30;
                break;
            case 'F':
                precioFinal += 10;
                break;
        }

        if (this.peso >= 0 && this.peso <= 19) {
            precioFinal += 10;
        } else if (this.peso >= 20 && this.peso <= 49) {
            precioFinal += 50;
        } else if (this.peso >= 50 && this.peso <= 79) {
            precioFinal += 80;
        } else if (this.peso >= 80) {
            precioFinal += 100;
        }
        return precioFinal;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" +
                "precio=" + precio +
                ", color=" + color +
                ", consumo=" + consumo +
                ", peso=" + peso +
                ", precio final=" + getPrecioFinal() +
                '}';
    }
}
