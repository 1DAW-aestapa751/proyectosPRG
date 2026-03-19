public class Personaje {
     String nombre;
     int vidamax;
     int vida;
     double defensa;
     double ataque;
     int nivel;
     int exp;
     double sigEXP;

    public Personaje(String nombre, int vidamax, int defensa, int ataque){
        this.nombre = nombre;
        this.vidamax = vidamax;
        this.vida = vidamax;
        this.defensa = defensa;
        this.ataque = ataque;
        this.nivel = 1;
        this.sigEXP = 100;
        this.exp = 0;
        System.out.println("Se ha añadido el personaje: "+nombre);
    }

    public void recibirDano(int dano){
        this.vida -= dano;
    }

    public void recibirvida(int cura){
        this.vida += cura;
    }

    public void buffatk(double porcentaje){
        this.ataque += this.ataque * porcentaje/100;
    }

    public void buffdef(double porcentaje){
        this.defensa += this.defensa * porcentaje/100;
    }

    public void lvup(){
        this.nivel += 1;
        this.defensa += this.defensa*0.20;
        this.ataque += this.ataque*0.20;
        this.vida += 20;
        this.exp = 0;
        this.sigEXP += sigEXP*0.25;
        System.out.println(this.nombre+" ha subido de nivel ("+(nivel-1)+" -> "+nivel+")");
    }

    public void subirEXP(int exp){
        this.exp += exp;
        System.out.println(this.nombre+" consigue "+exp+" puntos de exp");
        if (this.exp >= this.sigEXP) {
            lvup();
        }
        else{
            System.out.println("Siguiente nivel: "+this.exp+"/"+sigEXP);
        }
    }
}
