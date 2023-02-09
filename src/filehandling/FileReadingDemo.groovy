package filehandling

import classes.Person

class FileReadingDemo {
    static void main(String[] args) {
        Person johnDoe = new Person();

        //Read full content of file
        File file = new File("resources/john-doe.txt")
        def text = file.getText('UTF-8')
        println text

        // Iterate over each line
        file.eachLine {line, i ->
            if (i == 1) {
                johnDoe.setLastName(line)
            } else if (i == 2) {
                johnDoe.setFirstName(line)
            } else if (i ==3) {
                johnDoe.setAge(line.toInteger())
            } else {
                throw new RuntimeException("A person text should have only 3 lines")
            }
        }
        println johnDoe
    }
}
