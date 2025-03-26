package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import w2.C6882h;

/* loaded from: classes.dex */
public abstract class R60 {
    public static D2.c2 a(Context context, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C3893r60 c3893r60 = (C3893r60) it.next();
            if (c3893r60.f26096c) {
                arrayList.add(C6882h.f44278p);
            } else {
                arrayList.add(new C6882h(c3893r60.f26094a, c3893r60.f26095b));
            }
        }
        return new D2.c2(context, (C6882h[]) arrayList.toArray(new C6882h[arrayList.size()]));
    }

    public static C3893r60 b(D2.c2 c2Var) {
        return c2Var.f1229z ? new C3893r60(-3, 0, true) : new C3893r60(c2Var.f1225v, c2Var.f1222s, false);
    }
}
