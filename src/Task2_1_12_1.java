import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

// От индийца https://youtu.be/eyIyO3Fqmak
// Есть еще от Stream API: https://youtu.be/4PWfSmgiHKs

//        Пример _ ППППППППППППППППППППППППППППППППППП

public class Task2_1_12_1 {
    public static void main(String[] args) {
        System.out.println("Задание : \n1.\tВам нужно создать класс “Students” с полями “класс” и " +
                "\n“оценка”, и попробовать вычислить средний балл у студентов при помощи различных " +
                "\nметодов (reduce, min/max и т.д.)\n\nРешение: ");

        Students student1 = new Students();
        student1.name1 = "Иван";
        student1.theClass1 = "Java";
        student1.mark1 = 5;
        double dstudent1 = student1.mark1;
        student1.theClass2 = "Python";
        student1.mark2 = 5;
        double dstudent2 = student1.mark2;
        student1.theClass3 = "C++";
        student1.mark3 = 3;
        double dstudent3 = student1.mark3;
        student1.theClass4 = "Pascal";
        student1.mark4 = 4;
        double dstudent4 = student1.mark4;

        student1.name2 = "Петр";
        student1.theClass5 = "Java";
        student1.mark5 = 3;
        double dstudent5 = student1.mark5;
        student1.theClass6 = "Python";
        student1.mark6 = 5;
        double dstudent6 = student1.mark6;
        student1.theClass7 = "C++";
        student1.mark7 = 4;
        double dstudent7 = student1.mark7;
        student1.theClass8 = "Pascal";
        student1.mark8 = 3;
        double dstudent8 = student1.mark8;

        System.out.println(
                "name1=" + student1.name1 + ", theClass1=" + student1.theClass1 + ", mark1=" + student1.mark1 +
                        "\nname1=" + student1.name1 + ", theClass2=" + student1.theClass2 + ", mark2=" + student1.mark2 +
                        "\nname1=" + student1.name1 + ", theClass3=" + student1.theClass3 + ", mark3=" + student1.mark3 +
                        "\nname1=" + student1.name1 + ", theClass4=" + student1.theClass4 + ", mark4=" + student1.mark4 +
                        "\n\nname2=" + student1.name2 + ", theClass5=" + student1.theClass5 + ", mark5=" + student1.mark5 +
                        "\nname2=" + student1.name2 + ", theClass6=" + student1.theClass6 + ", mark6=" + student1.mark6 +
                        "\nname2=" + student1.name2 + ", theClass7=" + student1.theClass7 + ", mark7=" + student1.mark7 +
                        "\nname2=" + student1.name2 + ", theClass8=" + student1.theClass8 + ", mark8=" + student1.mark8);
        System.out.println(); // Это перенос строки

        IntStream intStream1 = IntStream.of(student1.mark1, student1.mark2, student1.mark3, student1.mark4);
        IntStream intStream2 = IntStream.of(student1.mark5, student1.mark6, student1.mark7, student1.mark8);
        /*System.out.println("SUM: " + IntStream.of(student1.mark1, 30, 50, 70, 90, 100).sum());*/

        // От индийца https://youtu.be/eyIyO3Fqmak
        // Есть еще от Stream API: https://youtu.be/4PWfSmgiHKs
        double avg1 = intStream1.average().getAsDouble();
        double avg2 = intStream2.average().getAsDouble();
        System.out.printf(
                "Пример с методом average: " +
                        "\nСредний балл Ивана: ");
        System.out.printf("%.2f",avg1);
        System.out.printf(
                "\nСредний балл Петра: ");
        System.out.printf("%.2f",avg2);
        System.out.println("\n"); // Это перенос строки

        double minMax1 = IntStream.of((IntStream.of(student1.mark1, student1.mark2, student1.mark3, student1.mark4).min()).getAsInt(), (IntStream.of(student1.mark1, student1.mark2, student1.mark3, student1.mark4).max().getAsInt())).average().getAsDouble();
        double minMax2 = IntStream.of((IntStream.of(student1.mark5, student1.mark6, student1.mark7, student1.mark8).min()).getAsInt(), (IntStream.of(student1.mark5, student1.mark6, student1.mark7, student1.mark8).max().getAsInt())).average().getAsDouble();
        System.out.printf(
                "Пример с методами min/max (результат отличается, т.к. расчет по этим методам на совсем корректен): " +
                        "\nСредний балл Ивана: ");
        System.out.printf("%.2f",minMax1);
        System.out.printf(
                "\nСредний балл Петра: ");
        System.out.printf("%.2f",minMax2);
        System.out.println("\n"); // Это перенос строки

        double reduce1 = (Stream.of(dstudent1,dstudent2,dstudent3,dstudent4).reduce((x, y)->(x+y)).get())/4;
        double reduce2 = (Stream.of(dstudent5,dstudent6,dstudent7,dstudent8).reduce((x, y)->(x+y)).get())/4;


        System.out.printf(
                "Пример с методом reduce: " +
                        "\nСредний балл Ивана: ");
        System.out.printf("%.2f",reduce1);
        System.out.printf(
                "\nСредний балл Петра: ");
        System.out.printf("%.2f",reduce2);
        System.out.println("\n"); // Это перенос строки

    }
}

