package it.saimao.L71_ThrowsException;

public class UncheckedException {
    public static void main(String[] args) {
        var main = new UncheckedException();
        try {
            main.init();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        System.out.println("End Main!");
    }

    private void init() throws NullPointerException {
        String name = null;
        name.toString();
    }
}
