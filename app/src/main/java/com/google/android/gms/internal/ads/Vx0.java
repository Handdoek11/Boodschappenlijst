package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public abstract class Vx0 {
    public static Vx0 b(Class cls) {
        return System.getProperty("java.vm.name").equalsIgnoreCase("Dalvik") ? new Qx0(cls.getSimpleName()) : new Sx0(cls.getSimpleName());
    }

    public abstract void a(String str);
}
