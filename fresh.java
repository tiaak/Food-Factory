package tugas_kel3;

public class fresh extends food{
    protected String expdate;

    public void setExpdate(String expdate) {
        this.expdate = expdate;
    }

    public String getExpdate() {
        return expdate;
    }

    public void show(){
        System.out.println("Tanggal Kadaluarsanya jatuh pada tanggal " + getExpdate());
    }
}
