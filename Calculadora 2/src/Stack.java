/* CALCULATOR POSTFIX
 * UNIVERSIDAD DEL VALLE DE GUATEMALA
 * CARLOS CHEW - 17507
 * OTTO TRUJILLO - 17189
*/

public interface Stack<E> 
{


   public void push(E item);

   public E pop();

   public E peek();

   public boolean empty();

   public int size();
 

}