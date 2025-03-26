package L1;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f3692a = new C0068a();

    /* renamed from: b, reason: collision with root package name */
    public static final a f3693b = new b();

    /* renamed from: c, reason: collision with root package name */
    public static final a f3694c = new c();

    /* renamed from: d, reason: collision with root package name */
    public static final a f3695d = new d();

    /* renamed from: e, reason: collision with root package name */
    public static final a f3696e = new e();

    /* renamed from: L1.a$a, reason: collision with other inner class name */
    class C0068a extends a {
        C0068a() {
        }

        @Override // L1.a
        public boolean a() {
            return true;
        }

        @Override // L1.a
        public boolean b() {
            return true;
        }

        @Override // L1.a
        public boolean c(J1.a aVar) {
            return aVar == J1.a.REMOTE;
        }

        @Override // L1.a
        public boolean d(boolean z7, J1.a aVar, J1.c cVar) {
            return (aVar == J1.a.RESOURCE_DISK_CACHE || aVar == J1.a.MEMORY_CACHE) ? false : true;
        }
    }

    class b extends a {
        b() {
        }

        @Override // L1.a
        public boolean a() {
            return false;
        }

        @Override // L1.a
        public boolean b() {
            return false;
        }

        @Override // L1.a
        public boolean c(J1.a aVar) {
            return false;
        }

        @Override // L1.a
        public boolean d(boolean z7, J1.a aVar, J1.c cVar) {
            return false;
        }
    }

    class c extends a {
        c() {
        }

        @Override // L1.a
        public boolean a() {
            return true;
        }

        @Override // L1.a
        public boolean b() {
            return false;
        }

        @Override // L1.a
        public boolean c(J1.a aVar) {
            return (aVar == J1.a.DATA_DISK_CACHE || aVar == J1.a.MEMORY_CACHE) ? false : true;
        }

        @Override // L1.a
        public boolean d(boolean z7, J1.a aVar, J1.c cVar) {
            return false;
        }
    }

    class d extends a {
        d() {
        }

        @Override // L1.a
        public boolean a() {
            return false;
        }

        @Override // L1.a
        public boolean b() {
            return true;
        }

        @Override // L1.a
        public boolean c(J1.a aVar) {
            return false;
        }

        @Override // L1.a
        public boolean d(boolean z7, J1.a aVar, J1.c cVar) {
            return (aVar == J1.a.RESOURCE_DISK_CACHE || aVar == J1.a.MEMORY_CACHE) ? false : true;
        }
    }

    class e extends a {
        e() {
        }

        @Override // L1.a
        public boolean a() {
            return true;
        }

        @Override // L1.a
        public boolean b() {
            return true;
        }

        @Override // L1.a
        public boolean c(J1.a aVar) {
            return aVar == J1.a.REMOTE;
        }

        @Override // L1.a
        public boolean d(boolean z7, J1.a aVar, J1.c cVar) {
            return ((z7 && aVar == J1.a.DATA_DISK_CACHE) || aVar == J1.a.LOCAL) && cVar == J1.c.TRANSFORMED;
        }
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract boolean c(J1.a aVar);

    public abstract boolean d(boolean z7, J1.a aVar, J1.c cVar);
}
