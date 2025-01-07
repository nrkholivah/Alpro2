class Weaponn {

    public static void main(String[] args) {
        Knife knife = new Knife();
        Gun gun = new Gun(10);

        knife.attack(); // "Menyayat dan menusuk musuh"
        System.out.println("Senjata");
        gun.attack(); // "Menembakkan peluru\nSisa peluru: 9"
        gun.attack(); // "Menembakkan peluru\nSisa peluru: 8"

        Knife knife2Knife = new Knife();
        Gun gun2Gun = new Gun(10);

        knife2Knife.attack(); // "Menyayat dan menusuk musuh"
        System.out.println("Senjata");
        gun2Gun.attack(); // "Menembakkan peluru\nSisa peluru: 9"
        gun2Gun.attack(); // "Menembakkan peluru\nSisa peluru: 8"
    }
}

class Weapon {
    public void attack() {
        System.out.println("Attacking with a weapon...");
    }
}

class Knife extends Weapon {
    public void attack() {
        System.out.println("Menyayat dan menusuk musuh");
    }
}

class Gun extends Weapon {
    private int ammo;

    public Gun(int ammo) {
        this.ammo = ammo;
    }

    public void attack() {
        if (ammo > 0) {
            System.out.println("Menembakkan peluru");
            ammo--;
            System.out.println("Sisa peluru: " + ammo);
        } else {
            System.out.println("Kehabisan peluru");
        }
    }
}
