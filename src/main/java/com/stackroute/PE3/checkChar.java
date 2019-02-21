/* set up an array of places, Loop round and remove the vowels.*/

package com.stackroute.PE3;

import java.util.*;

public class checkChar {
    public String[] remVow(String s[]) {
        for (int i = 0; i < s.length; i++)
            s[i] = s[i].replaceAll("[aeiouAEIOU]", "");
        return s;
    }

}
