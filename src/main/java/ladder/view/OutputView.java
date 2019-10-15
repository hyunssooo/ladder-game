package ladder.view;

import java.util.List;
import java.util.Map;

import ladder.Ladder;
import ladder.Lines;

public class OutputView {
    public static void printLadder(Ladder ladder, List<String> people, List<String> rewards) {
        System.out.println("사다리 결과");
        for (final String person : people) {
            System.out.print(person + "    ");
        }
        System.out.println();
        final List<Lines> lines = ladder.getLines();
        for (final Lines line : lines) {
            printLine(line);
        }

        for (final String reward : rewards) {
            System.out.print(reward + "    ");
        }
        System.out.println();
    }

    private static void printLine(Lines line) {
        for (final Boolean lineLine : line.getLines()) {
            System.out.print("|");
            if (lineLine) {
                System.out.print("----");
            } else {
                System.out.print("    ");
            }
        }
        System.out.println("|");
    }

    public static void printReward(String resultReward) {
        System.out.println("실행 결과");
        System.out.println(resultReward);
        System.out.println();
    }

    public static void printAll(Map<String, String> finish) {
        System.out.println("실행 결과");
        finish.forEach((k, v) -> System.out.println(k + " : " + v));
        System.out.println();
    }
}
