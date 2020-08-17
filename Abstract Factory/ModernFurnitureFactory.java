public class ModernFurnitureFactory implements IFurnitureFactory {

    @Override
    public IChair CreateChair() {
        return new ModernChair();
    }

    @Override
    public ICoffeeTable CreateCoffeeTable() {
        return new ModernCoffeeTable();
    }

}