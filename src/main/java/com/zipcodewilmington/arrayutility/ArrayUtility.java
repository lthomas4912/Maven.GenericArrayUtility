package com.zipcodewilmington.arrayutility;

import java.util.Arrays;

/**
 * Created by leon on 3/6/18.
 */
public class ArrayUtility <T> {

    private T[] array;
    private T count;

    public ArrayUtility(T[] objectArray){
        this.array = objectArray;
    }


    public Integer countDuplicatesInMerge(T[] arrayToAdd, T valueToEvaluate){
        int count = 0;
        T [] arrayToMerge = mergeArray(array,arrayToAdd);
        for(T something : arrayToMerge){
            if(getNumberOfOccurrences(valueToEvaluate)== something){
                arrayToMerge[count] = something;
                count++;
            }
        }
        return count;
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

    public T[] mergeArray( T[] newArray, T[] arrayToAdd) {
        int newLength = newArray.length + arrayToAdd.length;
        T[] otherArray = Arrays.copyOf(newArray,newLength);
        int mergedIndex = otherArray.length;
        for(int i = 0; i < arrayToAdd.length; i++){
            otherArray[mergedIndex] = arrayToAdd[i];
            mergedIndex++;
        }
        return otherArray;
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

//    public T[] getArray(T[] array){
//
//        T[] arr = (T[]) Array.newInstance(array.getClass().getComponentType(), 10);
//        return arr;
//    }



}
