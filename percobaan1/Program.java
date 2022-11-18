public class Program {
   public static void main(String[] args) {
    Kucing kucingKampung = new Kucing();
    Ikan lumbaLumba = new Ikan();
    Harimau harimau = new Harimau();
    

    Orang ani = new Orang("Ani");
    Orang budi = new Orang("Budi");
    Orang dilla = new Orang("Dilla");

    ani.peliharaanHewan(kucingKampung);
    budi.peliharaanHewan(lumbaLumba);
    dilla.peliharaanHewan(harimau);


    ani.ajakPeliharaanJalanJalan();
    budi.ajakPeliharaanJalanJalan();
    dilla.ajakPeliharaanJalanJalan();
   } 
}
