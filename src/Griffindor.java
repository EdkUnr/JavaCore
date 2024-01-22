
public class Griffindor extends HogwartsStudent{
    private int nobility, honor, bravery, thePowerOfMagic, distanceOfTransgression;


    public Griffindor(String name, int nobility, int honor, int bravery, int thePowerOfMagic, int distanceOfTransgression) {
        super(name, thePowerOfMagic, distanceOfTransgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
        this.thePowerOfMagic = thePowerOfMagic;
        this.distanceOfTransgression = distanceOfTransgression;
    }

    public String toString(){
        String parameters = "Имя студента: " + this.getName() + ".\n"
                + "Благородство: " + this.getNobility() + " очков.\n"
                + "Честь: " + this.getHonor() + " очков.\n"
                + "Храбрость: " + this.getBravery() + " очков.\n"
                + "Сила магии: " + this.getThePowerOfMagic() + " очков.\n"
                + "Расстояние трансгрессии: " + this.getDistanceOfTransgression() + " очков.\n";
        System.out.println(parameters);
        return parameters;
    }

    public static void compareGriffindorStudents(Griffindor students, Griffindor student) {
        Griffindor student1 = students;
        Griffindor student2 = student;

        int score1 = student1.getNobility() + student1.getHonor() + student1.getBravery();
        int score2 = student2.getNobility() + student2.getHonor() + student2.getBravery();

        if (score1 > score2) {
            System.out.println(student1.getName() + " студент Гриффиндора лучше, чем " + student2.getName());
        } else if (score1 < score2) {
            System.out.println(student2.getName() + " студент Гриффиндора лучше, чем " + student1.getName());
        } else {
            System.out.println(student1.getName() + " и " + student2.getName() + " оба хорошие студенты Гриффиндора.");
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

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }
}