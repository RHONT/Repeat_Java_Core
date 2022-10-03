package Terminate_method_Collect;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class First {
    private List<Unt> untList= new ArrayList<>(List.of(
            new Unt("Spider",10,20),
            new Unt("Halk",40,1),
            new Unt("Magneto",50,5),
            new Unt("Runner",400,90),
            new Unt("Medusa",250,20),
            new Unt("Demon",600,80),
            new Unt("Gorgula",900,60),
            new Unt("Kurt",30,70)
    ));

    public static Map<String,List<Unt>> createMap(){
        Map<String,List<Unt>> map=new HashMap<>();
        map.put("Slow Unit",new ArrayList<>());
        map.put("Faster Unit",new ArrayList<>());
        return map;
    }

    public static void addToMap(Map<String,List<Unt>> map,Unt unt){
        if (unt.getSpeed()<50) {
            map.get("Slow Unit").add(unt);
        }
        else{
            map.get("Faster Unit").add(unt);
        }

    }

    public static void mergeMap(Map<String,List<Unt>> map,Map<String,List<Unt>> finishMap){
        finishMap.forEach((k,v)->map.get(k).addAll(v));

    }

    public static void main(String[] args) {
        First first = new First();
        List<Unt> slowList = first.untList.stream().filter(a -> a.getSpeed() < 50).collect(Collectors.toList());
        List<Unt> slowList2 = first.untList.stream().
                filter(a -> a.getSpeed() < 50).
                collect(ArrayList::new,
                        ArrayList::add,
                        ArrayList::addAll);
        //Теперь попробую сортировку
        Map<String,List<Unt>> sortedList = first.untList.stream().
                collect(First::createMap,First::addToMap,First::mergeMap);


        System.out.println(slowList);
        System.out.println(slowList2);
        System.out.println(sortedList);

    }

    private class Unt{
        private final String name;
        private int health;
        private int speed;

        public Unt(String name, int health, int speed) {
            this.name = name;
            this.health = health;
            this.speed = speed;
        }

        public String getName() {
            return name;
        }

        public int getHealth() {
            return health;
        }

        public void setHealth(int health) {
            this.health = health;
        }

        public int getSpeed() {
            return speed;
        }

        public void setSpeed(int speed) {
            this.speed = speed;
        }

        @Override
        public String toString() {
            return "Unt{" +
                    "name='" + name + '\'' +
                    ", health=" + health +
                    ", speed=" + speed +
                    '}';
        }
    }


}
