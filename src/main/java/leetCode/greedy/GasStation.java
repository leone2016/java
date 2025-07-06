package leetCode.greedy;

public class GasStation {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas = 0, totalCost = 0, currentGas = 0, startIndex = 0;

        for (int i = 0; i < gas.length; i++) {
            totalCost += cost[i];
            totalGas += gas[i];
            currentGas += gas[i] - cost[i];

            // If current gas is negative, reset the start index
            if (currentGas < 0) {
                startIndex = i + 1;
                currentGas = 0;
            }
        }

        // If total gas is less than total cost, return -1
        return totalGas < totalCost ? -1 : startIndex;
    }

    public static void main(String[] args) {
        GasStation gasStation = new GasStation();
        int[] gas = {1, 2, 3, 4, 5};
        int[] cost = {3, 4, 5, 1, 2};
        int result = gasStation.canCompleteCircuit(gas, cost);
        System.out.println("Starting index: " + result); // Expected output: 3
    }
}
