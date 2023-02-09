package classes

import groovy.io.FileType

import java.nio.file.Path
import java.nio.file.Paths

class ReadNumbersFromFilesInDirectory {
    static void main(String[] args) {
        Path dir = Paths.get("resources")

        List<Integer> numbers = readIntegers(dir)
        println numbers
        //Groovy style
        println numbers.max()
        println numbers.sum()

        // Java style
//        def max = numbers.stream().mapToInt { it }.max()
//        println max.present ? max.getAsInt() : "Empty List"
//        println numbers.stream().mapToInt {it}.sum()
    }

    private static List<Integer> readIntegers(Path dir) {
        List<Integer> numbers = []
        dir.toFile().traverse(type: FileType.FILES, nameFilter: ~/.*\.txt$/) { file ->
            file.eachLine { line ->
                //Groovy style
                if (line.isNumber()) {
                    numbers << line.toInteger()
                }

                //Java style
//                try {
//                    numbers.add(line.toInteger())
//                } catch (NumberFormatException e) {
//                    //do nothing
//                }
            }
        }
        numbers
    }

}
