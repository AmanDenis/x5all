package x5all.x5.three.Phone;

public class Main {
    public static void main(String[] args) {

        Phone phone = new Phone();
        Phone phone1 = new Phone(111, "Siemens", 1.2);

        System.out.println(phone1.getModel());
        System.out.println(phone1.getNumber());
        System.out.println(phone1.getWeight());
        System.out.println(phone.receiveCall("Ivan ") + phone.getNumber(777));
        System.out.println(phone.receiveCall("Gosha ", 111));
        phone.sendMessage(989,288,556);
    }
}
