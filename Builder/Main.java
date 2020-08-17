class Main {
    public static void main(String[] args) {
        HolyBasil dish1 = new HolyBasilBuilder("Pork").fishSauce("little").garlic("much").chili("no").build();

        System.out.println(dish1);

        HolyBasil dish2 = new HolyBasilBuilder("Chicken").chili("much").build();

        System.out.println(dish2);

        HolyBasil dish3 = new HolyBasilBuilder("Shimp").build();

        System.out.println(dish3);
    }
}