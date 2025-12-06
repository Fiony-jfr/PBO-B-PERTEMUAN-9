package RentalKendaraan;

public class Sepeda extends Kendaraan {
    private String jenisSepeda;

    public Sepeda(String merk, String model, int tahunProduksi, String jenisSepeda) {
        super(merk, model, tahunProduksi);
        this.jenisSepeda = jenisSepeda;
    }

    public String getJenisSepeda() {
        return jenisSepeda;
    }

    @Override
    public String detailInformation() {
        return "Sepeda: " + super.detailInformation() + ", Jenis: " + jenisSepeda;
    }
}
