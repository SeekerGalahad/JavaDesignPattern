package com.design.training.adapter;

/**
 * @author Wagic
 * @Description:
 * @Date: 2019-01-25 11:36 by Wagic 创建
 */
public class OperationAdapter implements ScoreOperation {

    private QuickSort sortObj;

    private BinarySearch searchObj;

    public OperationAdapter() {
        this.sortObj = new QuickSort();
        this.searchObj = new BinarySearch();
    }

    @Override
    public int[] sort(int[] array) {
        return sortObj.quickSort(array);
    }

    @Override
    public int search(int[] array, int key) {
        return searchObj.binarySearch(array, key);
    }
}
