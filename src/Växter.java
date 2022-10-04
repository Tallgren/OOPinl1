public abstract class Växter implements Interface {

    protected String namn;
    double längd;
    public VäxtTyp växtTyp;

    public Växter(String namn, double längd) {
        this.namn = namn;
        this.längd = längd;
    }

    public String getNamn() {
        return namn;
    }

    public double getLängd() {
        return längd;
    }

    public void Print(Växter element) {}
}
