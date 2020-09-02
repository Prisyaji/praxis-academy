package BelajarInheritance;

public class Persegi extends BangunDatar {
    float sisi;   

    @Override
    float Luas(){
        float Luas = sisi * sisi;
        System.out.println("Luas Persegi : " + Luas);
        return Luas;
    }

    @Override
    float Keliling(){
        float Keliling = 4 * sisi;
        System.out.println("Keliling Persegi : " + Keliling);
        return Keliling;    
    }
}
