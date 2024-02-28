public class Package_Gerstenfeld {

    private double weight;
    private String area, address, status;

    public Package_Gerstenfeld (double weight, String destinationArea, String address ) {
        this.weight = weight;
        area = destinationArea;
        this.address = address;
        status = "In warehouse";
    }

    public double getWeight () { return weight; }

    public String getArea () { return area; }

    public String getAddress () {
        return address;
    }

    public String getStatus () {
        return status;
    }

    public void setStatus (String newStatus) { status = newStatus; }
}
