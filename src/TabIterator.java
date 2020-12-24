
public class TabIterator<TYPE> implements Iterator<TYPE> {
    private TYPE [] _objects;
    private final int _firstIdx;
    private final int _lastIdx;
    private int _currentIdx;

    TabIterator(TYPE [] objects) {
        _objects = objects;
        _firstIdx = 0;
        _lastIdx = objects.length - 1;
        _currentIdx = _firstIdx;
    }

    @Override
    public void previous() {
        if (_currentIdx > 0) {
            _currentIdx--;
        } else {
            _currentIdx = -1;
        }
    }

    @Override
    public void next() {
        if (_currentIdx < _lastIdx) {
            _currentIdx++;
        } else {
            _currentIdx = -1;
        }
    }

    @Override
    public void first() {
        _currentIdx = _firstIdx;
    }

    @Override
    public void last() {
        _currentIdx = _lastIdx;
    }

    @Override
    public boolean isDone() {
        return _currentIdx == -1;
    }

    @Override
    public TYPE current() {
        if (isDone()) {
            return null;
        }
        return _objects[_currentIdx];
    }

}
