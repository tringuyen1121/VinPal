package com.example.a.khonsu.util.filter;

/**
 * Low-pass filter filters out noise from sensors' data, smooths the data.
 */

public class LowPassFilter {

    private static final float ALPHA = 0.20f;

    public static float[] lowPass( float[] input, float[] output ) {
        if ( output == null ) return input;

        for ( int i=0; i<input.length; i++ ) {
            output[i] = output[i] + ALPHA * (input[i] - output[i]);
        }
        return output;
    }
}
