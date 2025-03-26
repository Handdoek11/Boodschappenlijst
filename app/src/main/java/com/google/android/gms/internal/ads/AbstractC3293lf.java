package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.lf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3293lf {
    static List a() {
        ArrayList arrayList = new ArrayList();
        c(arrayList, C1831Uf.c("gad:dynamite_module:experiment_id", ""));
        c(arrayList, AbstractC2969ig.f23022a);
        c(arrayList, AbstractC2969ig.f23023b);
        c(arrayList, AbstractC2969ig.f23024c);
        c(arrayList, AbstractC2969ig.f23025d);
        c(arrayList, AbstractC2969ig.f23026e);
        c(arrayList, AbstractC2969ig.f23042u);
        c(arrayList, AbstractC2969ig.f23027f);
        c(arrayList, AbstractC2969ig.f23034m);
        c(arrayList, AbstractC2969ig.f23035n);
        c(arrayList, AbstractC2969ig.f23036o);
        c(arrayList, AbstractC2969ig.f23037p);
        c(arrayList, AbstractC2969ig.f23038q);
        c(arrayList, AbstractC2969ig.f23039r);
        c(arrayList, AbstractC2969ig.f23040s);
        c(arrayList, AbstractC2969ig.f23041t);
        c(arrayList, AbstractC2969ig.f23028g);
        c(arrayList, AbstractC2969ig.f23029h);
        c(arrayList, AbstractC2969ig.f23030i);
        c(arrayList, AbstractC2969ig.f23031j);
        c(arrayList, AbstractC2969ig.f23032k);
        c(arrayList, AbstractC2969ig.f23033l);
        return arrayList;
    }

    static List b() {
        ArrayList arrayList = new ArrayList();
        c(arrayList, AbstractC4493wg.f27524a);
        return arrayList;
    }

    private static void c(List list, C1831Uf c1831Uf) {
        String str = (String) c1831Uf.e();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        list.add(str);
    }
}
