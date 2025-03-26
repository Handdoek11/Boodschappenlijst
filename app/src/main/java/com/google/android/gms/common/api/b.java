package com.google.android.gms.common.api;

import A3.AbstractC0376j;
import A3.C0377k;
import X2.AbstractServiceConnectionC0760h;
import X2.B;
import X2.C0753a;
import X2.C0754b;
import X2.k;
import X2.p;
import Z2.AbstractC0765d;
import Z2.C0766e;
import Z2.r;
import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.appcompat.app.E;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.AbstractC1090b;
import com.google.android.gms.common.api.internal.AbstractC1093e;
import com.google.android.gms.common.api.internal.AbstractC1096h;
import com.google.android.gms.common.api.internal.C1091c;
import com.google.android.gms.common.api.internal.C1092d;
import com.google.android.gms.common.api.internal.C1095g;
import com.google.android.gms.common.api.internal.C1101m;
import com.google.android.gms.common.api.internal.s;
import java.util.Collections;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    private final Context f13232a;

    /* renamed from: b, reason: collision with root package name */
    private final String f13233b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.common.api.a f13234c;

    /* renamed from: d, reason: collision with root package name */
    private final a.d f13235d;

    /* renamed from: e, reason: collision with root package name */
    private final C0754b f13236e;

    /* renamed from: f, reason: collision with root package name */
    private final Looper f13237f;

    /* renamed from: g, reason: collision with root package name */
    private final int f13238g;

    /* renamed from: h, reason: collision with root package name */
    private final c f13239h;

    /* renamed from: i, reason: collision with root package name */
    private final k f13240i;

    /* renamed from: j, reason: collision with root package name */
    protected final C1091c f13241j;

    public static class a {

        /* renamed from: c, reason: collision with root package name */
        public static final a f13242c = new C0227a().a();

        /* renamed from: a, reason: collision with root package name */
        public final k f13243a;

        /* renamed from: b, reason: collision with root package name */
        public final Looper f13244b;

        /* renamed from: com.google.android.gms.common.api.b$a$a, reason: collision with other inner class name */
        public static class C0227a {

            /* renamed from: a, reason: collision with root package name */
            private k f13245a;

            /* renamed from: b, reason: collision with root package name */
            private Looper f13246b;

            public a a() {
                if (this.f13245a == null) {
                    this.f13245a = new C0753a();
                }
                if (this.f13246b == null) {
                    this.f13246b = Looper.getMainLooper();
                }
                return new a(this.f13245a, this.f13246b);
            }
        }

        private a(k kVar, Account account, Looper looper) {
            this.f13243a = kVar;
            this.f13244b = looper;
        }
    }

    public b(Activity activity, com.google.android.gms.common.api.a aVar, a.d dVar, a aVar2) {
        this(activity, activity, aVar, dVar, aVar2);
    }

    private final AbstractC1090b w(int i8, AbstractC1090b abstractC1090b) {
        abstractC1090b.k();
        this.f13241j.B(this, i8, abstractC1090b);
        return abstractC1090b;
    }

    private final AbstractC0376j x(int i8, AbstractC1096h abstractC1096h) {
        C0377k c0377k = new C0377k();
        this.f13241j.C(this, i8, abstractC1096h, c0377k, this.f13240i);
        return c0377k.a();
    }

    public c g() {
        return this.f13239h;
    }

    protected C0766e.a h() {
        C0766e.a aVar = new C0766e.a();
        aVar.d(null);
        aVar.c(Collections.emptySet());
        aVar.e(this.f13232a.getClass().getName());
        aVar.b(this.f13232a.getPackageName());
        return aVar;
    }

    public AbstractC0376j i(AbstractC1096h abstractC1096h) {
        return x(2, abstractC1096h);
    }

    public AbstractC0376j j(AbstractC1096h abstractC1096h) {
        return x(0, abstractC1096h);
    }

    public AbstractC1090b k(AbstractC1090b abstractC1090b) {
        w(0, abstractC1090b);
        return abstractC1090b;
    }

    public AbstractC0376j l(C1095g c1095g) {
        r.l(c1095g);
        r.m(c1095g.f13318a.b(), "Listener has already been released.");
        r.m(c1095g.f13319b.a(), "Listener has already been released.");
        return this.f13241j.v(this, c1095g.f13318a, c1095g.f13319b, c1095g.f13320c);
    }

    public AbstractC0376j m(C1092d.a aVar, int i8) {
        r.m(aVar, "Listener key cannot be null.");
        return this.f13241j.w(this, aVar, i8);
    }

    public AbstractC0376j n(AbstractC1096h abstractC1096h) {
        return x(1, abstractC1096h);
    }

    protected String o(Context context) {
        return null;
    }

    public final C0754b p() {
        return this.f13236e;
    }

    protected String q() {
        return this.f13233b;
    }

    public Looper r() {
        return this.f13237f;
    }

    public C1092d s(Object obj, String str) {
        return AbstractC1093e.a(obj, this.f13237f, str);
    }

    public final int t() {
        return this.f13238g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final a.f u(Looper looper, s sVar) {
        C0766e a8 = h().a();
        a.f b8 = ((a.AbstractC0225a) r.l(this.f13234c.a())).b(this.f13232a, looper, a8, this.f13235d, sVar, sVar);
        String q8 = q();
        if (q8 != null && (b8 instanceof AbstractC0765d)) {
            ((AbstractC0765d) b8).P(q8);
        }
        if (q8 == null || !(b8 instanceof AbstractServiceConnectionC0760h)) {
            return b8;
        }
        E.a(b8);
        throw null;
    }

    public final B v(Context context, Handler handler) {
        return new B(context, handler, h().a());
    }

    private b(Context context, Activity activity, com.google.android.gms.common.api.a aVar, a.d dVar, a aVar2) {
        r.m(context, "Null context is not permitted.");
        r.m(aVar, "Api must not be null.");
        r.m(aVar2, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context context2 = (Context) r.m(context.getApplicationContext(), "The provided context did not have an application context.");
        this.f13232a = context2;
        String attributionTag = Build.VERSION.SDK_INT >= 30 ? context.getAttributionTag() : o(context);
        this.f13233b = attributionTag;
        this.f13234c = aVar;
        this.f13235d = dVar;
        this.f13237f = aVar2.f13244b;
        C0754b a8 = C0754b.a(aVar, dVar, attributionTag);
        this.f13236e = a8;
        this.f13239h = new p(this);
        C1091c t7 = C1091c.t(context2);
        this.f13241j = t7;
        this.f13238g = t7.k();
        this.f13240i = aVar2.f13243a;
        if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            C1101m.u(activity, t7, a8);
        }
        t7.G(this);
    }

    public b(Context context, com.google.android.gms.common.api.a aVar, a.d dVar, a aVar2) {
        this(context, null, aVar, dVar, aVar2);
    }
}
