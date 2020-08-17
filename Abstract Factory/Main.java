public class Main {
    public static void main(String[] args) {
        ClientMethod(new ModernFurnitureFactory());
        System.out.println("====================");
        ClientMethod(new VictorianFurnitureFactory());

    }

    static void ClientMethod(IFurnitureFactory factory) {
        var chairProduct = factory.CreateChair();
        System.out.println(chairProduct.SitOn());

        var tableProduct = factory.CreateCoffeeTable();
        System.out.println(tableProduct.SomeUsefulFunction());
    }
}