import java.util.Scanner;
public class procesos{     
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int num,hor,min,seg;
        System.out.println("ingrese los segundos ");
        num=scan.nextInt();
        hor=num/3600;
        min=(num-(3600*hor))/60;
        seg=num-((hor*3600)+(min*60));
        System.out.println(hor+"h "+min+"m "+seg+"s");
     }
}