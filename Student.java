public class Student {
        String name;
        double grade;

        Student(String name, double grade) {
            this.name = name;
            this.grade = grade;
        }

        public void introduce() {
            System.out.println("Zdravei, az sum " + name + " i imam uspeh " + grade);
        }

            public static void main(String[] args) {
        Student s1 = new Student("Ivan", 5.50);
        Student s2 = new Student("Maria", 6.00);

        s1.introduce();
        s2.introduce();
    }
    }




