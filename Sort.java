package com.fedu.jp;

public class Sort
{
    private static void quick_sort_recursively(int[] array, final int first_ref, final int last_ref)
    {
        if(last_ref - first_ref <= 1)
        {
            return;
        }

        int left_ref = first_ref;
        int right_ref = last_ref - 1;
        int pivot = array[last_ref];
        while(left_ref <= right_ref)
        {
            boolean left_bigger = array[left_ref] > pivot;
            boolean right_smaller = array[right_ref] < pivot;
            if(left_bigger && right_smaller)
            {
                int tmp = array[left_ref];
                array[left_ref] = array[right_ref];
                array[right_ref] = tmp;
                ++left_ref;
                --right_ref;
                continue;
            }
            
            if(!left_bigger) {
                ++left_ref;
            }

            if(!right_smaller) {
                --right_ref;
            }
        }

        if(left_ref != last_ref) {
            int tmp = array[left_ref];
            array[left_ref] = pivot;
            array[last_ref] = tmp;
        }

        quick_sort_recursively(array, first_ref, right_ref);
        quick_sort_recursively(array, left_ref, last_ref);
    }

    public static void quick_sort(int[] array)
    {
        quick_sort_recursively(array, 0, array.length-1);
    }

    public static void count_sort(int[] array)
    {
        int max = array[0];
        int min = array[0];
        for (int var : array)
        {
            if(var > max)
            {
                max = var;
            }
            else if(var < min)
            {
                min = var;
            }
        }

        int size = max - min + 1;
        int[] count_buffer = new int[size];
        for (int var : array)
        {
            count_buffer[var-min] += 1;
        }

        int n = 0;
        for (int i = 0; i < count_buffer.length; ++i) {
            for(int j = 0; j < count_buffer[i]; ++j)
            {
                array[n] = i + min;
                ++n;
            }
        }
    }
}