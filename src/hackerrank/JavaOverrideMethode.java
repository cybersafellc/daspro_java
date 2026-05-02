package hackerrank;

import java.io.*;
import java.util.*;

class Sports{
    String getName(){
        return "Generic Sports";
    }
    void getNumberOfTeamMembers(){
        System.out.println("Each team has n players in " + getName());
    }
}

class Soccer extends Sports {
    @Override
    String getName(){
        return "Soccer Class";
    }
    @Override
    void getNumberOfTeamMembers(){
        System.out.println("Each team has 11 players in " + getName());
    }
}


public class JavaOverrideMethode {

    public static void main(String[] args) {
        Sports sport1 = new Sports();
        System.out.println(sport1.getName());
        sport1.getNumberOfTeamMembers();

        Sports soccer1 = new Soccer();
        System.out.println(soccer1.getName());
        soccer1.getNumberOfTeamMembers();
    }
}

