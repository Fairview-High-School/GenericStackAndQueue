import java.util.LinkedList;

//FIFO Stack, which can store Elements of type E (Where E is any Object type) 
public class LinkedListStack<E> implements Stack<E>
{
    private LinkedList<E> list;
    
    public LinkedListStack()
    {
        list = new LinkedList<E>();
    }
}

