package D2;

import android.content.Context;
import android.os.Bundle;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: D2.f1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0501f1 {

    /* renamed from: a, reason: collision with root package name */
    private final String f1250a;

    /* renamed from: b, reason: collision with root package name */
    private final List f1251b;

    /* renamed from: c, reason: collision with root package name */
    private final Set f1252c;

    /* renamed from: d, reason: collision with root package name */
    private final Bundle f1253d;

    /* renamed from: e, reason: collision with root package name */
    private final Map f1254e;

    /* renamed from: f, reason: collision with root package name */
    private final String f1255f;

    /* renamed from: g, reason: collision with root package name */
    private final String f1256g;

    /* renamed from: h, reason: collision with root package name */
    private final int f1257h;

    /* renamed from: i, reason: collision with root package name */
    private final Set f1258i;

    /* renamed from: j, reason: collision with root package name */
    private final Bundle f1259j;

    /* renamed from: k, reason: collision with root package name */
    private final Set f1260k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f1261l;

    /* renamed from: m, reason: collision with root package name */
    private final String f1262m;

    /* renamed from: n, reason: collision with root package name */
    private final int f1263n;

    /* renamed from: o, reason: collision with root package name */
    private long f1264o = 0;

    public C0501f1(C0498e1 c0498e1, R2.a aVar) {
        this.f1250a = c0498e1.f1238g;
        this.f1251b = c0498e1.f1239h;
        this.f1252c = DesugarCollections.unmodifiableSet(c0498e1.f1232a);
        this.f1253d = c0498e1.f1233b;
        this.f1254e = DesugarCollections.unmodifiableMap(c0498e1.f1234c);
        this.f1255f = c0498e1.f1240i;
        this.f1256g = c0498e1.f1241j;
        this.f1257h = c0498e1.f1242k;
        this.f1258i = DesugarCollections.unmodifiableSet(c0498e1.f1235d);
        this.f1259j = c0498e1.f1236e;
        this.f1260k = DesugarCollections.unmodifiableSet(c0498e1.f1237f);
        this.f1261l = c0498e1.f1243l;
        this.f1262m = c0498e1.f1244m;
        this.f1263n = c0498e1.f1245n;
    }

    public final int a() {
        return this.f1263n;
    }

    public final int b() {
        return this.f1257h;
    }

    public final long c() {
        return this.f1264o;
    }

    public final Bundle d() {
        return this.f1259j;
    }

    public final Bundle e(Class cls) {
        return this.f1253d.getBundle(cls.getName());
    }

    public final Bundle f() {
        return this.f1253d;
    }

    public final R2.a g() {
        return null;
    }

    public final String h() {
        return this.f1262m;
    }

    public final String i() {
        return this.f1250a;
    }

    public final String j() {
        return this.f1255f;
    }

    public final String k() {
        return this.f1256g;
    }

    public final List l() {
        return new ArrayList(this.f1251b);
    }

    public final Set m() {
        return this.f1260k;
    }

    public final Set n() {
        return this.f1252c;
    }

    public final void o(long j8) {
        this.f1264o = j8;
    }

    public final boolean p() {
        return this.f1261l;
    }

    public final boolean q(Context context) {
        w2.t e8 = C0528o1.h().e();
        C0555y.b();
        Set set = this.f1258i;
        String C7 = H2.g.C(context);
        return set.contains(C7) || e8.e().contains(C7);
    }
}
