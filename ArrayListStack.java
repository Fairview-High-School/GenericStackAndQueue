import java.util.ArrayList;

//FIFO Stack, which can store Elements of type E (Where E is any Object type) 
public class ArrayListStack<E> implements Stack<E>
{
    private ArrayList<E> list;
    
    public ArrayListStack()
    {
        list = new ArrayList<E>();
    }
}