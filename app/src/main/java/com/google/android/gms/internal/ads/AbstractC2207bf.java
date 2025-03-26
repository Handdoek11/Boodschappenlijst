package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.bf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2207bf {

    /* renamed from: a, reason: collision with root package name */
    private final int f20904a;

    /* renamed from: b, reason: collision with root package name */
    private final String f20905b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f20906c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f20907d;

    /* synthetic */ AbstractC2207bf(int i8, String str, Object obj, Object obj2, AbstractC2098af abstractC2098af) {
        this.f20904a = i8;
        this.f20905b = str;
        this.f20906c = obj;
        this.f20907d = obj2;
        D2.A.a().d(this);
    }

    public static AbstractC2207bf f(int i8, String str, float f8, float f9) {
        return new C1969Ye(1, str, Float.valueOf(f8), Float.valueOf(f9));
    }

    public static AbstractC2207bf g(int i8, String str, int i9, int i10) {
        return new C1899We(1, str, Integer.valueOf(i9), Integer.valueOf(i10));
    }

    public static AbstractC2207bf h(int i8, String str, long j8, long j9) {
        return new C1934Xe(1, str, Long.valueOf(j8), Long.valueOf(j9));
    }

    public static AbstractC2207bf i(int i8, String str) {
        C2004Ze c2004Ze = new C2004Ze(1, "gads:sdk_core_constants:experiment_id", null, null);
        D2.A.a().c(c2004Ze);
        return c2004Ze;
    }

    protected abstract Object a(JSONObject jSONObject);

    public abstract Object b(Bundle bundle);

    protected abstract Object c(SharedPreferences sharedPreferences);

    public abstract void d(SharedPreferences.Editor editor, Object obj);

    public final int e() {
        return this.f20904a;
    }

    public final Object j() {
        return D2.A.c().a(this);
    }

    public final Object k() {
        return D2.A.c().f() ? this.f20907d : this.f20906c;
    }

    public final String l() {
        return this.f20905b;
    }
}