//        Конец Примера _ КККККККККККККККК









////        Пример 6 ППППППППППППППППППППППППППППППППППП
//
//public class Draft1_Task2_1_12 {
//    public static void main(String[] args) {
//        System.out.println("Задание : \n1.\tВам нужно создать класс “Students” с полями “класс” и " +
//                "\n“оценка”, и попробовать вычислить средний балл у студентов при помощи различных " +
//                "\nметодов (reduce, min/max и т.д.)\n\nРешение: ");
//
//        Students student1 = new Students();
//        student1.name1 = "Иван";
//        student1.theClass1 = "Java";
//        student1.mark1 = 5;
//        student1.theClass2 = "Python";
//        student1.mark2 = 5;
//        student1.theClass3 = "C++";
//        student1.mark3 = 3;
//        student1.theClass4 = "Pascal";
//        student1.mark4 = 4;
//
//        student1.name2 = "Петр";
//        student1.theClass5 = "Java";
//        student1.mark5 = 3;
//        student1.theClass6 = "Python";
//        student1.mark6 = 5;
//        student1.theClass7 = "C++";
//        student1.mark7 = 3;
//        student1.theClass8 = "Pascal";
//        student1.mark8 = 4;
//
//        System.out.println(
//          "name1=" + student1.name1 + ", theClass1=" + student1.theClass1 + ", mark1=" + student1.mark1 +
//        "\nname1=" + student1.name1 + ", theClass2=" + student1.theClass2 + ", mark2=" + student1.mark2 +
//        "\nname1=" + student1.name1 + ", theClass3=" + student1.theClass3 + ", mark3=" + student1.mark3 +
//        "\nname1=" + student1.name1 + ", theClass4=" + student1.theClass4 + ", mark4=" + student1.mark4 +
//        "\n\nname2=" + student1.name2 + ", theClass5=" + student1.theClass5 + ", mark5=" + student1.mark5 +
//        "\nname2=" + student1.name2 + ", theClass6=" + student1.theClass6 + ", mark6=" + student1.mark6 +
//        "\nname2=" + student1.name2 + ", theClass7=" + student1.theClass7 + ", mark7=" + student1.mark7 +
//        "\nname2=" + student1.name2 + ", theClass8=" + student1.theClass8 + ", mark8=" + student1.mark8);
//        System.out.println(); // Это перенос строки
//
//        IntStream intStream1 = IntStream.of(student1.mark1, student1.mark2, student1.mark3, student1.mark4);
//        IntStream intStream2 = IntStream.of(student1.mark5, student1.mark6, student1.mark7, student1.mark8);
//        /*System.out.println("SUM: " + IntStream.of(student1.mark1, 30, 50, 70, 90, 100).sum());*/
//
//        // От индийца https://youtu.be/eyIyO3Fqmak
//        // Есть еще от Stream API: https://youtu.be/4PWfSmgiHKs
//        double avg1 = intStream1.average().getAsDouble();
//        double avg2 = intStream2.average().getAsDouble();
//        System.out.printf(
//                "С методом average: " +
//                "\nСредний балл Ивана: ");
//        System.out.printf("%.2f",avg1);
//        System.out.printf(
//                "\nСредний балл Петра: ");
//        System.out.printf("%.2f",avg2);
//        System.out.println(); // Это перенос строки
//
//    }
//}
//
////        Конец Примера 6 КККККККККККККККК









