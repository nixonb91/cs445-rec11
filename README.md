# CS 445 Recitation 11: Dictionaries

## Introduction

In this recitation, you will write several methods in the class, `MapLandmarks.java`, that extends an double-hashing based implementation of the Dictionary ADT. This class will allow a client to store landmarks and their coordinates in a Dictionary data structure. We have provided a list of some famous landmarks in PA in the file `landmarks.txt`. Our program utilizes the Dictionary ADT by using the latitude and longitude pair as the key and the landmark name as the value. The latitude and longitude are wrapped in the class `Tuple` which will respresent the key used by `MapLandmarks.java`. Using the Tuple class: 
   - introduces the 2 components of the key in a convenient wrapper class; latitude and longitude.
   - overrides the .equals method to make sure that the 2 components of the key are considered when comparing.
   - overrides the hashCode method such that Horner's method is applied on each component separately, then their results are added mitigating the risk of losing numeric information (sure, we don't have that much information to lose considering that our .txt file doesn't have hundreds of landmarks, but it's a good practice to be aware of).

You will write three methods for your dictionary of landmarks: a method to add a new landmark (addLandmark), another one to remove an existing landmark (removeLandmark), and a third one to print all the landmarks (the ones imported from the .txt file along with any added ones considering the removed ones -if any).

## Exercise

1. Download the provided code by forking and cloning this [Recitation 11
repository](https://github.com/2217-cs445/cs445-rec11). The starting code can be
found in the usual location. Note the following provided Java files:

   - `Maplandmarks.java` (in package `cs445.rec11`) contains stubs for the
     methods you will write in this exercise. 
   - `Tuple.java` (in package `cs445.rec11`) a wrapper class for the 2 components of the key.
   - `DictionarytInterface.java` (in package `cs445.rec11`) contains the dictionary ADT.
   - `HashingDictionary.java` (in package `cs445.rec11`) is a double hashing-based dictionary along with the implementation of dictionary methods.
   - `CSVReader.java` (in package `cs445.rec11`) reads the landmark.txt file and stores all the lines in a list of strings.
   - `Demo.java` (in package `cs445.rec11`) a sample client for running the project and giving the user the choice to add a landmark, remove a landmark, print all the landmarks in the dictionary, or search a landmark by entering its latitude and longitude. 
   - `landmark.txt` (in package `cs445.resources`) has some famous landmarks in PA. Each line has the landmark name, its latitude, and its longitude separated by commas. 

2. In class `Maplandmarks`, write the method `void addLandmark(V value, double firstComponent, double secondComponent)`, which adds a value and its associated key, which has two components. You should rely on the implemented methods in `HashingDictionary.java` as we are extending the `HashingDictionary` class.

3. In the same class, write the method `void removeLandmark(V value)`, which removes a value and its associated key from our dictionary pairs. 

4. Check if the previous 2 methods work as expected using `./gradlew test` (or `gradlew.bat test` on DOS-based terminals), which will run
the unit tests we provided you with. Note: it's better to run ./gradlew test after writing each method, so that you will be able to debug your methods separately. 

5. Lastly, write the method `public void printAllLandmarks()`, which prints all
landmarks your dictionary has. Hint: Consider using an iterator for this task. 

6. Test that your last method works as expected using `./gradlew run` and choosing "3. Print all landmarks" on the console menu. Now compare what's printed on the screen to what is contained in the landmark.txt file (in `cs445.resouces`.) They should be the same unless you inserted or removed any of the existing landmarks. 

## Conclusion

In this exercise, you practiced using Dictionary methods along with iterators. Dictionaries are known for their efficiency in lookups and updating their pairs as they map any-non null keys to any-non null values. You can check the signature (input and output) of the Dictionaries' methods here: [more about dictionaries](https://docs.oracle.com/javase/7/docs/api/java/util/Dictionary.html)

