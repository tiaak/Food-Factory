package tugas_kel3;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        //INISIASI
        String name,exp;
        int harga,qty,total = 0, finalcost = 0;
        int type,next;
        double temp;
        boolean pil;
        Scanner input = new Scanner(System.in);
        frozen bk = new frozen();
        fresh sgr = new fresh();


        System.out.println("== FROZEN & FRESH FOOD PAYMENT DETAIL ==");
        System.out.println("Please input your food detail below");

        do{
            System.out.println("Jenis Makanan : ");
            System.out.println("1. Fresh Food");
            System.out.println("2. Frozen Food");
            System.out.println("Jenis makanan apa yang anda pilih ? ");
            type = input.nextInt();

            if(type == 1){
                System.out.print("Name = ");
                name = input.next();
                sgr.setName(name);

                System.out.print("Price = ");
                harga = input.nextInt();
                sgr.setHarga(harga);

                System.out.print("Quantity = ");
                qty = input.nextInt();
                sgr.setQty(qty);

                System.out.print("Expire Date = ");
                exp = input.next();
                sgr.setExpdate(exp);

                System.out.println(" ");
                System.out.println("summary");
                sgr.display();
                sgr.show();
                total = sgr.total();
            }else{
                System.out.print("Name = ");
                name = input.next();
                bk.setName(name);

                System.out.print("Price = ");
                harga = input.nextInt();
                bk.setHarga(harga);

                System.out.print("Quantity = ");
                qty = input.nextInt();
                bk.setQty(qty);

                System.out.print("Suhu Penyimpanan = ");
                temp = input.nextDouble();
                bk.setTemp(temp);

                System.out.println(" ");
                System.out.println("summary");
                bk.display();
                bk.show();
                total = bk.total();
            }
            finalcost= finalcost + total;

            System.out.println(" ");
            System.out.println("Masih ada? 1/0");
            next = input.nextInt();
            if(next == 1){
                pil = true;
            }else{
                break;
            }
        }while(pil = true);

        if(finalcost > 200000){
            finalcost = (int) (0.9 * finalcost);
        }

        System.out.println("Total belanja anda adalah = " + finalcost);
        System.out.println("Dison 10% setiap pembelian dengan total Rp200.000");
    }
}
