package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.Mf0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1552Mf0 {

    /* renamed from: a, reason: collision with root package name */
    private final String f17382a;

    /* renamed from: b, reason: collision with root package name */
    private final C1518Lf0 f17383b;

    /* renamed from: c, reason: collision with root package name */
    private C1518Lf0 f17384c;

    /* synthetic */ C1552Mf0(String str, AbstractC1587Nf0 abstractC1587Nf0) {
        C1518Lf0 c1518Lf0 = new C1518Lf0();
        this.f17383b = c1518Lf0;
        this.f17384c = c1518Lf0;
        str.getClass();
        this.f17382a = str;
    }

    public final C1552Mf0 a(Object obj) {
        C1518Lf0 c1518Lf0 = new C1518Lf0();
        this.f17384c.f16869b = c1518Lf0;
        this.f17384c = c1518Lf0;
        c1518Lf0.f16868a = obj;
        return this;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.f17382a);
        sb.append('{');
        C1518Lf0 c1518Lf0 = this.f17383b.f16869b;
        String str = "";
        while (c1518Lf0 != null) {
            Object obj = c1518Lf0.f16868a;
            sb.append(str);
            if (obj == null || !obj.getClass().isArray()) {
                sb.append(obj);
            } else {
                sb.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r3.length() - 1);
            }
            c1518Lf0 = c1518Lf0.f16869b;
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }
}
