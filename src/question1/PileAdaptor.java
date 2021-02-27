package question1;

public class PileAdaptor implements PileI {

    public StackImpl stack;

    public PileAdaptor(StackImpl stack) {
        this.stack = stack;
    }

    @Override
    public void empiler(Object o) {
        stack.push(o);
    }

    @Override
    public Object depiler() {
        return stack.pop();
    }

    @Override
    public boolean estVide() {
        return stack.isEmpty();
    }
}
