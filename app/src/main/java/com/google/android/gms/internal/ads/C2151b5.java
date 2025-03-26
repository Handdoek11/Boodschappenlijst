package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.b5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2151b5 {

    /* renamed from: a, reason: collision with root package name */
    public final String f20806a;

    /* renamed from: b, reason: collision with root package name */
    public final int f20807b;

    /* renamed from: c, reason: collision with root package name */
    public final String f20808c;

    /* renamed from: d, reason: collision with root package name */
    public final Set f20809d;

    private C2151b5(String str, int i8, String str2, Set set) {
        this.f20807b = i8;
        this.f20806a = str;
        this.f20808c = str2;
        this.f20809d = set;
    }

    public static C2151b5 a(String str, int i8) {
        String str2;
        String trim = str.trim();
        AbstractC3796qC.d(!trim.isEmpty());
        int indexOf = trim.indexOf(" ");
        if (indexOf == -1) {
            str2 = "";
        } else {
            String trim2 = trim.substring(indexOf).trim();
            trim = trim.substring(0, indexOf);
            str2 = trim2;
        }
        int i9 = AbstractC2301cW.f21206a;
        String[] split = trim.split("\\.", -1);
        String str3 = split[0];
        HashSet hashSet = new HashSet();
        for (int i10 = 1; i10 < split.length; i10++) {
            hashSet.add(split[i10]);
        }
        return new C2151b5(str3, i8, str2, hashSet);
    }

    public static C2151b5 b() {
        return new C2151b5("", 0, "", Collections.emptySet());
    }
}
