package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import android.view.accessibility.CaptioningManager;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;

/* renamed from: com.google.android.gms.internal.ads.mo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3420mo {

    /* renamed from: a, reason: collision with root package name */
    private final int f24567a;

    /* renamed from: b, reason: collision with root package name */
    private final int f24568b;

    /* renamed from: c, reason: collision with root package name */
    private final int f24569c;

    /* renamed from: d, reason: collision with root package name */
    private final int f24570d;

    /* renamed from: e, reason: collision with root package name */
    private int f24571e;

    /* renamed from: f, reason: collision with root package name */
    private int f24572f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f24573g;

    /* renamed from: h, reason: collision with root package name */
    private final AbstractC4169th0 f24574h;

    /* renamed from: i, reason: collision with root package name */
    private final AbstractC4169th0 f24575i;

    /* renamed from: j, reason: collision with root package name */
    private final AbstractC4169th0 f24576j;

    /* renamed from: k, reason: collision with root package name */
    private final int f24577k;

    /* renamed from: l, reason: collision with root package name */
    private final int f24578l;

    /* renamed from: m, reason: collision with root package name */
    private final AbstractC4169th0 f24579m;

    /* renamed from: n, reason: collision with root package name */
    private final C1563Mn f24580n;

    /* renamed from: o, reason: collision with root package name */
    private AbstractC4169th0 f24581o;

    /* renamed from: p, reason: collision with root package name */
    private int f24582p;

    /* renamed from: q, reason: collision with root package name */
    private final HashMap f24583q;

    /* renamed from: r, reason: collision with root package name */
    private final HashSet f24584r;

    public C3420mo() {
        this.f24567a = Integer.MAX_VALUE;
        this.f24568b = Integer.MAX_VALUE;
        this.f24569c = Integer.MAX_VALUE;
        this.f24570d = Integer.MAX_VALUE;
        this.f24571e = Integer.MAX_VALUE;
        this.f24572f = Integer.MAX_VALUE;
        this.f24573g = true;
        this.f24574h = AbstractC4169th0.w();
        this.f24575i = AbstractC4169th0.w();
        this.f24576j = AbstractC4169th0.w();
        this.f24577k = Integer.MAX_VALUE;
        this.f24578l = Integer.MAX_VALUE;
        this.f24579m = AbstractC4169th0.w();
        this.f24580n = C1563Mn.f17408b;
        this.f24581o = AbstractC4169th0.w();
        this.f24582p = 0;
        this.f24583q = new HashMap();
        this.f24584r = new HashSet();
    }

    public final C3420mo e(Context context) {
        CaptioningManager captioningManager;
        if ((AbstractC2301cW.f21206a >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
            this.f24582p = 1088;
            Locale locale = captioningManager.getLocale();
            if (locale != null) {
                this.f24581o = AbstractC4169th0.x(locale.toLanguageTag());
            }
        }
        return this;
    }

    public final C3420mo f(int i8, int i9, boolean z7) {
        this.f24571e = i8;
        this.f24572f = i9;
        this.f24573g = true;
        return this;
    }

    protected C3420mo(C1599No c1599No) {
        this.f24567a = Integer.MAX_VALUE;
        this.f24568b = Integer.MAX_VALUE;
        this.f24569c = Integer.MAX_VALUE;
        this.f24570d = Integer.MAX_VALUE;
        this.f24571e = c1599No.f17613i;
        this.f24572f = c1599No.f17614j;
        this.f24573g = c1599No.f17615k;
        this.f24574h = c1599No.f17616l;
        this.f24575i = c1599No.f17617m;
        this.f24576j = c1599No.f17619o;
        this.f24577k = Integer.MAX_VALUE;
        this.f24578l = Integer.MAX_VALUE;
        this.f24579m = c1599No.f17623s;
        this.f24580n = c1599No.f17624t;
        this.f24581o = c1599No.f17625u;
        this.f24582p = c1599No.f17626v;
        this.f24584r = new HashSet(c1599No.f17604C);
        this.f24583q = new HashMap(c1599No.f17603B);
    }
}
