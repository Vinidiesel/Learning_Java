package application;

import entities.Candidate;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Map<String,Integer> votes = new HashMap<>();

        System.out.print("Enter file full path: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))){



            String line = br.readLine();

            while (line != null){
                String[] fields = line.split(",");
                String name = fields[0];
                int vote = Integer.parseInt(fields[1]);

                Candidate candidate = new Candidate(name);


                if (votes.containsKey(candidate.getName())){
                    int votesSoFar = votes.get(candidate.getName());
                    votes.put(candidate.getName(), vote + votesSoFar);
                }else{
                    votes.put(candidate.getName(), vote);
                }

                line = br.readLine();
            }

            for (String key: votes.keySet()) {
                System.out.println(key + ": " + votes.get(key));
            }

        }catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }

}