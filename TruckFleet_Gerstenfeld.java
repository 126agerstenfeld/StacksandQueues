import java.util.ArrayList;
import java.util.concurrent.LinkedTransferQueue;

public class TruckFleet_Gerstenfeld {

    private LinkedTransferQueue<Package_Gerstenfeld> storage;

    private ArrayList<Truck_Gerstenfeld> truckFleet;

    public TruckFleet_Gerstenfeld () {
        storage = new LinkedTransferQueue<Package_Gerstenfeld>();
        truckFleet = new ArrayList<Truck_Gerstenfeld>(0);
    }

    public void addTruck (Truck_Gerstenfeld truck) {
        truckFleet.add(truck);
    }

    public void addPackage (Package_Gerstenfeld parcel) {
        for (int x = 0; x < truckFleet.size(); x++) {
            if (truckFleet.get(x).getArea().equals(parcel.getArea()) && truckFleet.get(x).atWarehouse()) {
                truckFleet.get(x).loadPackage(parcel);
                break;
            }
        }
        storage.add(parcel);
    }

    public String findTruck (Truck_Gerstenfeld truck) {
        for (int x = 0; x < truckFleet.size(); x++)
            if (truck.equals(truckFleet.get(x))) {
                return truckFleet.get(x).getLocation();
            }
        return "Truck not found";
    }

    public String findPackage (Package_Gerstenfeld parcel) {
        for (int x = 0; x < truckFleet.size(); x++) {
            if (!(truckFleet.get(x).findPackage(parcel).equals("Package not found")))
                return truckFleet.get(x).findPackage(parcel);
        }
        return "Package not found";
    }

    public void deliverPackage (Truck_Gerstenfeld truck) {
        truck.unloadPackage();
    }

    public boolean returnToWarehouse (Truck_Gerstenfeld truck) {
        if (truck.getNumPackages() == 0) {
            truck.setCurrentLocationIfEmpty("Warehouse");
            if (storage.peek() != null && truck.getArea().equals(storage.peek().getArea())) {
                truck.loadPackage(storage.remove());
                for (int x = 0; x < storage.size(); x++) {

                    if (storage.peek() != null && truck.getArea().equals(storage.peek().getArea()))
                        truck.loadPackage(storage.remove());
                    else
                        return true;
                }
            }
        }
        return true;
    }

    public String test () {
        return null;
    }

}
