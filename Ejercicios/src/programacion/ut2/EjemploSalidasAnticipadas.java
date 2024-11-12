package programacion.ut2;

public class EjemploSalidasAnticipadas {
    public static void main(String[] args) {
        /*int i = 1;
        while (i<=10) {
            System.out.println("i = " + i);
            if (i == 2) {
                break;
            }
            i++;
        }*/
        
        int i = 0;
        while (i<10) {
            i++;
            if (i % 2 == 0)
                break;
            System.out.println("i = " + i);
        }
    }
}
