import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Күндөргө enum түзүңүз (Monday, Tuesday ...)
        // Консолдон бир күндү белгилеңиз. Эгер Monday болсо - анда "Дуйшөмбү куну жава окуйм" же Tuesday болсо - анда "Шейшемби күнү англис тили сабагын окуйм" деп күнгө жараша кайсы сабакты окуганыңызды консолго чыгарыңыз.
        // Жуманын күндөрүн кыргыз тилинде көрсөтүңүз.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Жума кунун жазыныз:  ");
        String weekName = scanner.nextLine();

        Weekdays[] weekdays = Weekdays.values();
        System.out.println(Arrays.toString(weekdays));

        String error = null;
        for (Weekdays weekday:weekdays) {
            if (weekday.name().equals(weekName)){
                System.out.println(weekday+" "+weekday.lessons);
                return;
            }else {
                error = "Туура эмес кунду белгилединиз!";
            }
        }
        System.out.println(error);
    }
}