package observerpattern;

public class Main {
    public static void main(String[] args) {
        PostOffice postOffice =new PostOffice();
        Person p1 = new Person("Ram");
        Person p2 = new Person("Hari");

        Mail m = new Mail("Ram","Kathmandu","You have got new mail");

        postOffice.Attach(p1);
        postOffice.Attach(p2);

        postOffice.addMail(m);
    }
}
