package com.google.android.gms.ads.nativead;

import android.os.Bundle;
import w2.u;

/* loaded from: classes.dex */
public abstract class NativeAd {

    public static abstract class a {
    }

    public static abstract class b {
    }

    public interface c {
        void a(NativeAd nativeAd);
    }

    public abstract String a();

    public abstract String b();

    public abstract u c();

    protected abstract Object d();

    protected abstract void recordEvent(Bundle bundle);
}
