public class DynamicArray 
{
    private int[] _arr;
    private int _length;
    private int _capacity;

    public DynamicArray(int capacity) 
    {
        _capacity = capacity;
        _length = 0;
        _arr = new int[_capacity];
    }

    public int Get(int i) 
    {
        return _arr[i];
    }

    public void Set(int i, int n) 
    {
        _arr[i] = n;
    }

    public void PushBack(int n) 
    {
        if(_capacity == _length)
        {
            Resize();
        }

        _arr[_length] = n;
        _length++;
    }

    public int PopBack() 
    {
        if(_length > 0)
        {
            _length--;
        }

        return _arr[_length];
    }

    private void Resize() 
    {
        _capacity *= 2;

        int[] arr1 = new int[_capacity];

        for(int i = 0; i < _length; i++)
        {
            arr1[i] = _arr[i];
        }

        _arr = arr1;
    }

    public int GetSize() 
    {
        return _length;
    }

    public int GetCapacity() 
    {
        return _capacity;
    }
}
