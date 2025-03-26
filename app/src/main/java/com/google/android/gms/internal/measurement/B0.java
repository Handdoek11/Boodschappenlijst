package com.google.android.gms.internal.measurement;

import java.net.URL;
import java.net.URLConnection;

/* loaded from: classes.dex */
final class B0 extends C0 {
    @Override // com.google.android.gms.internal.measurement.C0
    public final URLConnection b(URL url, String str) {
        return url.openConnection();
    }

    private B0() {
    }
}
