package Commune;

public class Commune {
    private String name;
    private int department;
    private int postalCode;
    private int surface;
    private int population;

    // constructors
    public Commune(){};
    public Commune(String name, int department, int postalCode, int surface, int population) throws IllegalArgumentException{
        if(department < 1 || department > 99){
            throw new IllegalArgumentException("department should be between 1 and 99");
        }

        if(surface < 0 || population < 0 ){
            throw new IllegalArgumentException("Ce nombre est strictememnt positif");
        }

        if(department != postalCode / 1000 ){
            throw new IllegalArgumentException("Le departement ne corresponds pas au code postal");
        }

        this.name = name;
        this.department = department;
        this.population = population;
        this.surface = surface;
        this.postalCode = postalCode;
    }

    // setters
    public String getName(){
        return this.name;
    }
    public int getDepartment(){
        return this.department;
    }
    public int getPostalCode(){
        return this.postalCode;
    }
    public int getSurface(){
        return this.surface;
    }
    public int getPopulation(){
        return this.population;
    }

    public String toString(){
        return "name: " + this.name + ", department: " + this.department + ", postalCode: " + this.postalCode + ", surface: " + this.surface + ", population: " + this.population;
    }

    public static Commune morePopulated(Commune commune1, Commune commune2){
        if(commune1.population > commune2.population) {
            return commune1;
        }
        return commune2;
    }

    public double density(){
        return (double) this.population/this.surface;
    }
}

