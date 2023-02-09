package classes

class CollectionsDemo {
    static void main(String[] args) {
        Person johnDoe = new Person("John", "Doe", 40)
        Person maryHill = new Person("Mary", "Hill", 30)
        Person thomasMarks = new Person(firstName: "Thomas", lastName: "Marks", age:21)

        //List
        def allPersons = [johnDoe, maryHill, thomasMarks]

        //Querying collection
        assert allPersons instanceof List
        assert allPersons.size() == 3
        assert allPersons[2] == thomasMarks

        //Iterate over elements
        allPersons.each {
            println it
        }
        println()

        //Iterate over elements using an index
        allPersons.eachWithIndex { Person entry, int i ->
            println i + ": " + entry
        }
        println()

        //Filtering a specific element
        def personWithLastNameHill = allPersons.find {
            it.lastName = 'Hill'
        }
        println personWithLastNameHill
        println()

        //Transform
        def agesResult = allPersons.collect { it.age <= 30 }
        println agesResult
        println()

        //Sorting
        def sortedByAges = allPersons.sort { it.age }
        println sortedByAges
        println()

    }
}
