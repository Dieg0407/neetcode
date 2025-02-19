package com.dieg0407.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class CarFleet {
    public int carFleet(int target, int[] position, int[] speed) {
        if (position.length == 0) {
            return 0;
        }
        if (position.length == 1) {
            return 1;
        }

        final List<Tuple> cars = new ArrayList<>();
        for (int i = 0; i < position.length; i++) {
            cars.add(new Tuple(position[i], speed[i]));
        }

        cars.sort(Tuple::compareTo);

        final List<Double> times = cars.stream()
                .map(car -> (target - car.position) / (double) car.speed)
                .toList();

        // it needs to be on decrescent order
        // if not, it means there will be a collision
        final Stack<Double> monotonicStack = new Stack<>();
        times.forEach(time -> {
            while (!monotonicStack.isEmpty() && monotonicStack.peek() <= time) {
                monotonicStack.pop();
            }
            monotonicStack.push(time);
        });

        return monotonicStack.size();
    }

    private record Tuple(int position, int speed) implements Comparable<Tuple> {
        @Override
        public int compareTo(Tuple o) {
            return Integer.compare(this.position, o.position);
        }
    }
}
