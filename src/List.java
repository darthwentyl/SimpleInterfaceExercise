
public class List {
    private DataList _dataList;

    public List(DataList dataList) {
        _dataList = dataList;
    }

    public void print() {
        System.out.println(_dataList.title());
        System.out.println("+-----+----------------------------------------------+");
        System.out.println("| L.p | " + _dataList.head());
        System.out.println("+-----+----------------------------------------------+");
        Iterator<String> iter = _dataList.rows();
        int i;
        for (iter.first(), i = 1; !iter.isDone(); iter.next(), ++i) {
            System.out.println(String.format("| %3d | ", i) + iter.current());
        }
        System.out.println("+-----+----------------------------------------------+");
        System.out.println(_dataList.additionalInfo());
    }
}
