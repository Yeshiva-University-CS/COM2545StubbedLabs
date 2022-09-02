package edu.yu.introtoalgs;

/**
 *
 *
 * Students MUST EXTEND TemplateBaseClass with an implementation class named Template.
 *
 * In the Template class, students MAY NOT change the TemplateBaseClass API in
 * any way.  My test code will only invoke the API defined below.
 *
 * @author Avraham Leff
 */

public abstract class TemplateBaseClass {

  /** Constructor: student implementations MAY ONLY use a no-argument
   * constructor
   */
  public TemplateBaseClass() {
  }

  /** You're given an input array of integers and a specified value to remove
   * from the array.  Let's call the number of array elements "n".  Your task
   * is to determine how many array elements DON'T equal "val" (let's call that
   * "retval"), to return that number AND to MODIFY "numbers" so that array
   * elements 0..retval-1) now contain the original array elements IN ORDER BUT
   * don't contain array elements equal to "val".  You may set the remaining
   * array elements (retval..n-1) to any value that you choose.
   *
   * In other words, you're removing all occurrences of "val" from the array
   * BUT NOT creating a new array, only modifying its contents.
   *
   * NOTE: The implementor of this method is "assuming ownership of the array"
   * since it's allowed to modify the contents of the array.
   *
   * @param numbers the input array, guarranteed to be non-null and
   * contain at least one element.  If "val" occurs in at least one
   * element of the array, the array's contents must be modified as
   * specified above.
   * @param val the value to remove from the input array
   * @return the number of array elements that DON'T equal "val".
   */
  public abstract int removeArrayElement(int[] numbers, int val);
} // class
