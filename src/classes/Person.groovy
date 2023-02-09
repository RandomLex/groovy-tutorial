package classes

import groovy.transform.EqualsAndHashCode
import groovy.transform.ToString
import groovy.transform.TupleConstructor

@EqualsAndHashCode
@ToString
@TupleConstructor
class Person implements Serializable {
    String firstName
    String lastName
    int age

//    String getFullName() {
//        firstName + " " + lastName
//    }
}
