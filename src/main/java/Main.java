import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        //basHarflerBul();

        //listeDonme();

        //smallestNumber();

        //orderNumbersFromSmallestToLargest();

        // tersCevir();

        //tersCevir2();

        //verilenSayiyiTopla();

        //ucgenCizim();





    }

    private static void ucgenCizim() {
        System.out.println("Sayı giriniz");
        Scanner sayiAl=new Scanner(System.in);
        int sayi=sayiAl.nextInt();
        for (int i = 0; i <sayi; i++) {
            for (int j = 0; j < (sayi*2)-1; j++) {
                if(j<sayi-(i+1)||j-i>=sayi){
                    System.out.print(" ");
                }else{
                    System.out.print
                            ("*");
                }
            }
            System.out.println();
        }
    }

    private static void verilenSayiyiTopla() {
        System.out.println("Sayı giriniz");
        Scanner sayiAl=new Scanner(System.in);
        String  sayi=sayiAl.nextLine();
        char[] array=sayi.toCharArray();
        int[] sayiArray=new int[array.length];
        int toplam=0;
        for (int i = 0; i < array.length; i++) {
            sayiArray[i]=Character.getNumericValue(array[i]);
            toplam+=sayiArray[i];
        }

        System.out.println(toplam);
    }

    private static void tersCevir2() {
        String örnek="merhaba";
        char[] dizi=örnek.toCharArray();

        char temp='s';
        for (int i = 1; i < örnek.length()+1 ; i++) {
            for (int j=0; j < örnek.length()-i; j++) {
                temp=dizi[j];
                dizi[j]=dizi[j+1];
                dizi[j+1]=temp;
            }
        }
        System.out.println(dizi);
    }

    private static String tersCevir() {
        Scanner in=new Scanner(System.in);

        System.out.println("Kelime giriniz");
        String örnek = in.nextLine();

        String yeni="";
        for (int i = örnek.length()-1; i >=0 ; i--) {
            yeni+=örnek.charAt(i);
        }
        return yeni;
    }

    private static void orderNumbersFromSmallestToLargest() {
        int[] dizi=new int[]{11,14,4,7,2,8,3,12,43,21};
        int temp;
        for (int i = 0; i < dizi.length; i++) {
            for (int y = i+1; y < dizi.length; y++) {
                if (dizi[i] > dizi[y]) {
                    temp = dizi[i];
                    dizi[i] = dizi[y];
                    dizi[y] = temp;
                }
            }
        }
        Arrays.stream(dizi).forEach(m->{
            System.out.print(m+" ");
        });
    }

    private static void smallestNumber() {
        int[] dizi=new int[]{11,1,4,7,2,8,3,12,43,21};
        int temp=110;

        for (int i=0;i<dizi.length;i++){

            for (int y=0;y< dizi.length;y++){
                if(dizi[y]<dizi[i]&&temp>dizi[y]){
                   temp=dizi[y];
                }
            }
        }
        System.out.println(temp);
    }

    private static void listeDonme() {
        List<String> stringList=List.of("Batuhan","Kerem","Salih","Mehmet","Ali");
        List<String> liste=new ArrayList<>(List.of("mer","ser","mart"));
        List<String> liste2=Arrays.asList("Selami","Kadir","Mert");
        liste2.stream().filter(s -> s.startsWith("M")).forEach(System.out::println);
        liste.stream().map(m->m+"s").forEach(p->{
            System.out.println(p);
        });
    }

    private static void basHarflerBul() {
        String metin="Kocaeli Üniversitesi";
        int sayac=0;
        do {

            sayac++;
        }while(Character.compare(metin.charAt(sayac),' ')!=0);

        String altMetin=metin.substring(0,1);
        String yeni=altMetin.concat(metin.substring(sayac+1,sayac+2));

        System.out.println("ASAA");
    }

}
