
public class Hufflepuff extends HogwartsStudent{
    private int hardWork, loyalty, honesty, thePowerOfMagic, distanceOfTransgression;

    public Hufflepuff(String name, int hardWork, int loyalty, int honesty, int thePowerOfMagic, int distanceOfTransgression) {
        super(name, thePowerOfMagic, distanceOfTransgression);
        this.hardWork = hardWork;
        this.loyalty = loyalty;
        this.honesty = honesty;
        this.thePowerOfMagic = thePowerOfMagic;
        this.distanceOfTransgression = distanceOfTransgression;
    }

    public String toString() {
        String parameters = "Имя студента: " + this.getName() + ".\n"
                + "Трудолюбие: " + this.getHardWork() + " очков.\n"
                + "Верность: " + this.getLoyalty() + " очков.\n"
                + "Честность: " + this.getHonesty() + " очков.\n"
                + "Сила магии: " + this.getThePowerOfMagic() + " очков.\n"
                + "Расстояние трансгрессии: " + this.getDistanceOfTransgression() + " очков.\n";
        System.out.println(parameters);
        return parameters;
    }
    public static void compareHufflepuffStudents(Hufflepuff students, Hufflepuff student) {
        Hufflepuff student1 = students;
        Hufflepuff student2 = student;

        int score1 = student1.getHardWork() + student1.getLoyalty() + student1.getHonesty();
        int score2 = student2.getHardWork() + student2.getLoyalty() + student2.getHonesty();

        if (score1 > score2) {
            System.out.println(student1.getName() + "студент Пуффендуя лучше, чем " + student2.getName());
        } else if (score1 < score2) {
            System.out.println(student2.getName() + " - студент Пуффендуя лучше, чем  " + student1.getName());
        } else {
            System.out.println(student1.getName() + " и " + student2.getName() + " оба хорошие студенты Пуффендуя");
        }
    }

    public int getThePowerOfMagic() {
        return thePowerOfMagic;
    }

    public void setThePowerOfMagic(int thePowerOfMagic) {
        this.thePowerOfMagic = thePowerOfMagic;
    }

    public int getDistanceOfTransgression() {
        return distanceOfTransgression;
    }

    public void setDistanceOfTransgression(int distanceOfTransgression) {
        this.distanceOfTransgression = distanceOfTransgression;
    }

    public int getHardWork() {
        return hardWork;
    }

    public void setHardWork(int hardWork) {
        this.hardWork = hardWork;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }
}