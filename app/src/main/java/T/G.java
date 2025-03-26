package t;

import x6.C6916E;
import z.InterfaceC6995d;

/* loaded from: classes.dex */
public abstract class G extends z.h implements InterfaceC6995d {

    /* renamed from: s, reason: collision with root package name */
    private final H f43752s;

    /* renamed from: t, reason: collision with root package name */
    private a f43753t;

    private static final class a extends z.i {

        /* renamed from: c, reason: collision with root package name */
        private Object f43754c;

        public a(Object obj) {
            this.f43754c = obj;
        }

        @Override // z.i
        public void a(z.i iVar) {
            J6.r.c(iVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord>");
            this.f43754c = ((a) iVar).f43754c;
        }

        @Override // z.i
        public z.i b() {
            return new a(this.f43754c);
        }

        public final Object g() {
            return this.f43754c;
        }

        public final void h(Object obj) {
            this.f43754c = obj;
        }
    }

    public G(Object obj, H h8) {
        this.f43752s = h8;
        this.f43753t = new a(obj);
    }

    @Override // z.g
    public z.i a() {
        return this.f43753t;
    }

    @Override // z.g
    public void c(z.i iVar) {
        J6.r.c(iVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        this.f43753t = (a) iVar;
    }

    public H d() {
        return this.f43752s;
    }

    @Override // t.M
    public Object getValue() {
        return ((a) androidx.compose.runtime.snapshots.e.y(this.f43753t, this)).g();
    }

    @Override // t.v
    public void setValue(Object obj) {
        androidx.compose.runtime.snapshots.c b8;
        a aVar = (a) androidx.compose.runtime.snapshots.e.l(this.f43753t);
        if (d().a(aVar.g(), obj)) {
            return;
        }
        a aVar2 = this.f43753t;
        androidx.compose.runtime.snapshots.e.o();
        synchronized (androidx.compose.runtime.snapshots.e.n()) {
            b8 = androidx.compose.runtime.snapshots.c.f8092e.b();
            ((a) androidx.compose.runtime.snapshots.e.t(aVar2, this, b8, aVar)).h(obj);
            C6916E c6916e = C6916E.f44463a;
        }
        androidx.compose.runtime.snapshots.e.s(b8, this);
    }

    public String toString() {
        return "MutableState(value=" + ((a) androidx.compose.runtime.snapshots.e.l(this.f43753t)).g() + ")@" + hashCode();
    }
}
