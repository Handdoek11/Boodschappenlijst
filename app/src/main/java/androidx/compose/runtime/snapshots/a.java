package androidx.compose.runtime.snapshots;

import I6.l;
import J6.s;
import java.util.List;
import x6.C6916E;
import y6.AbstractC6987o;

/* loaded from: classes.dex */
public final class a extends b {

    /* renamed from: androidx.compose.runtime.snapshots.a$a, reason: collision with other inner class name */
    static final class C0144a extends s implements l {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ List f8081o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0144a(List list) {
            super(1);
            this.f8081o = list;
        }

        public final void b(Object obj) {
            List list = this.f8081o;
            int size = list.size();
            for (int i8 = 0; i8 < size; i8++) {
                ((l) list.get(i8)).invoke(obj);
            }
        }

        @Override // I6.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b(obj);
            return C6916E.f44463a;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a(int i8, d dVar) {
        l lVar;
        synchronized (e.n()) {
            List list = e.f8118i;
            lVar = (l) AbstractC6987o.T(list);
            lVar = lVar == null ? new C0144a(list) : lVar;
        }
        super(i8, dVar, null, lVar);
    }

    @Override // androidx.compose.runtime.snapshots.b, androidx.compose.runtime.snapshots.c
    public void a() {
        synchronized (e.n()) {
            j();
            C6916E c6916e = C6916E.f44463a;
        }
    }
}
