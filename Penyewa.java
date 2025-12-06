package RentalKendaraan;

public class Penyewa {
    private String name;
    private String startDate;
    private int duration;
    private Kendaraan kendaraanVar;

    public Penyewa(String name, String startDate, int duration, Kendaraan kendaraan) {
        this.name = name;
        this.startDate = startDate;
        this.duration = duration;
        this.kendaraanVar = kendaraan;
    }

    public String getName() { return name; }
    public String getStartDate() { return startDate; }
    public int getDuration() { return duration; }
    public Kendaraan getKendaraan() { return kendaraanVar; }

    public String detailInformation() {
        return "Nama: " + name + " | Durasi: " + duration + " hari (Mulai: " + startDate + 
               ") | Unit: " + kendaraanVar.detailInformation();
    }

    @Override
    public String toString() {
        return name;
    }
}
