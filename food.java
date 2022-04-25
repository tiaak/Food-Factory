package tugas_kel3;

public class food {
    protected String name;
    protected int harga,qty,total = 0;


    public void setName(String name) {
        this.name = name;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public int getHarga() {
        return harga;
    }

    public int getQty() {
        return qty;
    }

    public int total(){
        total =harga * qty;
        return total;
    }

    public void display(){
        System.out.println("Name of Food = " + getName());
        System.out.println("Price = " + getHarga());
        System.out.println("Quantity = " + getQty());
        System.out.println("Sum of the Price = " + total());
    }
}
