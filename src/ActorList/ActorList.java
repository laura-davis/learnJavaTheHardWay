package ActorList;

import java.net.MalformedURLException;
import java.util.Scanner;

class Actor {
    String name;
    String role;
    String birthDate;
}

public class ActorList {
    public static void main(String[] args) throws Exception {
        String url = "https://learnjavathehardway.org/txt/s01e01-cast.txt";
        Scanner inFile = new Scanner((new java.net.URL(url)).openStream());
        int count = 0;
        while (inFile.hasNext()) {
            Actor a = getActor(inFile);
            System.out.print(a.name + " was born on " + a.birthDate);
            System.out.println(" and played " + a.role);
            count++;
        }
        inFile.close();
        System.out.println(count);
    }
        public static Actor getActor (Scanner input){
            Actor a = new Actor();
            a.name = input.nextLine();
            a.role = input.nextLine();
            a.birthDate = input.nextLine();
            return a;

        }
    }
