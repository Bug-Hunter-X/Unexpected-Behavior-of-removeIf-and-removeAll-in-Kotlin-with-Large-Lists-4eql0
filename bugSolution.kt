fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    val iter = list.iterator()
    while (iter.hasNext()) {
        if (iter.next() > 2) {
            iter.remove()
        }
    }
    println(list) // Output: [1, 2]

    val list2 = mutableListOf(1, 2, 3, 4, 5)
    list2.retainAll { it <= 2 }
    println(list2) // Output: [1, 2]
    
    //For larger lists, consider using filter and creating a new list
    val largeList = (1..10000).toMutableList()
    val filteredList = largeList.filter { it <= 5000 }.toMutableList()
    println(filteredList.size)
} 