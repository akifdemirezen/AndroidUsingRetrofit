
package com.example.akif.projem;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Example {

    @SerializedName("USERS")
    @Expose
    private List<USER> dataList = new ArrayList<>();

    public List<USER> getDataList() {
        return dataList;
    }

   /* public void setUSERS(List<USER> uSERS) {
        this.uSERS = uSERS;
    }  */

}
