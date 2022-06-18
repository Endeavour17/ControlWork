package Task1.State;

public class In_Stock extends State{
    @Override
    public  void raisePrice() {
        System.err.println("Товар еще не участвует в торгах");

    }

    @Override
    public void startSale() {

    }

    @Override
    public void giveToTheWinner() {

    }

    @Override
    public void withdraw() {

    }
}
