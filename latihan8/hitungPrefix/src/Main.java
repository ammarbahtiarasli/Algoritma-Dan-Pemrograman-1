import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int prefix,x;
        double y,z,total_ip;
        Scanner scan = new Scanner(System.in);
        System.out.print("masukan prefix : ");
        prefix = scan.nextInt();
        x = 32 - prefix;
        y = Math.pow(2, x);
        z=256-y;
        System.out.println("subnetmask : " + z);
        total_ip = 256 - z;
        System.out.println("total ip per kelas : " + total_ip);
        int a=1;
        for (int i = 0; i < 256; i+=total_ip) {
            System.out.println(a++ + " 192.168.1."+i);
        }
    }
}