import java.util.Scanner;
import java.time.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cenaBiletu=40;
        int znizka=0;


        System.out.println("Podaj swój wiek");
        int age= scanner.nextInt();
        String weekDay= LocalDate.now().getDayOfWeek().name();
        System.out.println("Podaj miasto");
        String city= scanner.next();

        double ticketDiscount=1;
        double finalcenaBiletu=40;



        if (weekDay.equals("THURSDAY")) {
            cenaBiletu=0;
        } else if (18>age && age>10 && city.equals("Warsaw")) {
            ticketDiscount=0.6;
        } else if (city.equals("Warsaw")) {
            ticketDiscount=0.1;

        } else if (18>age && age>10) {
                ticketDiscount = 0.5;

        } else if (age<10){
            ticketDiscount=1;
        }
        if (ticketDiscount==1){
            finalcenaBiletu=0;
            znizka=100;
        }else  {
            finalcenaBiletu = cenaBiletu * (1 - ticketDiscount);
            znizka= (int) (ticketDiscount*100);
        }







        System.out.println("Data:"+city+","+age+" years old"+","+weekDay+" Ticket Price:"+finalcenaBiletu+"\nDiscount:"+znizka+"%");







        }
    }