////        Пример 5 ППППППППППППППППППППППППППППППППППП
//
//public class Draft1_Task2_1_12 {
//    public static void main(String[] args) {
//        System.out.println("Задание : \n1.\tВам нужно создать класс “Students” с полями “класс” и " +
//                "\n“оценка”, и попробовать вычислить средний балл у студентов при помощи различных " +
//                "\nметодов (reduce, min/max и т.д.)\n\nРешение: ");
//
//        Students student1 = new Students();
//        student1.name1 = "Иван";
//        student1.theClass1 = "Java";
//        student1.mark1 = 10;
//        student1.theClass2 = "Python";
//        student1.mark2 = 5;
//        student1.theClass3 = "C++";
//        student1.mark3 = 3;
//        student1.theClass4 = "Pascal";
//        student1.mark4 = 4;
//
//        student1.name2 = "Петр";
//        student1.theClass5 = "Java";
//        student1.mark5 = 3;
//        student1.theClass6 = "Python";
//        student1.mark6 = 5;
//        student1.theClass7 = "C++";
//        student1.mark7 = 3;
//        student1.theClass8 = "Pascal";
//        student1.mark8 = 4;
//
//        System.out.println(
//          "name1=" + student1.name1 + ", theClass1=" + student1.theClass1 + ", mark1=" + student1.mark1 +
//        "\nname1=" + student1.name1 + ", theClass2=" + student1.theClass2 + ", mark2=" + student1.mark2 +
//        "\nname1=" + student1.name1 + ", theClass3=" + student1.theClass3 + ", mark3=" + student1.mark3 +
//        "\nname1=" + student1.name1 + ", theClass4=" + student1.theClass4 + ", mark4=" + student1.mark4 +
//        "\nname2=" + student1.name2 + ", theClass5=" + student1.theClass5 + ", mark5=" + student1.mark5 +
//        "\nname2=" + student1.name2 + ", theClass6=" + student1.theClass6 + ", mark6=" + student1.mark6 +
//        "\nname2=" + student1.name2 + ", theClass7=" + student1.theClass7 + ", mark7=" + student1.mark7 +
//        "\nname2=" + student1.name2 + ", theClass8=" + student1.theClass8 + ", mark8=" + student1.mark8);
//        System.out.println(); // Это перенос строки
//
//        IntStream intStream = IntStream.of(student1.mark1, 30, 50, 70, 90, 100);
//        /*int sum = intStream.sum();*/
//        System.out.println("SUM: " + IntStream.of(student1.mark1, 30, 50, 70, 90, 100).sum());
//
//
//        /*DoubleStream doubleStream = DoubleStream.of(student1.mark1, 30, 50, 70, 90, 100);
//        OptionalDouble average = doubleStream.average();
//        System.out.println("AVERAGE: " + DoubleStream.of(student1.mark1, 30, 50, 70, 90, 100).average());*/
//
//        // От индийца https://youtu.be/eyIyO3Fqmak
//        double avg = intStream.average().getAsDouble();
//        System.out.printf("AVERAGE FROM AN INDIAN: " + "%.2f",avg);
//
//        /*IntStream stream1 = IntStream.of(mark1, 10);*/
//        /*System.out.println(IntStream.of(1, 2, 3));
//        *//*IntStream stream1 = IntStream.range(0, 10);*//*
//        *//*System.out.println(stream1.count());*/
//
//
//
////        public class UniversityStructure {
////            String faculty;
////            int studyPeriod;
////
////            public class Tutors {
////                String familyName;
////                int academicSubjects;
////            }
////
////        }
////            System.out.println(); // Это перенос строки
////            List<StudentsTest> studentsTests = Data.getStudentsTests();
////            for (int i = 0; i < studentsTests.size(); i++) {
////                System.out.println(studentsTests.get(i));
////            }
//
//    }
//}
//
////        Конец Примера 5 КККККККККККККККК









