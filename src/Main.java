
public class Main {

    public static void main(String[] args) {
        Person [] persons = new Person [4];

        persons[0] = new Person("Jan", "Kowalski", 12345678, 321.21);
        persons[1] = new Person("Katarzyna", "Kowalska", 87654321, 321.21);
        persons[2] = new Person("Adam", "Nowak", 11111111, 321.21);
        persons[3] = new Person("Karolina", "Nowak", 33333333, 321.21);

        DataList trip = new Trip(new TabIterator<Person>(persons),
                                 "Wycieczka klasowa",
                                 "Program wycieczki klasowej",
                                 persons.length);
        List tripList = new List(trip);
        tripList.print();

        System.out.println();

        Item [] items = new Item [4];
        items[0] = new Item("Product1", 123.12, 21.21);
        items[1] = new Item("Product2", 456.12, 21.45);
        items[2] = new Item("Product3", 789.12, 89.21);
        items[3] = new Item("Product3", 12.32, 13.00);

        DataList promotion = new Promotion(new TabIterator<Item>(items),
                                           "Wykaz towarow na promocji", 
                                           "Towary na promocji",
                                           items.length);
        List promotionList = new List(promotion);
        promotionList.print();
    }

}
