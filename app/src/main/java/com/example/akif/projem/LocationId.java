
package com.example.akif.projem;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LocationId {

    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("il")
    @Expose
    private String il;
    @SerializedName("ilce")
    @Expose
    private String ilce;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIl() {
        return il;
    }

    public void setIl(String il) {
        this.il = il;
    }

    public String getIlce() {
        return ilce;
    }

    public void setIlce(String ilce) {
        this.ilce = ilce;
    }

}
