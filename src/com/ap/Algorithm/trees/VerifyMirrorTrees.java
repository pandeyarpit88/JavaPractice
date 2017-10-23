package com.ap.Algorithm.trees;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by APandey1 on 11-10-2017.
 */

public class VerifyMirrorTrees {

    HashMap map = new HashMap();
    String a;
    int b,c,f,asd;
    Map<String, String> mp;

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof VerifyMirrorTrees))
            return false;
        VerifyMirrorTrees that = (VerifyMirrorTrees) o;
        if (b != that.b)
            return false;
        if (c != that.c)
            return false;
        if (f != that.f)
            return false;
        if (asd != that.asd)
            return false;
        if (map != null ? !map.equals(that.map) : that.map != null)
            return false;
        if (a != null ? !a.equals(that.a) : that.a != null)
            return false;
        return mp != null ? mp.equals(that.mp) : that.mp == null;
    }

    @Override
    public int hashCode() {
        int result = map != null ? map.hashCode() : 0;
        result = 31 * result + (a != null ? a.hashCode() : 0);
        result = 31 * result + b;
        result = 31 * result + c;
        result = 31 * result + f;
        result = 31 * result + asd;
        result = 31 * result + (mp != null ? mp.hashCode() : 0);
        return result;
    }

    public static void main(String[] args) {

    }
}
