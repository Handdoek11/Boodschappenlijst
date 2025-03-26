package v6;

import X2.D;
import a6.i;
import d6.InterfaceC5732b;
import h6.AbstractC5844b;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import t6.AbstractC6805a;

/* renamed from: v6.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6846b extends AbstractC6847c {

    /* renamed from: t, reason: collision with root package name */
    static final a[] f44155t = new a[0];

    /* renamed from: u, reason: collision with root package name */
    static final a[] f44156u = new a[0];

    /* renamed from: o, reason: collision with root package name */
    final AtomicReference f44157o = new AtomicReference(f44156u);

    /* renamed from: s, reason: collision with root package name */
    Throwable f44158s;

    /* renamed from: v6.b$a */
    static final class a extends AtomicBoolean implements InterfaceC5732b {

        /* renamed from: o, reason: collision with root package name */
        final i f44159o;

        /* renamed from: s, reason: collision with root package name */
        final C6846b f44160s;

        a(i iVar, C6846b c6846b) {
            this.f44159o = iVar;
            this.f44160s = c6846b;
        }

        public boolean a() {
            return get();
        }

        public void b() {
            if (get()) {
                return;
            }
            this.f44159o.a();
        }

        @Override // d6.InterfaceC5732b
        public void c() {
            if (compareAndSet(false, true)) {
                this.f44160s.P(this);
            }
        }

        public void d(Throwable th) {
            if (get()) {
                AbstractC6805a.m(th);
            } else {
                this.f44159o.onError(th);
            }
        }

        public void e(Object obj) {
            if (get()) {
                return;
            }
            this.f44159o.b(obj);
        }
    }

    C6846b() {
    }

    public static C6846b O() {
        return new C6846b();
    }

    @Override // a6.AbstractC0829f
    protected void G(i iVar) {
        a aVar = new a(iVar, this);
        iVar.d(aVar);
        if (N(aVar)) {
            if (aVar.a()) {
                P(aVar);
            }
        } else {
            Throwable th = this.f44158s;
            if (th != null) {
                iVar.onError(th);
            } else {
                iVar.a();
            }
        }
    }

    boolean N(a aVar) {
        a[] aVarArr;
        a[] aVarArr2;
        do {
            aVarArr = (a[]) this.f44157o.get();
            if (aVarArr == f44155t) {
                return false;
            }
            int length = aVarArr.length;
            aVarArr2 = new a[length + 1];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
        } while (!D.a(this.f44157o, aVarArr, aVarArr2));
        return true;
    }

    void P(a aVar) {
        a[] aVarArr;
        a[] aVarArr2;
        do {
            aVarArr = (a[]) this.f44157o.get();
            if (aVarArr == f44155t || aVarArr == f44156u) {
                return;
            }
            int length = aVarArr.length;
            int i8 = 0;
            while (true) {
                if (i8 >= length) {
                    i8 = -1;
                    break;
                } else if (aVarArr[i8] == aVar) {
                    break;
                } else {
                    i8++;
                }
            }
            if (i8 < 0) {
                return;
            }
            if (length == 1) {
                aVarArr2 = f44156u;
            } else {
                a[] aVarArr3 = new a[length - 1];
                System.arraycopy(aVarArr, 0, aVarArr3, 0, i8);
                System.arraycopy(aVarArr, i8 + 1, aVarArr3, i8, (length - i8) - 1);
                aVarArr2 = aVarArr3;
            }
        } while (!D.a(this.f44157o, aVarArr, aVarArr2));
    }

    @Override // a6.i
    public void a() {
        Object obj = this.f44157o.get();
        Object obj2 = f44155t;
        if (obj == obj2) {
            return;
        }
        for (a aVar : (a[]) this.f44157o.getAndSet(obj2)) {
            aVar.b();
        }
    }

    @Override // a6.i
    public void b(Object obj) {
        AbstractC5844b.e(obj, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        for (a aVar : (a[]) this.f44157o.get()) {
            aVar.e(obj);
        }
    }

    @Override // a6.i
    public void d(InterfaceC5732b interfaceC5732b) {
        if (this.f44157o.get() == f44155t) {
            interfaceC5732b.c();
        }
    }

    @Override // a6.i
    public void onError(Throwable th) {
        AbstractC5844b.e(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        Object obj = this.f44157o.get();
        Object obj2 = f44155t;
        if (obj == obj2) {
            AbstractC6805a.m(th);
            return;
        }
        this.f44158s = th;
        for (a aVar : (a[]) this.f44157o.getAndSet(obj2)) {
            aVar.d(th);
        }
    }
}
