
public class Trip implements DataList {

    private Iterator<Person> _persons;
    private String _title;
    private String _head;
    private int _numberOfPersons;

    Trip(
            Iterator<Person> persons,
            String title,
            String head,
            int numberOfPersons) {
        _persons = persons;
        _title = title;
        _head = head;
        _numberOfPersons = numberOfPersons;
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
        String [] rows = new String [_numberOfPersons];
        int i;
        for (_persons.first(), i = 0; !_persons.isDone(); _persons.next(), ++i) {
            rows[i] = _persons.current().toString();
        }
        return new TabIterator<String>(rows);
    }

    @Override
    public String additionalInfo() {
        double paymantSum = 0;
        for (_persons.first(); !_persons.isDone(); _persons.next()) {
            paymantSum += _persons.current().getPayment();
        }
        return String.format("Calkowity koszt wynosi %10.2f", paymantSum);
    }
}
