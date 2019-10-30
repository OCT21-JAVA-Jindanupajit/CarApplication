import java.util.ArrayList;
import java.util.Random;

public class CarApplication implements Runnable {

    private ArrayList<Car> carCollection = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("main(): start");
        Thread t = new Thread(new CarApplication());
        t.start();
        System.out.println("main(): exit");
    }

    @Override
    public void run() {
        System.out.println("run(): start");
        Car subj;
        Car obj;
        Random r = new Random();
        initDatabase();

        for (int i = 0; i < 20;) {

            subj = carCollection.get(r.nextInt(carCollection.size()));
            do {
                obj = carCollection.get(r.nextInt(carCollection.size()));
            } while(subj == obj);

            switch(r.nextInt(5)) {
                case 0:
                    if (subj.isStart()) break;
                    System.out.println(subj.start());
                    i++;
                    break;
                case 1:
                    if (!subj.isStart()) break;
                    System.out.println(subj.stop());
                    i++;
                    break;
                case 2:
                    if (!subj.isStart()) break;
                    System.out.println(subj.pass(obj));
                    i++;
                    break;
                case 3:
                    if (!subj.isStart()) break;
                    System.out.println(subj.accelerate());
                    i++;
                    break;
                case 4:
                    if (!subj.isStart()) break;
                    System.out.println(subj.honkAt(obj));
                    i++;
                    break;
                default:
            }

        }
        System.out.println("run(): exit");
    }

    private void initDatabase()
    {
        Random r = new Random();

        carCollection.add(
                new Car(
                        "Porsche",
                        "Taycan",
                        Color.BLUE,
                        0,
                        false,
                         r.nextInt(999999)
                )
        );
        carCollection.add(
                new Car(
                        "Tesla",
                        "Model X",
                        Color.RED,
                        0,
                        false,
                        r.nextInt(999999)
                )
        );
        carCollection.add(
                new Car(
                        "BMW",
                        "x6",
                        Color.GREEN,
                        0,
                        false,
                        r.nextInt(999999)
                )
        );
    }
}
