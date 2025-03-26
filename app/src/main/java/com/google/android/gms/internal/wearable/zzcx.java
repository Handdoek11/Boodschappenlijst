package com.google.android.gms.internal.wearable;

import java.io.IOException;

/* loaded from: classes2.dex */
public class zzcx extends IOException {
    public zzcx(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }

    public zzcx(String str) {
        super(str);
    }
}
