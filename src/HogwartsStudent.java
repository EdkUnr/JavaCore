
abstract class HogwartsStudent {
    protected String name;
    protected int magicPower;
    protected int transgressionDistance;

    public static void compareStudents(HogwartsStudent student1, HogwartsStudent student2) {
        int totalPower1 = student1.getTotalPower();
        int totalPower2 = student2.getTotalPower();

        if (totalPower1 > totalPower2) {
            System.out.println(student1.getName() + " сильнее, чем " + student2.getName());
        } else if (totalPower1 < totalPower2) {
            System.out.println(student2.getName() + " сильнее, чем " + student1.getName());
        } else {
            System.out.println(student1.getName() + " и " + student2.getName() + " оба одинаково сильные");
        }
    }

    public HogwartsStudent(String name, int magicPower, int transgressionDistance) {
        this.name = name;
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
    }

    public String getName() {
        return name;
    }

    public int getTotalPower() {
        return magicPower + transgressionDistance;
    }
}



