public class SampleCode {

	    public static GuitarString stringA = new GuitarString(440);
	    public static GuitarString stringC = new GuitarString(523);

	    public static void main(String[] args) {

	        while (true) {
	      	  if (StdDraw.hasNextKeyTyped()) {
	              char key = Character.toLowerCase(StdDraw.nextKeyTyped());
	              keyPressed(key);
	      	  }
	            // compute the super-position of samples
	            double sample = stringA.sample() + stringC.sample();

	            // play the sample on standard audio
	            StdAudio.play(sample);

	            // advance the simulation of each guitar string by one step   
	            stringA.tic();
	            stringC.tic();
	        }
	    }

	    public static void keyPressed(char ch) {
	        if      (ch == 'a') { stringA.pluck(); }
	        else if (ch == 'c') { stringC.pluck(); }
	    }

}
