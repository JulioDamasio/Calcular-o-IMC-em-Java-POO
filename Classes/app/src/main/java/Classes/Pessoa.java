
package Classes;


public class Pessoa {
    
    //atributos
    private float peso;
    private float altura;

                  
    public float calcularIMC() {
        
        float imc;
        imc = peso / (altura * altura);
        return imc;
    
    }
    //M�todos acessores
    public void setPeso(float peso){
        this.peso = peso;
    }
    
    public float getPeso() {
        return peso;
    }
    
    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    public float getAltura(){
        return altura;
    }
}
