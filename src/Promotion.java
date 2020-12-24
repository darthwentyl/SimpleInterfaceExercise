
public class Promotion implements DataList {
    Iterator<Item> _items;
    String _title;
    String _head;
    int _numberOfItems;
    
    Promotion(Iterator<Item> items,
              String title,
              String head,
              int numberOfItems) {
        _items = items;
        _title = title;
        _head = head;
        _numberOfItems = numberOfItems;
    }

    @Override
    public String title() {
        return _title;
    }

    @Override
    public String head() {
        return _head;
    }

    @Override
    public Iterator<String> rows() {
        String [] rows = new String [_numberOfItems];
        int i;
        for (_items.first(), i = 0; !_items.isDone(); _items.next(), ++i) {
            rows[i] = _items.current().toString();
        }
        return new TabIterator<String>(rows);
    }

    @Override
    public String additionalInfo() {
        double sumPromotionCost = 0;
        double sumBaseCost = 0;
        for (_items.first(); !_items.isDone(); _items.next()) {
            sumBaseCost += _items.current().getBaseCost();
            sumPromotionCost += _items.current().getPromotionCost();
        }

        double avgDiscount = 100 * ((sumPromotionCost - sumBaseCost) / sumBaseCost);
        
        String out = String.format("Sredni rabat wynosi %3.2f", avgDiscount).toString();
        out += "%";
        return out;
    }

}
