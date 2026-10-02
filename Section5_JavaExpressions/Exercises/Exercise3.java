package Section5_JavaExpressions.Exercises;

public class Exercise3 {
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0){
            System.out.println("Invalid Value");
        };
        int megabytes = kiloBytes / 1024;
        int remaingkilobytes = kiloBytes % 1024;
        System.out.println(kiloBytes + "KB =" + megabytes + "MB and " + remaingkilobytes + "KB");
    }
}
