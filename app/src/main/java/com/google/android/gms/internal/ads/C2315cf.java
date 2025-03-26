package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.cf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2315cf {

    /* renamed from: a, reason: collision with root package name */
    private final List f21260a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final List f21261b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final List f21262c = new ArrayList();

    public final List a() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f21261b.iterator();
        while (it.hasNext()) {
            String str = (String) D2.A.c().a((AbstractC2207bf) it.next());
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(str);
            }
        }
        arrayList.addAll(AbstractC3293lf.a());
        return arrayList;
    }

    public final List b() {
        List a8 = a();
        Iterator it = this.f21262c.iterator();
        while (it.hasNext()) {
            String str = (String) D2.A.c().a((AbstractC2207bf) it.next());
            if (!TextUtils.isEmpty(str)) {
                a8.add(str);
            }
        }
        a8.addAll(AbstractC3293lf.b());
        return a8;
    }

    public final void c(AbstractC2207bf abstractC2207bf) {
        this.f21261b.add(abstractC2207bf);
    }

    public final void d(AbstractC2207bf abstractC2207bf) {
        this.f21260a.add(abstractC2207bf);
    }

    public final void e(SharedPreferences.Editor editor, int i8, JSONObject jSONObject) {
        for (AbstractC2207bf abstractC2207bf : this.f21260a) {
            if (abstractC2207bf.e() == 1) {
                abstractC2207bf.d(editor, abstractC2207bf.a(jSONObject));
            }
        }
        if (jSONObject != null) {
            editor.putString("flag_configuration", jSONObject.toString());
        } else {
            H2.p.d("Flag Json is null.");
        }
    }
}
