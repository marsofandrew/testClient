package spbspu.icc.ics;

/**
 * Created by Андрей on 14.07.2017.
 */
public class Main {
    public static void main(String args[]){
        if (args.length<1){
            System.exit(1);
        }
        int identity = Integer.parseInt(args[0]);
        System.out.println("isentity = " + args[0]);
        new Thread(new ClientTask(args[0]));
    }
}
