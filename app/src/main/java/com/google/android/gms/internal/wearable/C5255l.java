package com.google.android.gms.internal.wearable;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.wearable.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5255l {

    /* renamed from: a, reason: collision with root package name */
    private final String f30201a;

    /* renamed from: b, reason: collision with root package name */
    private final C5253k f30202b;

    /* renamed from: c, reason: collision with root package name */
    private C5253k f30203c;

    /* synthetic */ C5255l(String str, AbstractC5257m abstractC5257m) {
        C5253k c5253k = new C5253k();
        this.f30202b = c5253k;
        this.f30203c = c5253k;
        str.getClass();
        this.f30201a = str;
    }

    public final C5255l a(String str, int i8) {
        String valueOf = String.valueOf(i8);
        C5251j c5251j = new C5251j(null);
        this.f30203c.f30198c = c5251j;
        this.f30203c = c5251j;
        c5251j.f30197b = valueOf;
        c5251j.f30196a = "filterType";
        return this;
    }

    public final C5255l b(String str, Object obj) {
        C5253k c5253k = new C5253k();
        this.f30203c.f30198c = c5253k;
        this.f30203c = c5253k;
        c5253k.f30197b = obj;
        c5253k.f30196a = str;
        return this;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.f30201a);
        sb.append('{');
        C5253k c5253k = this.f30202b.f30198c;
        String str = "";
        while (c5253k != null) {
            Object obj = c5253k.f30197b;
            sb.append(str);
            String str2 = c5253k.f30196a;
            if (str2 != null) {
                sb.append(str2);
                sb.append('=');
            }
            if (obj == null || !obj.getClass().isArray()) {
                sb.append(obj);
            } else {
                sb.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r3.length() - 1);
            }
            c5253k = c5253k.f30198c;
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }
}
