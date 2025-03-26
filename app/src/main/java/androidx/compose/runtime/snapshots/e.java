package androidx.compose.runtime.snapshots;

import I6.l;
import I6.p;
import J6.r;
import J6.s;
import androidx.compose.runtime.snapshots.c;
import androidx.compose.runtime.snapshots.d;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;
import t.C6765c;
import t.L;
import t.P;
import u.C6806a;
import x6.C6916E;
import y6.AbstractC6987o;
import z.C6993b;
import z.i;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    private static final l f8110a = b.f8123o;

    /* renamed from: b, reason: collision with root package name */
    private static final L f8111b = new L();

    /* renamed from: c, reason: collision with root package name */
    private static final Object f8112c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private static androidx.compose.runtime.snapshots.d f8113d;

    /* renamed from: e, reason: collision with root package name */
    private static int f8114e;

    /* renamed from: f, reason: collision with root package name */
    private static final C6993b f8115f;

    /* renamed from: g, reason: collision with root package name */
    private static final z.f f8116g;

    /* renamed from: h, reason: collision with root package name */
    private static List f8117h;

    /* renamed from: i, reason: collision with root package name */
    private static List f8118i;

    /* renamed from: j, reason: collision with root package name */
    private static final AtomicReference f8119j;

    /* renamed from: k, reason: collision with root package name */
    private static final androidx.compose.runtime.snapshots.c f8120k;

    /* renamed from: l, reason: collision with root package name */
    private static C6765c f8121l;

    static final class a extends s implements l {

        /* renamed from: o, reason: collision with root package name */
        public static final a f8122o = new a();

        a() {
            super(1);
        }

        public final void b(androidx.compose.runtime.snapshots.d dVar) {
        }

        @Override // I6.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((androidx.compose.runtime.snapshots.d) obj);
            return C6916E.f44463a;
        }
    }

    static final class b extends s implements l {

        /* renamed from: o, reason: collision with root package name */
        public static final b f8123o = new b();

        b() {
            super(1);
        }

        public final void b(androidx.compose.runtime.snapshots.d dVar) {
        }

        @Override // I6.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((androidx.compose.runtime.snapshots.d) obj);
            return C6916E.f44463a;
        }
    }

    static final class c extends s implements l {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ l f8124o;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ l f8125s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(l lVar, l lVar2) {
            super(1);
            this.f8124o = lVar;
            this.f8125s = lVar2;
        }

        public final void b(Object obj) {
            this.f8124o.invoke(obj);
            this.f8125s.invoke(obj);
        }

        @Override // I6.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b(obj);
            return C6916E.f44463a;
        }
    }

    static final class d extends s implements l {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ l f8126o;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ l f8127s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(l lVar, l lVar2) {
            super(1);
            this.f8126o = lVar;
            this.f8127s = lVar2;
        }

        public final void b(Object obj) {
            this.f8126o.invoke(obj);
            this.f8127s.invoke(obj);
        }

        @Override // I6.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b(obj);
            return C6916E.f44463a;
        }
    }

    static {
        d.a aVar = androidx.compose.runtime.snapshots.d.f8098v;
        f8113d = aVar.a();
        f8114e = 1;
        f8115f = new C6993b();
        f8116g = new z.f();
        f8117h = AbstractC6987o.e();
        f8118i = AbstractC6987o.e();
        int i8 = f8114e;
        f8114e = i8 + 1;
        androidx.compose.runtime.snapshots.a aVar2 = new androidx.compose.runtime.snapshots.a(i8, aVar.a());
        f8113d = f8113d.r(aVar2.b());
        AtomicReference atomicReference = new AtomicReference(aVar2);
        f8119j = atomicReference;
        f8120k = (androidx.compose.runtime.snapshots.c) atomicReference.get();
        f8121l = new C6765c(0);
    }

    private static final Object A(androidx.compose.runtime.snapshots.c cVar, l lVar) {
        Object invoke = lVar.invoke(f8113d.o(cVar.b()));
        synchronized (n()) {
            int i8 = f8114e;
            f8114e = i8 + 1;
            f8113d = f8113d.o(cVar.b());
            f8119j.set(new androidx.compose.runtime.snapshots.a(i8, f8113d));
            cVar.a();
            f8113d = f8113d.r(i8);
            C6916E c6916e = C6916E.f44463a;
        }
        return invoke;
    }

    public static final int B(int i8, androidx.compose.runtime.snapshots.d dVar) {
        int a8;
        int q8 = dVar.q(i8);
        synchronized (n()) {
            a8 = f8115f.a(q8);
        }
        return a8;
    }

    private static final i C(z.g gVar) {
        int e8 = f8115f.e(f8114e) - 1;
        androidx.compose.runtime.snapshots.d a8 = androidx.compose.runtime.snapshots.d.f8098v.a();
        i iVar = null;
        for (i a9 = gVar.a(); a9 != null; a9 = a9.c()) {
            if (a9.d() == 0) {
                return a9;
            }
            if (E(a9, e8, a8)) {
                if (iVar != null) {
                    return a9.d() < iVar.d() ? a9 : iVar;
                }
                iVar = a9;
            }
        }
        return null;
    }

    private static final boolean D(int i8, int i9, androidx.compose.runtime.snapshots.d dVar) {
        return (i9 == 0 || i9 > i8 || dVar.p(i9)) ? false : true;
    }

    private static final boolean E(i iVar, int i8, androidx.compose.runtime.snapshots.d dVar) {
        return D(i8, iVar.d(), dVar);
    }

    private static final Object g(l lVar) {
        Object obj;
        C6806a n8;
        Object A7;
        androidx.compose.runtime.snapshots.c cVar = f8120k;
        r.c(cVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.GlobalSnapshot");
        synchronized (n()) {
            try {
                obj = f8119j.get();
                n8 = ((androidx.compose.runtime.snapshots.a) obj).n();
                if (n8 != null) {
                    f8121l.a(1);
                }
                A7 = A((androidx.compose.runtime.snapshots.c) obj, lVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (n8 != null) {
            try {
                List list = f8117h;
                int size = list.size();
                for (int i8 = 0; i8 < size; i8++) {
                    ((p) list.get(i8)).invoke(n8, obj);
                }
            } finally {
                f8121l.a(-1);
            }
        }
        synchronized (n()) {
            try {
                i();
                if (n8 != null) {
                    Object[] j8 = n8.j();
                    int size2 = n8.size();
                    for (int i9 = 0; i9 < size2; i9++) {
                        Object obj2 = j8[i9];
                        r.c(obj2, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                        v((z.g) obj2);
                    }
                    C6916E c6916e = C6916E.f44463a;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return A7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h() {
        g(a.f8122o);
    }

    private static final void i() {
        z.f fVar = f8116g;
        int e8 = fVar.e();
        int i8 = 0;
        int i9 = 0;
        while (true) {
            if (i8 >= e8) {
                break;
            }
            P p8 = fVar.f()[i8];
            Object obj = p8 != null ? p8.get() : null;
            if (obj != null && u((z.g) obj)) {
                if (i9 != i8) {
                    fVar.f()[i9] = p8;
                    fVar.d()[i9] = fVar.d()[i8];
                }
                i9++;
            }
            i8++;
        }
        for (int i10 = i9; i10 < e8; i10++) {
            fVar.f()[i10] = null;
            fVar.d()[i10] = 0;
        }
        if (i9 != e8) {
            fVar.g(i9);
        }
    }

    private static final androidx.compose.runtime.snapshots.c j(androidx.compose.runtime.snapshots.c cVar, l lVar, boolean z7) {
        boolean z8 = cVar instanceof androidx.compose.runtime.snapshots.b;
        if (z8 || cVar == null) {
            return new f(z8 ? (androidx.compose.runtime.snapshots.b) cVar : null, lVar, null, false, z7);
        }
        return new g(cVar, lVar, false, z7);
    }

    static /* synthetic */ androidx.compose.runtime.snapshots.c k(androidx.compose.runtime.snapshots.c cVar, l lVar, boolean z7, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            lVar = null;
        }
        if ((i8 & 4) != 0) {
            z7 = false;
        }
        return j(cVar, lVar, z7);
    }

    public static final i l(i iVar) {
        i x7;
        c.a aVar = androidx.compose.runtime.snapshots.c.f8092e;
        androidx.compose.runtime.snapshots.c b8 = aVar.b();
        i x8 = x(iVar, b8.b(), b8.c());
        if (x8 != null) {
            return x8;
        }
        synchronized (n()) {
            androidx.compose.runtime.snapshots.c b9 = aVar.b();
            x7 = x(iVar, b9.b(), b9.c());
        }
        if (x7 != null) {
            return x7;
        }
        w();
        throw new KotlinNothingValueException();
    }

    public static final androidx.compose.runtime.snapshots.c m() {
        androidx.compose.runtime.snapshots.c cVar = (androidx.compose.runtime.snapshots.c) f8111b.a();
        return cVar == null ? (androidx.compose.runtime.snapshots.c) f8119j.get() : cVar;
    }

    public static final Object n() {
        return f8112c;
    }

    public static final androidx.compose.runtime.snapshots.c o() {
        return f8120k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final l p(l lVar, l lVar2, boolean z7) {
        if (!z7) {
            lVar2 = null;
        }
        return (lVar == null || lVar2 == null || r.a(lVar, lVar2)) ? lVar == null ? lVar2 : lVar : new c(lVar, lVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final l q(l lVar, l lVar2) {
        return (lVar == null || lVar2 == null || r.a(lVar, lVar2)) ? lVar == null ? lVar2 : lVar : new d(lVar, lVar2);
    }

    public static final i r(i iVar, z.g gVar) {
        i C7 = C(gVar);
        if (C7 != null) {
            C7.f(Integer.MAX_VALUE);
            return C7;
        }
        i b8 = iVar.b();
        b8.f(Integer.MAX_VALUE);
        b8.e(gVar.a());
        r.c(b8, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.newOverwritableRecordLocked$lambda$15");
        gVar.c(b8);
        r.c(b8, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.newOverwritableRecordLocked");
        return b8;
    }

    public static final void s(androidx.compose.runtime.snapshots.c cVar, z.g gVar) {
        cVar.m(cVar.f() + 1);
        l g8 = cVar.g();
        if (g8 != null) {
            g8.invoke(gVar);
        }
    }

    public static final i t(i iVar, z.g gVar, androidx.compose.runtime.snapshots.c cVar, i iVar2) {
        i r8;
        if (cVar.e()) {
            cVar.i(gVar);
        }
        int b8 = cVar.b();
        if (iVar2.d() == b8) {
            return iVar2;
        }
        synchronized (n()) {
            r8 = r(iVar, gVar);
        }
        r8.f(b8);
        cVar.i(gVar);
        return r8;
    }

    private static final boolean u(z.g gVar) {
        i iVar;
        int e8 = f8115f.e(f8114e);
        i iVar2 = null;
        i iVar3 = null;
        int i8 = 0;
        for (i a8 = gVar.a(); a8 != null; a8 = a8.c()) {
            int d8 = a8.d();
            if (d8 != 0) {
                if (d8 >= e8) {
                    i8++;
                } else if (iVar2 == null) {
                    i8++;
                    iVar2 = a8;
                } else {
                    if (a8.d() < iVar2.d()) {
                        iVar = iVar2;
                        iVar2 = a8;
                    } else {
                        iVar = a8;
                    }
                    if (iVar3 == null) {
                        iVar3 = gVar.a();
                        i iVar4 = iVar3;
                        while (true) {
                            if (iVar3 == null) {
                                iVar3 = iVar4;
                                break;
                            }
                            if (iVar3.d() >= e8) {
                                break;
                            }
                            if (iVar4.d() < iVar3.d()) {
                                iVar4 = iVar3;
                            }
                            iVar3 = iVar3.c();
                        }
                    }
                    iVar2.f(0);
                    iVar2.a(iVar3);
                    iVar2 = iVar;
                }
            }
        }
        return i8 > 1;
    }

    private static final void v(z.g gVar) {
        if (u(gVar)) {
            f8116g.a(gVar);
        }
    }

    private static final Void w() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    private static final i x(i iVar, int i8, androidx.compose.runtime.snapshots.d dVar) {
        i iVar2 = null;
        while (iVar != null) {
            if (E(iVar, i8, dVar) && (iVar2 == null || iVar2.d() < iVar.d())) {
                iVar2 = iVar;
            }
            iVar = iVar.c();
        }
        if (iVar2 != null) {
            return iVar2;
        }
        return null;
    }

    public static final i y(i iVar, z.g gVar) {
        i x7;
        c.a aVar = androidx.compose.runtime.snapshots.c.f8092e;
        androidx.compose.runtime.snapshots.c b8 = aVar.b();
        l d8 = b8.d();
        if (d8 != null) {
            d8.invoke(gVar);
        }
        i x8 = x(iVar, b8.b(), b8.c());
        if (x8 != null) {
            return x8;
        }
        synchronized (n()) {
            androidx.compose.runtime.snapshots.c b9 = aVar.b();
            i a8 = gVar.a();
            r.c(a8, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.readable$lambda$9");
            x7 = x(a8, b9.b(), b9.c());
            if (x7 == null) {
                w();
                throw new KotlinNothingValueException();
            }
        }
        return x7;
    }

    public static final void z(int i8) {
        f8115f.f(i8);
    }
}
