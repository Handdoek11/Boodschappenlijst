package com.google.android.gms.internal.ads;

import android.location.Location;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import z2.C7070e;

/* renamed from: com.google.android.gms.internal.ads.hm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2873hm implements J2.p {

    /* renamed from: a, reason: collision with root package name */
    private final Date f22606a;

    /* renamed from: b, reason: collision with root package name */
    private final int f22607b;

    /* renamed from: c, reason: collision with root package name */
    private final Set f22608c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f22609d;

    /* renamed from: e, reason: collision with root package name */
    private final Location f22610e;

    /* renamed from: f, reason: collision with root package name */
    private final int f22611f;

    /* renamed from: g, reason: collision with root package name */
    private final C1553Mg f22612g;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f22614i;

    /* renamed from: h, reason: collision with root package name */
    private final List f22613h = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    private final Map f22615j = new HashMap();

    public C2873hm(Date date, int i8, Set set, Location location, boolean z7, int i9, C1553Mg c1553Mg, List list, boolean z8, int i10, String str) {
        this.f22606a = date;
        this.f22607b = i8;
        this.f22608c = set;
        this.f22610e = location;
        this.f22609d = z7;
        this.f22611f = i9;
        this.f22612g = c1553Mg;
        this.f22614i = z8;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                if (str2.startsWith("custom:")) {
                    String[] split = str2.split(":", 3);
                    if (split.length == 3) {
                        if ("true".equals(split[2])) {
                            this.f22615j.put(split[1], Boolean.TRUE);
                        } else if ("false".equals(split[2])) {
                            this.f22615j.put(split[1], Boolean.FALSE);
                        }
                    }
                } else {
                    this.f22613h.add(str2);
                }
            }
        }
    }

    @Override // J2.p
    public final com.google.android.gms.ads.nativead.c a() {
        return C1553Mg.A0(this.f22612g);
    }

    @Override // J2.e
    public final int b() {
        return this.f22611f;
    }

    @Override // J2.p
    public final boolean c() {
        return this.f22613h.contains("6");
    }

    @Override // J2.e
    public final boolean d() {
        return this.f22614i;
    }

    @Override // J2.e
    public final boolean e() {
        return this.f22609d;
    }

    @Override // J2.e
    public final Set f() {
        return this.f22608c;
    }

    @Override // J2.p
    public final C7070e g() {
        C7070e.a aVar = new C7070e.a();
        C1553Mg c1553Mg = this.f22612g;
        if (c1553Mg == null) {
            return aVar.a();
        }
        int i8 = c1553Mg.f17387o;
        if (i8 == 2) {
            aVar.b(c1553Mg.f17391v);
        } else {
            if (i8 != 3) {
                if (i8 == 4) {
                    aVar.e(c1553Mg.f17393x);
                    aVar.d(c1553Mg.f17394y);
                }
            }
            D2.Q1 q12 = c1553Mg.f17392w;
            if (q12 != null) {
                aVar.h(new w2.x(q12));
            }
            aVar.b(c1553Mg.f17391v);
        }
        aVar.g(c1553Mg.f17388s);
        aVar.c(c1553Mg.f17389t);
        aVar.f(c1553Mg.f17390u);
        return aVar.a();
    }

    @Override // J2.p
    public final Map zza() {
        return this.f22615j;
    }

    @Override // J2.p
    public final boolean zzb() {
        return this.f22613h.contains("3");
    }
}
