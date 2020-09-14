// A GuitarString object simulates a guitar string that plays at a particular
// frequency.  It keeps track of a ring buffer of sound samples that are
// modified over time using the Karplus Strong algorithm to simulate the
// changes in the string's vibration.  The class maintains the data invariant
// that the ring buffer always contains at least two values.

// This is a skeleton file. The STUDENT must implement it!

import java.util.*;

public class GuitarString {
	// instance fields go here
	
	/**
	 * Constructor to create a guitar string with the given frequency.
	 *  @param frequency The which must be > 0 and <= 2/3 * (sample rate)
	 *  (throws an IllegalArgumentException if not)
	 */
	public GuitarString(double frequency) {

	}

	/**
	 * Constructor to create a guitar string using the values provided
	 * in the argument. 
	 * @param init array contains at least 2 values 
	 *    (throws IllegalArgumentException if not); 
	 *    all values are between -0.5 and +0.5 (not checked)
	 *    These values will be put into the Ring buffer.
	 */
	public GuitarString(double[] init) {

	}

	/**
	 * This will simulate a single pluck of the guitar string by
	 * adding "noise" into the ring buffer. It will randomly generate
	 * values in the range of -0.5 to +0.5. 
	 */
	public void pluck() {
	}


	/**
	 * Advance the simulation one time step.
	 * 
	 * post: simulation is advanced one step by applying the Karplus Strong
	 * algorithm to the first two values in the ring buffer and cycling
	 * the new value to the end of the buffer.
	 */
	public void tic() {
	}

	/**
	 * Gets the value at the front of the ring buffer. 
	 * @return the current sample value
	 */
	public double sample() {
		return 0;
	}
}
