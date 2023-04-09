package Execution;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import Exceptions.*;

/**
 * The type Execution program.
 */
public class ExecutionProgram {

    private final ArrayList<ArrayList<Container>> ship = new ArrayList<>();

    private ArrayList<Container> containersList;
    private final ArrayList<Double> weights = new ArrayList<>();

    private final double CONTAINER_MINIMUM_PRICE = 3000;

    private double totalWeights;

    /**
     * Start method.
     */
    protected void start() {
        borrowScreen();

        System.out.println("Hello! Welcome to the port of Algeciras, Spain.");
        objectWeightsToFreigh(enterNumberOfFreights());

        borrowScreen();

        System.out.println("Ok! Now I'll calculate how many containers you need and the transportation costs");
        charteringContainers();
        printTotalCost();
    }

    /**
     * Clear the screen upon execution in the terminal
     */
    private void borrowScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    /**
     * The user enters the number of shipments
     *
     * @return The number of freights the user wants to charter
     */
    private int enterNumberOfFreights() {

        Scanner sc = new Scanner(System.in);

        System.out.println("\nI see... So you want to transport all that merchandise by boat, right? So tell me... " +
                "How many items do you have?");
        int counter = 0;
        while (true) {
            try {
                System.out.print("Number of objects: ");
                int input = sc.nextInt();
                if (input < 0) {
                    throw new NegativeNumberException(counter);
                } else if (input == 0) {
                    throw new IncorrectNumberException();
                } else return input;

            } catch (NegativeNumberException e) {

                System.out.println("How are you going to load a negative number of objects? That's not possible.\n");
                System.out.println("Please enter a valid quantity of freights");
                sc.nextLine();

            } catch (IncorrectNumberException e) {

                System.out.println(e.getMessage());
                System.out.println("\nPlease enter a valid quantity of freights");
                sc.nextLine();

            } catch (NumberFormatException | InputMismatchException e) {
                System.out.println("[!] Detected invalid value\n");
                System.out.println("Please enter a valid quantity of freights");
                sc.nextLine();
            }
        }
    }

    /**
     * Create an ArrayList with each of the freight's weights that the user enters
     *
     * @param numberOfFreights Number of freights that the user wants to charter
     */
    private void objectWeightsToFreigh(int numberOfFreights) {
        for (int i = 0; i < numberOfFreights; i++) {
            weights.add(introduceWeights(i));
        }
    }

    /**
     * The user enters each of the freight's weights. It is verified that it is a double value
     *
     * @param i The number that the container ID will have
     * @return The weight of the freight the user wants to ship
     */
    private double introduceWeights(int i) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        while (true) {
            try {
                System.out.printf("--> Enter the exact weight in kg of the shipment [%d]: ", (i + 1));
                double input = sc.nextDouble();

                if (input == 0) {
                    throw new IncorrectNumberException("The minimum weight for each object is 1Kg");
                } else if (input < 0) {

                    if (count == 3) {
                        count = 0;
                    } else {
                        count++;
                    }

                    throw new NegativeNumberException(count);

                } else if (input > 24000) {
                    throw new MaximumWeightException();
                } else {
                    totalWeights += input;
                    return input;
                }
            } catch (IncorrectNumberException e) {
                System.out.println(e.getMessage());
                System.out.println("\nPlease enter a valid weight");
                sc.nextLine();

            } catch (NegativeNumberException e) {
                System.out.println(e.getMessage());
                System.out.println("\nPlease enter a valid weight");
                sc.nextLine();
            } catch (MaximumWeightException e) {
                System.out.println(e.getMessage());
                System.out.println("\nPlease enter a valid weight");
                sc.nextLine();

            } catch (Exception e) {
                System.out.println("[!] Detected invalid value\n");
                System.out.println("\nPlease enter a valid weight");
                sc.nextLine();
            }
        }
    }

    /**
     * Place each object into the containers based on their weight. Once the container is full,
     * it will be chartered onto the ship.
     */
    private void charteringContainers() {

        containersList = new ArrayList<>();
        int id = 1;

        while (weights.size() != 0) {

            Container container = new Container(id);

            for (int j = weights.size(); j > 0; j--) {
                if (container.getMaximumWeight() >= (container.getTotalWeight() + weights.get(j - 1))) {
                    container.setShipmentWeight(weights.get(j - 1));
                    container.setTotalWeight();
                    container.addWeightOfShipments(weights.get(j - 1));
                    weights.remove(j - 1);
                }
            }
            containersList.add(container);
            id++;
            ship.add(containersList);

        }
    }

    /**
     * Print the ID of each container, the weight of each object it contains, as well as the total weight of the
     * container, the price of chartering those containers, and the final price.
     */
    private void printTotalCost() {

        for (int i = 0; i < ship.size(); i++) {

            Container currentContainer = containersList.get(i);
            ArrayList currentContainerWeights = currentContainer.getWeightOfShipments();

            System.out.print("\nThe container with ID[" + currentContainer.getContainerID() + "] has the following weights: ");

            for (int j = 0; j < currentContainerWeights.size(); j++) {
                System.out.printf("\nObject number %d weights %.0f Kg", j + 1, (Double) currentContainerWeights.get(j));
            }
            System.out.printf("\nThe total weight of the container's cargo is %.1f Kg\n", currentContainer.getTotalWeight());
        }

        double price = calculatePrice(ship);

        System.out.printf("\n[i] The minimum cost per container is %.0f€, to which an additional surcharge of " +
                "25 cents per kilo would need to be added ", CONTAINER_MINIMUM_PRICE);
        System.out.printf("\n[i] You need a total of %d containers and the total weight of your " +
                "merchandise is %.2f Kg", ship.size(), totalWeights);
        System.out.printf("\n[i] The total cost of transporting your merchandise is %.2f €", price);
    }

    /**
     *
     * @param ship The number of containers the ship contains
     * @return Total price of shipment
     */
    private double calculatePrice(ArrayList ship) {

        double pricePerKg = 0.25;
        return (ship.size() * CONTAINER_MINIMUM_PRICE) + (pricePerKg * totalWeights);
    }

}
