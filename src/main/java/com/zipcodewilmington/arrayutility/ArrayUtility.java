package com.zipcodewilmington.arrayutility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by leon on 3/6/18.
 */
public class ArrayUtility <T> {

    private T[] array;


    public ArrayUtility(T[] objectArray){
        this.array = objectArray;
    }


    public Integer countDuplicatesInMerge(T[] arraysToMerge, T valueToEvaluate) {
        array = mergeArray(arraysToMerge);
        return getNumberOfOccurrences(valueToEvaluate);
    }

    public T getMostCommonFromMerge(T[] arrayToMerge){
         T result = arrayToMerge[0];
            for (T something : arrayToMerge) {
                if (getNumberOfOccurrences(something) > getNumberOfOccurrences(result)) {
                    result = something;
                }
            } return result;
        }


    public Integer getNumberOfOccurrences( T valueToEvaluate) {
            int count = 0;

        for (T type : array) {
            if(type == valueToEvaluate) {
                count++;
            }
        }
        return count;
    }

      public T[] mergeArray(T[] arrayToMerge) {
        T[] answer = Arrays.copyOf(array, array.length + arrayToMerge.length);
        for (int i = 0; i < array.length ; i++) {
            answer[i] = array[i];
        }
        for (int i = array.length, j = 0; i < answer.length; i++, j++) {
            answer[i] = arrayToMerge[j];
        }
        return answer;
    }


      public T[] removeValue( T valueToRemove) {

        T[] result = array.clone();
        int index = 0;
        for (T word : array) {
            if (!(word ==valueToRemove) ){
                result[index] = word;
                index++;
            }
        }return Arrays.copyOfRange(result, 0, index);
    }



}
