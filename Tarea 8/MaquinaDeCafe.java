public class MaquinaDeCafe {
    private int agua;
    private int cafe;
    private int crema;
    private int vasos;

    public MaquinaDeCafe() {
        this.agua = 5000;
        this.cafe = 1000;
        this.crema = 1500;
        this.vasos = 50;
    }

    public MaquinaDeCafe(int agua, int cafe, int crema, int vasos) {
        this.agua = agua;
        this.cafe = cafe;
        this.crema = crema;
        this.vasos = vasos;
    }

    public int getAgua() {
        return agua;
    }

    public void setAgua(int agua) {

        this.agua = agua;
    }

    public int getCafe() {
        return cafe;
    }

    public void setCafe(int cafe) {
        this.cafe = cafe;
    }

    public int getCrema() {
        return crema;
    }

    public void setCrema(int crema) {
        this.crema = crema;
    }

    public int getVasos() {
        return vasos;
    }

    public void setVasos(int vasos) {

        this.vasos = vasos;
    }

    @Override
    public String toString() {
        return "MaquinaDeCafe{" +
                "agua=" + agua +
                ", cafe=" + cafe +
                ", crema=" + crema +
                ", vasos=" + vasos +
                '}';
    }

    public void prepararAmericano() {
        if (agua >= 180 && cafe >= 15 && vasos > 0) {
            agua = 180;
            cafe = 15;
            vasos--;
            System.out.println("Su Americano ha sido preparado");
        } else {
            System.out.println("Lo sentimos, se han agotado los recursos");
        }
    }
        public void prepararExpresso () {
            if (agua >= 180 && cafe >= 20 && vasos > 0) {
                agua = 180;
                cafe = 20;
                vasos--;
                System.out.println("Aquí tiene su expresso");
            } else {
                System.out.println("Lo sentimos, se han agotado los recursos");
            }
        }
            public void prepararCapuchino () {
                if (agua >= 100 && cafe >= 14 && crema >= 70 && vasos > 0) {
                    agua = 100;
                    cafe = 14;
                    crema = 70;
                    vasos--;
                    System.out.println("Aquí tiene su capuchino");
                } else {
                    System.out.println("Lo sentimos, se han agotado los recursos");
                }
            }
}
