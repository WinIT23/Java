package pkg.packageone;

public class PackageOne {
    int defaultInt = 1;
    public int publicInt = 2;
    protected int protectedInt = 3;
    private int privateInt = 4;

    int getDefaultInt() {
        return defaultInt;
    }

    public int getPublicInt() {
        return publicInt;
    }

    protected int getProtectedInt() {
        return protectedInt;
    }

    private int getPrivateInt() {
        return privateInt;
    }
}
