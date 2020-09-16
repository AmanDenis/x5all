package x5.three.Phone;

public class Main {
    public static void main(String[] args) {

        Phone phone = new Phone();
        Phone phone1 = new Phone(111, "Siemens", 1.2);

        System.out.println(phone1.model);
        System.out.println(phone1.number);
        System.out.println(phone1.weight);
        System.out.println(phone.receiveCall("Ivan ") + phone.getNumber(777));
        System.out.println(phone.receiveCall("Gosha ", 111));
        phone.sendMessage(989,288,556);
    }
}
