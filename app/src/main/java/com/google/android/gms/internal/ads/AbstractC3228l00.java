package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.l00, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3228l00 {

    /* renamed from: a, reason: collision with root package name */
    public final int f24245a;

    public static String a(int i8) {
        StringBuilder sb = new StringBuilder();
        sb.append((char) ((i8 >> 24) & 255));
        sb.append((char) ((i8 >> 16) & 255));
        sb.append((char) ((i8 >> 8) & 255));
        sb.append((char) (i8 & 255));
        return sb.toString();
    }

    public String toString() {
        return a(this.f24245a);
    }
}
