import java.util.*;

public class DemTheoQG{
    ArrayList<Person> people = new ArrayList<>(List.of(
            new Person("Vinh", "Vietnam", 28),
            new Person("Lan", "Vietnam", 24),
            new Person("John", "USA", 27),
            new Person("Lee", "China", 67),
            new Person("Kim", "Korea", 22),
            new Person("Long", "Vietnam", 18),
            new Person("Jungho", "Korea", 19),
            new Person("Tian", "China", 20),
            new Person("Clara", "USA", 40),
            new Person("Mikura", "Japan", 27),
            new Person("Sony", "Japan", 29),
            new Person("Xiang", "China", 78),
            new Person("Peter", "France", 18),
            new Person("Haloy", "Malaysia", 20),
            new Person("Magie", "Malaysia", 32)
    ));
    //1.1 đếm số người theo từng quốc gia
    public void bai1(){
        HashMap<String, Integer> countPeople = new HashMap();
        people.stream().forEach((person) -> {
            Integer count = (Integer) countPeople.get(person.nationality);
            if (count == null) {
                countPeople.put(person.nationality, 1);
            } else {
                countPeople.put(person.nationality, count + 1);
            }
        });

        for(Map.Entry<String,Integer> entry : countPeople.entrySet())
            System.out.println(entry.getKey()+":"+ entry.getValue());
    }


    //1.2. Sắp xếp theo tên những người trên 25 tuổi rồi in ra màn hình
    public  void bai2()
    {
        Collections.sort(people, Comparator.comparing(Person::getName));
        for (Person p1 : people) {
            if (p1.age > 25) {
                System.out.println(p1);
            }
        }
    }
    // 1.3. tính trung bình tuổi người theo từng quốc gia
    public void bai3() {
        HashMap<String, List<Person>> countPeoplebyCountry = new HashMap();

        people.stream().forEach((person) -> {
            List<Person> count =  countPeoplebyCountry.get(person.getNationality());
            List<Person> p1 = new ArrayList<>();
            if (count == null) {
                p1.add(person);
                countPeoplebyCountry.put(person.getNationality(),p1 );
            } else {
                count.add(person);
                countPeoplebyCountry.put(person.getNationality(), count);
            }
        });
        double sum = 0;
        double ave=0;
        for(Map.Entry<String,List<Person>> entry : countPeoplebyCountry.entrySet())
        {
            for (Person ps: entry.getValue())
            {
                sum= sum+ ps.age;
            }
            ave=sum / entry.getValue().size() *10;
            ave = (int)ave/10.0;
            System.out.println( entry.getKey()+":"+ave) ;
        }



    }
    //1.4. đánh giá tuổi mỗi người
        public void bai4()
    {
        String str= "";
        for (Person person : people) {
            if (person.age<20) {
               str= "- tuoi noi loan";
            }
            else if (person.age>20 && person.age<30) {
                str= "- viec lam";
            }
            else if (person.age >31 && person.age<40)
            {
                str="- su nghiep";
            }
            else if (person.age>40)
            {
                str="- hương thu";
            }
            System.out.println(person+ str);
        }
    }


}
