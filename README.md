# Animal Keeper
 This program should replicate a zoo.

Input:

As input, the program should accept a (space-separated) sequence of commands,
each in one of the following formats:
1. 0 t “name” h: add (command ‘0’) an animal of type t (see the list of
animals given before) with name “name” to the home with number h
(see the restrictions given later for the home IDs);
2. 1 “name” h: move the animal with name “name” from its current home
to the home with number h;
3. 2 “name”: remove the animal with name “name” from the Zoo;
4. 3 f x: buy of food type f (see the list of food given above) the amount x;
5. 4 f x h: feed of food type f the amount x to home h.


Output:

The output must consist of a (space-separated) sequence of responses, each
reflecting the result of executing the corresponding command in the input se-
quence. A response is either of the form c, with c being the number of the
corresponding input command (see the list given before), in case the command
could be executed without any issues, or c! if the command could, for what-
ever reason, not be executed. You should think about what can possibly go
wrong, and prevent that your program executes a command under any of those
circumstances.

