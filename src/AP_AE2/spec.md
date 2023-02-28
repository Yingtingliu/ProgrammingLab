Assessed Exercise II
CS5002 Advanced Programming
Dr. Paul Henderson
February 2023
• Deadline: 16:30 on 17th March 2023
• Contribution to final course mark: 25%
• Solo or Group: Solo work
• Anticipated duration: 3 hours

Introduction

From the course Moodle page, download the files CommandRunner.java and
SlowCalculator.java. The latter contains a class SlowCalculator implementing Runnable. 
Its constructor takes a number N as input and stores it. Method
run performs a long, slow calculation on this number, then prints the result.
You do not need to consider (or even understand) the mathematical details of
what is being calculated!
In this exercise, you will write a class implementing the interface CommandRunner,
that runs certain commands passed as strings. These are inputs from a user,
requesting the calculation be performed for particular numbers. The inputs and
outputs are read/written by a separate part of the program – you just have to
use the passed string, and return a string.
As the calculation is slow, you will run it on background threads, so the
user can continue to interact with the system while tasks are running. To take
advantage of modern multi-core CPUs, the user may request several calculations
be run in parallel. Each calculation will still run on one single thread – your
goal is to let the user run multiple calculations in parallel, not to make the
individual calculations faster.

Task

You will write a class called Solution that implements the CommandRunner
interface. The runCommand method of this class will be passed a string, 
corresponding to a command the user entered. It should perform the relevant
command (see below), and return the specified output string. You should not
modify the interface CommandRunner in any way.
The following table lists the commands the user may enter (i.e. that may be
passed as the command argument to your Solution.runCommand method), and
the required behaviour of your runCommand method (note N is a long integer
chosen by the user):

start N 
start calculating with input N, by calling
SlowCalculator.run on a new thread; return
message “Started N”

cancel N 
cancel the calculation with input N that is currently
running (do nothing if it already completed or if it
was never started); return message “Cancelled N”

running 
just return a message indicating the total number of calculations currently running
(excluding those already completed), and
their inputs N (in any order), in the form
“3 calculations running: 83476 1000 176544”

get N 
if the calculation for N is finished, return message
“result is M ” where M is the integer result; if
the calculation is not yet finished, return message
“calculating”

finish 
finish running all calculations previously requested
by the user, and then after they are completed, return message “Finished

abort 
immediately stop all running calculations, and return
message “Aborted”