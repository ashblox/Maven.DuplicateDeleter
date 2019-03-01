package com.zipcodewilmington.looplabs;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {

    public IntegerDuplicateDeleter (Integer[] intArray) {
        super(intArray);
    }

    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        int indexesToBeRemoved = 0;
        for (int i = 0; i < array.length; i++) {
            if (countFrequency(array[i]) == exactNumberOfDuplications) {
                indexesToBeRemoved++;
            }
        }
        Integer[] dupsRemoved = new Integer[array.length - indexesToBeRemoved];
        Integer indexInNewArray = 0;
        for (int i = 0; i < array.length; i++) {
            if (countFrequency(array[i]) != exactNumberOfDuplications) {
                dupsRemoved[indexInNewArray] = array[i];
                indexInNewArray++;
            }
        }
        return dupsRemoved;
    }

    public Integer[] removeDuplicates(int maxNumberOfDuplications) {
        int indexesToBeRemoved = 0;
        for (int i = 0; i < array.length; i++) {
            if (countFrequency(array[i]) >= maxNumberOfDuplications) {
                indexesToBeRemoved++;
            }
        }
        Integer[] dupsRemoved = new Integer[array.length - indexesToBeRemoved];
        Integer indexInNewArray = 0;
        for (int i = 0; i < array.length; i++) {
            if (countFrequency(array[i]) < maxNumberOfDuplications) {
                dupsRemoved[indexInNewArray] = array[i];
                indexInNewArray++;
            }
        }
        return dupsRemoved;
    }

    public Integer countFrequency(Integer index) {
        Integer frequency = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == index) {
                frequency++;
            }
        }
        return frequency;
    }


}
