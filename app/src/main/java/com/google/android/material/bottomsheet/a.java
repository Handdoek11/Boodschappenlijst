package com.google.android.material.bottomsheet;

import android.view.View;
import java.util.Iterator;
import java.util.List;
import z0.C7036l0;
import z0.C7061y0;

/* loaded from: classes2.dex */
class a extends C7036l0.b {

    /* renamed from: c, reason: collision with root package name */
    private final View f31512c;

    /* renamed from: d, reason: collision with root package name */
    private int f31513d;

    /* renamed from: e, reason: collision with root package name */
    private int f31514e;

    /* renamed from: f, reason: collision with root package name */
    private final int[] f31515f;

    public a(View view) {
        super(0);
        this.f31515f = new int[2];
        this.f31512c = view;
    }

    @Override // z0.C7036l0.b
    public void b(C7036l0 c7036l0) {
        this.f31512c.setTranslationY(0.0f);
    }

    @Override // z0.C7036l0.b
    public void c(C7036l0 c7036l0) {
        this.f31512c.getLocationOnScreen(this.f31515f);
        this.f31513d = this.f31515f[1];
    }

    @Override // z0.C7036l0.b
    public C7061y0 d(C7061y0 c7061y0, List list) {
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if ((((C7036l0) it.next()).c() & C7061y0.l.a()) != 0) {
                this.f31512c.setTranslationY(E3.a.c(this.f31514e, 0, r0.b()));
                break;
            }
        }
        return c7061y0;
    }

    @Override // z0.C7036l0.b
    public C7036l0.a e(C7036l0 c7036l0, C7036l0.a aVar) {
        this.f31512c.getLocationOnScreen(this.f31515f);
        int i8 = this.f31513d - this.f31515f[1];
        this.f31514e = i8;
        this.f31512c.setTranslationY(i8);
        return aVar;
    }
}
