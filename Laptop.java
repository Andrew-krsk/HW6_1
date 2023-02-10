public class Laptop {
    private String model;
    private Integer ram;
    private Integer ssd;
    private Integer hdd;
    private String os;

    public String getModel() {
        return model;
    }

    public void setModel(String name) {
        this.model = name;
    }

    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ozu) {
        this.ram = ozu;
    }

    public Integer getSsd() {
        return ssd;
    }

    public void setSsd(Integer ssd) {
        this.ssd = ssd;
    }

    public Integer getHdd() {
        return hdd;
    }

    public void setHdd(Integer hdd) {
        this.hdd = hdd;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    @Override
    public String toString() {

        return System.out
                .printf("Модель: " + this.model + "\nОбъем ОЗУ: " + this.ram + "\nSSD: " + this.ssd + "\nHDD: " + this.hdd + "\nOC: " + this.os + "\n --- \n")
                .toString();
    }
}