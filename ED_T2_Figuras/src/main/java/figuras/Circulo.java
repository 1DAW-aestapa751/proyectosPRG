package figuras;

public class Circulo {
    private int radio;
    public Circulo(int radio){
        this.radio = radio;
    }
    
    public float calcularPerimetro(){
        return 2*(float)Math.PI*radio;
    }
    
    public float calcularaArea(){
        float v = (float) Math.PI * radio * radio;
        return v;
    }
}
