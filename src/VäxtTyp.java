public enum VäxtTyp {

    /*
    Enum med växttyper vi har, följt av vilken vätska
    och vätskemängd som behövs vid uträkning i programmet
     */
    KAKTUS("mineralvatten", 0.2),
    PALM("kranvatten", 0.5),
    KÖTTÄTANDEVÄXT("proteindryck", 0.2);

    public final String vätska;
    public final double mängd;

    VäxtTyp(String vätska, double mängd) {
        this.vätska = vätska;
        this.mängd = mängd;
    }
}
