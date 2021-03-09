import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PersonPool {
    private static PersonPool personPool = new PersonPool();

    public static PersonPool getInstance() {
        return personPool;
    }

    List<Person> personList = new ArrayList<Person>();

    public List<Person> getPersonList() {
        return personList;
    }


    /**
     * @param state 市民类型 Person.State的值，若为-1则返回当前总数目
     * @return 获取指定人群数量
     */
    public int getPeopleSizeByCity(int state, int city) {
        if (state == -1) {
            return personList.size();
        }
        int i = 0;
        for (Person person : personList) {
            if (person.getState() == state && person.city.getCenterX()==city) {
                i++;
            }
        }
        return i;
    }
    
    public int getPeopleSize(int state) {
        if (state == -1) {
            return personList.size();
        }
        int i = 0;
        for (Person person : personList) {
            if (person.getState() == state) {
                i++;
            }
        }
        return i;
    }
    

    private PersonPool() {
        City city1 = new City(Constants.CITY1, Constants.CITY1);//设置城市中心为坐标(400,400)
        City city2 = new City(Constants.CITY2, Constants.CITY2);
        //添加城市居民
        for (int i = 0; i < Constants.CITY_PERSON_SIZE/2; i++) {
            Random random = new Random();
            //产生N(a,b)的数：Math.sqrt(b)*random.nextGaussian()+a
            int x = (int) (100 * random.nextGaussian());
            int y = (int) (100 * random.nextGaussian());
            x = x%150+ city1.getCenterX();
            y = y%150+ city1.getCenterY();
            //System.out.print(x+" ");
            //System.out.println(y);
            personList.add(new Person(city1, x, y));
        }
        for (int i = 0; i < Constants.CITY_PERSON_SIZE/2; i++) {
            Random random = new Random();
            //产生N(a,b)的数：Math.sqrt(b)*random.nextGaussian()+a
            int x = (int) (100 * random.nextGaussian());
            int y = (int) (100 * random.nextGaussian());
            x = x%150+ city2.getCenterX();
            y = y%150+ city2.getCenterY();
            personList.add(new Person(city2, x, y));
        }
    }
}
