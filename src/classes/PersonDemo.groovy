package classes

class PersonDemo {
    static void main(String[] args) {
        Person alex = new Person(firstName: "Alexej", lastName: "Barzykin", age: 46)

        Closure personToString = { Person person -> println person.toString() }
//        personToString(alex)
        handlePerson(personToString, alex)

        Closure personFullName = { Person person ->
            println person.firstName + " " + person.lastName
        }
        handlePerson(personFullName, alex)


//        println alex.getFullName()
//        println alex.getAge()
//
//        if (alex.getAge() >= 45 && alex.getAge() <= 65) {
//            println alex.getFullName() + " is middle-aged"
//        } else {
//            println alex.getFullName() + " is " + alex.getAge() + " years old"
//        }
//
//        def persons = [alex, new Person("Ivan", "Drago", 40)]
//
//        println()
//        println "List of people"
//        for (Person person : persons) {
//            println person.getFullName()
//        }
//
//
//        def firstName = alex.getFirstName()
//        try {
//            firstName.toLong()
//        } catch (NumberFormatException e) {
//            assert e instanceof NumberFormatException
//            print "'" + firstName + "' " + "cannot be converted into a Long"
//        }


    }

    static void handlePerson(Closure c, Person p) {
        if (p == null) {
            throw new IllegalArgumentException("A peron instance cannot be null")
        }
        c(p)
    }
}
