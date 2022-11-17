Use this file to record your reflection on this assignment.

- Which classmates did you consult with while working on this assignment?
    - Lesly
    - Glory
    - Abby
    - Jessica
    - Cassie
- Which session(s) of TA / office hours did you attend?
    - Monday evening with TA Dakota
- What are your initial impressions of Java? 
    - It feels unnecesarily complex. Although I am sure, that each of the complexities have its benefit in terms of speed and efficiency, it feels really annoying to work with coming from the ease of Pyhton.
- Can you draw any conclusion about programming in general from the similarities or the differences between the two languages? 
    - Generally, programming is easier if you have a logical plan (preferably in the form of pseudocode) before you actually start coding.... regardless of the language.
- What worked, what didn't, what advice would you give someone taking this course in the future?

<u> 9/21 20:12 </u>
I met up with Lesly and Glory today at the Nielson Library to brainstorm ideas. But we were all pretty tired. So far, we have been able to do the most basic requirement of the task which is taking in the number of rounds and looping input and responses for that number of times. I plan to design some string comprehension methods to make the conversations more complex.

<u> 9/26 16:03 </u>
It took me a while to understand how I was meant to implement canned responses but, after discussing the code with Cassie, I have settled on using it as a pool for the chatbot to randomly collect responses from. This lead me to explore how the Random class works in Java as I realized it does not work the same way as it does in Python. I have been able to code for the robot to randomly select a response and will be moving on to break down user questions or staements into array from their string version.

<u> 9/26 22:03 </u>
I attended TA hours to brainstorm with Abby and Jessica as well as Ask the TA, Dakota, a quesion about  my VS Code. Abby and  Jessica used if statements to check if words were within a string. To try something else, I attempted to use functions to check if any of the words were in an array of words that could be mirrored. Additionally, for some reason, my Visual Studio Code is not able to run my java program. Unfortunately, Jessica was not able to provide much help so I resorted to editing myocde in repl.it instead. However, repl.it does not povide support for the org.apache.commons import. So I returned to VS Code where support for that import has already been set up, as I was importing Array Utils from that class to use in my code. Now, the import is supported but I am still not able to run my code. I am considering submitting what I've written without running it as I have coded most of the rubric, but I really want to run it tjust to test the various cases and be sure it works. I will spend a bit more time figuring this out. 

<u> 9/26 22:21 </u>
I am installing a new JDK using the .exe file.... hopefully that works.

<u> 9/26 22:37 </u>
I have been able to get the code to run on VS Code but the Debugger is still not working and there is a bug preventing it from moving past the first response that cannot be mirrored.

<u> 11/17 09:56 </u>
I returned to this assignment after a while to revise and resubmit it. Looking at it with a fresh eye made me realize how crowded and confusing my code was. I created a new git branch froman earlier stage of my work to "start afresh". Moving from that, I made suure to leave lots of spacesand comments in the code for better visibility and understanding. having more breathable code helped me to move from stage to stage much more easily. I have been able to create a function to switch mirror words that calls without compilation errors. I'm moving on by trying to achieve the Kudos tasks.

<u> 11/17 10:22 </u>
I have successfully completed the task. I was not able to complete all the Kudos tasks but I have a general idea of how to go about them. I was able to change the ending punctuations based on what type of puctuation the user ends with, but was not able to change mirror words that end with a punctuation mark. I can use a better regex expression to accomplish this but adding a more advanced regex expression complicates my code. 
All in all, the major lesson I learnt from this resubmission is that _cleaner code makes it easier to think and develop work._

References:
https://www.educative.io/answers/how-to-generate-random-numbers-in-java
https://www.geeksforgeeks.org/check-if-a-value-is-present-in-an-array-in-java/