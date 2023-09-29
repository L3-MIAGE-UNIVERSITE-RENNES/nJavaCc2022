package Commune;

public class Main {
    public static void main(String[] args){
        try {
            Commune commune1 = new Commune("Saint-Nazaire", 47, 46600, 23990,100356);
            Commune commune2 = new Commune("Saint-Nazaire", 42, 42300, 207780,322462);
            Commune commune3 = new Commune("Rennes", 35, 35000, 2000,1000000);

            Commune morePopulated = Commune.morePopulated(commune1, commune3);
            System.out.println("More populated -> " + morePopulated);
            Commune[] array = {commune1, commune2, commune3};
            Commune leastPopulated = leastPopulated(array);
            System.out.println("Least populated -> " + leastPopulated);
            int sameName = sameName(array, "Saint-Nazaire");
            System.out.println("Same name -> " + sameName);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static Commune leastPopulated(Commune[] array){
        int i = 0;
        Commune leastPopulated = array[0];
        while(i < array.length){
            if(leastPopulated.density() > array[i].density()){
                leastPopulated = array[i];
            }
            i++;
        }
        return leastPopulated;
    }

    public static int sameName(Commune[] array, String name){
        int i = 0;
        int count = 0;
        while(i < array.length){
            if(array[i].getName().equals(name)){
                count = count + 1;
            }
            i++;
        }
        return count;
    }
}
