# CS 445 Recitation 11: Dictionaries

## Introduction

In this recitation, you will implement several methods for a dictionary. We have a list of the famous landmarks in PA in a .txt file. Our program takes this file as an input, stores each landmark name as a value along with its latitude and longitude as the associated key. Notice that for this recitation, the key is a Tuple(latitude, longitude), this is why we have Tuple.java file that:

   - introduces the 2 components of the key; latitude and longitude.
   - overrides .equals method to make sure that the 2 components of the key are considered when comparing.
   - overrides hashCode method such that Horner's method is applied on each component separately, then their results are added mitigating the risk of losing numeric information (sure, we don't have that much information to lose considering that our .txt file doesn't have hundreds of landmarks, but it's a good practice to be aware of).

You will write three methods for your dictionary of landmarks: a method to add a new landmark (addLandmark), another one to remove an existing landmark (removeLandmark), and a third one to print all the landmarks (the ones imported from the .txt file along with any added ones considering the removed ones -if any).

## Exercise

1. Download the provided code by forking and cloning this [Recitation 11
repository](https://github.com/2217-cs445/cs445-rec11). The starting code can be
found in the usual location. Note the following provided Java files:

   - `Maplandmarks.java` (in package `cs445.rec11`) contains stubs for the
     methods you will write in this exercise. 
   - `Tuple.java` (in package `cs445.rec11`) declares the 2 components of the key.
   - `DictionarytInterface.java` (in package `cs445.rec11`) contains the dictionary ADT.
   - `HashingDictionary.java` (in package `cs445.rec11`) is a double hashing-based dictionary along with the implementation of dictionary methods.
   - `CSVReader.java` (in package `cs445.rec11`) reads landmark.txt file and stores all the lines in a list of strings.
   - `Demo.java` (in package `cs445.rec11`) to run the project and give the user the choice to add a landmark, remove a landmark, print all the landmarks in the dictionary, search a landmark by entering its latitude and longitude. Also, you'll use this class to make sure the printAllLandmarks method is properly implemented. 
   - `landmark.txt` (in package `cs445.resources`) has some famous landmarks in PA. Each line has the landmark name, its latitude, and its longitude separated by commas. 

2. In class `Maplandmarks`, in the `cs445.rec11` package, write the method `void addLandmark(V value, double firstComponent, double secondComponent)`, which adds a pair of a value paired and its key, which has two components. You should rely on the implemented methods in `HashingDictionary` class.

3. In the same class, write the method `void removeLandmark(V value)`, which removes a value and its associated key from our dictionary pairs. 

4. Check if the previous 2 methods work as expected using `./gradlew test` (or `gradlew.bat test` on DOS-based terminals), which will run
the unit tests we provided you with. Note: it's better to run ./gradlew test after writing each method, so that you will be able to debug your methods separately. 

5. Lastly, write the method `public void printAllLandmarks()`, which prints all
landmarks your dictionary has. Note: you will be using iterators for this method. 

6. Test that your last method using `./gradlew run`, and choose "3. Print all landmarks." Now compare what's printed on the screen to what landmark.txt file (in `cs445.resouces`.) They should be the same unless you inserted or removed any of the existing landmarks. 

## Conclusion

In this exercise, we have practiced using Dictionary methods along with iterators again (we used iterators for recitation 10). Dictionaries are known for their efficiency in lookups and updating their pairs as they map any-non null keys to any-non null values. You
can check the signature (input and output) of the Dictionaries' methods here: [more about
dictionaries](https://docs.oracle.com/javase/7/docs/api/java/util/Dictionary.html)

