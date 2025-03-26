package B;

import I6.p;
import Q.B;
import Q.InterfaceC0681c;

/* loaded from: classes.dex */
public interface e {

    /* renamed from: a, reason: collision with root package name */
    public static final a f275a = a.f276b;

    public interface b extends e {
    }

    public static abstract class c implements InterfaceC0681c {

        /* renamed from: b, reason: collision with root package name */
        private int f278b;

        /* renamed from: d, reason: collision with root package name */
        private c f280d;

        /* renamed from: e, reason: collision with root package name */
        private c f281e;

        /* renamed from: f, reason: collision with root package name */
        private B f282f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f283g;

        /* renamed from: a, reason: collision with root package name */
        private c f277a = this;

        /* renamed from: c, reason: collision with root package name */
        private int f279c = -1;

        @Override // Q.InterfaceC0681c
        public final c f() {
            return this.f277a;
        }

        public final int j() {
            return this.f279c;
        }

        public final c k() {
            return this.f281e;
        }

        public final B l() {
            return this.f282f;
        }

        public final int m() {
            return this.f278b;
        }

        public final c n() {
            return this.f280d;
        }

        public final boolean o() {
            return this.f283g;
        }

        public final void p(int i8) {
            this.f279c = i8;
        }

        public void q(B b8) {
            this.f282f = b8;
        }
    }

    e a(e eVar);

    Object b(Object obj, p pVar);

    public static final class a implements e {

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ a f276b = new a();

        private a() {
        }

        public String toString() {
            return "Modifier";
        }

        @Override // B.e
        public e a(e eVar) {
            return eVar;
        }

        @Override // B.e
        public Object b(Object obj, p pVar) {
            return obj;
        }
    }
}
