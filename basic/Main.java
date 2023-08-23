public class Main {

    public static void main(String[] args) {
        int isAdult = 40;
        int isYouth = 24;
        

        String Adult = "Candidate is an adult";
        String Youth = "Candidate is a Youth";
        String Child = "Candidate is a Child";

        if (!(isAdult >= 40 && isYouth < 40)) {
            System.out.println(Adult);
        } else if (isYouth <= 24) {
            System.out.println(Youth);
        } else {
            System.out.println(Child);
        }
    }
}