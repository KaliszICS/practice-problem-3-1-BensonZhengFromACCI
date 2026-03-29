public class PracticeProblem {

	public static void main(String args[]) {

	}

public static String evenOrOdd(int number) {
    if (number % 2 == 0) {
        return "Even";
    }
    if (number % 2 != 0) {
        return "Odd";
    }
    return "";
}

public static String teacherOrStudent(String name) {
    if (name == "Kalisz") {
        return "Teacher";
    }
    if (name != "Kalisz") {
        return "Student";
    }
    return "";
}

public static int fartherFromZero(int number) {
    if (number > 0) {
        return number + 5;
    }
    if (number < 0) {
        return number - 5;
    }
    return 0;
}
}

