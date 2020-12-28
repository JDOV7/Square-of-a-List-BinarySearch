package binarysearch;

import java.util.Arrays;

public class SquareofaList {

    public void SquareofaList() {
        int[] nums = {-9, -2, 0, 2, 3};
        int iResultArrSort[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            iResultArrSort[i] = (int) (Math.pow(nums[i], 2));
        }
        Arrays.sort(iResultArrSort);
        for (int i : iResultArrSort) {
            System.out.println(i);
        }
    }
}
