class AccessExample {
    public String publicMessage = "Public: accessible from anywhere.";
    private String privateMessage = "Private: accessible inside this class.";
    protected String protectedMessage = "Protected: accessible in this package.";

    public void showPrivateMessage() {
        System.out.println(privateMessage);
    }
}

public class AccessModifiersDemo {
    public static void main(String[] args) {
        AccessExample example = new AccessExample();
        System.out.println(example.publicMessage);
        example.showPrivateMessage();
        System.out.println(example.protectedMessage);
    }
}
