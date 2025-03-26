package D2;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import w2.t;

/* loaded from: classes.dex */
public final class Y1 {

    /* renamed from: a, reason: collision with root package name */
    private Bundle f1195a = new Bundle();

    /* renamed from: b, reason: collision with root package name */
    private List f1196b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private boolean f1197c = false;

    /* renamed from: d, reason: collision with root package name */
    private int f1198d = -1;

    /* renamed from: e, reason: collision with root package name */
    private final Bundle f1199e = new Bundle();

    /* renamed from: f, reason: collision with root package name */
    private final Bundle f1200f = new Bundle();

    /* renamed from: g, reason: collision with root package name */
    private final List f1201g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    private int f1202h = -1;

    /* renamed from: i, reason: collision with root package name */
    private String f1203i = null;

    /* renamed from: j, reason: collision with root package name */
    private final List f1204j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    private int f1205k = 60000;

    /* renamed from: l, reason: collision with root package name */
    private final int f1206l = t.b.DEFAULT.a();

    /* renamed from: m, reason: collision with root package name */
    private long f1207m = 0;

    public final X1 a() {
        Bundle bundle = this.f1199e;
        Bundle bundle2 = this.f1195a;
        Bundle bundle3 = this.f1200f;
        return new X1(8, -1L, bundle2, -1, this.f1196b, this.f1197c, this.f1198d, false, null, null, null, null, bundle, bundle3, this.f1201g, null, null, false, null, this.f1202h, this.f1203i, this.f1204j, this.f1205k, null, this.f1206l, this.f1207m);
    }

    public final Y1 b(Bundle bundle) {
        this.f1195a = bundle;
        return this;
    }

    public final Y1 c(int i8) {
        this.f1205k = i8;
        return this;
    }

    public final Y1 d(boolean z7) {
        this.f1197c = z7;
        return this;
    }

    public final Y1 e(List list) {
        this.f1196b = list;
        return this;
    }

    public final Y1 f(String str) {
        this.f1203i = str;
        return this;
    }

    public final Y1 g(long j8) {
        this.f1207m = j8;
        return this;
    }

    public final Y1 h(int i8) {
        this.f1198d = i8;
        return this;
    }

    public final Y1 i(int i8) {
        this.f1202h = i8;
        return this;
    }
}
