import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static class Country {
        int id, gold, silver, bronze;

        Country(int id, int gold, int silver, int bronze) {
            this.id = id;
            this.gold = gold;
            this.silver = silver;
            this.bronze = bronze;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int country = Integer.parseInt(st.nextToken());
        int question = Integer.parseInt(st.nextToken());
        List<Country> countries = new ArrayList<>();

        int[] score = new int[country];
        for (int i = 0; i < country; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int country2 = Integer.parseInt(st2.nextToken());
            int goldmedal = Integer.parseInt(st2.nextToken());
            int slivermedal = Integer.parseInt(st2.nextToken());
            int coopermedal = Integer.parseInt(st2.nextToken());
            countries.add(new Country(country2, goldmedal, slivermedal, coopermedal));
        }

        countries.sort((c1, c2) -> {
            if (c1.gold != c2.gold) {
                return c2.gold - c1.gold;
            } else if (c1.silver != c2.silver) {
                return c2.silver - c1.silver;  // 금메달이 같으면 은메달 수로 비교
            } else {
                return c2.bronze - c1.bronze;  // 금, 은메달이 같으면 동메달 수로 비교
            }
        });
        int rank = 1;  // 첫 번째 국가의 순위는 1
        HashMap<Integer,Integer> scoreMap = new HashMap<>();
        scoreMap.put(countries.get(0).id,rank);
        for (int i = 0; i < countries.size(); i++) {
            if (i > 0 && !isSameRank(countries.get(i), countries.get(i - 1))) {
                rank = i + 1;
                scoreMap.put(countries.get(i).id,rank);
            } else {
                scoreMap.put(countries.get(i).id,rank);
            }
        }
        System.out.println(scoreMap.get(question));

    }
    static boolean isSameRank(Country c1, Country c2) {
        return c1.gold == c2.gold && c1.silver == c2.silver && c1.bronze == c2.bronze;
    }

}
