package androidx.compose.runtime.snapshots;

import I6.l;
import J6.AbstractC0650j;
import u.C6806a;

/* loaded from: classes.dex */
public abstract class b extends c {

    /* renamed from: n, reason: collision with root package name */
    private static final a f8082n = new a(null);

    /* renamed from: o, reason: collision with root package name */
    public static final int f8083o = 8;

    /* renamed from: p, reason: collision with root package name */
    private static final int[] f8084p = new int[0];

    /* renamed from: g, reason: collision with root package name */
    private final l f8085g;

    /* renamed from: h, reason: collision with root package name */
    private final l f8086h;

    /* renamed from: i, reason: collision with root package name */
    private int f8087i;

    /* renamed from: j, reason: collision with root package name */
    private C6806a f8088j;

    /* renamed from: k, reason: collision with root package name */
    private d f8089k;

    /* renamed from: l, reason: collision with root package name */
    private int[] f8090l;

    /* renamed from: m, reason: collision with root package name */
    private int f8091m;

    private static final class a {
        public /* synthetic */ a(AbstractC0650j abstractC0650j) {
            this();
        }

        private a() {
        }
    }

    public b(int i8, d dVar, l lVar, l lVar2) {
        super(i8, dVar, null);
        this.f8085g = lVar;
        this.f8086h = lVar2;
        this.f8089k = d.f8098v.a();
        this.f8090l = f8084p;
        this.f8091m = 1;
    }

    @Override // androidx.compose.runtime.snapshots.c
    public abstract void a();

    @Override // androidx.compose.runtime.snapshots.c
    public l d() {
        return this.f8085g;
    }

    @Override // androidx.compose.runtime.snapshots.c
    public boolean e() {
        return false;
    }

    @Override // androidx.compose.runtime.snapshots.c
    public int f() {
        return this.f8087i;
    }

    @Override // androidx.compose.runtime.snapshots.c
    public l g() {
        return this.f8086h;
    }

    @Override // androidx.compose.runtime.snapshots.c
    public void i(z.g gVar) {
        C6806a n8 = n();
        if (n8 == null) {
            n8 = new C6806a();
            o(n8);
        }
        n8.add(gVar);
    }

    @Override // androidx.compose.runtime.snapshots.c
    public void m(int i8) {
        this.f8087i = i8;
    }

    public C6806a n() {
        return this.f8088j;
    }

    public void o(C6806a c6806a) {
        this.f8088j = c6806a;
    }
}
