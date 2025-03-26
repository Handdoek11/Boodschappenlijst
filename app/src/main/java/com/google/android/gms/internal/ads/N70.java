package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class N70 {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap f17477a = new HashMap();

    public final M70 a(D70 d70, Context context, C4222u70 c4222u70, T70 t70) {
        M70 m70 = (M70) this.f17477a.get(d70);
        if (m70 != null) {
            return m70;
        }
        C4767z70 c4767z70 = new C4767z70(G70.A0(d70, context));
        M70 m702 = new M70(c4767z70, new V70(c4767z70, c4222u70, t70));
        this.f17477a.put(d70, m702);
        return m702;
    }
}
