package chapter12;

import java.util.Map;

public class FinalGrade {
    public static Map getFinalGrade() {

        Map <String,Integer> grades = TestResults.getOriginalGrades();
        Map <String,Integer>  makeUpGrades = TestResults.getMakeUpGrades();

        grades.forEach(
                (k, v) -> System.out.println("Name: " + k + " Grade: " + v)
        );
        for (var student : grades.entrySet()) {
            int makeupGrade = makeUpGrades.get(student.getKey());
            int originalGrade = student.getValue();
            if (makeupGrade > originalGrade) {
                grades.put(student.getKey(), makeupGrade);
            }
        }
        return grades;

    }

    public static void main(String[] args) {
        Map updatedGrade = getFinalGrade();
        updatedGrade.forEach(
                (k, v) -> System.out.println("\nName: " + k + " Final Grade: " + v)
        );

    }
}
