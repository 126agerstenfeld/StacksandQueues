import java.util.ArrayList;
import java.util.Stack;

public class Truck_Gerstenfeld {

    private int maxCapacity;

    private double maxWeight, currentWeight;

    private String area;

    private Stack<Package_Gerstenfeld> packages;

    private ArrayList<String> locations;

    public Truck_Gerstenfeld (int maxCapacity, double maxWeight, String area) {
        packages = new Stack<Package_Gerstenfeld>();
        locations = new ArrayList<String>(1);
        this.maxCapacity = maxCapacity;
        this.maxWeight = maxWeight;
        this.area = area;
        locations.add("Warehouse");
    }

    public void loadPackage(Package_Gerstenfeld parcel) {
        if (packages.size() < maxCapacity && (currentWeight + parcel.getWeight()) <= maxWeight) {
            packages.add(parcel);
            currentWeight += parcel.getWeight();
            locations.add(1, parcel.getAddress());
            parcel.setStatus("In transit");
        }
    }

    public void unloadPackage() {
        if (locations.get(0).equals("Warehouse")) {
            locations.remove(0);
            (packages.pop()).setStatus("Delivered");
            locations.remove(0);
        }

        else {
            locations.remove(0);
            (packages.pop()).setStatus("Delivered");
        }
    }

    public String findPackage(Package_Gerstenfeld parcel) {
        for (int x = 0; x < packages.size(); x++)
            if (parcel.equals(packages.get(x))) {
                return parcel.getStatus();
            }
        return "Package not found";
    }

    public String getNextLocation () {
        if (locations.size() == 1)
            return "In warehouse";
        return locations.get(1);
    }

    public String getLocation () {
        return locations.get(0);
    }

    public int getNumPackages () {
        return packages.size();
    }

    public String getCurrentWeight () {
        return currentWeight + "Ibs";
    }

    public String getArea () {
        return area;
    }

    public void setCurrentLocationIfEmpty (String location) {
        if (locations.isEmpty())
        locations.add(location);
    }

    public boolean atWarehouse () {
        if (locations.get(0).equals("Warehouse")) {
            return true;
        }
        else {
            return false;
        }
    }
}
