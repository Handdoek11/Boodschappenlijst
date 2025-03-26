package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import q.C6407k;

/* loaded from: classes.dex */
public final class SI {

    /* renamed from: h, reason: collision with root package name */
    public static final SI f18855h = new SI(new QI());

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4604xh f18856a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4277uh f18857b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC1521Lh f18858c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC1415Ih f18859d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC2651fk f18860e;

    /* renamed from: f, reason: collision with root package name */
    private final C6407k f18861f;

    /* renamed from: g, reason: collision with root package name */
    private final C6407k f18862g;

    public final InterfaceC4277uh a() {
        return this.f18857b;
    }

    public final InterfaceC4604xh b() {
        return this.f18856a;
    }

    public final InterfaceC1163Bh c(String str) {
        return (InterfaceC1163Bh) this.f18862g.get(str);
    }

    public final InterfaceC1271Eh d(String str) {
        if (str == null) {
            return null;
        }
        return (InterfaceC1271Eh) this.f18861f.get(str);
    }

    public final InterfaceC1415Ih e() {
        return this.f18859d;
    }

    public final InterfaceC1521Lh f() {
        return this.f18858c;
    }

    public final InterfaceC2651fk g() {
        return this.f18860e;
    }

    public final ArrayList h() {
        ArrayList arrayList = new ArrayList(this.f18861f.size());
        for (int i8 = 0; i8 < this.f18861f.size(); i8++) {
            arrayList.add((String) this.f18861f.g(i8));
        }
        return arrayList;
    }

    public final ArrayList i() {
        ArrayList arrayList = new ArrayList();
        if (this.f18858c != null) {
            arrayList.add(Integer.toString(6));
        }
        if (this.f18856a != null) {
            arrayList.add(Integer.toString(1));
        }
        if (this.f18857b != null) {
            arrayList.add(Integer.toString(2));
        }
        if (!this.f18861f.isEmpty()) {
            arrayList.add(Integer.toString(3));
        }
        if (this.f18860e != null) {
            arrayList.add(Integer.toString(7));
        }
        return arrayList;
    }

    private SI(QI qi) {
        this.f18856a = qi.f18443a;
        this.f18857b = qi.f18444b;
        this.f18858c = qi.f18445c;
        this.f18861f = new C6407k(qi.f18448f);
        this.f18862g = new C6407k(qi.f18449g);
        this.f18859d = qi.f18446d;
        this.f18860e = qi.f18447e;
    }
}
