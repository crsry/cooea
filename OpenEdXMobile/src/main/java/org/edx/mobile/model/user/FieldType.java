package org.edx.mobile.model.user;

import com.google.gson.annotations.SerializedName;

public enum FieldType {
    @SerializedName("switch")
    SWITCH,

    @SerializedName("select")
    SELECT,

    @SerializedName("textarea")
    TEXTAREA;
}
