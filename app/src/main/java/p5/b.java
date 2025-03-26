package p5;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private final c f40827a;

    /* renamed from: b, reason: collision with root package name */
    private final int f40828b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f40829c;

    /* renamed from: d, reason: collision with root package name */
    private int f40830d = 0;

    public b(c cVar, int i8, boolean z7) {
        this.f40827a = cVar;
        this.f40828b = i8;
        this.f40829c = z7;
    }

    public int a() {
        return this.f40828b;
    }

    public int b() {
        return this.f40828b + this.f40830d;
    }

    public c c() {
        return this.f40827a;
    }

    public int d() {
        return this.f40828b + (g() ? -1 : 0);
    }

    public void e() {
        this.f40830d++;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f40828b != bVar.f40828b || this.f40829c != bVar.f40829c || this.f40830d != bVar.f40830d) {
            return false;
        }
        c cVar = this.f40827a;
        c cVar2 = bVar.f40827a;
        return cVar != null ? cVar.equals(cVar2) : cVar2 == null;
    }

    public boolean f() {
        return this.f40829c;
    }

    public boolean g() {
        c cVar = this.f40827a;
        return (cVar == null || cVar.c() == null) ? false : true;
    }

    public int hashCode() {
        c cVar = this.f40827a;
        return ((((((cVar != null ? cVar.hashCode() : 0) * 31) + this.f40828b) * 31) + (this.f40829c ? 1 : 0)) * 31) + this.f40830d;
    }

    public String toString() {
        return "DisplaySection{mHeaderItem=" + this.f40827a + ", mBodyPosition=" + this.f40828b + ", mIsDragTarget=" + this.f40829c + ", mBodyCount=" + this.f40830d + '}';
    }
}
