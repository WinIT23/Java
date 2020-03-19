import pkg.packageone.PackageOne;
import pkg.packagetwo.PackageTwo;

class PackageDemo {
    public static void main(String[] args) {
        //PackageOne gives error as there are 3 metods which are not public
//        PackageOne pkgOne = new PackageOne();
        //PackageTwo won't give error as there are all methods public
        PackageTwo pkgOne = new PackageTwo();

        System.out.println(pkgOne.getDefaultInt());
        System.out.println(pkgOne.getPublicInt());
        System.out.println(pkgOne.getProtectedInt());
        System.out.println(pkgOne.getPrivateInt()); 
    }
}

class PackageDemoSub extends PackageOne {
    public static void main(String[] args) {
        //default and private will not be inherited in this class.
        //so they will be an unknown symbol for compiler
        PackageDemoSub pkgOne = new PackageDemoSub();
        //Same as above class
//        PackageOne pkgOne = new PackageOne();
//        System.out.println(pkgOne.getDefaultInt());
        System.out.println(pkgOne.getPublicInt());
        System.out.println(pkgOne.getProtectedInt());
//        System.out.println(pkgOne.getPrivateInt());
    }
}
