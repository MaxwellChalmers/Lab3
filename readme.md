
# this is a header


1. Write a function that takes in a list of integers as an argument
and returns true if it contains two integers that are the same, false
otherwise.


The two solutions are nested loops and using a set or map. I think that both are fine ways to solve this if you are not worried about time complexity but I am  sure the set solution has a better performance.


in order to explain let's imagine that each entry in the list is a physical object that represents the number in the list


I'd describe the nested loops as if you were to pick up one of these objects with your right hand and then pick up every other object to see if they have the same number,  checking every option until they find a match, or if a match isn't found you pick a different object that you haven't held in your right hand yet and repeat the entire process until you find a match or run out of unique objects to hold.


for a set implementation  you would simply pick one number up and place it on a table. keep picking and placing numbers onto the table one at a time. everytime you repeat this you look at the table to see if there is a copy of the number you are trying to place, if you see a copy you are done and if you run out of objects to put on the table you know that there isn't a duplicate

the only disadvanage for the set I can think of compared to the nesting loops is you need a table (it might cost a little bit more space/memory than the nesting loops )



