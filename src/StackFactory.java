/**
 * <h1>StackFactory</h1>
 * The factory that generates the stack types
 * <p>
 *
 * @author Sebastian Gonzales (tabufellin) Pablo Ruiz (PingMaster99)
 * @version 1.0
 * @since 2020-02-26
 **/
public class  StackFactory<E> {
    public Object getStack(String entry) {
        entry = entry.toLowerCase();
        switch (entry) {
            case "arraylist":
                return new StackArrayList<E>();
            case "vector":
                return new StackVector<E>();
            case "list":
                return new ListSingle<E>();        //Change to return new List<>();

            case "listdouble":
                return new DoubleList<E>();
            case "circular":
                return new CircularList<E>();
            default:
                System.err.println("El tipo de stack introducido no es correcto");
                return null;
        }
    }
}
