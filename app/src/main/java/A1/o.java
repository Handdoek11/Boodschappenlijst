package A1;

import c1.AbstractC0975a;

/* loaded from: classes.dex */
public final class o implements n {

    /* renamed from: a, reason: collision with root package name */
    private final androidx.room.h f86a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC0975a f87b;

    /* renamed from: c, reason: collision with root package name */
    private final c1.d f88c;

    /* renamed from: d, reason: collision with root package name */
    private final c1.d f89d;

    class a extends AbstractC0975a {
        a(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // c1.d
        public String d() {
            return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
        }

        @Override // c1.AbstractC0975a
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void g(g1.f fVar, m mVar) {
            String str = mVar.f84a;
            if (str == null) {
                fVar.f0(1);
            } else {
                fVar.w(1, str);
            }
            byte[] k8 = androidx.work.b.k(mVar.f85b);
            if (k8 == null) {
                fVar.f0(2);
            } else {
                fVar.R(2, k8);
            }
        }
    }

    class b extends c1.d {
        b(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // c1.d
        public String d() {
            return "DELETE from WorkProgress where work_spec_id=?";
        }
    }

    class c extends c1.d {
        c(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // c1.d
        public String d() {
            return "DELETE FROM WorkProgress";
        }
    }

    public o(androidx.room.h hVar) {
        this.f86a = hVar;
        this.f87b = new a(hVar);
        this.f88c = new b(hVar);
        this.f89d = new c(hVar);
    }

    @Override // A1.n
    public void a(String str) {
        this.f86a.b();
        g1.f a8 = this.f88c.a();
        if (str == null) {
            a8.f0(1);
        } else {
            a8.w(1, str);
        }
        this.f86a.c();
        try {
            a8.x();
            this.f86a.r();
        } finally {
            this.f86a.g();
            this.f88c.f(a8);
        }
    }

    @Override // A1.n
    public void b(m mVar) {
        this.f86a.b();
        this.f86a.c();
        try {
            this.f87b.h(mVar);
            this.f86a.r();
        } finally {
            this.f86a.g();
        }
    }

    @Override // A1.n
    public void c() {
        this.f86a.b();
        g1.f a8 = this.f89d.a();
        this.f86a.c();
        try {
            a8.x();
            this.f86a.r();
        } finally {
            this.f86a.g();
            this.f89d.f(a8);
        }
    }
}
