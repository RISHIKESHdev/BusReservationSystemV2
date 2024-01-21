package src.com.brs.bus;

public class CargoBay implements busUtilities {
    public CargoBay(double cargoBayCubicCapacity,boolean isCargoBayFunctional){
        this.setCargoBayCubicCapacity(cargoBayCubicCapacity);
        this.setCargoBayFunctional(isCargoBayFunctional);
    }
    double cargoBayCubicCapacity;
    boolean isCargoBayFunctional;

    public double getCargoBayCubicCapacity() {
        return cargoBayCubicCapacity;
    }

    public void setCargoBayCubicCapacity(double cargoBayCubicCapacity) {
        this.cargoBayCubicCapacity = cargoBayCubicCapacity;
    }

    public boolean isCargoBayFunctional() {
        return isCargoBayFunctional;
    }

    public void setCargoBayFunctional(boolean cargoBayFunctional) {
        isCargoBayFunctional = cargoBayFunctional;
    }
}
