//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        int startBalance = 300;
        int contribution = 1100;
        int bonus = contribution / 100;
        int totalBalance;
        if (contribution > 1000) {
            totalBalance = startBalance + contribution + bonus;
        } else {
            totalBalance = startBalance + contribution;

        }
        System.out.println(totalBalance);
    }
}

