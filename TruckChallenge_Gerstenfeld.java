public class TruckChallenge_Gerstenfeld {
    public static void main (String[] args) {

        TruckFleet_Gerstenfeld warehouse = new TruckFleet_Gerstenfeld();
        Truck_Gerstenfeld truck1 = new Truck_Gerstenfeld(15, 200, "Freehold");
        Truck_Gerstenfeld truck2 = new Truck_Gerstenfeld(7, 100, "Manalapan");
        Truck_Gerstenfeld truck3 = new Truck_Gerstenfeld(2, 75, "Colts Neck");
        Truck_Gerstenfeld truck4 = new Truck_Gerstenfeld(25, 300, "Howell");
        Truck_Gerstenfeld truck5 = new Truck_Gerstenfeld(21, 250, "Marlboro");

        warehouse.addTruck(truck1);
        warehouse.addTruck(truck2);
        warehouse.addTruck(truck3);
        warehouse.addTruck(truck4);
        warehouse.addTruck(truck5);

        Package_Gerstenfeld package1 = new Package_Gerstenfeld(20, "Manalapan", "101 Road St");
        Package_Gerstenfeld package2 = new Package_Gerstenfeld(100, "Manalapan", "300 Street Rd");
        Package_Gerstenfeld package3 = new Package_Gerstenfeld(150, "Freehold", "32 Avenue Rd");
        Package_Gerstenfeld package4 = new Package_Gerstenfeld(10, "Freehold", "1 Main St");
        Package_Gerstenfeld package5 = new Package_Gerstenfeld(15, "Freehold", "15 Temple Rd");
        Package_Gerstenfeld package6 = new Package_Gerstenfeld(16, "Freehold", "3 My Rd");
        Package_Gerstenfeld package7 = new Package_Gerstenfeld(1, "Marlboro", "4 Goldstein Way");
        Package_Gerstenfeld package8 = new Package_Gerstenfeld(15, "Marlboro", "15 Goldstein Way");
        Package_Gerstenfeld package9 = new Package_Gerstenfeld(35, "Freehold", "53 CompSci Ct");
        Package_Gerstenfeld package10 = new Package_Gerstenfeld(54, "Marlboro", "32 Colts Neck Rd");

        warehouse.addPackage(package1);
        warehouse.addPackage(package2);
        warehouse.addPackage(package3);
        warehouse.addPackage(package4);
        warehouse.addPackage(package5);
        warehouse.addPackage(package6);
        warehouse.addPackage(package7);
        warehouse.addPackage(package8);
        warehouse.addPackage(package9);
        warehouse.addPackage(package10);


        warehouse.test();
        System.out.println(truck1.getNextLocation());
        System.out.println(truck2.getNextLocation());
        System.out.println(truck3.getNextLocation());
        System.out.println(truck4.getNextLocation());
        System.out.println(truck5.getNextLocation());
        
        while (truck1.getNumPackages() > 0 || truck2.getNumPackages() > 0 || truck3.getNumPackages() > 0 || truck4.getNumPackages() > 0 || truck5.getNumPackages() > 0) {
            if (truck1.getNumPackages() > 0)
            warehouse.deliverPackage(truck1);
            if (truck2.getNumPackages() > 0)
                warehouse.deliverPackage(truck2);
            if (truck3.getNumPackages() > 0)
                warehouse.deliverPackage(truck3);
            if (truck4.getNumPackages() > 0)
                warehouse.deliverPackage(truck4);
            if (truck5.getNumPackages() > 0)
                warehouse.deliverPackage(truck5);
        }

        warehouse.returnToWarehouse(truck1);
        warehouse.returnToWarehouse(truck2);
        warehouse.returnToWarehouse(truck5);

        warehouse.test();

        System.out.println(package1.getStatus());
        System.out.println(package2.getStatus());
        System.out.println(package3.getStatus());
        System.out.println(package4.getStatus());
        System.out.println(package5.getStatus());
        System.out.println(package6.getStatus());
        System.out.println(package7.getStatus());
        System.out.println(package8.getStatus());
        System.out.println(package9.getStatus());
        System.out.println(package10.getStatus());






    }
}
