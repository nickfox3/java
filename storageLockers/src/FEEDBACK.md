Overall, you did a nice job with separation of concerns, encapsulation, and defensive coding for user errors. You're definitely getting it! 

There's a few logic bugs and style things we should fix.

**OVERALL: Revision Requested**

* The main method is doing a lot of work. Consider extracting the menu logic into a separate method.

* There seems to be a critical bug in `removeLocker()`:
  ```java
  // CURRENT (BUGGY):
  if (lockers[i].getLockerNumber() == lockerNumber) {
      lockers[lockerCount - 1] = null; 
      lockerCount--;
      break;
  }
  ```

  It appears that no matter what locker number is found, you're setting the last locker in the index to null, not necessarily the one found.

* Bug in PIN generation:
  ```java
  int lockerNumber = (int) (Math.random() * 1000); // 0-999, not 4 digits
  String pin = String.format("%04d", (int) (Math.random() * 100)); // 0-99, not 4 digits
  ```