package BelajarInheritance;

public class Lingkaran extends BangunDatar {
    //jari ajri lingkaran
    float r;

    @Override
    float Luas(){
        float Luas = (float) (Math.PI * r * r);
        System.out.println("Luas Lingkaran : " + Luas);
        return Luas;
    }

    @Override
    float Keliling(){
        float Keliling = (float) (2 * Math.PI * r);
        System.out.println("Keliling Lingkaran " + Keliling);
        return Keliling;
    }
}
