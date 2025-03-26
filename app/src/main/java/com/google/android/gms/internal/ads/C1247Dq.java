package com.google.android.gms.internal.ads;

import java.math.BigInteger;

/* renamed from: com.google.android.gms.internal.ads.Dq, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1247Dq {

    /* renamed from: a, reason: collision with root package name */
    private BigInteger f14569a = BigInteger.ONE;

    /* renamed from: b, reason: collision with root package name */
    private String f14570b = "0";

    public final synchronized String a() {
        String bigInteger;
        bigInteger = this.f14569a.toString();
        this.f14569a = this.f14569a.add(BigInteger.ONE);
        this.f14570b = bigInteger;
        return bigInteger;
    }

    public final synchronized String b() {
        return this.f14570b;
    }
}
