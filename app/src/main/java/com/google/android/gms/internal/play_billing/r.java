package com.google.android.gms.internal.play_billing;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    private final String f29977a;

    /* renamed from: b, reason: collision with root package name */
    private final C5167p f29978b;

    /* renamed from: c, reason: collision with root package name */
    private C5167p f29979c;

    /* synthetic */ r(String str, AbstractC5184s abstractC5184s) {
        C5167p c5167p = new C5167p();
        this.f29978b = c5167p;
        this.f29979c = c5167p;
        str.getClass();
        this.f29977a = str;
    }

    public final r a(Object obj) {
        C5167p c5167p = new C5167p();
        this.f29979c.f29961b = c5167p;
        this.f29979c = c5167p;
        c5167p.f29960a = obj;
        return this;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.f29977a);
        sb.append('{');
        C5167p c5167p = this.f29978b.f29961b;
        String str = "";
        while (c5167p != null) {
            Object obj = c5167p.f29960a;
            sb.append(str);
            if (obj == null || !obj.getClass().isArray()) {
                sb.append(obj);
            } else {
                sb.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r3.length() - 1);
            }
            c5167p = c5167p.f29961b;
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }
}
