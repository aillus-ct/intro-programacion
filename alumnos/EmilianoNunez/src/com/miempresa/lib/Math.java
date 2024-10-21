package com.miempresa.lib;

public class Math {
    public int pow(int n, int e){
        int res = 1;
        for(int i = 0; i<e; i++){
            res = res * n;
        }
        return res;
    }
}
