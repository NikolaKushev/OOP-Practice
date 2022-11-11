package TrafficLIghts;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] signals=scanner.nextLine().split(" ");
        int iterations= Integer.parseInt(scanner.nextLine());
        List<TrafficLights> trafficLights=new ArrayList<>();
        for (String signal : signals) {
            Color color=Color.valueOf(signal);
            TrafficLights trafficLight=new TrafficLights(color);
            trafficLights.add(trafficLight);
        }
        for (int i = 0; i < iterations; i++) {
            for (TrafficLights trafficLight : trafficLights) {
                trafficLight.changeColor();
                System.out.print(trafficLight.getColor()+" ");
            }
            System.out.println();
        }
    }
}
