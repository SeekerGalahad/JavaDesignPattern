package com.design.training.adapter;

/**
 * @author Wagic
 * @Description:
 * @Date: 2019-01-26 11:31 by Wagic 创建
 */
public class AlgTest {

    public static void main(String[] args) {
        ScoreOperation operation = new OperationAdapter();

        int[] scores = {84, 76, 50, 69, 90, 91, 88, 96};
        int[] result;
        int score;

        result = operation.sort(scores);

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }

        score = operation.search(scores, 90);

        if (score == -1) {
            System.out.println("not found");
        } else {
            System.out.println("found.");
        }
    }
}
