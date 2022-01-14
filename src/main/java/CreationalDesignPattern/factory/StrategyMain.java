package CreationalDesignPattern.factory;

import java.util.Scanner;

public class StrategyMain {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        Strategy strategy = null;
        Do v = null;
        System.out.println("input your option(v1/v2):");

        //basic idea
        /*do{
            String version = input.nextLine().toUpperCase();
            if(version.equals("V1"))
                v = new DoImplV1();
            else if(version.equals("V2"))
                v = new DoImplV2();
            v.doSomething(version);
        }while (input.hasNextLine());*/

        //by using strategy pattern
        /*do{
            String option = input.nextLine().toUpperCase();
            if(option.equals("V1")){
                strategy = new Strategy(new DoImplV1());
            }else if(option.equals("V2")){
                strategy = new Strategy(new DoImplV2());
            }
            strategy.doAction(option);
        }while (input.hasNextLine());*/

        //by using CreationalDesignPattern.singleton.factory pattern
        /*do{
            String version = input.nextLine().toUpperCase();
            v = new ObjectFactoryImpl().getObject(version);
            v.doSomething(version);
        }while (input.hasNextLine());*/

        //the best one with FACADE
        do{
            String option = input.nextLine().toUpperCase();
            strategy = new Strategy(new ObjectFactoryImpl().getObject(option));
            strategy.doAction(option);

        }while (input.hasNextLine());
    }
}
