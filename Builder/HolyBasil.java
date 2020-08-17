public class HolyBasil {
    private String meat; // จำเป็นต้องใส่
    private String fishSauce; // ไม่จำเป็น
    private String garlic; // ไม่จำเป็น
    private String chili; // ไม่จำเป็น

    public HolyBasil(String meat, String fishSauce, String garlic, String chili) {
        this.meat = meat;
        this.fishSauce = fishSauce;
        this.garlic = garlic;
        this.chili = chili;
    }

    // ต้องมี getter แต่ไม่ต้องมี setter
    public String getMeat() {
        return meat;
    }

    public String getfishSauce() {
        return fishSauce;
    }

    public String getgarlic() {
        return garlic;
    }

    public String getchili() {
        return chili;
    }

    @Override
    public String toString() {
        String order = "HolyBasil " + this.meat + ", fishSauce:" + this.fishSauce + ", garlic:" + this.garlic
                + ", chili:" + this.chili;
        return order;
    }
}