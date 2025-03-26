package com.google.android.gms.internal.ads;

import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Op, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1635Op {

    /* renamed from: b, reason: collision with root package name */
    public static final C1635Op f17950b = new C1635Op(AbstractC4169th0.w());

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC4169th0 f17951a;

    static {
        Integer.toString(0, 36);
    }

    public C1635Op(List list) {
        this.f17951a = AbstractC4169th0.t(list);
    }

    public final AbstractC4169th0 a() {
        return this.f17951a;
    }

    public final boolean b(int i8) {
        for (int i9 = 0; i9 < this.f17951a.size(); i9++) {
            C3640op c3640op = (C3640op) this.f17951a.get(i9);
            if (c3640op.c() && c3640op.a() == i8) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1635Op.class != obj.getClass()) {
            return false;
        }
        return this.f17951a.equals(((C1635Op) obj).f17951a);
    }

    public final int hashCode() {
        return this.f17951a.hashCode();
    }
}
