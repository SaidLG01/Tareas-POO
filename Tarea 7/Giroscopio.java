package clases.fes;

public class Giroscopio {
    private String material;
    private float peso;
    private String color;

    public Giroscopio() {
    }

    public Giroscopio(String material, float peso, String color) {
        this.material = material;
        this.peso = peso;
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Giroscopio{" +
                "material='" + material + '\'' +
                ", peso=" + peso +
                ", color='" + color + '\'' +
                '}';
    }
    public void describir(){
        System.out.println("El giroscopio está hecho de: " + material + ", también tiene un peso de: " + peso + " gramos y es de color " + color);
    }
    public void girar() {
        System.out.println("El giroscopio que pesa: " + peso + "y se constituye de " + material);
    }
}
