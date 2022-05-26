package com.company.ARRAYS;
import java.util.*;
import static java.util.stream.Stream.concat;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

public class ArrayUnion {

        public static int[] arrayDiff(int[] a, int[] b) {
            // Your code here

            Set<Integer> set1 = new HashSet<Integer>();

            for (int v : a) {
                set1.add(v);
            }

            Set<Integer> set2 = new HashSet<Integer>();

            for (int v : b) {
                set2.add(v);
            }

            //Finding Union of set1 and set2
            Set<Integer> union_data = new HashSet<Integer>(set1);

            union_data.addAll(set2);

            int i = 0;
            int[] array1 = new int[union_data.size()];

            for(Integer ele:union_data){
                array1[i++] = ele;
            }

            return array1;

        }
    }