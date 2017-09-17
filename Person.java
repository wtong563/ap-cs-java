public class Person {

    String name;
    int age;
    char gender;
    double height;
    boolean alive;
    int needSleep;

    void setNeedSleep
            (int h){
        needSleep = h;
    }

    int getNeedSleep(){
        return needSleep;
    }

    Person(String s) {
        name = s;
    }

    public static void main(String a[]){
        Person kevin = new Person ("kevin");
        Person Justin = new Person("Justin");
        kevin.setNeedSleep(7);
        Justin.setNeedSleep(12);
        System.out.println(kevin.getNeedSleep());
        System.out.println(Justin.getNeedSleep());

    }
}
