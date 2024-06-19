public class Classroom {
    public static void main(String[] args) {
        Wilder mjsilva = new Wilder("mjsilva", true);
        Wilder Haroune = new Wilder("Haroune", true);
        Wilder Diamantine = new Wilder("Diamantine", false);

        Wilder[] classroom = { mjsilva, Haroune, Diamantine };
        for (Wilder student : classroom) {
            System.out.println(student.whoAmI());
        }
    }
}
