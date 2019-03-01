package com.zipcodewilmington.looplabs;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {

    public StringDuplicateDeleter(String[] strArray) {
        super(strArray);
    }

    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        int indexesToBeRemoved = 0;
        for (int i = 0; i < array.length; i++) {
            if (countFrequency(array[i]) == exactNumberOfDuplications) {
                indexesToBeRemoved++;
            }
        }
        String[] dupsRemoved = new String[array.length - indexesToBeRemoved];
        Integer indexInNewArray = 0;
        for (int i = 0; i < array.length; i++) {
            if (countFrequency(array[i]) != exactNumberOfDuplications) {
                dupsRemoved[indexInNewArray] = array[i];
                indexInNewArray++;
            }
        }
        return dupsRemoved;
    }

    public String[] removeDuplicates(int maxNumberOfDuplications) {
        int indexesToBeRemoved = 0;
        for (int i = 0; i < array.length; i++) {
            if (countFrequency(array[i]) >= maxNumberOfDuplications) {
                indexesToBeRemoved++;
            }
        }
        String[] dupsRemoved = new String[array.length - indexesToBeRemoved];
        Integer indexInNewArray = 0;
        for (int i = 0; i < array.length; i++) {
            if (countFrequency(array[i]) < maxNumberOfDuplications) {
                dupsRemoved[indexInNewArray] = array[i];
                indexInNewArray++;
            }
        }
        return dupsRemoved;
    }

    public Integer countFrequency(String str) {
        Integer frequency = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(str)) {
                frequency++;
            }
        }
        return frequency;
    }
}
