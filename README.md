# Zettai

This is the project implemented based on the book "From Objects to Functions" used to learn
functional programming in Kotlin.
Visit [official book website](https://pragprog.com/titles/uboop/from-objects-to-functions/) for more information.

## User stories

The basic user stories are:
1. See a single list
2. Create a new list with a name and a description
3. See all their lists
4. Add an item to a list with description and optional due date
5. Modify the name or the description of a list
6. Mark an item as “done” or “in progress,” and edit the description
7. Archive a list when it’s completed

The additional user stories are:
1. See items from all the open lists that are due soon
2. See all the items that are in a “pending” state
3. Put a list on temporary hold and specify a reason
4. See the entire history of a list

Event storming - flow of user stories / events:

![Event storming](/docs/img/ch1-eventstorming.jpg "Event storming")

Mockups:

![Lists](/docs/img/ch1-mockup-lists.jpg "UI - lists") 
![Items](/docs/img/ch1-mockup-items.jpg "UI - items")
![Next](/docs/img/ch1-mockup-next.jpg "UI - next")
