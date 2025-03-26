package io.ktor.util.converters;

import J6.AbstractC0650j;
import J6.r;

/* loaded from: classes2.dex */
public class DataConversionException extends Exception {
    public DataConversionException() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataConversionException(String str) {
        super(str);
        r.e(str, "message");
    }

    public /* synthetic */ DataConversionException(String str, int i8, AbstractC0650j abstractC0650j) {
        this((i8 & 1) != 0 ? "Invalid data format" : str);
    }
}
