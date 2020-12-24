
public class Item {
    private String _name;
    private double _baseCost;
    private double _promotionCost;

    public Item(String name, double baseCost, double promotionCost) {
        _name = name;
        _baseCost = baseCost;
        _promotionCost = promotionCost;
    }

    public String getName() {
        return _name;
    }

    public double getBaseCost() {
        return _baseCost;
    }

    public double getPromotionCost() {
        return _promotionCost;
    }

    public String toString() {
        return String.format("%-10s %10.2f %10.2f", _name, _baseCost, _promotionCost);
    }
}
