
public class Ravenclaw extends HogwartsStudent{
    private int smart, wise, witty, creative, thePowerOfMagic, distanceOfTransgression;

    public Ravenclaw(String name, int smart, int wise, int witty, int creative, int thePowerOfMagic, int distanceOfTransgression) {
        super(name, thePowerOfMagic, distanceOfTransgression);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creative = creative;
        this.thePowerOfMagic = thePowerOfMagic;
        this.distanceOfTransgression = distanceOfTransgression;
    }

    public String toString() {
        String parameters = "Имя студента: " + this.getName() + ".\n"
                + "Ум: " + this.getSmart() + " очков.\n"
                + "Мудрость: " + this.getWise() + " очков.\n"
                + "Остроумие : " + this.getWitty() + " очков.\n"
                + "Творчество: " + this.getCreative() + " очков.\n"
                + "Сила магии: " + this.getThePowerOfMagic() + " очков.\n"
                + "Расстояние трансгрессии: " + this.getDistanceOfTransgression() + " очков.\n";
        System.out.println(parameters);
        return parameters;
    }
    public static void compareRavenclawStudents(Ravenclaw students, Ravenclaw student) {
        Ravenclaw student1 = students;
        Ravenclaw student2 = student;

        int score1 = student1.getSmart() + student1.getWise() + student1.getWitty() + student1.getCreative();
        int score2 = student2.getSmart() + student2.getWise() + student2.getWitty() + student2.getCreative();

        if (score1 > score2) {
            System.out.println(student1.getName() + " студент Когтеврана лучше, чем " + student2.getName());
        } else if (score1 < score2) {
            System.out.println(student2.getName() + " студент Когтеврана лучше, чем " + student1.getName());
        } else {
            System.out.println(student1.getName() + " и " + student2.getName() + " оба хорошие студенты Когтеврана.");
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public int getWitty() {
        return witty;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    public int getCreative() {
        return creative;
    }

    public void setCreative(int creative) {
        this.creative = creative;
    }
}
