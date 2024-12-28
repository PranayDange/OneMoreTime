Collection

What is Collection framework?
It provides a set of interfaces and classes that help in managing groups of objects.



                          Collection (interface)
                               |
    ------------------------------------------------------------------------------------------
    |                                            |                                  |
List                                           Queue                                Set
(interface)                                 (interface)                          (interface)
|                                               |                                    |
--------------------------------   -----------------------------   -----------------------------------
|              |              |   |         |          |        |   |              |                |
ArrayList   LinkedList    Vector PriorityQueue Deque  LinkedList HashSet       LinkedHashSet     SortedSet
|                           |    |         |          |                    (interface)           |
Stack                     Stack  ArrayDeque ArrayDeque TreeSet












Key Interfaces in Collection framework
The collection framework is primarily built around a set of interfaces important one are:

Collection:The root interface for all the other collection types.
List:An ordered collection that can contain duplicate elements (eg.,Arraylist,Linkedlist)
Set:A collection that cannot contain duplicate elements(eg.,HashSet,TreeSet)
Queue:A collection designed for holding elements prior to processing(eg.,priority queue,linkedlist when used as a queue)
Deque:A double ended queue that allows insertion and removal from both ends(eg.,ArrayDeque)
Map:An interface that represents a collection of key-value pairs(eg.,HashMap,TreeMap)

Collection Framework is organized into a hierarchy where the core interfaces are at the top,
and the specific implementation extend these interfaces.