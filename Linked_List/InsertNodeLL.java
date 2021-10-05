import java.util.Scanner;

class N<T>
{
    T data;
    N next;
    N(T data)
    {
        this.data=data;
    }
}
class InsertNodeLL {
    public static N<Integer> createList()
    {
        Scanner sc= new Scanner(System.in);
        int data=0;
        N<Integer> head = null;
        N<Integer> tail = null;
        data=sc.nextInt();
        while(data!=-1)
        {
            N<Integer> currentNode = new N<>(data);
            if(head==null)
            {
                head=currentNode;
                tail=currentNode;
            }
            else{
                tail.next=currentNode;
                tail=tail.next;
            }
            data=sc.nextInt();
        }
        return head;
    }
    public static void print(N<Integer> head)
    {
        N<Integer> temp= head;
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public static void Add(N<Integer> head,int e,int pos)
    {
        N<Integer> elem = new N<Integer>(e);
        int count=0;
        N<Integer> x = head;
        while(count<pos-1)
        {
            count++;
            x=x.next;
        }
        elem.next=x.next;
        x.next=elem;
    }
    public static void main(String args[])
    {
        N<Integer> head = createList();
        Add(head,10,3);
        print(head);

    }
}