////        Пример 4 ППППППППППППППППППППППППППППППППППП
//
//public class Draft1_Task2_1_12 {
//    public static void main(String[] args) {
//        System.out.println("Задание : \n1.\tВам нужно создать класс “Students” с полями “класс” и " +
//                "\n“оценка”, и попробовать вычислить средний балл у студентов при помощи различных " +
//                "\nметодов (reduce, min/max и т.д.)\n\nРешение: ");
//
//        Students student1 = new Students();
//        student1.name1 = "Иван";
//        student1.theClass1 = "Java";
//        student1.mark1 = 10;
//        student1.theClass2 = "Python";
//        student1.mark2 = 5;
//        student1.theClass3 = "C++";
//        student1.mark3 = 3;
//        student1.theClass4 = "Pascal";
//        student1.mark4 = 4;
//
//        Students2 student2 = new Students2();
//        student2.name2 = "Петр";
//        student2.theClass5 = "Java";
//        student2.mark5 = 3;
//        student2.theClass6 = "Python";
//        student2.mark6 = 5;
//        student2.theClass7 = "C++";
//        student2.mark7 = 3;
//        student2.theClass8 = "Pascal";
//        student2.mark8 = 4;
//
//        IntStream intStream = IntStream.of(student1.mark1, 30, 50, 70, 90, 100);
//        /*int sum = intStream.sum();*/
//        System.out.println("SUM: " + IntStream.of(student1.mark1, 30, 50, 70, 90, 100).sum());
//
//
//        /*DoubleStream doubleStream = DoubleStream.of(student1.mark1, 30, 50, 70, 90, 100);
//        OptionalDouble average = doubleStream.average();
//        System.out.println("AVERAGE: " + DoubleStream.of(student1.mark1, 30, 50, 70, 90, 100).average());*/
//
//        // От индийца https://youtu.be/eyIyO3Fqmak
//        double avg = intStream.average().getAsDouble();
//        System.out.printf("AVERAGE FROM AN INDIAN: " + "%.2f",avg);
//
//        /*IntStream stream1 = IntStream.of(mark1, 10);*/
//        /*System.out.println(IntStream.of(1, 2, 3));
//        *//*IntStream stream1 = IntStream.range(0, 10);*//*
//        *//*System.out.println(stream1.count());*/
//
//
//
////        public class UniversityStructure {
////            String faculty;
////            int studyPeriod;
////
////            public class Tutors {
////                String familyName;
////                int academicSubjects;
////            }
////
////        }
//
//    }
//}
//
////        Конец Примера 4 КККККККККККККККК









////        Пример 3 ППППППППППППППППППППППППППППППППППП
//
//public class Draft1_Task2_1_12 {
//    public static void main(String[] args) {
//        System.out.println("Задание : \n1.\tВам нужно создать класс “Students” с полями “класс” и " +
//                "\n“оценка”, и попробовать вычислить средний балл у студентов при помощи различных " +
//                "\nметодов (reduce, min/max и т.д.)\n\nРешение: ");
//
//        Students student1 = new Students();
//        student1.name1 = "Иван";
//        student1.theClass1 = "Java";
//        student1.mark1 = 10;
//        student1.theClass2 = "Python";
//        student1.mark2 = 5;
//        student1.theClass3 = "C++";
//        student1.mark3 = 3;
//        student1.theClass4 = "Pascal";
//        student1.mark4 = 4;
//
//        Students2 student2 = new Students2();
//        student2.name2 = "Петр";
//        student2.theClass5 = "Java";
//        student2.mark5 = 3;
//        student2.theClass6 = "Python";
//        student2.mark6 = 5;
//        student2.theClass7 = "C++";
//        student2.mark7 = 3;
//        student2.theClass8 = "Pascal";
//        student2.mark8 = 4;
//
//        /*IntStream intStream = IntStream.of(10, 30, 50, 70, 90, 100);
//        int sum = intStream.sum();*/
//        System.out.println("SUM: " + IntStream.of(student1.mark1, 30, 50, 70, 90, 100).sum());
//
//
//        DoubleStream doubleStream = DoubleStream.of(10, 30, 50, 70, 90, 100);
//        OptionalDouble average = doubleStream.average();
//        System.out.println("AVERAGE: " + DoubleStream.of(10, 30, 50, 70, 90, 100).average());
//
//
//
//        /*IntStream stream1 = IntStream.of(mark1, 10);*/
//        /*System.out.println(IntStream.of(1, 2, 3));
//        *//*IntStream stream1 = IntStream.range(0, 10);*//*
//        *//*System.out.println(stream1.count());*/
//
//
//
////        public class UniversityStructure {
////            String faculty;
////            int studyPeriod;
////
////            public class Tutors {
////                String familyName;
////                int academicSubjects;
////            }
////
////        }
//
//    }
//}
//
////        Конец Примера 3 КККККККККККККККК









