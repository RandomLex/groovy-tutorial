package filehandling

import classes.Person

class WritingFileDemo {
    static void main(String[] args) {
        // Create a file and populate contents
        File textFile = new File("resources/mary-hill.txt")
        textFile.withWriter("UTF-8") {BufferedWriter writer ->
            writer.writeLine "Mary"
            writer.writeLine "Hill"
            writer.writeLine "30"
        }
        textFile.append("1")
        textFile << "2"

        // Serializing an object to a file
        Person thomasMarks = new Person("Thomas", "Marks", 21)
        File binFile = new File("resources/thomas-marks.bin")
        binFile.withObjectOutputStream { out ->
            out.writeObject(thomasMarks)
        }

    }
}
