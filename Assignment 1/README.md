# Pseudocode, test cases, and counting operations – 20 course points
Link to official site description (All links are working as of August 13, 2021): https://introcs.cs.rutgers.edu/assignment-pseudocode/ <br/><br/>
In this assignment you will develop algorithms for problems described below, write test cases that exercise all the possible algorithm execution paths, and calculate the number of operations that are executed in certain algorithmic paths.<br/><br/>

## Assignment
For each of the following problems provide:

&nbsp;&nbsp;&nbsp;&nbsp; a. &nbsp; inputs<br/>
&nbsp;&nbsp;&nbsp;&nbsp; b. &nbsp; outputs<br/>
&nbsp;&nbsp;&nbsp;&nbsp; c. &nbsp; error conditions<br/>
&nbsp;&nbsp;&nbsp;&nbsp; d. &nbsp; an algorithm using the pseudocode reference used in class<br/>
&nbsp;&nbsp;&nbsp;&nbsp; e. &nbsp; a set of test cases. Be careful about corner cases<br/>
&nbsp;&nbsp;&nbsp;&nbsp; f. &nbsp; the minimum number of operations executed in your algorithm<br/>
&nbsp;&nbsp;&nbsp;&nbsp; g. &nbsp; the maximum number of operations executed in your algorithm<br/><br/><br/>

1. *Gas*. Compute and display the price a person will pay for gas at the gas station. Read the price per gallon, the number of gallons of gas that were purchased, and whether the person pays cash or credit to pay. If the person pays with a credit card, there is an extra charge of 10% of the total price. Gas is never free. A person stopping to buy gas will always buy some amount of gas. Note that zero as an input would incur on an error condition.<br/><br/><br/>

2. _Train Ticket for one person_. Read a person’s age, then compute and display the price the person needs to pay for the train ride according to the following rules:
    - Children younger than 7 years old ride for free.
    - If the ticket is bought at the train station:
      - A person over 65 years old pays $7.50.
      - Everyone else pays $13.20.
    - If ticket is bought inside the train, there is an extra charge of 20% compared to train station prices.<br/>
    - Note that a persons’ age is within the range of 0 to 120 years. Other inputs are error conditions.<br/><br/><br/>

3. *WCS111 FM*. Suppose you work at WCS111 FM, a radio station by computer scientists for computer scientists. The station runs a contest where listeners win prizes based on how many hours they spend programming in Java. When a listener calls in to the radio station, the listener will state how many hours (whole number) a month he/she spends programming in Java. Based on the number of hours spent programming, display the listener prize according to the following rules:
    1. Listeners who do not program do not win any prize (in other words, those who program for 0 hours per month) do not win any prizes.
    2. Hobbyist programmers (1 – 5 hours) win a T-shirt.
    3. Regular programmers (6 – 400 hours) win all of the following for which they qualify:
        * a laptop if their hours happen to end in 9 (e.g. 19, 29, 209…).
        * a hat if their hours are an even number.
        * a TV if their hours are divisible by 3.
    4. Elite programmers (> 400 hours) will win a cat.<br/><br/><br/>

4. _Lucky Sevens_. Given a whole number, compute and display how many digits in the number are 7s.
    - For example, the number of 7s in 3482 is 0, while the number of 7s in 372771 is 3.
    * Note: whole numbers are non-negative integers starting at zero {0, 1, 2, 3, 4, …}.<br/><br/><br/>

## Before submission
5. *Collaboration policy*. Read our collaboration policy [here](https://introcs.cs.rutgers.edu/#academic-integrity).
6. _Writeup_. Use your preferred text editor to type your answers, and then save the file in **PDF** format. We will only grade typed assignments and in PDF format. You will use [Gradescope](https://www.gradescope.com/) to submit your assignment. If you have not yet used Gradescope, go to your scarletmail inbox and look for an email from Gradescope with instructions on how to access your account.
7. *On Gradescope read*. Help −> Student Workflow −> Submitting a PDF for instructions on how to submit your PDF file.
8. _Submitting the assignment_. Submit your assignment via the Web submission system called Gradescope. To do this, click the *Assignments* link from the course website; click the _Submit_ link for that assignment.<br/><br/><br/>

## Getting help
If anything is unclear, don’t hesitate to drop by office hours or post a question on Piazza. Find instructors office hours by clicking the [Staff](https://introcs.cs.rutgers.edu/staff/) link from the course website. You are welcome to any professor office hours.<br/><br/><br/>

My solution to this assignment received a grade of 19.1 out of 20. The things marked wrong were:
- Minimum number of operations for Problem 2 (0 out of 0.2 points)
- Maximum number of operations for Problem 2 (0 out of 0.2 points)
- Maximum number of operations for Problem 3 (0 out of 0.2 points) 
- Correct use of loop condition in Problem 4 (lost 0.2 out of 1.0 points) (partial credit lost)
- Maximum number of operations in Problem 4 (lost 0.1 out of 0.2 points) (partial credit lost)<br/><br/>
