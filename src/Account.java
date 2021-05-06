public class Account {
    private String name;

    public Account(String name) {
        this.name = name;
    }

    public void active(){
        System.out.println("TK "+ name + " dc kich hoat");
    }

    public void close(){
        System.out.println("TK "+ name + "bị khóa");
    }
}