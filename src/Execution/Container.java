package Execution;

import java.util.ArrayList;

/**
 * The type Container.
 */
public class Container {
    private double shipmentWeight;
    private final double maximumWeight;
    private double totalWeight;
    private final int containerID;

    private final ArrayList weightOfShipments;

    /**
     * Instantiates a new Container.
     *
     * @param containerID the container's ID
     */
    public Container(int containerID) {
        maximumWeight = 24000.0;
        shipmentWeight = 0;
        totalWeight = 0;
        this.containerID = containerID;
        weightOfShipments = new ArrayList<>();
    }

    /**
     * Gets maximum weight.
     *
     * @return the maximum weight
     */
    public double getMaximumWeight() {
        return maximumWeight;
    }

    /**
     * Gets total weight.
     *
     * @return the total weight
     */
    public double getTotalWeight() {
        return totalWeight;
    }

    /**
     * Gets the container's id.
     *
     * @return the container's id
     */
    public int getContainerID() {
        return containerID;
    }

    /**
     * Sets shipment weight.
     *
     * @param shipmentWeight the shipment weight
     */
    public void setShipmentWeight(double shipmentWeight) {
        this.shipmentWeight = shipmentWeight;
    }

    /**
     * Sets total weight.
     */
    public void setTotalWeight() {
        this.totalWeight += shipmentWeight;
    }

    /**
     * Sets weight of shipments.
     *
     * @param weight the weight
     */
    public void setWeightOfShipments(Double weight) {
        weightOfShipments.add(weight);
    }

    /**
     * Gets weight of shipments.
     *
     * @return the weight of shipments
     */
    public ArrayList getWeightOfShipments() {
        return weightOfShipments;
    }
}
