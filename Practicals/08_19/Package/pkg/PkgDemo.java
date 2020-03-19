// import packagetwo.*;

class PkgDemo {
    public static void main(String[] args) {
        pkg.packagetwo.PackageTwo pkgTwo = new pkg.packagetwo.PackageTwo();

        System.out.println(pkgTwo.getDefaultInt());
        System.out.println(pkgTwo.getPublicInt());
        System.out.println(pkgTwo.getProtectedInt());
        System.out.println(pkgTwo.getPrivateInt());
    }
}
