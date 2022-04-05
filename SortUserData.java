package com.sebone.excr.collection.basic;

import java.util.ArrayList;

public interface SortUserData {

    /* interface name :- SortUserData 
    *  objective :- method sort the user data by particular keyword 	
    *  method is absract method
    */
    ArrayList<UserData> sortByUserName(ArrayList<UserData>userData);
    ArrayList<UserData> sortByRollNumber(ArrayList<UserData>userData);
    ArrayList<UserData> sortByAge(ArrayList<UserData>userData);
   
}
