package tugas_kel3;


public class frozen extends food{
    protected double temp;

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public double getTemp() {
        return temp;
    }

    public void show(){
        System.out.println("Suhu yang disarankan untuk penyimpanan adalah " + getTemp() + " celcius");
    }
}
