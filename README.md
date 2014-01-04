danjohn-taptest
===============

A simple java application to run a "tap test" described by Dan John.

## General Description

I looked around quite a bit and couldn't find anyone that had implemented a "tap test" application that would count the number of keystrokes someone could do in a time frame.  Dan John mentions having a friend write him a simple application in the book, Easy Strength.  I thought the tap test would be a good thing to test my neuro-muscular efficiency before each of my morning workouts, so I threw together a quick Java application to do so.  It is an eclipse project that can generate (Export...) an executable jar file.  You can download the releases here:

[https://github.com/kddubb/danjohn-taptest/releases](https://github.com/kddubb/danjohn-taptest/releases)

Then you can execute the jar file using the command:

`java -jar /path/to/TapTest-v0.1.jar`

It will then ask you how long you want to test:

`Please enter the number of seconds to tap test (default 10):`

It tests using the Enter key only for now, as soon as you press the Enter key the first time it will start timing:

`Start hitting the Enter key to start your test:`

When the time has elapsed, it will display the results:

`You pressed the Enter key 69 times in 10 seconds.`

Hope it's useful to at least a few more of you besides myself. :)