////        Пример 2 ППППППППППППППППППППППППППППППППППП
//
//public class Draft1_Task2_1_12 {
//    public static void main(String[] args) {
//        System.out.println("Задание : \n1.\tВам нужно создать класс “Students” с полями “класс” и " +
//                "\n“оценка”, и попробовать вычислить средний балл у студентов при помощи различных " +
//                "\nметодов (reduce, min/max и т.д.)\n\nРешение: ");
//
//        Students student1 = new Students();
//        student1.name = "Иван";
//        student1.theClass = "Java";
//        student1.mark1 = 10;
//        student1.mark2 = 5;
//        student1.mark3 = 3;
//        student1.mark4 = 4;
//
//        Students2 student2 = new Students2();
//        student2.name = "Петр";
//        student2.theClass = "С++";
//        student2.mark5 = 3;
//        student2.mark6 = 5;
//        student2.mark7 = 4;
//        student2.mark8 = 3;
//
//        /*IntStream intStream = IntStream.of(10, 30, 50, 70, 90, 100);
//        int sum = intStream.sum();*/
//        System.out.println("SUM: " + IntStream.of(student1.mark1, 30, 50, 70, 90, 100).sum());
//
//
//        DoubleStream doubleStream = DoubleStream.of(10, 30, 50, 70, 90, 100);
//        OptionalDouble average = doubleStream.average();
//        System.out.println("AVERAGE: " + DoubleStream.of(10, 30, 50, 70, 90, 100).average());
//
//
//
//        /*IntStream stream1 = IntStream.of(mark1, 10);*/
//        /*System.out.println(IntStream.of(1, 2, 3));
//        *//*IntStream stream1 = IntStream.range(0, 10);*//*
//        *//*System.out.println(stream1.count());*/
//
//
//
////        public class UniversityStructure {
////            String faculty;
////            int studyPeriod;
////
////            public class Tutors {
////                String familyName;
////                int academicSubjects;
////            }
////
////        }
//
//    }
//}
//
////        Конец Примера 2 КККККККККККККККК





////        Пример 1 ППППППППППППППППППППППППППППППППППП
//
//public class Draft1_Task2_1_12 {
//    public static void main(String[] args) {
//        System.out.println("Задание : \n1.\tВам нужно создать класс “Students” с полями “класс” и " +
//                "\n“оценка”, и попробовать вычислить средний балл у студентов при помощи различных " +
//                "\nметодов (reduce, min/max и т.д.)\n\nРешение: ");
//
//        Students student1 = new Students();
//        student1.name = "Иван";
//        student1.theClass = "Java";
//        student1.mark1 = 4;
//        student1.mark2 = 5;
//        student1.mark3 = 3;
//        student1.mark4 = 4;
//
//        Students2 student2 = new Students2();
//        student2.name = "Петр";
//        student2.theClass = "С++";
//        student2.mark5 = 3;
//        student2.mark6 = 5;
//        student2.mark7 = 4;
//        student2.mark8 = 3;
//
//        /*IntStream stream1 = IntStream.of(mark1, 10);*/
//        /*System.out.println(IntStream.of(1, 2, 3));
//        *//*IntStream stream1 = IntStream.range(0, 10);*//*
//        *//*System.out.println(stream1.count());*/
//
//
//
////        public class UniversityStructure {
////            String faculty;
////            int studyPeriod;
////
////            public class Tutors {
////                String familyName;
////                int academicSubjects;
////            }
////
////        }
//
//    }
//}
//
////        Конец Примера 1 КККККККККККККККК





