package PBO3.TUGAS4;

public class kubusBalokDemo {
    public static void main(String[] args){
        kubusBalok Balok1 = new Balok(3, 4, 3);
        kubusBalok Kubus1 = new Kubus(4);
    
        System.out.println("Menghitung volume dan luas permukaan balok menggunakan 3 parameter");
        System.out.println("Volume balok : "+Balok1.volume());
        System.out.println("Luas permukaan balok : "+Balok1.luasPermukaan());

        System.out.println("\nMenghitung volume dan luas permuakaan balok menggunakan 1 parameter");
        System.out.println("Volume kubus : " +Kubus1.volume());
        System.out.println("Luas permukaan kubus : " +Kubus1.luasPermukaan());
    }
}
