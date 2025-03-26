package m6;

import a6.AbstractC0829f;
import h6.AbstractC5844b;
import j6.AbstractC6083c;

/* loaded from: classes2.dex */
public final class j extends AbstractC0829f {

    /* renamed from: o, reason: collision with root package name */
    final Object[] f39326o;

    static final class a extends AbstractC6083c {

        /* renamed from: o, reason: collision with root package name */
        final a6.i f39327o;

        /* renamed from: s, reason: collision with root package name */
        final Object[] f39328s;

        /* renamed from: t, reason: collision with root package name */
        int f39329t;

        /* renamed from: u, reason: collision with root package name */
        boolean f39330u;

        /* renamed from: v, reason: collision with root package name */
        volatile boolean f39331v;

        a(a6.i iVar, Object[] objArr) {
            this.f39327o = iVar;
            this.f39328s = objArr;
        }

        public boolean a() {
            return this.f39331v;
        }

        void b() {
            Object[] objArr = this.f39328s;
            int length = objArr.length;
            for (int i8 = 0; i8 < length && !a(); i8++) {
                Object obj = objArr[i8];
                if (obj == null) {
                    this.f39327o.onError(new NullPointerException("The element at index " + i8 + " is null"));
                    return;
                }
                this.f39327o.b(obj);
            }
            if (a()) {
                return;
            }
            this.f39327o.a();
        }

        @Override // d6.InterfaceC5732b
        public void c() {
            this.f39331v = true;
        }

        @Override // i6.InterfaceC5880e
        public void clear() {
            this.f39329t = this.f39328s.length;
        }

        @Override // i6.InterfaceC5880e
        public Object f() {
            int i8 = this.f39329t;
            Object[] objArr = this.f39328s;
            if (i8 == objArr.length) {
                return null;
            }
            this.f39329t = i8 + 1;
            return AbstractC5844b.e(objArr[i8], "The array element is null");
        }

        @Override // i6.InterfaceC5877b
        public int i(int i8) {
            if ((i8 & 1) == 0) {
                return 0;
            }
            this.f39330u = true;
            return 1;
        }

        @Override // i6.InterfaceC5880e
        public boolean isEmpty() {
            return this.f39329t == this.f39328s.length;
        }
    }

    public j(Object[] objArr) {
        this.f39326o = objArr;
    }

    @Override // a6.AbstractC0829f
    public void G(a6.i iVar) {
        a aVar = new a(iVar, this.f39326o);
        iVar.d(aVar);
        if (aVar.f39330u) {
            return;
        }
        aVar.b();
    }
}
