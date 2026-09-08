public class PetMachine {

    private boolean clean = true;
    private int water;
    private int shampoo;

    private Pet pet;

    public void takeShower() {

        if (this.pet == null) {
            System.out.println("Coloque o pet na máquina para iniciar o banho");
            return;
        }

        if (this.water < 10 || this.shampoo < 2) {
            System.out.println("Não há água ou shampoo suficiente para dar banho no pet.");
            return;
        }

        this.water -= 10;
        this.shampoo -= 2;
        pet.setClean(true);

        System.out.println("O pet " + pet.getName() + " está limpo");
    }

    public void addWater() {

        if (water >= 30) {
            System.out.println("A capacidade de água da máquina está no máximo");
            return;
        }

        water += 2;
    }

    public void addShampoo() {

        if (shampoo >= 10) {
            System.out.println("A capacidade de shampoo da máquina está no máximo");
            return;
        }

        shampoo += 2;
    }

    public int getWater() {
        return water;
    }

    public int getShampoo() {
        return shampoo;
    }

    public boolean hasPet() {
        return pet != null;
    }

    public void setPet(Pet pet) {

        if (!this.clean) {
            System.out.println("A máquina está suja, para colocar pet é necessário limpá-la.");
            return;
        }

        if (hasPet()) {
            System.out.println("O pet " + this.pet.getName() + " está na máquina neste momento.");
            return;
        }

        this.pet = pet;
    }

    public void removePet() {

        if (!hasPet()) {
            System.out.println("Não há pet na máquina.");
            return;
        }

        if (!this.pet.isClean()) {
            this.clean = false;
            System.out.println("O pet " + this.pet.getName() + " foi retirado sem estar limpo.");
        } else {
            System.out.println("O pet " + this.pet.getName() + " está limpo.");
        }

        this.pet = null;
    }

    public void wash() {

        if (this.clean) {
            System.out.println("A máquina já está limpa.");
            return;
        }

        if (this.water < 3 || this.shampoo < 1) {
            System.out.println("Não há água ou shampoo suficiente para limpar a máquina.");
            return;
        }

        this.water -= 3;
        this.shampoo -= 1;
        this.clean = true;

        System.out.println("A máquina está limpa");
    }
}